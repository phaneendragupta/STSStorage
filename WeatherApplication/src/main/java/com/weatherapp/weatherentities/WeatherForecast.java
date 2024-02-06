package com.weatherapp.weatherentities;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherForecast {

	private String name;
	private String region;
	private String country;
	private double lat;
	private double lon;
	private String localtime;

	
    private List<FutureDay> forecastDayList = new ArrayList();
    
    
    

//	public WeatherForecast() {
//		super();
//	}
//
//	public WeatherForecast(String country, double temp_c, String weatherDescription, List<ForecastDay> forecastDayList) {
//		super();
//		this.country = country;
//		this.temp_c = temp_c;
//		this.weatherDescription = weatherDescription;
//		this.forecastDayList = forecastDayList;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	public double getTemp_c() {
//		return temp_c;
//	}
//
//	public void setTemp_c(double temp_c) {
//		this.temp_c = temp_c;
//	}
//
//	public String getWeatherDescription() {
//		return weatherDescription;
//	}
//
//	public void setWeatherDescription(String weatherDescription) {
//		this.weatherDescription = weatherDescription;
//	}
//
//	public List<ForecastDay> getForecastDayLoop() {
//		return forecastDayList;
//	}
//
//	public void setForecastDayList(List<ForecastDay> forecastDayList) {
//		this.forecastDayList = forecastDayList;
//	}
//
//	@Override
//	public String toString() {
//		return "WeatherForecast [country=" + country + ", temp_c=" + temp_c + ", weatherDescription="
//				+ weatherDescription + ", forecastDayList=" + forecastDayList + "]";
//	}

}
