package com.spring.transAction.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(isolation = Isolation.DEFAULT, readOnly = true, timeout = 5, propagation = Propagation.REQUIRED)
public class test {
	public static void main(String[] args) {
		//		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/transAction/Dao/application.xml");
		//		NewDao bean = ctx.getBean("newDao", NewDao.class);
		//		bean.insert("小明", "111");
		/*List a = new ArrayList();
		System.out.println(new ArrayList().size());*/
		Calendar instance = Calendar.getInstance();
		instance.add(Calendar.DAY_OF_YEAR, -7);
		Date date = instance.getTime();
		String dateStr = new SimpleDateFormat("yyyy-MM-dd").format(date);
		System.out.println(dateStr);
	}

}
