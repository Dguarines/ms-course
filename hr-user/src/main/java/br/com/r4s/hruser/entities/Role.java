package br.com.r4s.hruser.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_role")
public class Role implements Serializable{
	
	private static final long serialVersionUID = 2677198411468287698L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String roleName;
	
	public Role() {
	}
	
	public Role(Long id, String roleName) {
		this.id = id;
		this.roleName = roleName;
	}
}
