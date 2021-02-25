package database;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Properties;

public class DatabaseProperties {

	// init database constants
	protected static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
	protected static final String DATABASE_URL = "jdbc:mysql://localhost:3307/bc";
	protected static final String USERNAME = "root";
	protected static final String PASSWORD = "";
	protected static final String MAX_POOL = "250";

	// init connection object
	protected Connection connection;
	// init properties object
	protected Properties properties;
	
	//declare resultset mapping
	public ArrayList<users> resultList = new ArrayList<>();

}
