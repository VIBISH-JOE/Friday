package com.example.friday;
import java.util.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class FridayService {
	//https://api.openweathermap.org/data/2.5/weather?lat=10.940093&lon=76.956502&appid={API key}&lang=en&units=metric
	@Value("${weather.api}")
	private String api;
	public static final String Base_url="https://api.openweathermap.org/data/2.5/weather";
	public FridayEntity getweather(double lat,double lon) {
		RestTemplate rest=new RestTemplate();
		String url=Base_url+"?lat="+lat+"&lon="+lon+"&appid="+api+"&lang=en&units=metric";
		Map<String,Object> response=rest.getForObject(url,Map.class);
		if(response!=null) {
			List<Map<String,String>>des=(List<Map<String,String>>)response.get("weather");
			String description=des.get(0).get("description");
			Map<String,Object> t=(Map<String,Object>)response.get("main");
			String loc=(String) response.get("name");
			double temp=(double)t.get("temp");
			return new FridayEntity(description,loc,temp);
		}
		return null;
	}
}
