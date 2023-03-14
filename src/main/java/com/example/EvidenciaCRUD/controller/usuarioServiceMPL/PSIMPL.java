
package com.example.EvidenciaCRUD.controller.usuarioServiceMPL;

import com.example.EvidenciaCRUD.Entity.usuario;
import com.example.EvidenciaCRUD.Repository.usuarioRepo;
import com.example.EvidenciaCRUD.Service.usuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class PSIMPL implements usuarioService{
    
    @Autowired
    private usuarioRepo repo;

    @Override
    public List<usuario> Consultarusuario() {
        return (List<usuario>)this.repo.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public usuario Crearusuario(usuario usuario) {
        usuario.setCorreo(usuario.getCorreo());
        return this.repo.save(usuario); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public usuario modificarusuario(usuario usuario) {
        return this.repo.save(usuario);   // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public usuario Buscarusuario(int id) {
        return this.repo.findById(id).get(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void Eliminarusuario(int id) {
        this.repo.deleteById(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public usuario Consultarusuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
