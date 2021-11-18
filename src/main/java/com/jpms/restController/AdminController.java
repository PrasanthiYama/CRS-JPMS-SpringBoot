/**
 * 
 */
package com.jpms.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpms.modal.Course;
import com.jpms.modal.Professor;
import com.jpms.modal.Student;
import com.jpms.modal.User;
import com.jpms.repository.UserRepository;
import com.jpms.service.AdminService;

/**
 * @author Administrator
 *
 */
@RestController
@CrossOrigin
public class AdminController {
	
	@Autowired
	public AdminService adminService;
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value="/studentRegistration/{id}",method = RequestMethod.PUT)
	public Student approveStudentRegistration(@RequestBody Student student,@PathVariable("id") Integer id) {	
		
		return adminService.approveStudentRegistration(student, id);
		
	}
	
//	@RequestMapping(value="/post/reportCard",method = RequestMethod.POST)
//	public ResponseEntity generateReportCard(@RequestBody Student student) {
//		
//		adminService.generateReportCard(student);
//		
//		return new ResponseEntity(student, HttpStatus.OK);
//		
//	}
	
	@RequestMapping(value="/post/addProfessor",method = RequestMethod.POST)
	public ResponseEntity addprofessor(@RequestBody Professor professor) {
		
		adminService.addProfessor(professor);
		
		return new ResponseEntity(professor, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/users",method = RequestMethod.GET)
	public List<User> getUsers() {
		
		return userRepository.findAll();
		
	}
	
	@RequestMapping(value="/post/addCourse",method = RequestMethod.POST)
	public ResponseEntity addCourse(@RequestBody Course course) {
		
		adminService.addCourse(course);
		
		return new ResponseEntity(course, HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/courses/{id}")
	public ResponseEntity deleteCustomer(@PathVariable Integer id) {

		if (null == adminService.removeCourse(id)) {
			return new ResponseEntity("No Courses found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(id, HttpStatus.OK);

	}
	
	

}
