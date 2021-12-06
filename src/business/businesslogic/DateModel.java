package business.businesslogic;

public class DateModel {
	
	private String day;
	private String month;
	private String year;	
		
	public DateModel(String year, String month, String day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public DateModel() {
		day = "";
		month = "";
		year = "";
	}
	
	public void setYear(String year){
		this.year = year;
	}
	
	public String getYear(){
		return year;
	}
		
	
	public void setMonth(String month){
		this.month = month;
	}
	
	public String getMonth(){
		return month;
	}
	
	
	public void setDay(String day){
		this.day = day;
	}
	
	public String getDay(){
		return day;
	}
	
	public String getDateFormatted() {
		String date = year + "-" + month + "-" + day;
		return date;
	}
	
}
