package cgg.ecom.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="category_id")
private int categoryId;
	@Column(name="category_name")
private String categoryName;
	@Column(name="category_desc")
private String categoryDesc;
public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getCategoryDesc() {
	return categoryDesc;
}
public void setCategoryDesc(String categoryDesc) {
	this.categoryDesc = categoryDesc;
}
public Category( String categoryName, String categoryDesc) {
	super();
	this.categoryName = categoryName;
	this.categoryDesc = categoryDesc;
}
public Category() {
	super();
	// TODO Auto-generated constructor stub
}

}
