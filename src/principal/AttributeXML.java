package principal;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.helpers.DefaultHandler;
import utilidades.Util;

/**
 *
 * @author Wheslley Nycolas da Silva
 */
public class AttributeXML extends DefaultHandler {

    public static void main(String[] args) throws Exception {

        String strXML = "<eSocial xmlns=\"http://www.esocial.gov.br/schema/evt/evtInfoEmpregador/v02_04_01\" "
                + "               xmlns:ns2=\"http://www.w3.org/2000/09/xmldsig#\">\n"
                + "         <evtInfoEmpregador Id=\"ID_XPTO\">\n"
                + "             <ideEvento>\n"
                + "                 <tpAmb>2</tpAmb>\n"
                + "             </ideEvento>\n"
                + "         </evtInfoEmpregador>\n"
                + "     </eSocial>";

        Util util = new Util();
        
        Element el = util.converterStringToElement(strXML);
        
        NodeList nodeList = el.getElementsByTagName("evtInfoEmpregador");
        
        if (nodeList != null && nodeList.getLength() > 0) {
            
            for (int j = 0; j < nodeList.getLength(); j++) {
                
                Element ell = (org.w3c.dom.Element) nodeList.item(j);
                
                if (ell.hasAttribute("Id")) {
                    System.out.println(ell.getAttribute("Id"));
                    break;
                }
                
            }
            
        }
        
    }

}
