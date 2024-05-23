package ilp037.creational.factorymethod;

import ilp037.creational.factorymethod.Notification.Type;

public class App {

	public static void main(String[] args) {
		Notification n = NotificationFactory.create(Type.SMS);
		n.notifyUser();

	}

}
