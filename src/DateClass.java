
public class DateClass {
	private int day;
	private int month;
	private int year;
	public DateClass(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public  Boolean dateControl() {
		boolean flag = true;
		if((this.month> 12 ||this.month<1) || (this.day<1||this.day>31) || this.year<0 ) {
			flag= false;
		}
		else {
			if((this.month)==1 || this.month==3 || this.month==5 || this.month== 7 || this.month== 8 ||this.month==10 || this.month==12){
				if(this.day<01||this.day>31) {
					flag= false;
				}
			}
			else if(this.month==4 || this.month==6 || this.month== 9 || this.month==11) {
				if(this.day<01||this.day>30) {
					flag= false;
				}
			}
			else if(((this.month==2) && (this.year%4!=0) && (this.day<1||this.day>28)) || ((this.month==2) && (this.year)%4==0 && (this.day<1||this.day>29)) ) {
				flag= false;
			}
			else {
				flag= true;
			}
		}
		return flag;
	}
	public String display() {
		return this.day+"/"+this.month+"/"+this.year;
	}
}
