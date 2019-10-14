package com.yichen.thinking.in.java.chapter08;

class AlertStatus {
	public String alertStatus() {
		return "None";
	}
}

class GreenAlertStatus extends AlertStatus {
	@Override
	public String alertStatus() {
		// TODO Auto-generated method stub
		return "Green";
	}
}

class RedAlertStatus extends AlertStatus {
	
	@Override
	public String alertStatus() {
		return "Red";
	}
}

class YellowAlertStatus extends AlertStatus {
	@Override
	public String alertStatus() {
		return "Yellow";
	}
}

public class StarShip {

	AlertStatus alertStatus;
	
	void changeStatus(AlertStatus alertStatus) {
		this.alertStatus = alertStatus;
	}
	
	@Override
	public String toString() {
		return alertStatus.alertStatus();
	}
	
	public static void main(String[] args) {
		StarShip ship = new StarShip();
		ship.changeStatus(new RedAlertStatus());
		System.out.println(ship);
		
		ship.changeStatus(new GreenAlertStatus());
		System.out.println(ship);
		
		ship.changeStatus(new YellowAlertStatus());
		System.out.println(ship);
	}

}
