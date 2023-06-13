package cgginterns.hibernate.map3;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Projects {
	@Id
	@Column(name="project_id")
	private int pid;
	@Column(name="project_name")
	private String pName;
	@ManyToMany(mappedBy="projects")
	List<Employee> employee;
	public Projects(int pid, String pName) {
		super();
		this.pid = pid;
		this.pName = pName;
	}
	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Projects [pid=" + pid + ", pName=" + pName + "]";
	}
	
}
