package com.floristeria.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.floristeria.v1.Model.UsuarioModel;
import org.springframework.stereotype.Repository;




@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {


}



