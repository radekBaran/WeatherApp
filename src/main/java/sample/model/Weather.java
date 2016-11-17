package sample.model;

import java.time.LocalDateTime;

public class Weather {


    private double temperatureInCelsius;
    private LocalDateTime lastUpadeted;
    private double feelsLikeTemperatureInCelsius;
    private String iconUrl;
    private boolean idDay;
    private double pressuteMb;
    private String location;
    private WeatherCondition weatherCondition;


    public Weather(double temperatureInCelsius, LocalDateTime lastUpadeted, double feelsLikeTemperatureInCelsius, String iconUrl, boolean idDay, double pressuteMb, String location, WeatherCondition weatherCondition) {
        this.temperatureInCelsius = temperatureInCelsius;
        this.lastUpadeted = lastUpadeted;
        this.feelsLikeTemperatureInCelsius = feelsLikeTemperatureInCelsius;
        this.iconUrl = iconUrl;
        this.idDay = idDay;
        this.pressuteMb = pressuteMb;
        this.location = location;
        this.weatherCondition = weatherCondition;
    }

    public WeatherCondition getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(WeatherCondition weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    public LocalDateTime getLastUpadeted() {
        return lastUpadeted;
    }

    public void setLastUpadeted(LocalDateTime lastUpadeted) {
        this.lastUpadeted = lastUpadeted;
    }

    public double getFeelsLikeTemperatureInCelsius() {
        return feelsLikeTemperatureInCelsius;
    }

    public void setFeelsLikeTemperatureInCelsius(double feelsLikeTemperatureInCelsius) {
        this.feelsLikeTemperatureInCelsius = feelsLikeTemperatureInCelsius;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public boolean isIdDay() {
        return idDay;
    }

    public void setIdDay(boolean idDay) {
        this.idDay = idDay;
    }

    public double getPressuteMb() {
        return pressuteMb;
    }

    public void setPressuteMb(double pressuteMb) {
        this.pressuteMb = pressuteMb;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
