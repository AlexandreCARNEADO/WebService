/**
 * Amende.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SystemeAmendesInt;

public class Amende  implements java.io.Serializable {
    private java.lang.String immatriculation;

    private int numero;

    private int tarif;

    public Amende() {
    }

    public Amende(
           java.lang.String immatriculation,
           int numero,
           int tarif) {
           this.immatriculation = immatriculation;
           this.numero = numero;
           this.tarif = tarif;
    }


    /**
     * Gets the immatriculation value for this Amende.
     * 
     * @return immatriculation
     */
    public java.lang.String getImmatriculation() {
        return immatriculation;
    }


    /**
     * Sets the immatriculation value for this Amende.
     * 
     * @param immatriculation
     */
    public void setImmatriculation(java.lang.String immatriculation) {
        this.immatriculation = immatriculation;
    }


    /**
     * Gets the numero value for this Amende.
     * 
     * @return numero
     */
    public int getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this Amende.
     * 
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }


    /**
     * Gets the tarif value for this Amende.
     * 
     * @return tarif
     */
    public int getTarif() {
        return tarif;
    }


    /**
     * Sets the tarif value for this Amende.
     * 
     * @param tarif
     */
    public void setTarif(int tarif) {
        this.tarif = tarif;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Amende)) return false;
        Amende other = (Amende) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.immatriculation==null && other.getImmatriculation()==null) || 
             (this.immatriculation!=null &&
              this.immatriculation.equals(other.getImmatriculation()))) &&
            this.numero == other.getNumero() &&
            this.tarif == other.getTarif();
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
        if (getImmatriculation() != null) {
            _hashCode += getImmatriculation().hashCode();
        }
        _hashCode += getNumero();
        _hashCode += getTarif();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Amende.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://SystemeAmendesInt/", "amende"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("immatriculation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "immatriculation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
