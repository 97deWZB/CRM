package com.briup.crm.service;

import com.briup.crm.bean.SysUser;
import com.github.pagehelper.PageInfo;

public interface UserService {
	public SysUser login(String name,String password)throws Exception;
	public PageInfo<SysUser> findAllUser(int curPage,int size);
	
	public void saveOrUpdate(SysUser user);
	
	public void deleteUserById(long id);
	
	public SysUser findUserById(long id);
}
