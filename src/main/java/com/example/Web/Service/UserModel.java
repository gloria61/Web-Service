package com.example.Web.Service;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class UserModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudent;
	
	//private String name;

	public Long getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Long idStudent) {
		this.idStudent = idStudent;
	}

	//public String getName() {
		//return name;
	//}

	//public void setName(String name) {
		//this.name = name;
	//}

	public UserModel(Long idStudent, String name) {
		super();
		this.idStudent = idStudent;
		//this.name = name;
	}
	
	public UserModel() {
		
	}
}
