/**
 * 
 */
package com.jpms.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpms.modal.Professor;
import com.jpms.modal.Student;
import com.jpms.modal.User;

/**
 * @author Administrator
 *
 */
@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

	
	Optional<Student> findUserByStudentId(Integer studentId);

}
