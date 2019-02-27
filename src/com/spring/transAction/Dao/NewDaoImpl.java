package com.spring.transAction.Dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class NewDaoImpl implements NewDao {
	private DataSource ds;

	public void setDs(DataSource ds) {
		this.ds = ds;

	}

	@Override
	public void insert(String title, String Contect) {
		/*try {
			Connection connection = ds.getConnection();
			PreparedStatement prepareStatement = connection.prepareStatement("insert into user_into values(null,null,?,?)");
			prepareStatement.setString(1, title);
			prepareStatement.setString(2, Contect);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		JdbcTemplate jt = new JdbcTemplate(ds);
		jt.update("insert into user " + "values(null,null,?,?)", title, Contect);
		//两次插入的数据违法唯一键约束
		jt.update("insert into user " + "values(null,null,?,?)", title, Contect);
		//如果没有事务 控制，则第一条可以插入
		//如果有事务控制，则第一条也插不进去
		System.out.println("成功");
	}

}
