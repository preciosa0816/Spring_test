package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.ForumVO;
import org.zerock.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//Java Config
//@ContextConfiguration(classes={org.zerock.config.RootConfig.class})
@Log4j
public class ForumMapperTests {

	@Setter(onMethod_ = @Autowired)
	private ForumMapper mapper;
	
//	@Test
//	public void testGetList() {
//		mapper.getList().forEach(board->log.info(forum)); //ForumVo board
//		
//	}
//	
//	@Test
//	public void testInsert() {
//		ForumVO board= new ForumVO();
//		board.setTitle("new title");
//		board.setContent("new content");
//		board.setWriter("new writer");
//		
//		mapper.insert(board);
//		log.info(board);	
//	}
//	
//	@Test
//	public void testInsertSelectKey() {
//		ForumVO board= new ForumVO();
//		board.setTitle("new title select key");
//		board.setContent("new content select key");
//		board.setWriter("newbie");
//		
//		mapper.insertSelectKey(board);
//		log.info(board);	
//	}
//	
//	@Test
//	public void testRead() {
//		//존재하는 게시물 번호로 테스트
//		ForumVO board= mapper.read(5L);
//		log.info(board);
//		
//	}
//	
//	@Test
//	public void testDelete() {
//		log.info("DELETE COUNT: "+mapper.delete(7L));
//	}
//	
//	
//	@Test
//	public void testUpdate() {
//		ForumdVO board = new ForumVO();
//		//실행전 존재하는 번호인지 확인할 것
//		board.setBno(10L);
//		board.setTitle("updated title");
//		board.setContent("updated content");
//		board.setWriter("user1234");
//		int count = mapper.update(board);
//		log.info("UPDATE COUNT: "+count);
//	}
//	
//	@Test
//	public void testPaging() {
//		Criteria cri = new Criteria();
//		//10개씩 3페이지
//		cri.setPageNum(3);
//		cri.setAmount(10);
//		List<ForumVO> list = mapper.getListWithPaging(cri);
//		list.forEach(board->log.info(board.getBno()));
//	}
//	
	/*
	 * @Test public void testSearch() { Criteria cri = new Criteria(); //10개씩 3페이지
	 * cri.setKeyword("새로"); cri.setType("TC");
	 * 
	 * List<ForumVO> list = mapper.getListWithPaging(cri);
	 * list.forEach(board->log.info(board)); }
	 */
	
	
	
	
	  @Test public void testSearch2() { Criteria cri = new Criteria(); //10개씩 3페이지
	  cri.setKeyword("90"); 
	  cri.setTypeb("W"); 
	  cri.setTypea("D");
	  
	  List<ForumVO> list = mapper.getListWithPaging(cri);
	  list.forEach(board->log.info(board)); }
	 
	
	
	
}
