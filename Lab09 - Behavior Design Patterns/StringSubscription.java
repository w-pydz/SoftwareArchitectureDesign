import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class StringSubscription implements Flow.Subscription {

    private static List<StringSubscriber> subscribers = new ArrayList();

    public void addSubscriber(StringSubscriber subscriber)
    {
        subscribers.add(subscriber);
    }

    /*public void removeSubscriber(StringSubscriber subscriber)
    {
        subscribers.remove(subscriber);
    }*/

    public void newPublish(String text)
    {
        for(StringSubscriber subscriber: subscribers)
        {
            subscriber.onNext(text);
        }
    }

    @Override
    public void request(long n) {}

    @Override
    public void cancel() {}
}