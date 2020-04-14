package myspringboot_007;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/hello2")
	@ResponseBody
	public String hello() {
		return "hello2,world";
	}
}
