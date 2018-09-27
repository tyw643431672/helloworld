package com.znsd.view;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

/**
 * 自定义视图
 * @author Administrator
 *
 */

@Component//把视图放到IOC容器里面 ，这里视图的名字就是testView
public class TestView implements View{

	@Override
	public String getContentType() {
		return "text/html; charset=UTF-8";//可在jsp页面的头中找到
	}

	@Override
	public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.getWriter().println("hello view current time : " + new Date());
	}

}
