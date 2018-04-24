
public class EventClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Client c1 =new Client("Suyash","suyash123","Mapusa","26-Jan-1995");
		
		c1.hallBooking("large hall",300,"music","light");
		
		c1.Catering("veg",220,"ice cream","soup");
		
		c1.Transport("Bus","AC",30,5);
		
		c1.hall_bill();
		c1.catering_bill();
		c1.transport_bill();
		c1.total_bill1();
		
	}
}
