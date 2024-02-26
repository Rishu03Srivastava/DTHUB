package Methodcall;

public class Fristcall {
	
	int Dthub;
	int TesterEducationHub;
	
	public void Tester1()
	{
		System.out.println("Rishu Srivastava");
	}
	
	public void T1Exp()
	{
		System.out.println("2 years");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fristcall ft = new Fristcall();
		ft.Tester1();
		ft.T1Exp();
		ft.Dthub=01;
		System.out.println("DTHub rank " + ft.Dthub);
		ft.TesterEducationHub=1;
		System.out.println("Rank in testing " +ft.TesterEducationHub);

	}

}
