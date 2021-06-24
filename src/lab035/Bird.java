package lab035;

public class Bird extends Animal  implements FlyAction  {

	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.print("an mo");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.print("bay dap canh");
	}

}
