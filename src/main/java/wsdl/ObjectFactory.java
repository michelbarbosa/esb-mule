
package wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Request_QNAME = new QName("http://www.example.org/Titulos/", "Request");
    private final static QName _Response_QNAME = new QName("http://www.example.org/Titulos/", "Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Busca }
     * 
     */
    public Busca createBusca() {
        return new Busca();
    }

    /**
     * Create an instance of {@link Titulos_Type }
     * 
     */
    public Titulos_Type createTitulos_Type() {
        return new Titulos_Type();
    }

    /**
     * Create an instance of {@link Titulo }
     * 
     */
    public Titulo createTitulo() {
        return new Titulo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Busca }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Titulos/", name = "Request")
    public JAXBElement<Busca> createRequest(Busca value) {
        return new JAXBElement<Busca>(_Request_QNAME, Busca.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Titulos_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/Titulos/", name = "Response")
    public JAXBElement<Titulos_Type> createResponse(Titulos_Type value) {
        return new JAXBElement<Titulos_Type>(_Response_QNAME, Titulos_Type.class, null, value);
    }

}
