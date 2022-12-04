public class Main {
    public static void main(String[] args) throws InterruptedException {
        Terminal terminal = new Terminal();

        Observer subscriber = new Subscriber(new Indicators(0,0,0));

        terminal.addObserver(subscriber);
        terminal.doWork(10);
        terminal.removeObserver(subscriber);
    }
}