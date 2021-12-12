package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
@RequiredArgsConstructor //특정파라미터가 있는 생성자: nonNull이나 final이 붙은 인스턴스 변수에 대한 생성자만듦
public class SampleHotel3 {
	
	@NonNull//여러개의 인스턴스 변수들 중 특정한 변수에 대해서만 생성자 작성(+null 불가)
	private Chef chef;
	//단일 생성자의 묵시적 자동주입(@Autowired)생략
	//생성자주입
//	public SampleHotel(Chef chef) { //@AllArgsConstructor 생성시 중복됨
//		this.chef=chef;
//	}
}
