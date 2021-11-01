import java.io.File;
import java.util.concurrent.Flow;

public abstract class StringSubscriber implements Flow.Subscriber<String>{

    protected File file;

    public abstract void onSubscribe(Flow.Subscription subscription);
    //public abstract void cancleSubscribe(Flow.Subscription subscription);
    public abstract void onNext(String text);

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Exception: " + throwable.toString());
    }
    
    @Override
    public void onComplete() {
        System.out.println("================== C O M P L E T E ==================");
    }
}