package com.example.demo;

import org.dromara.hutool.core.date.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		LocalDateTime localDateTime = LocalTime.now().atDate(LocalDate.of(1970, 1, 1));
		System.out.println(DateUtil.date(localDateTime));
	}

}
