package cn.gzsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	/**
	 * 打开首页
	 */
	@RequestMapping("/")
	public String showIndex() {
        System.out.println("跳转到首页index.jsp...");
		return "index";
	}
	
	/**
	 * 展示其他页面
	 * @param page 对应的jsp文件名
	 * @return
	 */

	@RequestMapping("/{page}")
	public String page(@PathVariable String page){
		return page;
		
	}
}
