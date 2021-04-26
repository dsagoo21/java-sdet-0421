package com.RestAPIs.RestApIs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorAPIsController {

	
	@GetMapping("/addition/{num1}/+/{num2}")
		public String add(@PathVariable int num1, @PathVariable int num2)
		{
			int result=num1+num2;
		return  "addition  of two numbers "+result;
		}
	@GetMapping("/subtraction/{num1}/-/{num2}")
	public String sub(@PathVariable int num1, @PathVariable int num2)
	{
		int result=num1-num2;
	return  "subtraction  of two numbers "+result;
	
	}
	@GetMapping("/division/{num1}///{num2}")
	public String division(@PathVariable int num1, @PathVariable int num2)
	{
		int result=num1/num2;
	return  "sub of two numbers "+result;
	
	}
	@GetMapping("/multiplication/{num1}/*/{num2}")
	public String multiplication(@PathVariable int num1, @PathVariable int num2)
	{
		int result=num1*num2;
	return  "multiplication  of two numbers "+result;
	
	}
}
