package org.zerock.sample;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class HotelTests2 {
	@Setter(onMethod_ = {@Autowired} )
	private SampleHotel2 hotel;
	
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testExist() {
		
		assertNotNull(hotel);//restaurant 변수가 null이 아니어야만 테스트가 성공한다

		log.info(hotel);
		log.info("--------------------------");
		log.info(hotel.getChef());
	}
	
	
}
