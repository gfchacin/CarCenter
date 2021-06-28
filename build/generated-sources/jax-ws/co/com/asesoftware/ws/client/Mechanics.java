
package co.com.asesoftware.ws.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Mechanics", targetNamespace = "http://service.mechanics.asesoftware.com.co/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Mechanics {


    /**
     * 
     * @return
     *     returns java.util.List<co.com.asesoftware.ws.client.MechanicDto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAvailableMechanics", targetNamespace = "http://service.mechanics.asesoftware.com.co/", className = "co.com.asesoftware.ws.client.GetAvailableMechanics")
    @ResponseWrapper(localName = "getAvailableMechanicsResponse", targetNamespace = "http://service.mechanics.asesoftware.com.co/", className = "co.com.asesoftware.ws.client.GetAvailableMechanicsResponse")
    @Action(input = "http://service.mechanics.asesoftware.com.co/Mechanics/getAvailableMechanicsRequest", output = "http://service.mechanics.asesoftware.com.co/Mechanics/getAvailableMechanicsResponse")
    public List<MechanicDto> getAvailableMechanics();

    /**
     * 
     * @param mechanic
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "registerMechanic", targetNamespace = "http://service.mechanics.asesoftware.com.co/", className = "co.com.asesoftware.ws.client.RegisterMechanic")
    @ResponseWrapper(localName = "registerMechanicResponse", targetNamespace = "http://service.mechanics.asesoftware.com.co/", className = "co.com.asesoftware.ws.client.RegisterMechanicResponse")
    @Action(input = "http://service.mechanics.asesoftware.com.co/Mechanics/registerMechanicRequest", output = "http://service.mechanics.asesoftware.com.co/Mechanics/registerMechanicResponse")
    public String registerMechanic(
        @WebParam(name = "mechanic", targetNamespace = "")
        MechanicDto mechanic);

}
