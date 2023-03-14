
package controller;

import com.example.EvidenciaCRUD.Entity.usuario;
import com.example.EvidenciaCRUD.controller.usuarioServiceMPL.PSIMPL;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.http.HttpStatus.CREATED;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("CRUDRepo")
public class Controlador {
    
    @Autowired
    private PSIMPL impl;
    
    @GetMapping
    @RequestMapping(value="Consultarusuario",method = RequestMethod.GET)
    public ResponseEntity<?> Consultarusuarios(){
        List<usuario>Listausuario=this.impl.Consultarusuario();
        return ResponseEntity.ok(Listausuario);
    }    
    
     @PostMapping
    @RequestMapping(value="Crearusuario",method = RequestMethod.POST)
    public ResponseEntity<?> Crearusuarios(@RequestBody usuario usuario){
        usuario usuariocreado=this.impl.Crearusuario(usuario);
        return ResponseEntity.status(CREATED).body(usuariocreado);
    }   
    
    @PutMapping
    @RequestMapping(value="modificarusuario",method = RequestMethod.PUT)
    public ResponseEntity<?> modificarusuario(@RequestBody usuario usuario){
        usuario usuariomodificado=this.impl.modificarusuario(usuario);
        return ResponseEntity.status(CREATED).body(usuariomodificado);
    }   
    
    @GetMapping
    @RequestMapping(value="Consultarusuario/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> Consultarusuario(@PathVariable int id){
        usuario usuario=this.impl.Consultarusuario(id);
        return ResponseEntity.ok(usuario);
    }  
    
     @DeleteMapping
    @RequestMapping(value="Eliminarusuario/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> Eliminarusuario(@PathVariable int id){
        this.impl.Eliminarusuario(id);
        return ResponseEntity.ok().build();
    }    
    
}
