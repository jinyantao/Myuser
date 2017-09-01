package com.jyt.soft.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jyt.soft.service.UserService;
import com.jyt.soft.util.PageUtil;
import com.jyt.soft.util.PagerInfo;

@Controller
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("userList.htm")
	public ModelAndView userList(HttpServletRequest request,HttpServletResponse response,String pageSize,String currentPage,String userName){
		
		 currentPage = PageUtil.initCurrentPage(currentPage);
	        PagerInfo pager = PageUtil.initPagerInfo(pageSize, currentPage);
	        Map<String, Object> paramsMap = new HashMap<String, Object>();

	        StringBuilder hql = new StringBuilder();
	        hql.append(" from UserBean ");
	      return null;  
	}
}
