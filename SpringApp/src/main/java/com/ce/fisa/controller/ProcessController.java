package com.ce.fisa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ProcessController {

	@GetMapping("/test")
	public String reqRes() {
		log.info("요청 수락 ~~~");
		return "linux 서버에서 실행되는 app + 241001 파일 변화 자동 감지 테스트 + myserver02로 넘기기!!! + 자동실행까지!!!plz \n 오후 마 지 막 시 도 ing!";
	}
}
