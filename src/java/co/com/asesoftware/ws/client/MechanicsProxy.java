package co.com.asesoftware.ws.client;

public class MechanicsProxy implements co.com.asesoftware.ws.client.Mechanics_PortType {
  private String _endpoint = null;
  private co.com.asesoftware.ws.client.Mechanics_PortType mechanics_PortType = null;
  
  public MechanicsProxy() {
    _initMechanicsProxy();
  }
  
  public MechanicsProxy(String endpoint) {
    _endpoint = endpoint;
    _initMechanicsProxy();
  }
  
  private void _initMechanicsProxy() {
    try {
      mechanics_PortType = (new co.com.asesoftware.ws.client.Mechanics_ServiceLocator()).getMechanicsPort();
      if (mechanics_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mechanics_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mechanics_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mechanics_PortType != null)
      ((javax.xml.rpc.Stub)mechanics_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.com.asesoftware.ws.client.Mechanics_PortType getMechanics_PortType() {
    if (mechanics_PortType == null)
      _initMechanicsProxy();
    return mechanics_PortType;
  }
  
  public co.com.asesoftware.ws.client.MechanicDto[] getAvailableMechanics(java.lang.String fechaProceso, int tamanoListado) throws java.rmi.RemoteException{
    if (mechanics_PortType == null)
      _initMechanicsProxy();
    return mechanics_PortType.getAvailableMechanics(fechaProceso, tamanoListado);
  }
  
  public java.lang.String registerMechanics(co.com.asesoftware.ws.client.MechanicDto mechanic) throws java.rmi.RemoteException{
    if (mechanics_PortType == null)
      _initMechanicsProxy();
    return mechanics_PortType.registerMechanics(mechanic);
  }
  
  
}