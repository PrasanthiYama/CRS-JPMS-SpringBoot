/**
 * 
 */
package com.jpms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jpms.modal.Course;
import com.jpms.modal.Professor;
import com.jpms.modal.Student;
import com.jpms.modal.User;

/**
 * @author Administrator
 *
 */

public interface AdminService {
	
	public Student generateReportCard(Student student);
	
	public  List<User> addProfessor(Professor professor);
	
	public Student approveStudentRegistration(Student student, Integer id);
	
	public List<Course> addCourse(Course course);
	
	public List<Course> removeCourse(Integer id);
}
