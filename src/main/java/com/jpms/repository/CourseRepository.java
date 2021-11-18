/**
 * 
 */
package com.jpms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpms.modal.Course;


/**
 * @author Administrator
 *
 */
@Repository
public interface CourseRepository  extends JpaRepository<Course,Integer>{

}
