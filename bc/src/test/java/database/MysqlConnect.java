package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class MysqlConnect extends DatabaseProperties
		implements initiateDBConncetion, MappingdbResults, createDB, selectFromDB, insertToDB, updateDB, deleteFromDB {

	// create properties
	private Properties getProperties() {
		if (properties == null) {
			properties = new Properties();
			properties.setProperty("user", USERNAME);
			properties.setProperty("password", PASSWORD);
			properties.setProperty("MaxPooledStatements", MAX_POOL);
		}
		return properties;
	}

	// connect database
	public Connection connect() {
		if (connection == null) {
			try {
				Class.forName(DATABASE_DRIVER);
				connection = DriverManager.getConnection(DATABASE_URL, getProperties());
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}

	// disconnect database
	public void disconnect() {
		if (connection != null) {
			try {
				connection.close();
				connection = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void startdbConnection() {
		// TODO Create connection to database
		// create properties
		getProperties();
		// connect database
		connect();
		// map results
		mapdbResults();
		// disconnect database
		disconnect();

	}

	@Override
	public void mapdbResults() {
		// TODO get data from db and parse it to user class
		String sql = "SELECT * FROM `users`";
		try {
			PreparedStatement statement = connect().prepareStatement(sql);
			for (ResultSet rs = statement.executeQuery(sql); rs.next();) {
				users bcUsers = new users();
				bcUsers.setUserName(rs.getString("username"));
				bcUsers.setPassword(rs.getString("password"));
				resultList.add(bcUsers);

			}
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}
}