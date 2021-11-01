import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        StringPublisher publisher = new StringPublisher();

        AlphabetSubscriber alphabetSubscriber = new AlphabetSubscriber();
        NumberSubscriber numberSubscriber = new NumberSubscriber();
        SymbolSubscriber symbolSubscriber = new SymbolSubscriber();

        publisher.subscribe(alphabetSubscriber);
        publisher.subscribe(numberSubscriber);
        publisher.subscribe(symbolSubscriber);
        
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.print("Input your text here (or input e to exit): ");
            String input = scanner.nextLine();

            if(input.equals("e"))
            {
                /*publisher.unsubscribe(alphabetSubscriber);
                publisher.unsubscribe(numberSubscriber);
                publisher.unsubscribe(symbolSubscriber);*/ //try to do but... TT-TT
                break;
            }
            else
            {
                
                publisher.publish(input);
            }
        }
        scanner.close();
    }
}