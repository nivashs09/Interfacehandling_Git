package WorkInterface;

public class colg implements Univ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		colg a=new colg();
		a.art();
		a.eng1();
	}

	@Override
	public void art() {
		// TODO Auto-generated method stub
		System.out.println("easy");
	}

	@Override
	public void eng1() {
		// TODO Auto-generated method stub
		System.out.println("tough");
		
	}

}
