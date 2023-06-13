package cgginterns.hibernate.map3;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
		@Id
		@Column(name="emp_id")
		private int empid;
		@Column(name="emp_name")
		private String empName;
		
		@ManyToMany
		@JoinTable(name="emp_proj",joinColumns= {@JoinColumn(name="eid")},inverseJoinColumns= {@JoinColumn(name="pid")})
		List<Projects> projects;
		
		public Employee(int empid, String empName) {
			super();
			this.empid = empid;
			this.empName = empName;
		}
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		

		public List<Projects> getProjects() {
			return projects;
		}
		public void setProjects(List<Projects> projects) {
			this.projects = projects;
		}
		@Override
		public String toString() {
			return "Employee [empid=" + empid + ", empName=" + empName + "]";
		}
		
		
}
