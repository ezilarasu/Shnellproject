package com.shnell.shnellgo.repository;

import java.util.Optional;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shnell.shnellgo.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
		
	
	Optional<UserEntity> findByName(String name);
	
	@Modifying(clearAutomatically = true , flushAutomatically = true)
	@Query("update UserEntity user set user.role =:role where user.userId =:userId")
	int setAccessUser(String role , int userId);
	
}
