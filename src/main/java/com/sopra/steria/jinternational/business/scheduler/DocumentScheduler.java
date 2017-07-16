package com.sopra.steria.jinternational.business.scheduler;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.sopra.steria.jpinternational.business.service.OrderService;

@Service
@EnableScheduling
public class DocumentScheduler {

@Autowired
OrderService orderService;


	
 public OrderService getOrderService() {
	return orderService;
}

public void setOrderService(OrderService orderService) {
	this.orderService = orderService;
}

/*@Scheduled(fixedDelay = 5000)
 public void fixedDelayTask() {
 System.out.println(new Date() + " This runs in a fixed delay");
 }

 @Scheduled(fixedRate = 6000)
 public void fixedRateTask() {
 System.out.println(new Date() + " This runs in a fixed rate");
 }

 @Scheduled(fixedRate = 7000, initialDelay = 2000)
 public void fixedRateWithInitialDelayTask(){
 System.out.println(new Date() + " This runs in a fixed delay with a initial delay");
 }
*/
 @Scheduled(cron = "10 * * * * *")
 public void cronTask(){
 System.out.println(new Date() + " This runs in a cron schedule");
  
 }
}