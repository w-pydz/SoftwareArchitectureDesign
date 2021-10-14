package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException {

        // Current usage
        /*BookMetadataFormatter formatter = null;
        try {
            formatter = BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.CSV);
            formatter.append(TestData.dragonBook);
            formatter.append(TestData.dinosaurBook);
            System.out.print(formatter.getMetadataString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }*/

        // Expected usage
        BookMetadataExporter XMLExporter = new XMLBookMetadataExporter();
        XMLExporter.add(TestData.sailboatBook);
        XMLExporter.add(TestData.GoFBook);
        XMLExporter.export(System.out);

        BookMetadataExporter CSVExporter = new CSVBookMetadataExporter();
        CSVExporter.add(TestData.sailboatBook);
        CSVExporter.add(TestData.GoFBook);
        CSVExporter.export(System.out);

        BookMetadataExporter JSONExporter = new JSONBookMetadataExporter();
        JSONExporter.add(TestData.sailboatBook);
        JSONExporter.add(TestData.GoFBook);
        JSONExporter.export(System.out);
    }
}
