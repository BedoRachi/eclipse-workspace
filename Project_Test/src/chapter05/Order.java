package chapter05;

public class Order {

	Long orderNum;
	String orderID, orderDay, orderName, orderSerial, orderPost;

	public long GetOrderNum() {
		return orderNum;
	}

	public String GetOrderID() {
		return orderID;
	}

	public String GetOrderDay() {
		return orderDay;
	}

	public String GetOrderName() {
		return orderName;
	}

	public String GetOrderSerial() {
		return orderSerial;
	}

	public String GetOrderPost() {
		return orderPost;
	}

	public void SetOrderNum(Long num) {
		orderNum = num;
	}

	public void SetOrderID(String id) {
		orderID = id;
	}

	public void SetOrderDay(String day) {
		orderDay = day;
	}

	public void SetOrderName(String name) {
		orderName = name;
	}

	public void SetOrderSerial(String serial) {
		orderSerial = serial;
	}

	public void SetOrderPost(String post) {
		orderPost = post;
	}

}
