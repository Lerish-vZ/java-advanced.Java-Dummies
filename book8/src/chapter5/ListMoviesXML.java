package chapter5;

import javax.xml.parsers.*;
import org.xml.sax.*;
import org.w3c.dom.*;
import java.text.*;

public class ListMoviesXML {
    private static NumberFormat cf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        Document doc = getDocument("movies.xml");
        Element root = doc.getDocumentElement();
        Element movieElement = (Element)root.getFirstChild();
        Movie m;

        while(movieElement != null) {
            m = getMovie(movieElement);
            String msg = Integer.toString(m.year);
            msg += ": " + m.title;
            msg += " (" + cf.format(m.price) + ")";
            System.out.println(msg);

            movieElement = (Element)movieElement.getNextSibling();
        }
    }

    private static Document getDocument(String name){
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);
            factory.setValidating(true);

            DocumentBuilder builder = factory.newDocumentBuilder();
            return builder.parse(new InputSource(name));
    } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    
}
