package com.yao.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.yao.model.Items;


public class ItemList1 implements Controller{

	private static final Logger logger=LoggerFactory.getLogger(ItemList1.class);
		@Override
		public ModelAndView handleRequest(HttpServletRequest request,
				HttpServletResponse response) throws Exception {
			
			//����service���� ���ݿ⣬��ѯ��Ʒ�б�����ʹ�þ�̬����ģ��
			List<Items> itemsList = new ArrayList<Items>();
			//��list����侲̬����
			
			Items items_1 = new Items();
			items_1.setName("����ʼǱ�");
			items_1.setPrice(6000f);
			items_1.setDetail("ThinkPad T430 ����ʼǱ����ԣ�");
			
			Items items_2 = new Items();
			items_2.setName("ƻ���ֻ�");
			items_2.setPrice(5000f);
			items_2.setDetail("iphone6ƻ���ֻ���");
			
			itemsList.add(items_1);
			itemsList.add(items_2);

			//����modelAndView׼��������ݡ�������ͼ
			ModelAndView modelAndView =  new ModelAndView();
			//�൱ ��request��setAttribut����jspҳ����ͨ��itemsListȡ����
			modelAndView.addObject("itemsList", itemsList);
			
			//ָ����ͼ
			modelAndView.setViewName("order/itemsList");
			logger.info(modelAndView.toString());
			return modelAndView;
		}

}
