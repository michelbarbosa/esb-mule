package wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2017-07-14T17:11:46.802-03:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://www.example.org/Titulos/", name = "Titulos")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Titulos {

    @WebMethod(operationName = "BuscaTitulos", action = "http://www.example.org/Titulos/BuscaTitulos")
    @WebResult(name = "Response", targetNamespace = "http://www.example.org/Titulos/", partName = "parameters")
    public Titulos_Type buscaTitulos(
        @WebParam(partName = "parameters", name = "Request", targetNamespace = "http://www.example.org/Titulos/")
        Busca parameters
    );
}
