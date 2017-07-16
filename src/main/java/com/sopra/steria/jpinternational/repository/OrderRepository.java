package com.sopra.steria.jpinternational.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.sopra.steria.jpinternational.model.persistent.OrderPersist;

@Repository
public interface OrderRepository<T extends OrderPersist> extends
		JpaRepository<T, Integer>, JpaSpecificationExecutor<T> {
	@Override
	@SuppressWarnings("unchecked")
	public OrderPersist saveAndFlush(OrderPersist orderPersist);

}