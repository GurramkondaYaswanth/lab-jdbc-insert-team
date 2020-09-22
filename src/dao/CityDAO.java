package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.City;
import utility.ConnectionManager;

public class CityDAO{
	public void getCityByName(String name) throws SQLException, ClassNotFoundException, IOException
	{
		Connection con = ConnectionManager.getConnection();
		Statement stmt=  con.createStatement();
		ResultSet rs =stmt.executeQuery("SELECT * FROM KABBADI");
		while(rs.next())
		{
			if(name.equalsIgnoreCase(rs.getString("CITYNAME")))
			{
			System.out.println("Team Name : "+rs.getString(1));
			System.out.println("Coach Name : "+rs.getString(2));
			System.out.println("Captain Name : "+rs.getString(3));
			System.out.println("City ID : "+rs.getLong(4));
			System.out.println("City Name : "+rs.getString(5));
			}
		}
		
	}
//	public createCity() {
//		
//	}
	
}


