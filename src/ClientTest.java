/*Roll Number: 1623
 * */
//AFTER REFACTORING

import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {
	Client c1 =new Client("Suyash","suyash123","Mapusa","26-Jan-1995");
	
	/*c1.hallBooking("large hall",300,"music","light");
	
	c1.Catering("veg",220,"ice cream","soup");
	
	c1.Transport("Bus","AC",30,5);*/

	@Test
	public void testHall_bill() {
		//fail("Not yet implemented");
		c1.hallBooking("large hall",300,"music","light");
		assertEquals(18000,c1.hall_bill());
	}
	
	public void testtotal_bill1(){
		//fail("Not yet implemented");
		c1.hallBooking("large hall",300,"music","light");
		c1.Catering("veg",220,"ice cream","soup");
		c1.Transport("Bus","AC",30,5);
		assertEquals(18000,c1.total_bill1());
	}


	@Test
	public void testCatering_bill() {
		//fail("Not yet implemented");
		c1.Catering("veg",220,"ice cream","soup");;
		assertEquals(13200,c1.catering_bill());
	}

	@Test
	public void testTransport_bill() {
		//fail("Not yet implemented");
		c1.Transport("Bus","AC",30,5);
		assertEquals(3600,c1.transport_bill());
	}

	@Test
	public void testGetUsername() {
		//fail("Not yet implemented");
		assertEquals("Suyash",c1.getUsername());
	}

	@Test
	public void testGetPassword() {
		//fail("Not yet implemented");
		assertEquals("suyash123",c1.getPassword());
	}

	@Test
	public void testGetAddress() {
		//fail("Not yet implemented");
		assertEquals("Mapusa",c1.getAddress());
	}

	/*@Test
	public void testGetDob() {
		//fail("Not yet implemented");
		assertEquals("26-Jan-1995",c1.getDob());
	}*/

}
