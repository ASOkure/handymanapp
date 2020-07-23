package com.aksam.dao;

import com.aksam.entity.Role;

public interface RoleDao {
	
	public Role findRoleByName(String theRoleName);

}
