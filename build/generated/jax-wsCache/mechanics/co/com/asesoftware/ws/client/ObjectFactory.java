
package co.com.asesoftware.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.asesoftware.ws.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAvailableMechanics_QNAME = new QName("http://service.mechanics.asesoftware.com.co/", "getAvailableMechanics");
    private final static QName _GetAvailableMechanicsResponse_QNAME = new QName("http://service.mechanics.asesoftware.com.co/", "getAvailableMechanicsResponse");
    private final static QName _RegisterMechanic_QNAME = new QName("http://service.mechanics.asesoftware.com.co/", "registerMechanic");
    private final static QName _RegisterMechanicResponse_QNAME = new QName("http://service.mechanics.asesoftware.com.co/", "registerMechanicResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.asesoftware.ws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAvailableMechanics }
     * 
     */
    public GetAvailableMechanics createGetAvailableMechanics() {
        return new GetAvailableMechanics();
    }

    /**
     * Create an instance of {@link GetAvailableMechanicsResponse }
     * 
     */
    public GetAvailableMechanicsResponse createGetAvailableMechanicsResponse() {
        return new GetAvailableMechanicsResponse();
    }

    /**
     * Create an instance of {@link RegisterMechanic }
     * 
     */
    public RegisterMechanic createRegisterMechanic() {
        return new RegisterMechanic();
    }

    /**
     * Create an instance of {@link RegisterMechanicResponse }
     * 
     */
    public RegisterMechanicResponse createRegisterMechanicResponse() {
        return new RegisterMechanicResponse();
    }

    /**
     * Create an instance of {@link MechanicDto }
     * 
     */
    public MechanicDto createMechanicDto() {
        return new MechanicDto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableMechanics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mechanics.asesoftware.com.co/", name = "getAvailableMechanics")
    public JAXBElement<GetAvailableMechanics> createGetAvailableMechanics(GetAvailableMechanics value) {
        return new JAXBElement<GetAvailableMechanics>(_GetAvailableMechanics_QNAME, GetAvailableMechanics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableMechanicsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mechanics.asesoftware.com.co/", name = "getAvailableMechanicsResponse")
    public JAXBElement<GetAvailableMechanicsResponse> createGetAvailableMechanicsResponse(GetAvailableMechanicsResponse value) {
        return new JAXBElement<GetAvailableMechanicsResponse>(_GetAvailableMechanicsResponse_QNAME, GetAvailableMechanicsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterMechanic }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mechanics.asesoftware.com.co/", name = "registerMechanic")
    public JAXBElement<RegisterMechanic> createRegisterMechanic(RegisterMechanic value) {
        return new JAXBElement<RegisterMechanic>(_RegisterMechanic_QNAME, RegisterMechanic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterMechanicResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mechanics.asesoftware.com.co/", name = "registerMechanicResponse")
    public JAXBElement<RegisterMechanicResponse> createRegisterMechanicResponse(RegisterMechanicResponse value) {
        return new JAXBElement<RegisterMechanicResponse>(_RegisterMechanicResponse_QNAME, RegisterMechanicResponse.class, null, value);
    }

}
