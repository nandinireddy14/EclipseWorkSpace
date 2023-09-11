package cgg.spring.orm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import cgg.spring.orm.entities.Student;

public class StudentDaoImpl implements StudentDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	//save student
	@Override
	@Transactional(readOnly = false)
	public int insert(Student student) {
		//insert
		Integer i = (Integer) hibernateTemplate.save(student);
		return i;
	}

	//updating data
	@Override
	@Transactional
	public void update(Student student) {
		this.hibernateTemplate.update(student);
	}

	
	@Override
	@Transactional
	public void delete(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}

	//get one student data
	@Override
	public Student getStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}

	//get all students
	@Override
	public List<Student> getAllStudents() {
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		
		return students;
	}
	

}
