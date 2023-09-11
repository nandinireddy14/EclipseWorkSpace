package cgg.spring.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cgg.spring.mvc.model.UserOne;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	@Transactional
	public int saveUser(UserOne user) {
		int id = (int) this.hibernateTemplate.save(user);
		return 0;
	}

}
