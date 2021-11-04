package com.dem.demo.repository;



import com.dem.demo.entity.AuthRoleEntity;
import com.dem.demo.entityDTO.AuthRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthRoleRepository extends JpaRepository<AuthRoleEntity, Long> {
    Optional<AuthRoleEntity> findByName(AuthRole name);
}
