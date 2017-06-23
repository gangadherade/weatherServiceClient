package com.ganga.javamind;

import nl.interact.ipds.agentvi.connector.schema.GlobalWeather;
import nl.interact.ipds.agentvi.connector.schema.GlobalWeatherSoap;

public class WeatherTest {
	public String getWeather(){
		GlobalWeather globalWeather = new GlobalWeather();
		GlobalWeatherSoap globalWeatherSoap = globalWeather.getGlobalWeatherSoap();
		
//		return globalWeatherSoap.getWeather("hyderabad", "india");
		return globalWeatherSoap.getCitiesByCountry("india");
	}
}
