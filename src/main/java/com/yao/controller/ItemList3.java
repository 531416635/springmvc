package com.yao.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yao.model.Items;
@Controller
public class ItemList3 {

	private static final Logger logger = LoggerFactory.getLogger(ItemList3.class);
	
	@RequestMapping("/queryItem.action")
	public ModelAndView queryItem() {
		// 商品列表
		List<Items> itemsList = new ArrayList<Items>();

		Items items_1 = new Items();
		items_1.setName("联想笔记本");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430 联想笔记本电脑！");

		Items items_2 = new Items();
		items_2.setName("苹果手机");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6苹果手机！");

		itemsList.add(items_1);
		itemsList.add(items_2);

		// 创建modelAndView准备填充数据、设置视图
		ModelAndView modelAndView = new ModelAndView();
		// 填充数据
		modelAndView.addObject("itemsList", itemsList);
		// 视图
		modelAndView.setViewName("order/itemsList");
		logger.info(modelAndView.toString());
		return modelAndView;
	}

}
