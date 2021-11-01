import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Flow;
import java.io.FileWriter;
import java.io.IOException;

public class NumberSubscriber extends StringSubscriber
{
    public NumberSubscriber()
    {
        super();
    }

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
        if (text.toString().matches("(.*)[0-9](.*)"))
        {
            Path filePath = Paths.get(System.getProperty("user.dir"), "output/","Number.txt");
            this.file = new File(filePath.toString());
            System.out.println("NumberSubscriber get : " + text);
            
            /*  write to file */ 
            try
            {
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