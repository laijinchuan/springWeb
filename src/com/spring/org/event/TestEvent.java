package com.spring.org.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 测试事件
 */
public class TestEvent {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/org/event/application.xml");
		emailEvent emailEvent = new emailEvent("1547349124@qq.com", "你好", "测试代码", "owwawcgfyajdbagb");
		ctx.publishEvent(emailEvent);
	}
}
