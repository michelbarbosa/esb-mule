
package wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for titulos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="titulos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="titulo" type="{http://www.example.org/TitulosResponse}titulo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "titulos", propOrder = {
    "titulo"
})
public class Titulos_Type {

    protected List<Titulo> titulo;

    /**
     * Gets the value of the titulo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titulo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitulo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Titulo }
     * 
     * 
     */
    public List<Titulo> getTitulo() {
        if (titulo == null) {
            titulo = new ArrayList<Titulo>();
        }
        return this.titulo;
    }

    /**
     * Sets the value of the titulo property.
     * 
     * @param titulo
     *     allowed object is
     *     {@link Titulo }
     *     
     */
    public void setTitulo(List<Titulo> titulo) {
        this.titulo = titulo;
    }

}
