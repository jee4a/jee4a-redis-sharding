package com.jee4a.redis.sharding;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.stereotype.Component;

import com.jee4a.redis.sharding.common.model.UserModel;
import com.jee4a.redis.sharding.manager.UserManger;

/**
 * <p></p> 
 * @author tpeng 2018年1月3日
 * @email 398222836@qq.com
 */
@Component
public class UserTest extends BaseJunitTest {

	@Resource
	private UserManger userManger ;
	
	@Test
	public void test0() {
		UserModel user =new UserModel();
		user.setId(1);
		user.setNick("Mr.t");
		user.setPhone("18673176225");
		user.setUserName("唐鹏");
		user.setLastLoginTime(new Date());
		userManger.addUser(user);
	}
}
