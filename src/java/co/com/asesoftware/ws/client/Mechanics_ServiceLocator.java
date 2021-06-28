/**
 * Mechanics_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.asesoftware.ws.client;

public class Mechanics_ServiceLocator extends org.apache.axis.client.Service implements co.com.asesoftware.ws.client.Mechanics_Service {

    public Mechanics_ServiceLocator() {
    }


    public Mechanics_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Mechanics_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MechanicsPort
    private java.lang.String MechanicsPort_address = "http://localhost:8080/WSCarcenterV1/Mechanics";

    public java.lang.String getMechanicsPortAddress() {
        return MechanicsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MechanicsPortWSDDServiceName = "MechanicsPort";

    public java.lang.String getMechanicsPortWSDDServiceName() {
        return MechanicsPortWSDDServiceName;
    }

    public void setMechanicsPortWSDDServiceName(java.lang.String name) {
        MechanicsPortWSDDServiceName = name;
    }

    public co.com.asesoftware.ws.client.Mechanics_PortType getMechanicsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MechanicsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMechanicsPort(endpoint);
    }

    public co.com.asesoftware.ws.client.Mechanics_PortType getMechanicsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            co.com.asesoftware.ws.client.MechanicsPortBindingStub _stub = new co.com.asesoftware.ws.client.MechanicsPortBindingStub(portAddress, this);
            _stub.setPortName(getMechanicsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMechanicsPortEndpointAddress(java.lang.String address) {
        MechanicsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (co.com.asesoftware.ws.client.Mechanics_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                co.com.asesoftware.ws.client.MechanicsPortBindingStub _stub = new co.com.asesoftware.ws.client.MechanicsPortBindingStub(new java.net.URL(MechanicsPort_address), this);
                _stub.setPortName(getMechanicsPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("MechanicsPort".equals(inputPortName)) {
            return getMechanicsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.mechanics.asesoftware.com.co/", "Mechanics");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.mechanics.asesoftware.com.co/", "MechanicsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MechanicsPort".equals(portName)) {
            setMechanicsPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
