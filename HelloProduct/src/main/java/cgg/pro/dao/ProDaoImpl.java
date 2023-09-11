package cgg.pro.dao;

import java.io.Serializable;

import org.hibernate.FlushMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cgg.pro.model.Product;
@Repository
public class ProDaoImpl implements ProDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int savePro(Product p) {
		int id=(int) this.hibernateTemplate.save(p);
		return id;
	}
	


}
