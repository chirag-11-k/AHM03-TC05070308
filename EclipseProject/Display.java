package EclipseProject;

public class Display {
  public static void main(String args[]){
	   Account acc = new Account();
	   acc.setAccName("Elon musk");
	   System.out.println("Account holder name : "+acc.getAccName());
	   acc.setBalance(12000);
	   System.out.println("Current Account Balance: "+acc.getBalance());
	   acc.WithDraw(1000);
	   acc.Deposit(5000);
	   
	   Account acc1 = new Account("Constructor_Account",44444);
	   acc1.display();
	   Account acc2 = new Account();
	   acc2.display();
//	   Account[]arr=new Account[5];
//	   for(int i=0;i<arr.length;i++) {
//		   arr[i]=new Account();
//	   }
//	   arr[0].setAccName("first");
//	   arr[1].setAccName("second");
//	   arr[2].setAccName("third");
//	   arr[3].setAccName("fourth");
//	   arr[4].setAccName("fifth");
  }
}
