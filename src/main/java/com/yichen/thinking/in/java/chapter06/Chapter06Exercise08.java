package com.yichen.thinking.in.java.chapter06;

class Connection {
	private static int counter = 0;
	private int id = counter++;
	@Override
	public String toString() {
		return "Connection" + id;
	}
	public void doSomething() {
		
	}
}

class ConnectionManager{
	private ConnectionManager() {
	}
	
	private static int counter = 0;
	
	private static Connection[] connections = new Connection[10];
	
	private static ConnectionManager instance = new ConnectionManager();
	
	static {
		for (int i = 0; i < 10; i++) {
			connections[i] = new Connection();
		}
	}
	
	public static ConnectionManager getInstance() {
		if(instance == null) return null;
		return instance;
	}
	
	public static Connection[] getConnections() {
		return connections;
	}
	
	public static Connection getConnection() {
		if( counter >= connections.length) return null;
		return connections[counter++];
	}
}

public class Chapter06Exercise08 {
	public static void main(String[] args) {		
		Connection connection = ConnectionManager.getConnection();
		while (connection != null) {
			System.out.println(connection);
			connection = ConnectionManager.getConnection();
		}
	}
}
