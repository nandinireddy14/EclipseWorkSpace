package cgginterns.hibernate.map2;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Courses {
	@Id
	@Column(name="course_id")
	private int courseId;
	@Column(name="course_name")
	private String courseName;
	@ManyToMany
	List<Student> Student;
	public Courses(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	public List<Student> getStudent() {
		return Student;
	}
	public void setStudent(List<Student> student) {
		Student = student;
	}
	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + "]";
	}
	
	
}
