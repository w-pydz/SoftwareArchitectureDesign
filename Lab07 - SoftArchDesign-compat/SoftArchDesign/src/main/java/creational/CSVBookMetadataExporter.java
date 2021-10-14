package creational;

import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter createExport() throws IOException{
        return new CSVBookMetadataFormatter();
    }
    
}
