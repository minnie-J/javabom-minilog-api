package com.javabom.minilog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiniLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniLogApplication.class, args);

		// logger 이용 예제
		Logger logger = LoggerFactory.getLogger("com.javabom.minilog.MiniLogApplication");

		logger.trace("Hello world.");
		logger.debug("Hello world."); //debug level로 해당 메시지의 로그를 찍겠다.
		logger.info("Hello world.");
		logger.warn("Hello world.");
		logger.error("Hello world.");
	}

}
