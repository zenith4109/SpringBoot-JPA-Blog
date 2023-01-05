package com.cos.bog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	//스프링이 com.cos.bolg 패키지 이하를 스캔해서 특정 어노테이션이 
				//클래스파일들을 new해서(IOC) 스프링컨테이너에 관리해준다.
public class BlogControllerTest {
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>Hello Spring Boot</h1>";
	}
}
