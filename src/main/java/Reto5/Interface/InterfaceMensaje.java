package Reto5.Interface;

import Reto5.Modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ACGR
 */
public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer>{
    
}
