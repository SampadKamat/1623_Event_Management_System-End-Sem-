
public class Client {
	String Username,password,address,dob;
	String h_type,h_addon1,h_addon2;
	String c_type,c_addon1,c_addon2;
	String t_vehicle,t_type;
	int h_capacity,c_capacity,t_capacity,t_number;
	public Client(String Username, String password, String address, String dob) {
		// TODO Auto-generated constructor stub
		this.Username=Username;
		this.password=password;
		this.address=address;
		this.dob=dob;
	}



	public void hallBooking(String type, int capacity, String addon1, String addon2) {
		// TODO Auto-generated method stub
		this.h_type=type;
		this.h_capacity=capacity;
		this.h_addon1=addon1;
		this.h_addon2=addon2;
		
	}

	public void Catering(String c_type, int c_capacity, String c_addon1, String c_addon2) {
		// TODO Auto-generated method stub
		this.c_type=c_type;
		this.c_capacity=c_capacity;
		this.c_addon1=c_addon1;
		this.c_addon2=c_addon2;
		
	}

	public void Transport(String t_vehicle, String t_type, int t_capacity, int t_number) {
		// TODO Auto-generated method stub
		this.t_vehicle=t_vehicle;
		this.t_type=t_type;
		this.t_capacity=t_capacity;
		this.t_number=t_number;
		
		
	}

	public int hall_bill() {
		// TODO Auto-generated method stub
		int total_hall_bill=0;
		int tax;
		total_hall_bill=h_capacity*50;
		tax=(total_hall_bill/100)*20;
		total_hall_bill=total_hall_bill+tax;
		total_hall_bill=total_hall_bill+tax;
		System.out.println("Total Bill of the hall: "+total_hall_bill);
		return total_hall_bill;
		
	}

	public int catering_bill() {
		// TODO Auto-generated method stub
		int total_catering_bill;
		int tax1;
		total_catering_bill=h_capacity*50;
		tax1=(total_catering_bill/100)*20;
		total_catering_bill=total_catering_bill+tax1;
		System.out.println("Total Bill of Catering: "+total_catering_bill);
		return total_catering_bill;	
	}

	public int transport_bill() {
		// TODO Auto-generated method stub
		int total_transport_bill;
		int tax2=0;
		total_transport_bill=(h_capacity*20)*t_number;
		tax2=(total_transport_bill/100)*20;
		total_transport_bill=total_transport_bill+tax2;
		System.out.println("Total Bill of Transport: "+total_transport_bill);
		return total_transport_bill;
		
	}
	
	public void total_bill1() {
		// TODO Auto-generated method stub
		int total=0;
		System.out.println("  TOTAL ");
		total=hall_bill()+catering_bill()+transport_bill();
		System.out.println("Total Bill Inclusive all TAX: "+total);
		
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
