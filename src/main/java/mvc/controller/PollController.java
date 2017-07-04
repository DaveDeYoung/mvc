package mvc.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class PollController {
	
	// inject the actual template
	@Autowired
	private RedisTemplate<String, String> template;
	
	// inject the template as ListOperations
    // can also inject as Value, Set, ZSet, and HashOperations
    @Resource(name="redisTemplate")
    private SetOperations<String, String> setOperations;
	 
	@ResponseBody
	@RequestMapping(value="pollByUser",method=RequestMethod.GET)
	public String index(HttpServletRequest request,HttpServletResponse response) {
		String user = "admin";
		String title = "title1";
		String link = "www.baidu.com";
		int article = 1;
		String voted = "voted" + article;
		setOperations.add(voted, user);
		return null;
	}

}
