package mediator;

public abstract class Colleague {
	
	private Mediator mediator;
	private String name;
	
	public String getName(){
		
		return this.name;
	}
	public void setName(String name){
		
		this.name = name;
	}
	
	public Colleague(Mediator newMediator,String name){
		
		this.mediator = newMediator;
		this.name = name;
	}
	
	public void buyCars(String vehicle){
		
		mediator.buyCars(vehicle,this);
	}
	
	public void saleCars(String vehicle){
		
		mediator.saleCars(vehicle,this);
	}

}
