package com.example.friday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.friday.FridayController;
@RestController
public class FridayController {
	@Autowired
	private FridayService std;
	@GetMapping("/path")
	public  FridayEntity get(@RequestParam double lat,@RequestParam double lon) {
		return std.getweather(lat, lon);
	}
}

