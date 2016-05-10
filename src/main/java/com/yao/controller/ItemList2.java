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

		// ��Ʒ�б�
		List<Items> itemsList = new ArrayList<Items>();

		Items items_1 = new Items();
		items_1.setName("����ʼǱ�");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430 ����ʼǱ����ԣ�");

		Items items_2 = new Items();
		items_2.setName("ƻ���ֻ�");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone5  ƻ���ֻ���");

		itemsList.add(items_1);
		itemsList.add(items_2);

		// �������
		request.setAttribute("itemsList", itemsList);

		// ��ͼ
		request.getRequestDispatcher("/WEB-INF/pages/order/itemsList.jsp")
				.forward(request, response);
		logger.info(request.toString());
		// ���ϱ߿��Կ���������������handleRequest����û�з���ModelAndView����ͨ��response�޸Ķ�����Ӧ���ݣ����緵��json���ݣ�
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		response.getWriter().write("json��");
		logger.info(response.getContentType().toString());
	}

}
