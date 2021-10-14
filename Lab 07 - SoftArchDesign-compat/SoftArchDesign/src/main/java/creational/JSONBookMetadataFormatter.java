package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    
    private JSONArray bookArray;
    private JSONObject bookObject;

    public JSONBookMetadataFormatter() throws IOException {
        reset();
    } 

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        bookArray = new JSONArray();
        bookObject = new JSONObject();
        bookObject.put(Book.class.getSimpleName()+"s", bookArray);
        return null;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        JSONObject newBookObj = new JSONObject();
        JSONArray newAuthorsArray = new JSONArray();

        for(String author : b.getAuthors()){
            newAuthorsArray.add(author);
        }

        newBookObj.put(Book.Metadata.ISBN.value,b.getISBN());
        newBookObj.put(Book.Metadata.AUTHORS.value,newAuthorsArray);
        newBookObj.put(Book.Metadata.TITLE.value,b.getTitle());
        newBookObj.put(Book.Metadata.PUBLISHER.value,b.getPublisher());
        bookArray.add(newBookObj);
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return bookObject.toString();
    }
}
