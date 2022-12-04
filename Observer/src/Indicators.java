import java.text.DecimalFormat;

public class Indicators {
    double pressure;
    int temperature;
    int RPM;

    public Indicators(double pressure, int temperature, int RPM) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.RPM = RPM;
    }
    public void print(){
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println("Давление: " + df.format(pressure) + " МПа Температура: " + temperature + " C Скорость вращения: " + RPM + " об/мин");
    }
    public double getPressure() {
        return pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getRPM() {
        return RPM;
    }
}

