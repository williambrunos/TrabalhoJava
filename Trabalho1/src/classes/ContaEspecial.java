package classes;

public class ContaEspecial extends Contas{
	private int limit;
	
        public void setLimit(int limit){
            this.limit = limit;
        }
        
        public int getLimit(){
            return this.limit;
        }
        
        
	public boolean discount(double penalty, double saque) {
		double difference = this.getAmount() - saque;
                boolean limitOutOfBounds = false;
                
                if( limit < -(difference) ){
                    limitOutOfBounds = true;
                }else{
                    this.initAmount(difference*(1+penalty));
                }
              
                return limitOutOfBounds;
	}
	
	public String countType() {
		return "Conta especial";
	}
}
