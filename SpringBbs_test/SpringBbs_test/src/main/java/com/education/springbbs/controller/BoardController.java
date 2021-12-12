package com.education.springbbs.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.education.springbbs.biz.board.BoardMgr;
import com.education.springbbs.biz.board.BoardMgrTrx;
import com.education.springbbs.dto.board.BoardDto;
import com.education.springbbs.dto.user.UserDto;
import com.education.springbbs.util.Util;
import com.education.springbbs.validator.board.BbsFormValidation;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	public BbsFormValidation bbsFormValidation;

	@Resource
	public MessageSource messageSource;

	@Autowired
	public BoardMgr boardMgr;

	@Autowired
	public BoardMgrTrx boardMgrTrx;

	// 페이지 범위 지정.
	private final int PAGE_SIZE = 10;

	@RequestMapping("list")
	public String getBbsList(Locale locale, Model model,
			@RequestParam(value = "pg", required = false, defaultValue = "1") int pg, HttpServletRequest request) {
		System.out.println("pg : " + pg);
		int startRow = (pg - 1) * PAGE_SIZE + 1;
		int endRow = pg * PAGE_SIZE;
		int pageCount = 0;
		int count = 0;
		int startPage = 0;
		int endPage = 0;

		String searchKey = request.getParameter("searchKey");
		String searchValue = request.getParameter("searchValue");

		List<BoardDto> list = null;

		try {
			list = boardMgr.getBbsList(startRow, endRow, searchKey, searchValue);
			count = boardMgr.boardCount(searchKey, searchValue);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("count : " + count);

		pageCount = (count / PAGE_SIZE) + (count % PAGE_SIZE > 0 ? 1 : 0);
		startPage = (((pg - 1) / PAGE_SIZE) * PAGE_SIZE + 1);
		endPage = (((pg - 1) / PAGE_SIZE) * PAGE_SIZE + 10);
		if (endPage > pageCount)
			endPage = pageCount;//////////////////////////////////////////

		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("startRow", startRow);
		model.addAttribute("endRow", endRow);
		model.addAttribute("count", count);
		model.addAttribute("pg", pg);
		model.addAttribute("list", list);

		return "list";

	}

	@RequestMapping("view.action")
	public String getBbsView(Model model, @RequestParam(value = "num", required = false, defaultValue = "1") int num) {

		BoardDto boardDto = null;
		try {
			boardDto = boardMgr.getBbsView(num);
			int views = boardMgrTrx.update_view(num);
			System.out.println(views);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("boardDto", boardDto);

		System.out.println("=========== controller getBbsView 실행===============>>>");

		return "view";

	}

	@RequestMapping("writeForm.action")
	public String writeForm() {
		return "write";
	}

	@RequestMapping(value = "updateArticle")
	public String updateAction(@ModelAttribute BoardDto dto, Model model, BindingResult bindingResult,
			HttpServletRequest request) throws Exception {
		String msg = "";
		String returnUrl = "";
		// System.out.println(1);
		this.bbsFormValidation.validate(dto, bindingResult);

		if (bindingResult.hasErrors()) {

			returnUrl = "/board/view.action?num=" + dto.getNum();
			model.addAttribute("msg", msg);
			model.addAttribute("returnUrl", returnUrl);
			model.addAttribute("error", Util.getValidateMsg(messageSource, bindingResult));
			System.out.println(Util.getValidateMsg(messageSource, bindingResult));
			return "error";
		}
		// System.out.println(2);
		// int result = boardMgrTrx.write(dto);
		System.out.println(dto.getTitle());
		System.out.println(dto.getContent());
		int result = boardMgrTrx.update(dto);

		System.out.println(3);
		if (result > 0) {
			msg = "글이 수정 되었습니다.";
			returnUrl = "list.action?pg=1";
		} else {
			msg = "입력도중 오류가 발생 하였습니다.";
			returnUrl = "list.action?pg=1";
		}

		model.addAttribute("msg", msg);
		model.addAttribute("returnUrl", returnUrl);

		return "result";
	}

	@RequestMapping("updateForm.action")
	public String updateForm(Model model, @RequestParam(value = "num", required = false, defaultValue = "1") int num) {

		BoardDto boardDto = null;
		try {
			boardDto = boardMgr.getBbsView(num);
			// int views = boardMgrTrx.update_view(num);
			// System.out.println(views);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("boardDto", boardDto);

		System.out.println("=========== controller getBbsView 실행===============>>>");

		return "update";

	}

	@RequestMapping("deleteForm.action")
	public String deleteForm(Model model,	@RequestParam(value="num",required=false,defaultValue="1" ) int num, String password) {
		System.out.println(password);
		//BoardDto boardDto= null;

		String msg = "";
		String returnUrl = "";
		try {			
			//boardDto = boardMgr.getBbsView(num);	
			//System.out.println("num="+num+"password="+password+"입니당");
			int check = boardMgrTrx.delete(num,password);
			
			if (check > 0) {
				msg = "글이 삭제되었습니다.";
				returnUrl = "list.action?pg=1";
			} else {
				msg = "비밀번호가 틀렸습니다.";
				returnUrl = "list.action?pg=1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("msg", msg);
		model.addAttribute("returnUrl", returnUrl);

		return "result";
		
	}
	@RequestMapping(value = "write", method = RequestMethod.POST)
	public String writeAction(@ModelAttribute BoardDto dto, Model model, BindingResult bindingResult,
			HttpServletRequest request) throws Exception {

		String msg = "";
		String returnUrl = "";

		this.bbsFormValidation.validate(dto, bindingResult);

		if (bindingResult.hasErrors()) {

			returnUrl = "list.action?pg=1";
			model.addAttribute("msg", msg);
			model.addAttribute("returnUrl", returnUrl);
			model.addAttribute("error", Util.getValidateMsg(messageSource, bindingResult));
			System.out.println(Util.getValidateMsg(messageSource, bindingResult));
			return "error";
		}

		int result = boardMgrTrx.write(dto);

		if (result > 0) {
			msg = "글이 입력 되었습니다.";
			returnUrl = "list.action?pg=1";
		} else {
			msg = "입력도중 오류가 발생 하였습니다.";
			returnUrl = "list.action?pg=1";
		}

		model.addAttribute("msg", msg);
		model.addAttribute("returnUrl", returnUrl);

		return "result";
	}

	@RequestMapping("sydate.action")
	public String sysdate() throws Exception {
		boardMgr.sysDate();
		return "home";
	}
}
