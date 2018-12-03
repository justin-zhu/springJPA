package com.justin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.RepositoryDefinition;

import com.justin.entity.UserInfo;
@RepositoryDefinition(domainClass=UserInfo.class,idClass=Integer.class)
public interface UserRespository{
	
	public UserInfo findByName(String name);
	public UserInfo findByNameLike(String name);
	public void save(UserInfo info);
	public List<UserInfo> findByNameStartingWithAndAgeLessThan(String name,Integer age);
	public List<UserInfo> findByNameEndingWithAndAgeLessThan(String name,Integer age);
	@Query("select u from UserInfo u where u.name like %?1%")
	public List<UserInfo> queryLike(String name);
}
