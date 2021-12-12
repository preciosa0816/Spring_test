package di1.spring.xml2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX2.xml");
		// MyInfo myInfo=ctx.getBean("myInfo", MyInfo.class);
		MyInfo myInfo=(MyInfo) ctx.getBean("myInfo");
		//myInfo.bmiCalculation();
		myInfo.getInfo();
		
		ctx.close();
		
	}

}
