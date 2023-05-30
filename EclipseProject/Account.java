package EclipseProject;

public class Account {
     
	
   private String AccName;
   private double Balance;
   
   public String getAccName() {
	   return AccName;
   }
   public void setAccName(String name) {
	   AccName = name;
   }
   public double getBalance() {
	   return Balance;
   }
   public void setBalance(double D) {
	   Balance = D;
   }
   public void WithDraw(double amount) {
	   if(amount>0 && amount <=Balance && Balance>3000) {
		   Balance-= amount;
		   System.out.println("Withdrawn: "+ amount);
		   System.out.println("Current Balance: "+ Balance);
	   }
	   else {
		   System.out.println("You dont have sufficient amount in account ");
	   }
   }
   public void Deposit(double amount) {
	   Balance+=amount;
	   System.out.println("Deposit amount : "+amount);
	   System.out.println("Updated Balance: "+Balance);
	  
   }
   public Account() {
	   AccName = "Default Constructor";
	   Balance = 88888;
   }
   public Account(String n, double B) {
	   AccName = n;
	   Balance = B;
   }
   public void display() {
	   System.out.println(AccName +" "+ Balance);
   }
}
