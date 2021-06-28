
package co.com.asesoftware.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para registerMechanic complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="registerMechanic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mechanic" type="{http://service.mechanics.asesoftware.com.co/}mechanicDto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerMechanic", propOrder = {
    "mechanic"
})
public class RegisterMechanic {

    protected MechanicDto mechanic;

    /**
     * Obtiene el valor de la propiedad mechanic.
     * 
     * @return
     *     possible object is
     *     {@link MechanicDto }
     *     
     */
    public MechanicDto getMechanic() {
        return mechanic;
    }

    /**
     * Define el valor de la propiedad mechanic.
     * 
     * @param value
     *     allowed object is
     *     {@link MechanicDto }
     *     
     */
    public void setMechanic(MechanicDto value) {
        this.mechanic = value;
    }

}
