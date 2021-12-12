package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

//@Component:Spring에게 클래스가 관리해야할 될 대상임을 표시(객체생성, 객체관리)
//@Data : lombok 설치시 내장, setter()&getter(), Constructor, toString등 을 자동 생성

@Component
@Data
public class Restaurant {
	//setter() 주입: spring 5.0
	@Setter(onMethod = @__({@Autowired}))
	//@Setter(onMethod_=@Autowired) 
	private Chef chef;
	
	//옛날 방식
//	public void setChef() {
//		this.chef=chef;
//	}
	
	
}
