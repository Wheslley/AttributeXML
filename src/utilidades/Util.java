package utilidades;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 *
 * @author Wheslley Nycolas da Silva
 *
 */
public class Util {

    /*
     * Converter String to Element XML
     */
    public Element converterStringToElement(String xml) {

        Document doc = null;

        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(new ByteArrayInputStream(xml.getBytes("UTF-8")));

        } catch (IOException | ParserConfigurationException | SAXException ex) {
            System.out.println("ERRO CONVERTER XML FOR ELEMENT [converterXml()] "
                    + " | Causa: " + ex.getCause() + " | Message: " + ex.getMessage());
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return doc.getDocumentElement();
        }

    }

}
