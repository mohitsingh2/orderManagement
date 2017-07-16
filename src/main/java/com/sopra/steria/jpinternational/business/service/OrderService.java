package com.sopra.steria.jpinternational.business.service;

import com.sopra.steria.jpinternational.model.persistent.OrderPersist;

public interface OrderService {
	public OrderPersist saveOrder(OrderPersist order);
}
