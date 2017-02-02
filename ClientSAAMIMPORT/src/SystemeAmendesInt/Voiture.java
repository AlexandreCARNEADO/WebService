/**
 * Voiture.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SystemeAmendesInt;

public class Voiture  implements java.io.Serializable {
    private java.lang.String immatriculation;

    private java.lang.String modele;

    private SystemeAmendesInt.Personne proprietaire;

    public Voiture() {
    }

    public Voiture(
           java.lang.String immatriculation,
           java.lang.String modele,
           SystemeAmendesInt.Personne proprietaire) {
           this.immatriculation = immatriculation;
           this.modele = modele;
           this.proprietaire = proprietaire;
    }


    /**
     * Gets the immatriculation value for this Voiture.
     * 
     * @return immatriculation
     */
    public java.lang.String getImmatriculation() {
        return immatriculation;
    }


    /**
     * Sets the immatriculation value for this Voiture.
     * 
     * @param immatriculation
     */
    public void setImmatriculation(java.lang.String immatriculation) {
        this.immatriculation = immatriculation;
    }


    /**
     * Gets the modele value for this Voiture.
     * 
     * @return modele
     */
    public java.lang.String getModele() {
        return modele;
    }


    /**
     * Sets the modele value for this Voiture.
     * 
     * @param modele
     */
    public void setModele(java.lang.String modele) {
        this.modele = modele;
    }


    /**
     * Gets the proprietaire value for this Voiture.
     * 
     * @return proprietaire
     */
    public SystemeAmendesInt.Personne getProprietaire() {
        return proprietaire;
    }


    /**
     * Sets the proprietaire value for this Voiture.
     * 
     * @param proprietaire
     */
    public void setProprietaire(SystemeAmendesInt.Personne proprietaire) {
        this.proprietaire = proprietaire;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Voiture)) return false;
        Voiture other = (Voiture) obj;
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
            ((this.modele==null && other.getModele()==null) || 
             (this.modele!=null &&
              this.modele.equals(other.getModele()))) &&
            ((this.proprietaire==null && other.getProprietaire()==null) || 
             (this.proprietaire!=null &&
              this.proprietaire.equals(other.getProprietaire())));
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
        if (getModele() != null) {
            _hashCode += getModele().hashCode();
        }
        if (getProprietaire() != null) {
            _hashCode += getProprietaire().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Voiture.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://SystemeAmendesInt/", "voiture"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("immatriculation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "immatriculation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modele");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modele"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proprietaire");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proprietaire"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://SystemeAmendesInt/", "personne"));
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
