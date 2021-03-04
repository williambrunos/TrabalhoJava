package classes;

public class ContaEspecial extends Contas{
	private int limit;
	
        public void setLimit(int limit){
            this.limit = limit;
        }
        
        public int getLimit(){
            return this.limit;
        }
        
	public void discount(double penalty) {
		
	}
	
	public String countType() {
		return "Conta especial";
	}
}
