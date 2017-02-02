/**
 * SystemeAmendes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SystemeAmendesInt;

public interface SystemeAmendes extends java.rmi.Remote {
    public int signaler(java.lang.String arg0, java.lang.String arg1, int arg2) throws java.rmi.RemoteException;
    public void enregistrer(SystemeAmendesInt.Voiture arg0) throws java.rmi.RemoteException;
    public SystemeAmendesInt.Amende[] lister(java.lang.String arg0) throws java.rmi.RemoteException;
    public void payer(int arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
}
