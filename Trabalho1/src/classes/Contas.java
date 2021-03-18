package classes;

import javax.swing.JOptionPane;

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
	
	public boolean withdraw(double value) {
		if (this.amount >= value) {
			this.canWithdraw = true;
			this.amount -= value;
		}else {
			this.canWithdraw = false;
		}
		
		return this.canWithdraw;
	}
	
        //Desconta da conta 1 e deposita na conta 2:
	public boolean transfer(int count1, int count2, double value) {
            boolean canDiscount = true;
            boolean canWithdraw = true;
            
            if( Principal.cc.getNumber() == count1 && Principal.cp.getNumber() == count2){
                
                canWithdraw = Principal.cc.withdraw(value);
                
                if( canWithdraw == true ){
                    canDiscount = true;
                    Principal.cp.deposit(value);
                }else{
                    canDiscount = false;
                }
                
            }else if( Principal.cc.getNumber() == count1 && Principal.ce.getNumber() == count2 ){
                
                canWithdraw = Principal.cc.withdraw(value);
                
                if( canWithdraw == true ){
                    canDiscount = true;
                    Principal.ce.deposit(value);
                }else{
                    canDiscount = false;
                }
                
            }else if( Principal.cp.getNumber() == count1 && Principal.cc.getNumber() == count2 ){
                
                canWithdraw = Principal.cp.withdraw(value);
                
                if( canWithdraw == true ){
                    canDiscount = true;
                    Principal.cc.deposit(value);
                }else{
                    canDiscount = false;
                }
                
            }else if( Principal.cp.getNumber() == count1 && Principal.ce.getNumber() == count2 ){
                
                canWithdraw = Principal.cp.withdraw(value);
                
                if( canWithdraw == true ){
                    canDiscount = true;
                    Principal.ce.deposit(value);
                }else{
                    canDiscount = false;
                }
                
            }else if( Principal.ce.getNumber() == count1 && Principal.cc.getNumber() == count2 ){
                
                canWithdraw = Principal.ce.withdraw(value);
                
                if( canWithdraw == true ){
                    canDiscount = true;
                    Principal.cc.deposit(value);
                }else{
                    canDiscount = false;
                }
                
            }else if( Principal.ce.getNumber() == count2 && Principal.cp.getNumber() == count2 ){
                
                canWithdraw = Principal.ce.withdraw(value);
                
                if( canWithdraw == true ){
                    canDiscount = true;
                    Principal.cp.deposit(value);
                }else{
                    canDiscount = false;
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Erro! Números de conta inváidos!", "Erro de transferência", JOptionPane.WARNING_MESSAGE);
                canDiscount = false;
            }
            return canDiscount;
	}
	
	public String countType() {
		return "Conta-comum";
	}
	
}
