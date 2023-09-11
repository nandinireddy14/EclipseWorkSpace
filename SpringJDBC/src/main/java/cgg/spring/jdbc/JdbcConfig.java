package cgg.spring.jdbc;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import cgg.spring.jdbc.dao.StudentDao;
import cgg.spring.jdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages="cgg.spring.jdbc.dao")
public class JdbcConfig {
	@Bean
public DataSource getDataSource() {
	
	
//	DriverManagerDataSource ds = new DriverManagerDataSource();
		BasicDataSource ds = new BasicDataSource();
	ds.setDriverClassName("org.postgresql.Driver");
	ds.setUrl("jdbc:postgresql://localhost:5432/springjdbc");
	ds.setUsername("postgres");
	ds.setPassword("nandini14");
	ds.setInitialSize(2);
	ds.setMaxTotal(5);
	
	return ds;
}

@Bean(name={"jdbcTemplate"})
public JdbcTemplate getTemplate() {
	JdbcTemplate jdbcTemplate=new JdbcTemplate();
	jdbcTemplate.setDataSource(getDataSource());
	return jdbcTemplate;
}
@Bean(name={"studentdao"})
public StudentDao getStudentDao() {
	StudentDaoImpl studentDao = new StudentDaoImpl();
//	studentDao.setJdbcTemplate(getTemplate());
	return studentDao;
}

}
