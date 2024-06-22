package com.minutes.rest.webservices.restfulwebservices.filtering;

import java.util.List;
import java.util.Arrays;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
	@GetMapping("/filtering")
public MappingJacksonValue filltering() {
		
		SomeBean someBean = new SomeBean ("value1","value2","value3");
		// mapiingJacksonVlues is use to add the filters also it provide filtering feature 
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);
		
 SimpleBeanPropertyFilter filter =
		 SimpleBeanPropertyFilter.filterOutAllExcept("filed1","filed2");
 
FilterProvider filters = 
new SimpleFilterProvider().addFilter("SomeBeanFilter",filter );

mappingJacksonValue.setFilters(filters);

return mappingJacksonValue;
}
	
	
	@GetMapping("/filtering-list")
	public MappingJacksonValue fillteringList() {
	 List<SomeBean> list = Arrays.asList(new SomeBean ("value1","value2","value3"),
				 new SomeBean("value4","value5","value6"));
	 MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);
	 
	 SimpleBeanPropertyFilter filter =
			 SimpleBeanPropertyFilter.filterOutAllExcept("filed1","filed3");
	 
	FilterProvider filters = 
	new SimpleFilterProvider().addFilter("SomeBeanFilter",filter );

	mappingJacksonValue.setFilters(filters);

	 
	return mappingJacksonValue; 
	}
}
