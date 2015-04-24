package oa.dao.impl;

import org.springframework.stereotype.Repository;

import oa.base.BaseDaoImpl;
import oa.dao.UserDao;
import oa.domain.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	// public UserDaoImpl(){
	// clazz = User.class;
	// }
}
