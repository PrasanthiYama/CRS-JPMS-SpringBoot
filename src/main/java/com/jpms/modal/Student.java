/**
 * 
 */
package com.jpms.modal;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Administrator
 *
 */
@Entity
@DiscriminatorValue("STUDENT")
public class Student extends User{
	
	@Column(name = "STUDENTID")
	public int studentId;
	
	@Column(name = "BRANCH")
	public String branch;
	
	@Column(name = "BATCH")
	public int batch;
	
	@Column(name = "ISAPPROVE")
	public boolean isApprove;
	
	Student() {}

	/**
	 * @param studentId
	 * @param branch
	 * @param batch
	 * @param isApprove
	 */
	public Student(int studentId, String branch, int batch, boolean isApprove) {
		super();
		this.studentId = studentId;
		this.branch = branch;
		this.batch = batch;
		this.isApprove = isApprove;
	}

	/**
	 * @return the isApprove
	 */
	public boolean isApprove() {
		return isApprove;
	}

	/**
	 * @param isApprove the isApprove to set
	 */
	public void setApprove(boolean isApprove) {
		this.isApprove = isApprove;
	}

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the branch
	 */
	public String getBranch() {
		return branch;
	}

	/**
	 * @param branch the branch to set
	 */
	public void setBranch(String branch) {
		this.branch = branch;
	}

	/**
	 * @return the batch
	 */
	public int getBatch() {
		return batch;
	}

	/**
	 * @param batch the batch to set
	 */
	public void setBatch(int batch) {
		this.batch = batch;
	}
	
	

}
