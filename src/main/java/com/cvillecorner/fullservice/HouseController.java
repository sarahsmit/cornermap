package main.java.com.cvillecorner.fullservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HouseController {

    @GetMapping("/")
    public String home() {
		return "welcome to the home page!";
	}

	@GetMapping("/houses")
    public House houses(@RequestParam(value = "number", defaultValue = "507") int number, 
            @RequestParam(value = "street", defaultValue = "14th St") String street) {
		return new House(number, street);
	}
}