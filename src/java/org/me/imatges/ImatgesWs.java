/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.imatges;

import java.awt.List;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.servlet.ServletException;
import org.me.clas.Imatge;

/**
 *
 * @author oriol
 */
@WebService(serviceName = "ImatgesWs")
public class ImatgesWs {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "registerImage")
    public int registerImage(@WebParam(name = "image") Imatge image)
        throws ServletException, IOException{
        //TODO write your implementation code here:
        String titol = image.getTitol();
        String autor = image.getAutor();
        String data = image.getDataCreacio();
        String descripcio = image.getDescripcio();
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error class.forname");
        }
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\oriol\\OneDrive\\Escritorio\\loquesea.db");
            PreparedStatement statement = conn.prepareStatement("insert into imagenes values (?, ?, ?, ?, ?, ? , ?)");
           statement.setString(1, "DEmomentnose");
           statement.setString(2, "someususari");
           statement.setString(3, titol);
           statement.setString(4, descripcio);
           statement.setString(5, "algunes paraules");
           statement.setString(6, autor);
           statement.setString(7, data);
           statement.executeUpdate();
            return 1;
        }
        catch(SQLException ex){
            return 0;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ModifyImage")
    public int ModifyImage(@WebParam(name = "image") Imatge image) {
        //TODO write your implementation code here:
        return 0;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listImages")
    public List listImages() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "searchbyId")
    public Imatge searchbyId(@WebParam(name = "id") int id) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "searchbyTitle")
    public List searchbyTitle(@WebParam(name = "title") String title) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "searchbyCreaDate")
    public List searchbyCreaDate(@WebParam(name = "creaDate") String creaDate) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "searchbyAutor")
    public List searchbyAutor(@WebParam(name = "autor") String autor) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "searchbyKeyWord")
    public List searchbyKeyWord(@WebParam(name = "keyWords") String keyWords) {
        //TODO write your implementation code here:
        return null;
    }

}
