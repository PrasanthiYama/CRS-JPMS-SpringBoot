/**
 * 
 */
package com.jpms.dao;

import org.springframework.stereotype.Repository;

import com.jpms.modal.Course;
import com.jpms.modal.Professor;
import com.jpms.modal.Student;

/**
 * @author Administrator
 *
 */
@Repository
public class AdminDao {
	

	public  boolean generateReportCard(Student student) {
		return false;
	}
	
	public boolean addProfessor(Professor professor)
	{
		return false;
	}
	
	public boolean approveStudentRegistration(Student student) {
		return false;
	}
	
	public boolean addCourse(Course course) {
		return false;
	}
	
	public Long removeCourse(Long id) {
//		
//		for (Course c : courses) {
//			if (c.getId().equals(id)) {
//				customers.remove(c);
//				return id;
//			}
//		}

		return null;
		
	}
}
