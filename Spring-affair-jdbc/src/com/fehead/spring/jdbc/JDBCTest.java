package com.fehead.spring.jdbc;

import static org.junit.Assert.*;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBCTest {

	private ApplicationContext ctx = null;
	private JdbcTemplate jdbcTemplate;
	
	{
		ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		jdbcTemplate = (JdbcTemplate)ctx.getBean("jdbcTemplate");
	}
	
	@Test
	public void testDataSource() throws SQLException{
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		try {
			System.out.println(dataSource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * Ö´ÐÐINSERT£¬UPDATE£¬DELETE
	 * */
	@Test
	public void testUpdate(){
		String sql = "UPDATE employees SET LAST_NAME=? WHERE id = ?";
		jdbcTemplate.update(sql, "Jack",2);
	}

}
