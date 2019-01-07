package com.cssl.service;

import java.util.List;

import com.cssl.pojo.Users;
import com.github.pagehelper.Page;

public interface UsersService {
	
	public boolean saveUsers(Users user);
	
	public int deleteById(int id);
	
	public Page<Users> findAll(int pageIndex);

}
