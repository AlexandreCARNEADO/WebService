/**
 * SystemeAmendesImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SystemeAmendeImpl;

public class SystemeAmendesImplServiceLocator extends org.apache.axis.client.Service implements SystemeAmendeImpl.SystemeAmendesImplService {

    public SystemeAmendesImplServiceLocator() {
    }


    public SystemeAmendesImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemeAmendesImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SystemeAmendesImplPort
    private java.lang.String SystemeAmendesImplPort_address = "http://localhost:9999/ws/saam";

    public java.lang.String getSystemeAmendesImplPortAddress() {
        return SystemeAmendesImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemeAmendesImplPortWSDDServiceName = "SystemeAmendesImplPort";

    public java.lang.String getSystemeAmendesImplPortWSDDServiceName() {
        return SystemeAmendesImplPortWSDDServiceName;
    }

    public void setSystemeAmendesImplPortWSDDServiceName(java.lang.String name) {
        SystemeAmendesImplPortWSDDServiceName = name;
    }

    public SystemeAmendesInt.SystemeAmendes getSystemeAmendesImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SystemeAmendesImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystemeAmendesImplPort(endpoint);
    }

    public SystemeAmendesInt.SystemeAmendes getSystemeAmendesImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            SystemeAmendeImpl.SystemeAmendesImplPortBindingStub _stub = new SystemeAmendeImpl.SystemeAmendesImplPortBindingStub(portAddress, this);
            _stub.setPortName(getSystemeAmendesImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemeAmendesImplPortEndpointAddress(java.lang.String address) {
        SystemeAmendesImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (SystemeAmendesInt.SystemeAmendes.class.isAssignableFrom(serviceEndpointInterface)) {
                SystemeAmendeImpl.SystemeAmendesImplPortBindingStub _stub = new SystemeAmendeImpl.SystemeAmendesImplPortBindingStub(new java.net.URL(SystemeAmendesImplPort_address), this);
                _stub.setPortName(getSystemeAmendesImplPortWSDDServiceName());
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
        if ("SystemeAmendesImplPort".equals(inputPortName)) {
            return getSystemeAmendesImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://SystemeAmendeImpl/", "SystemeAmendesImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://SystemeAmendeImpl/", "SystemeAmendesImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SystemeAmendesImplPort".equals(portName)) {
            setSystemeAmendesImplPortEndpointAddress(address);
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
