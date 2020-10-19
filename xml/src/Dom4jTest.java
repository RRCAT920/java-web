import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import pojo.Book;

/**
 * @author huzihao
 * @since 2020/10/19 16:23
 */
public class Dom4jTest {
    @Test
    public void parsingXML() {
        var reader = new SAXReader();
        try {
            var document = reader.read("src/books.xml");
            System.out.println(document);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    @Test
    void parsingXMLToPojo() {
        var reader = new SAXReader();
        try {
            var document = reader.read("src/books.xml");
            var root = document.getRootElement();
            var elementList = root.elements("book");
            var bookList = new ArrayList<Book>();
            elementList.forEach(element -> {
                var id = element.attributeValue("id");
                var name = element.elementText("name");
                var author = element.elementText("author");
                var price = BigDecimal.valueOf(Double.parseDouble(
                        element.elementText("price")));
                bookList.add(new Book(id, name, author, price));
            });
            System.out.println(bookList);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
