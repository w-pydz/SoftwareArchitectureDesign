package creational;

import java.io.IOException;

public class JSONBookMetadataExporter extends BookMetadataExporter {

    @Override
    public BookMetadataFormatter createExport() throws IOException {
        return new JSONBookMetadataFormatter();
    }
}
