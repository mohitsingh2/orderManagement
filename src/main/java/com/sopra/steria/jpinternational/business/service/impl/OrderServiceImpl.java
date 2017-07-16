package com.sopra.steria.jpinternational.business.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sopra.steria.jpinternational.business.service.OrderService;
import com.sopra.steria.jpinternational.model.persistent.OrderPersist;
import com.sopra.steria.jpinternational.repository.OrderRepository;

@Service("iOrderService")
public class OrderServiceImpl implements OrderService {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(OrderServiceImpl.class);

	@Resource
	private OrderRepository orderRepository;

	@Override
	public OrderPersist saveOrder(OrderPersist formattedOrderRequest) {
		LOGGER.info("Start database connection & insert record in database");
		return orderRepository.saveAndFlush(formattedOrderRequest);
	}

}
