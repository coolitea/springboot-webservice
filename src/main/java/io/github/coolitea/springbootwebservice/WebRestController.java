package io.github.coolitea.springbootwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {    
	@GetMapping("/api")
	public String main() {
		return "api main";
	}
}
