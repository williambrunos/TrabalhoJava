package classes;

public class Contas {
	
	private boolean canWithdraw;
	private String name;
	private int number;
	private double amount = 0;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public double getAmount() {
		return this.amount;
	}
        
        public void initAmount(double initialAmount){
            this.amount = 0;
            this.amount = initialAmount;
        }
	
	public void deposit(double value) {
		this.amount += value;
	}
	
	public Boolean withdraw(double value) {
		if (this.amount >= value) {
			this.canWithdraw = true;
			this.amount -= value;
		}else {
			this.canWithdraw = false;
		}
		
		return this.canWithdraw;
	}
	
	public void transfer(int count1, int count2) {
		
	}
	
	public String countType() {
		return "Conta-comum";
	}
	
}
