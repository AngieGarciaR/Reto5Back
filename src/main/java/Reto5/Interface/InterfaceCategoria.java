package Reto5.Interface;

import Reto5.Modelo.Categoria;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ACGR
 */
public interface InterfaceCategoria extends CrudRepository<Categoria,Integer> {
    
}
