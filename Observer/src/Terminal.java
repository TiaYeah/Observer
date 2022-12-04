import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Terminal implements Observed{
    Indicators indicators;

    List<Observer> subsribers = new ArrayList<>();

    public void doWork(int count) throws InterruptedException {
        Random rand = new Random();

        for(int i = 0; i < count; i++){
            indicators = new Indicators(
                    getRandomInRange(rand, 4.5, 5.7),
                    getRandomInRange(rand, 330, 515),
                    getRandomInRange(rand, 2998, 3002));
            indicators.print();

            notifyObservers();
            System.out.println("=========================");
            Thread.sleep(1000);
        }

    }
    private double getRandomInRange(Random rand, double min, double max) {
        return rand.nextDouble(max - min) + min;
    }
    private int getRandomInRange(Random rand, int min, int max) {
        return rand.nextInt(max - min) + min;
    }
    @Override
    public void addObserver(Observer observer) {
        this.subsribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subsribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: subsribers){
            observer.handleEvent(this.indicators);
        }
    }
}
