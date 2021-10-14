package creational;

import java.io.PrintStream;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) throws ParserConfigurationException, IOException {
        // Please implement this method. You may create additional methods as you see fit.
        BookMetadataFormatter formatter = createExport();
        for(Book bookObj : books){
            formatter.append(bookObj);
        }
        stream.println(formatter.getMetadataString());
    }

    public abstract BookMetadataFormatter createExport() throws ParserConfigurationException, IOException;
}
