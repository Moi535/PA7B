
package com.classicmodels7b.dao;

import com.classicmodels7b.model.OfficesModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author MOISES
 */
public class OfficesDaoImpl implements OfficesDao{

    Conexion con = new Conexion();
    
    @Override
    public String createOffices(OfficesModel newOffice) {
        String serverAnswer=null;
        try {
            PreparedStatement preparedStatement = con.getConnection().prepareStatement("INSERT INTO offices(officeCode, city,"
            + "phone, addressLine1, addressLine2, state, country, postalCode, territory) VALUES (?,?,?,?,?,?,?,?,?)");
            preparedStatement.setString(1, newOffice.getOfficeCode());
            preparedStatement.setString(2, newOffice.getCity());
            preparedStatement.setString(3, newOffice.getPhone());
            preparedStatement.setString(4, newOffice.getAddressLine1());
            preparedStatement.setString(5, newOffice.getAddressLine2());
            preparedStatement.setString(6, newOffice.getState());
            preparedStatement.setString(7, newOffice.getCountry());
            preparedStatement.setString(8, newOffice.getPostalCode());
            preparedStatement.setString(9, newOffice.getTerritory());
            
            int numAffectedRows = preparedStatement.executeUpdate();
            
            if (numAffectedRows > 0) {
                serverAnswer = "The office was inserted";
            }
            
        } catch (SQLException e) {
            System.out.println("ERROR " + e.getMessage());
            serverAnswer = "There was an error";
        }
        return serverAnswer;
    }

    @Override
    public ArrayList<OfficesModel> readOffices() {
        ArrayList<OfficesModel> officesList = new ArrayList();
        OfficesModel auxOffice;
        
        try {
            PreparedStatement preparedStatement = con.getConnection().prepareStatement("SELECT * FROM offices");
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()){
                auxOffice = new OfficesModel();
                auxOffice.setOfficeCode(resultSet.getString(1));
                auxOffice.setCity(resultSet.getString(2));
                auxOffice.setPhone(resultSet.getString(3));
                auxOffice.setAddressLine1(resultSet.getString(4));
                auxOffice.setAddressLine2(resultSet.getString(5));
                auxOffice.setState(resultSet.getString(6));
                auxOffice.setCountry(resultSet.getString(7));
                auxOffice.setPostalCode(resultSet.getString(8));
                auxOffice.setTerritory(resultSet.getString(9));
                
                officesList.add(auxOffice);
            }
        } catch (SQLException e) {
            System.out.println("ERROR"+ e.getMessage());
        }
        
        return officesList;
    }
    
    @Override
    public String updateOffices(OfficesModel auxOffice) {
        String serverAnswer=null;
        try {
            PreparedStatement preparedStatement = con.getConnection().prepareStatement("UPDATE office SET officeCode = ?, city = ?,"
                    + "phone = ?, addressLine1 = ?, addressLine2 = ?, state = ?, country = ?, postalCode = ?, territory = ? ");
            preparedStatement.setString(1, auxOffice.getOfficeCode());
            preparedStatement.setString(2, auxOffice.getCity());
            preparedStatement.setString(3, auxOffice.getPhone());
            preparedStatement.setString(4, auxOffice.getAddressLine1());
            preparedStatement.setString(5, auxOffice.getAddressLine2());
            preparedStatement.setString(6, auxOffice.getState());
            preparedStatement.setString(7, auxOffice.getCountry());
            preparedStatement.setString(8, auxOffice.getPostalCode());
            preparedStatement.setString(9, auxOffice.getTerritory());
            
            int numAffectedRows = preparedStatement.executeUpdate();
            
            if (numAffectedRows > 0) {
                serverAnswer = "The office was updated";
            }
            
        } catch (SQLException e) {
            System.out.println("ERROR " + e.getMessage());
            serverAnswer = "There was an error";
        }
        return serverAnswer;
    }    

    @Override
    public String deleteOffices(String officeCode) {
        String ServerAnswer = null;
        try {
            PreparedStatement preparedStatement = con.getConnection().prepareStatement("DELETE FROM offices WHERE officeCode = ?");
            
        } catch (SQLException e) {
            System.out.println("ERROR " + e.getMessage());
        }
        return ServerAnswer;
    }
}
