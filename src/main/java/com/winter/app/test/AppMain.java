package com.winter.app.test;

import com.winter.app.util.DBCConnector;

public class AppMain {
public static void main(String[] args) {
	DBCConnector connector = new DBCConnector();
	connector.getConnector();
}
}
