package com.emp.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// TODO: Auto-generated Javadoc
/**
 * The Class DbUtil.
 */
public class DbUtil {

	/** The connection. */
	private static Connection connection = null;

	/**
	 * Gets the connection.
	 * 
	 * @return the connection
	 * @throws ClassNotFoundException
	 *             the class not found exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws SQLException
	 *             the sQL exception
	 */
	public static Connection getConnection() throws ClassNotFoundException,
			IOException, SQLException {

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream input = classLoader.getResourceAsStream("com/emp/util/db.properties");
		
		Properties prop = new Properties();
		//prop.load(new FileInputStream("com/emp/util/db.properties"));
		prop.load(input);
		//InputStream inputStream = MyPropertyHandler.getClass().getClassLoader().getResourceAsStream("db.properties");
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String password = prop.getProperty("password");
		
		try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
		
		try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("ERROR: Unable to Connect to Database.");
        }

		return connection;
	}
}
