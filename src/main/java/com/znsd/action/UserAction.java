package com.znsd.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.znsd.bean.UserBean;

/**
 * 如果希望在多个请求之间共享某个模型的数据，则可以在控制器类上标注一个@SessionAttributes，
 * SpringMVC会将对应的属性存储到Session中。
 * 
 * @SessionAttributes除了可以通过属性名指定需要放到会话中的属性外，
 * 还可以通过模型属性的对象类型指定哪些类型放到Session中。 @author Administrator
 *
 */
@Controller
@SessionAttributes("user") // session
public class UserAction {

	@RequestMapping("/testSessionAttributes")
	public String testSessionAttributes(UserBean user, Map<String, Object> map) {
		System.out.println(user);
		map.put("user", user);
		return "success";
	}
	
	//在访问方法前，会优先调用所有的@ModelAttribute注释的方法
	//并根据返回的类型可以在别的方法中得到值
	/*@ModelAttribute 
	public void testModelAttribute(Integer id, Map<String, Object> map){
		System.out.println("id: " + id);
		UserBean user = new UserBean(id, "asdf", "zxcv");
		
		map.put("userBean", user);
	}*/
	
	@RequestMapping("/testXXX")
	public String testXXX(UserBean user) {
		
		System.out.println("user: " + user);
		
		return "success";
	}
	
	
	//测试视图
	@RequestMapping("/testView")
	public String testView(){
		System.out.println("进入action  testView");
		return "testView";
	}
	
	//重定向
	@RequestMapping("/testRedirect")
	public String testRedirect(){
		System.out.println("进入了重定向 testRedirect");
		return "redirect:/login.jsp";
	}
	
	@RequestMapping("/testEdit")
	public String testEdit(Map<String, Object> map){
		UserBean user = new UserBean(1, "小王", "123123");
		
		System.out.println("testEdit");
		List<String> sex = new ArrayList<>();
		sex.add("男");
		sex.add("女");
		
		List<String> path = new ArrayList<>();
		path.add("湖南");
		path.add("广东");
		path.add("四川");
		
		map.put("user", user);
		map.put("sex", sex);
		map.put("path", sex);
		
		return "forward:/login.jsp";//转发
	}
	
	@RequestMapping("/update")
	public String update(UserBean user){
		System.out.println(user);
		return "success";
	}
	
	
}
