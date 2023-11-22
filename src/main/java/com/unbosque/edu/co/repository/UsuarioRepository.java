package com.unbosque.edu.co.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unbosque.edu.co.entity.User;


@Repository
public interface UsuarioRepository extends JpaRepository<User, String> {
}
