package myspringboot_007;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {	
	@Autowired
    private FooProperties fooProperties;
	
	@Value("${server.port}")
	private String port;
	
	@Value("${server.name}")
	private String name;
	
	@RequestMapping("/demo")
	public String home() {
		return "Hello,world";
	}
	/*访问地址：http://localhost:8080/getUserByData?username=zk*/
	@RequestMapping(value="/getUserByData")
	public String getUserByData(@RequestParam(value="username")String username) {
		return "Hello,world "+username;
	}
	
//	@RequestMapping("/getYml")
//    public String getFooProperties(){
//        return "Hello,world"+port;
//    }
	@RequestMapping("/hello")
	public String hello() {
		return "hello,world";
	}
	
	@RequestMapping("/getFooProperties")
    public Map<String, Object> getFooProperties(){
        Map<String, Object> map = new HashMap<>();
        map.put("remote-address", fooProperties.getRemoteAddress());
        map.put("security", fooProperties.getSecurity().toString());
        return map;
    }
	
}
