import java.util.concurrent.Flow;

public class StringPublisher implements Flow.Publisher<String>
{
    private static StringSubscription subscription;
    
    StringPublisher()
    {
        subscription = new StringSubscription();
    }
    
    @Override
    public void subscribe(Flow.Subscriber<? super String> subscriber)
    {
        subscriber.onSubscribe(subscription);
    }

    /*public void unsubscribe(Flow.Subscriber<? super String> subscriber)
    {
        subscriber.cancleSubscribe(subscriber);
    }*/
    
    public void publish(String text)
    {
        System.out.println("Publisher send : "+text);
        subscription.newPublish(text);
    }
}