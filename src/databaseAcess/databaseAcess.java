package databaseAcess;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class databaseAcess {

	@Test
	public void test01() throws SQLException, ClassNotFoundException{
		// Load Microsoft SQL Server JDBC driver.
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		// Prepare connection url.
		String url = "jdbc:sqlserver://192.168.1.180:1433;DatabaseName=TEST_DB";

		// Get connection to DB.
		Connection con = DriverManager.getConnection(url, "username", "password");

		// Create statement object which would be used in writing DDL and DML
		// SQL statement.
		Statement stmt = (Statement) con.createStatement();

		// Send SQL SELECT statements to the database via the Statement.executeQuery
		// method which returns the requested information as rows of data in a
		// ResultSet object.

		ResultSet result = stmt.executeQuery("SEKECT TIO 1 EMAIL_ADRESS FROM USER_REGISTER_TABLE");

		// Move cursor from default position to first row of result set.
		result.next();

		// Fetch value of "email_address" from "result" object.
		String emailaddress = result.getString("email_address");
		System.out.println(emailaddress);
		// Use the emailAddress value to login to application.
	/*
		driver.findElement(By.id, "userID").sendKeys(emailaddress);
		driver.findElement(By.id, "password").sendKeys(secretPassword);
		driver.findElement(By.id, "loginButton").click();
		WebElement element = driver.findElement(By.xpath, "//*[contains(.,'Welcome back ')]");		
	*/
		

		
		
	}
}
