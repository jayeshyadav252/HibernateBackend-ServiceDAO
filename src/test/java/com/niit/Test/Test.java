package com.niit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.ServiceDAO.UserServiceDAO;
import com.niit.config.AppConfig;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppConfig.class)
public class Test {
	
	@Autowired
	UserServiceDAO userServiceDAO;
	
	

}
