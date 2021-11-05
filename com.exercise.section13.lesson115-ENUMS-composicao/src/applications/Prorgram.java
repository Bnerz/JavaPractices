package applications;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Prorgram {

	public static void main(String[] args) {

		Order order = new Order(124, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.PROCESSING;

		OrderStatus os2 = OrderStatus.DELIVERED;
		
		System.out.println(os1);
		System.out.println(os2);
		
	}

}
