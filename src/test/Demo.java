package test;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;


import com.justin.entity.UserInfo;
import com.justin.repository.UserRespository;


public class Demo {
	
	
	public static void main(String[] args) {
		
		new Demo().init();
	}
	
	public void init()
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserRespository respository =context.getBean(UserRespository.class);
//		UserInfo info=new UserInfo();
//		info.setAge(12);
//		info.setName("justin6");
//		respository.save(info);
		List<UserInfo> list=respository.queryLike("ju");
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			UserInfo userInfo = (UserInfo) iterator.next();
			System.out.println(userInfo.getName());
			
		}
		
		
		
	}
	
	
		
}
