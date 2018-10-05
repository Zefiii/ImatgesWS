/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.imatges;

import java.awt.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.me.clas.Imatge;

/**
 *
 * @author oriol
 */
@WebService(serviceName = "ImatgesWs")
public class ImatgesWs {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "registerImage")
    public int registerImage(@WebParam(name = "image") Imatge image) {
        //TODO write your implementation code here:
        return 0;
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
