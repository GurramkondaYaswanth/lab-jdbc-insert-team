package model;

public class City{
	Long cityld;
	String cityName;
	public Long getCityld() {
		return cityld;
	}
	public void setCityld(Long cityld) {
		this.cityld = cityld;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public City(Long cityld, String cityName) {
		super();
		this.cityld = cityld;
		this.cityName = cityName;
	}
	
}
