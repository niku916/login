package com.login.login.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.login.Entity.UserManagementEntity;

@Repository
public interface LoginRepo extends JpaRepository<UserManagementEntity, Integer> {

	Optional<UserManagementEntity> findByUserNameAndPassword(String userName, String password);

}
