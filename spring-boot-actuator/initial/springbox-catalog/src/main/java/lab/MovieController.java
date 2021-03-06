package lab;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
	@Value("${greeting}")
	private String greeting;

	@RequestMapping("/")
	public String greet() {
		return greeting;
	}
}
