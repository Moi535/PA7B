
package com.classicmodels7b.controller;

import com.classicmodels7b.dao.OfficesDaoImpl;
import com.classicmodels7b.model.OfficesModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MOISES
 */
public class OfficesController {
    OfficesDaoImpl officesDaoImple = new OfficesDaoImpl();
    
    public String createOffices(String officeCode, String city, String phone, String addressLine1, String addressLine2, String state, String country, String postalCode, String territory){
        OfficesModel newOffice;
        newOffice = new OfficesModel(officeCode, city, phone, addressLine1, addressLine2, state, country, postalCode, territory);
        String serverAnswer = officesDaoImple.createOffices(newOffice);
        
        return serverAnswer;
    }
    
    public void readOffices(JTable table){
        DefaultTableModel tableModel = new DefaultTableModel();
        
        /*Agregar encabezados*/
        
        tableModel.addColumn("OFFICE CODE");
        tableModel.addColumn("CITY");
        tableModel.addColumn("PHONE");
        tableModel.addColumn("ADDRESS LINE 1");
        tableModel.addColumn("ADDRESS LINE 2");
        tableModel.addColumn("STATE");
        tableModel.addColumn("COUNTRY");
        tableModel.addColumn("POSTAL CODE");
        tableModel.addColumn("TERRITORY");
        
        int numRegisters = officesDaoImple.readOffices().size();
        
        Object[] row = new Object[9];
        
        for (int i = 0; i < numRegisters; i++){
            row[0] = officesDaoImple.readOffices().get(i).getOfficeCode();
            row[1] = officesDaoImple.readOffices().get(i).getCity();
            row[2] = officesDaoImple.readOffices().get(i).getPhone();
            row[3] = officesDaoImple.readOffices().get(i).getAddressLine1();
            row[4] = officesDaoImple.readOffices().get(i).getAddressLine2();
            row[5] = officesDaoImple.readOffices().get(i).getState();
            row[6] = officesDaoImple.readOffices().get(i).getCountry();
            row[7] = officesDaoImple.readOffices().get(i).getPostalCode();
            row[8] = officesDaoImple.readOffices().get(i).getTerritory();
            
            tableModel.addRow(row);
        }
        table.setModel(tableModel);
    }
    public void updateOffice(){
        
    }
    
    public void deleteOffices(String officeCode){
    
        officesDaoImple.deleteOffices(officeCode);
    }
    
}
