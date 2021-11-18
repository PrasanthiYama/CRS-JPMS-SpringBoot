/**
 * 
 */
package com.jpms.modal;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Administrator
 *
 */
@Entity
@Table(name = "USER")
@DiscriminatorColumn(name="ROLE",discriminatorType = DiscriminatorType.STRING, length = 30)
public class User {
	
	@Id
	@GeneratedValue
	@Column(name="USERID")
	public Long userId;
	
	@Column(name="NAME")
	public String name;
	

	User(){}
	

	/**
	 * @param userId
	 * @param name
	 */
	public User(Long userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
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

}
