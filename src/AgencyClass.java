

public class AgencyClass {
	private int id;
	private String name;
	private AddressClass address;
	private PhoneClass phone;
	

	public AgencyClass(String inputName,AddressClass inputAddress,PhoneClass inputPhone) {
		name=inputName;
		address=inputAddress;
		phone=inputPhone;
		
	}
	public AgencyClass() {
		this.name=null;
		this.address=null;
		this.phone=null;
		this.id=-1;
		
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the phone
	 */
	public PhoneClass getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(PhoneClass phone) {
		this.phone = phone;
	}
	public void display() {
		System.out.println("Office ID: " +this.id);
		System.out.println("Name: "+ this.name);
		System.out.println("Adress: " + address.display());
		System.out.println("Phone: " +phone.display());
	}
	
}
