package test.java.com.levi.www.observerPattern;

import main.java.com.levi.www.observerPattern.observer.CurrentConditionsDisplay;
import main.java.com.levi.www.observerPattern.publisher.WeatherData;

public class TestWeatherData {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
