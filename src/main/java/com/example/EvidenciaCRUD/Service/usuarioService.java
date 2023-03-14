
package com.example.EvidenciaCRUD.Service;

import com.example.EvidenciaCRUD.Entity.usuario;
import java.util.List;


public interface usuarioService {
    
    public List<usuario> Consultarusuario();
    
    public usuario Crearusuario(usuario usuario);
    
    public usuario modificarusuario(usuario usuario);
    
    public usuario Buscarusuario(int id);
    
    public void Eliminarusuario(int id);
    
    
}
