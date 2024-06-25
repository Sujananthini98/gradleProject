package com.demo1gradle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
      
public class DemogradleController {
	 @GetMapping(path = "/msg")
     public String getMsg() {
  	   return "hello alls";
     }

}
