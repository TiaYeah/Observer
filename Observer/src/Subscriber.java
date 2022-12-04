import java.text.DecimalFormat;

public class Subscriber implements Observer {
    private Indicators currentIndicators;

    public Subscriber(Indicators currentIndicators) {
        this.currentIndicators = currentIndicators;
    }

    @Override
    public void handleEvent(Indicators indicators) {
        DecimalFormat df = new DecimalFormat("#0.00");
        if(indicators.getPressure() < 4.8 || indicators.getPressure() > 5.5){
            System.out.println("Опасность! Давление не в норме: " + df.format(indicators.getPressure()));
        }
        if(indicators.getTemperature() < 360 || indicators.getTemperature() > 500){
            System.out.println("Опасность! Температура не в норме: " + indicators.getTemperature());
        }
        if(indicators.getRPM() < 2999 || indicators.getRPM() > 3001){
            System.out.println("Опасность! Скорость вращения не в норме: " + indicators.getRPM());
        }
    }
}
