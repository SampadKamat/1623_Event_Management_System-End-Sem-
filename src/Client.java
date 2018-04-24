/*Roll Number: 1623
 * */
//AFTER REFACTORING

public class Client {
	//Refactoring EXTRACT CONSTANT
	private static final int PER_PERSON_CHARGES = 20;
	//Refactoring EXTRACT CONSTANT
	private static final int PER_PLATE_PRICE = 50;
	//Refactoring
	//Renaming the vairiables in understandable name
	String Username,password,address,dob;
	String hall_type,hall_addon1,hall_addon2;
	String catering_type,catering_addon1,catering_addon2;
	String transport_vehicle,transport_type;
	int hall_capacity,catering_capacity,transport_capacity,transport_number;
	public Client(String Username, String password, String address, String dob) {
		// TODO Auto-generated constructor stub
		this.Username=Username;
		this.password=password;
		this.address=address;
		this.dob=dob;
	}



	public void hallBooking(String type, int capacity, String addon1, String addon2) {
		// TODO Auto-generated method stub
		this.hall_type=type;
		this.hall_capacity=capacity;
		this.hall_addon1=addon1;
		this.hall_addon2=addon2;
		
	}

	public void Catering(String c_type, int c_capacity, String c_addon1, String c_addon2) {
		// TODO Auto-generated method stub
		this.catering_type=c_type;
		this.catering_capacity=c_capacity;
		this.catering_addon1=c_addon1;
		this.catering_addon2=c_addon2;
		
	}

	public void Transport(String t_vehicle, String t_type, int t_capacity, int t_number) {
		// TODO Auto-generated method stub
		this.transport_vehicle=t_vehicle;
		this.transport_type=t_type;
		this.transport_capacity=t_capacity;
		this.transport_number=t_number;
		
		
	}

	public int hall_bill() {
		// TODO Auto-generated method stub
		int total_hall_bill=0;
		int tax;
		total_hall_bill=hall_capacity*50;
		tax=(total_hall_bill/100)*20;
		total_hall_bill=total_hall_bill+tax;
		System.out.println("Total Bill of the hall: "+total_hall_bill);
		return total_hall_bill;
		
	}

	public int catering_bill() {
		// TODO Auto-generated method stub
		int total_catering_bill;
		int tax1;
		total_catering_bill=catering_capacity*PER_PLATE_PRICE;
		tax1=(total_catering_bill/100)*20;
		total_catering_bill=total_catering_bill+tax1;
		System.out.println("Total Bill of Catering: "+total_catering_bill);
		return total_catering_bill;	
	}

	public int transport_bill() {
		// TODO Auto-generated method stub
		int total_transport_bill;
		int tax2=0;
		total_transport_bill=(transport_capacity*PER_PERSON_CHARGES)*transport_number;
		tax2=(total_transport_bill/100)*20;
		total_transport_bill=total_transport_bill+tax2;
		System.out.println("Total Bill of Transport: "+total_transport_bill);
		return total_transport_bill;
		
	}
	
	public int total_bill1() {
		// TODO Auto-generated method stub
		int total=0;
		System.out.println("  TOTAL ");
		total=hall_bill()+catering_bill()+transport_bill();
		System.out.println("Total Bill Inclusive all TAX: "+total);
		return total;
		
	}
	
	public String getUsername() {
		return Username;
	}

	public String getPassword() {
		return password;
	}

	public String getAddress() {
		return address;
	}

	public String getDob() {
		return dob;
	}



	public void total_bill() {
		// TODO Auto-generated method stub
		
	}



}
