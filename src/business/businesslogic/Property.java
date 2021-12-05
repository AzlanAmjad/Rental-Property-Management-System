
public class Property{
	
	
	private String title;
	private String description;
	private String propertyType;
	private String rent;
	private String bedrooms;
	private String bathrooms; 
	private String squareFeet;
	private String furnished;
	private String landlord;
	private String state;
	private Landlord landlord;
	private String state;
	private Address address;
	private Date listingDate;
	private Fee fee = null;
	
	
	
	public String getTitle(){
	return title;	
		}
		
	public void setTitle(String a){
	title = a;
	}	
	
	public String getDescription(){
	return description;	
		}
		
	public void setDescription(String a){
	description = a;
	}	
	
	public String getPropertyType(){
	return propertyType;	
	}
		
	public void setPropertyType(String a){
	propertyType = a;
	}	
	
	public String getRent(){
		return rent;
	}
	
	public void setRent(String a){
	rent = a;
	}
	
	public String getBedrooms(){
	return bedrooms;
	}
	
	public void setBedrooms(String a){
	bedrooms = a;
	}
	
	public String getSquareFeet(){
		return squareFeet;
	}
	
	public void setSquareFeet(String a){
	squareFeet = a;
	}
	
	public String getFurnished(){
	return furnished;
	}
	
	public void setFurnished(String a){
		furnished = a;
	}
	
	public Landlord getLandlord(){
		return landlord;
	}
	
	public void setLandlord(Landlord a){
	landlord = a;
	}
	
	public String getState(){
	return state;
	}
	
	public void setState(String a){
	state = a;
	}
	
	public Address getAddress(){
		return address;
	}
	
	public Date getListingDate(){
		return listingDate;
	}
	
	public void setListingDate(Date a){
		listingDate = a;
	}
	
	public Fee getFee(){
		return fee;
	}
	
	public void setFee(Fee a){
		fee = a;
	}
	
	
	
	
	
	
}
