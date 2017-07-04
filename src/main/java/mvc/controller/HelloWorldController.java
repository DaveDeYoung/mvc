package mvc.controller;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import mvc.model.resource.ResourceBaseInfo;
import mvc.service.IResourceBaseService;

@Controller
public class HelloWorldController {
	
	private static final Logger logger = LoggerFactory
			.getLogger(HelloWorldController.class);
	
	@Resource
	IResourceBaseService resourceBase;
	
	@Value(value = "${cmdbIp}")
	public String cmdbIp;
	
	@ResponseBody
	@RequestMapping(value="index/login",method=RequestMethod.GET)
	public String index(HttpServletRequest request,HttpServletResponse response) {
		Cookie cookie  = new Cookie("1", "2");
		response.addCookie(cookie);
		HttpSession httpSession = request.getSession();
		System.out.println(httpSession.getAttribute("1"));
		System.out.println(httpSession.getId());
//		httpSession.setAttribute("1", "1");
		logger.debug("success...");
		ResourceBaseInfo info = resourceBase.selectByPrimaryKey(35925);
		logger.info("success..."+info);
		return "index";
	}

}