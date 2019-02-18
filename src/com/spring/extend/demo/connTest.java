package com.spring.extend.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class connTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/extend/util/application2.xml");
		DataSource data = (DataSource) ctx.getBean("dataSource");
		try {
			Connection connection = data.getConnection();
			Statement createStatement = connection.createStatement();
			ResultSet executeQuery = createStatement.executeQuery("select * from user_info");
			while (executeQuery.next()) {
				System.out.println(executeQuery.getString("user_name"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
