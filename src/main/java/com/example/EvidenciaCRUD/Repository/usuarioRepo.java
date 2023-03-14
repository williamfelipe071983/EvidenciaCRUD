
package com.example.EvidenciaCRUD.Repository;

import com.example.EvidenciaCRUD.Entity.usuario;
import org.springframework.data.repository.CrudRepository;


public interface usuarioRepo extends CrudRepository<usuario,Integer> {
    
}
