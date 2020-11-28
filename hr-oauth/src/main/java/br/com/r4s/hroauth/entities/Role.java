package br.com.r4s.hroauth.entities;

import java.io.Serializable;

import lombok.Data;

@Data
public class Role implements Serializable{
	
	private static final long serialVersionUID = 2677198411468287698L;
	
	private Long id;
	private String roleName;
	
	public Role() {
	}
	
	public Role(Long id, String roleName) {
		this.id = id;
		this.roleName = roleName;
	}
}
