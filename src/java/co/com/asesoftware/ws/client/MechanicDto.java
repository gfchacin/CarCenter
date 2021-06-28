/**
 * MechanicDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.asesoftware.ws.client;

public class MechanicDto  implements java.io.Serializable {
    private java.lang.String address;

    private java.lang.String document;

    private java.lang.String documentType;

    private java.lang.String email;

    private java.lang.String firstLastName;

    private java.lang.String firstName;

    private int horasTrabajadas;

    private java.lang.String phone;

    private java.lang.String secondLastName;

    private java.lang.String secondName;

    private java.lang.String state;

    public MechanicDto() {
    }

    public MechanicDto(
           java.lang.String address,
           java.lang.String document,
           java.lang.String documentType,
           java.lang.String email,
           java.lang.String firstLastName,
           java.lang.String firstName,
           int horasTrabajadas,
           java.lang.String phone,
           java.lang.String secondLastName,
           java.lang.String secondName,
           java.lang.String state) {
           this.address = address;
           this.document = document;
           this.documentType = documentType;
           this.email = email;
           this.firstLastName = firstLastName;
           this.firstName = firstName;
           this.horasTrabajadas = horasTrabajadas;
           this.phone = phone;
           this.secondLastName = secondLastName;
           this.secondName = secondName;
           this.state = state;
    }


    /**
     * Gets the address value for this MechanicDto.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this MechanicDto.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the document value for this MechanicDto.
     * 
     * @return document
     */
    public java.lang.String getDocument() {
        return document;
    }


    /**
     * Sets the document value for this MechanicDto.
     * 
     * @param document
     */
    public void setDocument(java.lang.String document) {
        this.document = document;
    }


    /**
     * Gets the documentType value for this MechanicDto.
     * 
     * @return documentType
     */
    public java.lang.String getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this MechanicDto.
     * 
     * @param documentType
     */
    public void setDocumentType(java.lang.String documentType) {
        this.documentType = documentType;
    }


    /**
     * Gets the email value for this MechanicDto.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this MechanicDto.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the firstLastName value for this MechanicDto.
     * 
     * @return firstLastName
     */
    public java.lang.String getFirstLastName() {
        return firstLastName;
    }


    /**
     * Sets the firstLastName value for this MechanicDto.
     * 
     * @param firstLastName
     */
    public void setFirstLastName(java.lang.String firstLastName) {
        this.firstLastName = firstLastName;
    }


    /**
     * Gets the firstName value for this MechanicDto.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this MechanicDto.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the horasTrabajadas value for this MechanicDto.
     * 
     * @return horasTrabajadas
     */
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }


    /**
     * Sets the horasTrabajadas value for this MechanicDto.
     * 
     * @param horasTrabajadas
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }


    /**
     * Gets the phone value for this MechanicDto.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this MechanicDto.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the secondLastName value for this MechanicDto.
     * 
     * @return secondLastName
     */
    public java.lang.String getSecondLastName() {
        return secondLastName;
    }


    /**
     * Sets the secondLastName value for this MechanicDto.
     * 
     * @param secondLastName
     */
    public void setSecondLastName(java.lang.String secondLastName) {
        this.secondLastName = secondLastName;
    }


    /**
     * Gets the secondName value for this MechanicDto.
     * 
     * @return secondName
     */
    public java.lang.String getSecondName() {
        return secondName;
    }


    /**
     * Sets the secondName value for this MechanicDto.
     * 
     * @param secondName
     */
    public void setSecondName(java.lang.String secondName) {
        this.secondName = secondName;
    }


    /**
     * Gets the state value for this MechanicDto.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this MechanicDto.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MechanicDto)) return false;
        MechanicDto other = (MechanicDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.document==null && other.getDocument()==null) || 
             (this.document!=null &&
              this.document.equals(other.getDocument()))) &&
            ((this.documentType==null && other.getDocumentType()==null) || 
             (this.documentType!=null &&
              this.documentType.equals(other.getDocumentType()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.firstLastName==null && other.getFirstLastName()==null) || 
             (this.firstLastName!=null &&
              this.firstLastName.equals(other.getFirstLastName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            this.horasTrabajadas == other.getHorasTrabajadas() &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.secondLastName==null && other.getSecondLastName()==null) || 
             (this.secondLastName!=null &&
              this.secondLastName.equals(other.getSecondLastName()))) &&
            ((this.secondName==null && other.getSecondName()==null) || 
             (this.secondName!=null &&
              this.secondName.equals(other.getSecondName()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getDocument() != null) {
            _hashCode += getDocument().hashCode();
        }
        if (getDocumentType() != null) {
            _hashCode += getDocumentType().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFirstLastName() != null) {
            _hashCode += getFirstLastName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        _hashCode += getHorasTrabajadas();
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getSecondLastName() != null) {
            _hashCode += getSecondLastName().hashCode();
        }
        if (getSecondName() != null) {
            _hashCode += getSecondName().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MechanicDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.mechanics.asesoftware.com.co/", "mechanicDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("document");
        elemField.setXmlName(new javax.xml.namespace.QName("", "document"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horasTrabajadas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "horasTrabajadas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
