import java.util.concurrent.Flow;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.IOException;

public class AlphabetSubscriber extends StringSubscriber
{

    @Override
    public void onSubscribe(Flow.Subscription subscription)
    {
        ((StringSubscription)subscription).addSubscriber(this);
    }

    /*@Override
    public void cancleSubscribe(Flow.Subscription subscription)
    {
        ((StringSubscription)subscription).removeSubscriber(this);
    }*/

    @Override
    public void onNext(String text)
    {
        if(text.matches("(.*)[a-zA-z](.*)"))
        {
            Path path = Paths.get(System.getProperty("user.dir"), "output/","Alphabet.txt");
            this.file = new File(path.toString());
            System.out.println("AlphabetSubscriber get : " + text);

            /*  write to file */ 
            try {
                FileWriter writer = new FileWriter(file, true);
                System.out.println("File saved");
                writer.write(text + "\n");
                writer.flush();
                writer.close();
            } 
            catch (IOException  e) {
                System.out.println(e);
            }

        }
    }
}