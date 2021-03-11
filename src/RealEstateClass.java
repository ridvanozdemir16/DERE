public class RealEstateClass {
	private int id;
	private String type;
	private String status;
	private Boolean availibility;
	private AddressClass address;
	private int surfaceArea;
	private int price;
	private int numberOfRooms;
	private String availableMessage;

	public RealEstateClass(String inputType,String inputStatus,AddressClass inputAddress,int inputSurfaceArea,int inputPrice,int inputNumberOfRooms) {
		
		type=inputType;
		status=inputStatus;
		availibility=true;
		address=inputAddress;
		surfaceArea=inputSurfaceArea;
		price=inputPrice;
		numberOfRooms=inputNumberOfRooms;
		availableMessage="Real Estate is available";
	}
	public RealEstateClass() {
		type=null;
		status=null;
		availibility=false;
		address=null;
		surfaceArea=0;
		price=0;
		numberOfRooms=0;
		availableMessage="Deleted";
	}
	
	/**
	 * @return the availableMessage
	 */
	public String getAvailableMessage() {
		return availableMessage;
	}
	/**
	 * @param availableMessage the availableMessage to set
	 */
	public void setAvailableMessage(String availableMessage) {
		this.availableMessage = availableMessage;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the availability
	 */
	public Boolean getAvailibility() {
		return availibility;
	}
	/**
	 * @param availability the availability to set
	 */
	public void setAvailibility(Boolean availability) {
		this.availibility = availability;
	}
	/**
	 * @return the address
	 */
	public AddressClass getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(AddressClass address) {
		this.address = address;
	}
	/**
	 * @return the surfaceArea
	 */
	public int getSurfaceArea() {
		return surfaceArea;
	}
	/**
	 * @param surfaceArea the surfaceArea to set
	 */
	public void setSurfaceArea(int surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the numberOfRooms
	 */
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	/**
	 * @param numberOfRooms the numberOfRooms to set
	 */
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public void display(){
		System.out.println(this.type +" " + this.status);
		System.out.println("Adress: " + address.display());
		System.out.println("Surface area: " +this.surfaceArea+"m²");
		System.out.println("Price: " +this.price);
		System.out.println("Number of Rooms: " +this.numberOfRooms);
	}
	
	
	

}
