/**
 * 
 */
package com.jpms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpms.modal.Course;
import com.jpms.modal.Professor;
import com.jpms.modal.Student;
import com.jpms.modal.User;
import com.jpms.repository.CourseRepository;
import com.jpms.repository.UserRepository;
import com.jpms.service.AdminService;

/**
 * @author Administrator
 *
 */
@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CourseRepository courseRepository;

	@Override
	public Student generateReportCard(Student newStudent) {
		
		return null;
	}

	@Override
	public List<User> addProfessor(Professor professor) {
		userRepository.save(professor);
		return userRepository.findAll();
	}

	@Override
	public Student approveStudentRegistration(Student std, Integer id) {
		
		return userRepository.findUserByStudentId(id)
			.map(student ->{
				student.setName(std.getName());
				student.setApprove(true);
				student.setBatch(std.getBatch());
				student.setBranch(std.getBranch());
				student.setStudentId(std.getStudentId());
				return userRepository.save(student);
		}).orElseGet(() ->{
			 std.setStudentId(id);
			 return userRepository.save(std);
		 });
				
	}

	@Override
	public List<Course> addCourse(Course course) {
		courseRepository.save(course);
		return courseRepository.findAll();
	}

	@Override
	public List<Course> removeCourse(Integer id) {
	
		 courseRepository.deleteById(id);		 
		 return courseRepository.findAll();
	}

}
