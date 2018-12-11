
package com.classicmodels7b.dao;

import com.classicmodels7b.model.OfficesModel;
import java.util.ArrayList;

/**
 *
 * @author MOISES
 */
public interface OfficesDao {

    //recibe un objeto de tipo officesmodel y 
    //crea una nueva oficina en la base de datos
    public String createOffices(OfficesModel newOffice);
    
    //devuelve un listado de las oficinas
    //almacenadas en la tabla de Offices
    public ArrayList<OfficesModel> readOffices();
    
    //Recibe un objeto de tipo OfficeModel y
    //actualiza una oficina
    public String updateOffices(OfficesModel auxOffice);
    
    //Borra una oficina de la tabls  Offices
    //de acuerdo al ID recibido
    public String deleteOffices(String officeCode);
}
