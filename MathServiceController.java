package com.example.SpringPlayground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathServiceController {
	  
	  @GetMapping("/add")
		public int add(@RequestParam int x, @RequestParam int y){
		  int c=x+y;
		  return c;
	  }
	  @GetMapping("/sub")
		public int sub(@RequestParam int x, @RequestParam int y){
		  int c=x-y;
		  return c;
	  }
	  @GetMapping("/mul")
		public int mul(@RequestParam int x, @RequestParam int y){
		  int c=x*y;
		  return c;
	  }
	  @GetMapping("/div")
		public int div(@RequestParam int x, @RequestParam int y){
		  int c=x/y;
		  return c;
	  }
	  
//	  @GetMapping("/math/calculate")
//	    public String getsub(@RequestParam String operation,@RequestParam String x,@RequestParam String y) {
//	        return String.format("subtraction is: %d", x-y);
//	    }
//	  @GetMapping("/math/calculate")
//	    public String getmul(@RequestParam String operation,@RequestParam String x,@RequestParam String y) {
//	        return String.format("multiplication is: %d", x*y);
//	    }
//	  @GetMapping("/math/calculate")
//	    public String getdiv(@RequestParam String operation,@RequestParam String x,@RequestParam String y) {
//	        return String.format("division is: %d", x/y);
//	    }
	  
}
