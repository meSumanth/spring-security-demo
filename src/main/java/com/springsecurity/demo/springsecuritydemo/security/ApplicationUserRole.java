/**
 * 
 */
package com.springsecurity.demo.springsecuritydemo.security;

import java.util.Set;

import com.google.common.collect.Sets;

/**
 * @author Sumanth
 *
 */
public enum ApplicationUserRole {
	STUDENT(Sets.newHashSet()),
	ADMIN(Sets.newHashSet(ApplicationRolePermissions.COURSE_READ, ApplicationRolePermissions.COURSE_WRITE)), ;
	
	private final Set<ApplicationRolePermissions> permissions;
	
	ApplicationUserRole(Set<ApplicationRolePermissions> permissions){
		this.permissions = permissions;
	}

}
