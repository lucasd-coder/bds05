package com.devsuperior.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.movieflix.entites.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
