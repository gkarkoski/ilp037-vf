package ilp037.creational.factorymethod;

public class NotificationFactory {
	
	public static Notification create(Notification.Type type) {
		switch (type) {
		case SMS : return new SmsNotification();
		case EMAIL : return new EmailNotification();
		case PUSH : return new PushNotification();
		default: throw new IllegalArgumentException("unknow notification type");
		
		}
	}	

}
