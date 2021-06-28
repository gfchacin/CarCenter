/**
 * Mechanics_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.asesoftware.ws.client;

public interface Mechanics_PortType extends java.rmi.Remote {
    public co.com.asesoftware.ws.client.MechanicDto[] getAvailableMechanics(java.lang.String fechaProceso, int tamanoListado) throws java.rmi.RemoteException;
    public java.lang.String registerMechanics(co.com.asesoftware.ws.client.MechanicDto mechanic) throws java.rmi.RemoteException;
}
