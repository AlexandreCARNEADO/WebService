package SystemeAmendesInt;

public class SystemeAmendesProxy implements SystemeAmendesInt.SystemeAmendes {
  private String _endpoint = null;
  private SystemeAmendesInt.SystemeAmendes systemeAmendes = null;
  
  public SystemeAmendesProxy() {
    _initSystemeAmendesProxy();
  }
  
  public SystemeAmendesProxy(String endpoint) {
    _endpoint = endpoint;
    _initSystemeAmendesProxy();
  }
  
  private void _initSystemeAmendesProxy() {
    try {
      systemeAmendes = (new SystemeAmendeImpl.SystemeAmendesImplServiceLocator()).getSystemeAmendesImplPort();
      if (systemeAmendes != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)systemeAmendes)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)systemeAmendes)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (systemeAmendes != null)
      ((javax.xml.rpc.Stub)systemeAmendes)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public SystemeAmendesInt.SystemeAmendes getSystemeAmendes() {
    if (systemeAmendes == null)
      _initSystemeAmendesProxy();
    return systemeAmendes;
  }
  
  public int signaler(java.lang.String arg0, java.lang.String arg1, int arg2) throws java.rmi.RemoteException{
    if (systemeAmendes == null)
      _initSystemeAmendesProxy();
    return systemeAmendes.signaler(arg0, arg1, arg2);
  }
  
  public void enregistrer(SystemeAmendesInt.Voiture arg0) throws java.rmi.RemoteException{
    if (systemeAmendes == null)
      _initSystemeAmendesProxy();
    systemeAmendes.enregistrer(arg0);
  }
  
  public SystemeAmendesInt.Amende[] lister(java.lang.String arg0) throws java.rmi.RemoteException{
    if (systemeAmendes == null)
      _initSystemeAmendesProxy();
    return systemeAmendes.lister(arg0);
  }
  
  public void payer(int arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (systemeAmendes == null)
      _initSystemeAmendesProxy();
    systemeAmendes.payer(arg0, arg1, arg2);
  }
  
  
}