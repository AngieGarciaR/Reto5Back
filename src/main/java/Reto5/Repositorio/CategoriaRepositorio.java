package Reto5.Repositorio;

import Reto5.Interface.InterfaceCategoria;
import Reto5.Modelo.Categoria;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ACGR
 */
@Repository
public class CategoriaRepositorio {
       @Autowired
    private InterfaceCategoria crud2;
    
     public List<Categoria> getAll(){
        return (List<Categoria>) crud2. findAll();       
    }
    
    public Optional <Categoria> getCategoria(int id){
        return crud2.findById(id);
    }
    
    public Categoria save(Categoria categoria){
        return crud2.save(categoria);
    }
     public void delete(Categoria categoria){
        crud2.delete(categoria);
    }
}
