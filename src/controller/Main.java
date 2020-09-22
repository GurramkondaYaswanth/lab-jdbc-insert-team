package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;
public class Main 

{
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		CityDAO citydao = new CityDAO();
		TeamDAO teamdao = new TeamDAO();
		City city = null;
		Team team = null;
		
		do {
		System.out.print("Enter 1 to add details to table or 2 search: ");
		int addSearch = Integer.parseInt(br.readLine());
		
		
		if(addSearch == 1) {
		System.out.print("Enter city name: ");
		String cityName = br.readLine();
		
		System.out.print("Enter city id: ");
		long id = Long.parseLong(br.readLine());
		
		city = new City(id,cityName);
		
		System.out.print("Enter team name: ");
		String name = br.readLine();
		
		System.out.print("Enter coach name: ");
		String coachName = br.readLine();
		
		System.out.print("Enter captain name: ");
		String captianName = br.readLine();
		
		team = new Team(name,coachName,captianName,city);
		teamdao.createTeam(team);
		}
		else if(addSearch == 2) {
		System.out.print("Enter city name to get details of city: ");
		String cname=br.readLine();
		citydao.getCityByName(cname);
		}else {
			System.out.println("Invalid Input");
		}
		} while(true);
		
	}
	
}
