
public class PhoneClass {
	private int countryCode;
	private int cityCode;
	private int number;
	
	public PhoneClass(int cityCode,int number) {
		this.countryCode=90;
		this.cityCode=cityCode;
		this.number=number;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public int getCityCode() {
		return cityCode;
	}

	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public String display() {
		return ("+"+this.countryCode+" ("+this.cityCode+") "+this.number);
	}
}
