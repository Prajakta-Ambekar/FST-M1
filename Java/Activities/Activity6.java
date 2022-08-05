
public class Activity6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Plane plane=new Plane();
		plane.Plane(10);
		plane.onboard("Ram");
		plane.onboard("Shyam");
		plane.onboard("Sita");
		System.out.println("Plane take-off at: "+plane.takeOff());
		System.out.println("People on the plane: "+plane.getPassesngers());
		Thread.sleep(5000);
		plane.land();
		
		System.out.println("Time of landing: "+plane.getLastTimeLanded());
		
		System.out.println("People on the plane after landing: " + plane.getPassesngers());

	}

}
