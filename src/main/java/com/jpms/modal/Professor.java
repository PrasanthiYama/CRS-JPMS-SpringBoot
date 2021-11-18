/**
 * 
 */
package com.jpms.modal;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Administrator
 *
 */
@Entity
@DiscriminatorValue("PROFESSOR")
public class Professor extends User{
	
	@Column(name = "DEPARTMENT")
	public String department;
	
	@Column(name = "DESIGNATION")
	public String designation;
	
	@Column(name = "PROFESSORDOJ")
	public Date doj;

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the doj
	 */
	public Date getDoj() {
		return doj;
	}

	/**
	 * @param doj the doj to set
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	
	

}
