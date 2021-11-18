/**
 * 
 */
package com.jpms.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name = "COURSE")
public class Course {
	
	
	@Id
	@GeneratedValue
	public Integer courseId;
	
	@Column(name = "COURSECODE")
	public String courseCode;
	
	@Column(name = "NAME")
	public String name;
	
	@Column(name="ISOFFERED")
	public boolean isOffered;
	
	@Column(name="INSTRUCTOR")
	public String instructor;
	
	
	Course(){}




	/**
	 * @param courseId
	 * @param courseCode
	 * @param name
	 * @param isOffered
	 * @param instructor
	 */
	public Course(Integer courseId, String courseCode, String name, boolean isOffered, String instructor) {
		super();
		this.courseId = courseId;
		this.courseCode = courseCode;
		this.name = name;
		this.isOffered = isOffered;
		this.instructor = instructor;
	}




	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}

	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the isOffered
	 */
	public boolean isOffered() {
		return isOffered;
	}

	/**
	 * @param isOffered the isOffered to set
	 */
	public void setOffered(boolean isOffered) {
		this.isOffered = isOffered;
	}

	/**
	 * @return the instructor
	 */
	public String getInstructor() {
		return instructor;
	}

	/**
	 * @param instructor the instructor to set
	 */
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	

}
