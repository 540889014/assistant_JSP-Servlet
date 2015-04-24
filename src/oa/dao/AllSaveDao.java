package oa.dao;

import oa.domain.AdminUser;
import oa.domain.Role;
import oa.domain.User;

public interface AllSaveDao {

	public void save(AdminUser adminuser);
	public void save(Role role);
	public void save(User user);
}
