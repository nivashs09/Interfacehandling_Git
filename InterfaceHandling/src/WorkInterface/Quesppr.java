package WorkInterface;

public class Quesppr implements BlueprintofQp, Univ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quesppr a = new Quesppr();
		a.dologin();
		a.dowork();
		a.doregister();
			}
	public void dologin(){
	System.out.println("One mark");
	}
	public void doregister() {
		System.out.println("twomarks");
	}
	public void dowork() {
		System.out.println("tenmarks");
	}
	@Override
	public void art() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void eng1() {
		// TODO Auto-generated method stub
		
	}
	

}
