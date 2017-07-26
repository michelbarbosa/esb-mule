
package wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for busca complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="busca">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clube" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inicio" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="fim" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "busca", namespace = "http://www.example.org/TitulosRequest", propOrder = {
    "clube",
    "inicio",
    "fim"
})
public class Busca {

    @XmlElement(required = true)
    protected String clube;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar inicio;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fim;

    /**
     * Gets the value of the clube property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClube() {
        return clube;
    }

    /**
     * Sets the value of the clube property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClube(String value) {
        this.clube = value;
    }

    /**
     * Gets the value of the inicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInicio() {
        return inicio;
    }

    /**
     * Sets the value of the inicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInicio(XMLGregorianCalendar value) {
        this.inicio = value;
    }

    /**
     * Gets the value of the fim property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFim() {
        return fim;
    }

    /**
     * Sets the value of the fim property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFim(XMLGregorianCalendar value) {
        this.fim = value;
    }

}
