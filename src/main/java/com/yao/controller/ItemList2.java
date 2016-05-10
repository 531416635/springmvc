package com.yao.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.HttpRequestHandler;

import com.yao.model.Items;

public class ItemList2 implements HttpRequestHandler {
	
	private static final Logger logger=LoggerFactory.getLogger(ItemList2.class);
	
	@Override
	public void handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// 商品列表
		List<Items> itemsList = new ArrayList<Items>();

		Items items_1 = new Items();
		items_1.setName("联想笔记本");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430 联想笔记本电脑！");

		Items items_2 = new Items();
		items_2.setName("苹果手机");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone5  苹果手机！");

		itemsList.add(items_1);
		itemsList.add(items_2);

		// 填充数据
		request.setAttribute("itemsList", itemsList);

		// 视图
		request.getRequestDispatcher("/WEB-INF/pages/order/itemsList.jsp")
				.forward(request, response);
		logger.info(request.toString());
		// 从上边可以看出此适配器器的handleRequest方法没有返回ModelAndView，可通过response修改定义响应内容，比如返回json数据：
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write("json串");
		logger.info(response.getContentType().toString());
	}

}
