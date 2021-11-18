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
@DiscriminatorValue("ADMIN")
public class Admin extends User{
	
	@Column(name = "ADMINDOJ")
	public Date adminDoj;

	/**
	 * @return the adminDoj
	 */
	public Date getAdminDoj() {
		return adminDoj;
	}

	/**
	 * @param adminDoj the adminDoj to set
	 */
	public void setAdminDoj(Date adminDoj) {
		this.adminDoj = adminDoj;
	}

	
	
	

}
