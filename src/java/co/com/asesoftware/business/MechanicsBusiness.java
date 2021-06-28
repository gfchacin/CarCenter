/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.asesoftware.business;

import co.com.asesoftware.ws.client.MechanicDto;
import co.com.asesoftware.ws.client.MechanicsPortBindingStub;
import co.com.asesoftware.ws.client.Mechanics_PortType;
import co.com.asesoftware.ws.client.Mechanics_Service;
import co.com.asesoftware.ws.client.Mechanics_ServiceLocator;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.axis.AxisFault;

/**
 *
 * @author User
 */
public class MechanicsBusiness {
    
    public static String registerMechanics(String TpoDoc, String doc, String frNom, String scNom, String frApe, String scApe, String cel, String dir, String ema, String est) throws MalformedURLException, AxisFault, RemoteException
    {
    
        MechanicDto mechanic = new MechanicDto();
        mechanic.setDocumentType(TpoDoc);
        mechanic.setDocument(doc);
        mechanic.setFirstName(frNom);
        mechanic.setSecondName(scNom);
        mechanic.setFirstLastName(frApe);
        mechanic.setSecondLastName(scApe);
        mechanic.setPhone(cel);
        mechanic.setAddress(dir);
        mechanic.setEmail(ema);
        mechanic.setState(est);
        Mechanics_Service service = new Mechanics_ServiceLocator();
        Mechanics_PortType wsClient = new MechanicsPortBindingStub(new URL(service.getMechanicsPortAddress()),service);
        String stateExecution = wsClient.registerMechanics(mechanic);
        return stateExecution;
        
    }
    
    public static MechanicDto[] getAvailableMechanics() throws MalformedURLException, AxisFault, RemoteException
    {
        Mechanics_Service service = new Mechanics_ServiceLocator();
        Mechanics_PortType wsClient = new MechanicsPortBindingStub(new URL(service.getMechanicsPortAddress()),service);
        DateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
        return wsClient.getAvailableMechanics(fecha.format(new Date()), 10);
    }
    
}
