package classes;

public class ContaPoupanca extends Contas{
	
	public void reajust(double tax) {
		double newAmount = 0;
		newAmount += this.getAmount() * tax;
		this.deposit(newAmount);
	}
	
	public void reajust() {
		double newAmount = 0;
		newAmount += this.getAmount() * 0.1;
		this.deposit(newAmount);
	}
	
	public String countType() {
		return "Conta-poupança";
	}

}
