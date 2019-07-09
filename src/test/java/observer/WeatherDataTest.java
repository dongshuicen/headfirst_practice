package observer;

import com.practice.headfirst.observer.CurrentConditionsDisplay;
import com.practice.headfirst.observer.ForeCaseDisplay;
import com.practice.headfirst.observer.Observer;
import com.practice.headfirst.observer.WeatherData;
import org.junit.jupiter.api.Test;

public class WeatherDataTest {

    @Test
    public void test_weatherdata_should_return_false() {
        WeatherData weatherData = new WeatherData();
        Observer currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.registerObserver(currentConditionsDisplay);
        Observer foreCaseDisplay = new ForeCaseDisplay();
        weatherData.registerObserver(foreCaseDisplay);
        weatherData.changeData(80.0f,65, 30.4f);
        weatherData.changeData(70.0f,25, 45.4f);
    }
}
