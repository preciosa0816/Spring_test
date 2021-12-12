package di1.spring.xml3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:pencil.xml");
		
		//결과:"6B 굵기로 쓰이고, 지우개가 있습니다."
		Pencil6BwithEraser p = ctx.getBean("pencil6BwithEraser", Pencil6BwithEraser.class);
		p.use();
	}

}
