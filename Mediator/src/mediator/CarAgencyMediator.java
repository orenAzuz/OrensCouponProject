package mediator;

import java.util.ArrayList;
import java.util.HashMap;
//This is the concrete mediator.
public class CarAgencyMediator implements Mediator{
	
	
	private HashMap<String,String>buyCar;
	private HashMap<String,String>waitingToBuyCar;
	private ArrayList<String>saleCar;
	private HashMap<String,String>allSellers;
	
	 public CarAgencyMediator() {
		
		 
		 buyCar = new HashMap<>();
		 saleCar = new ArrayList<>();
		 waitingToBuyCar = new HashMap<>();
		 allSellers = new HashMap<>();
	}
	 
	@Override
	public void buyCars(String vehicle,Colleague colleague) {
		
	
		
		for(int i = 0 ;i < saleCar.size(); i++){
			
			if(saleCar.get(i).equals(vehicle)){
				
				saleCar.remove(i);
				
				buyCar.put(vehicle,colleague.getName());
				System.out.println("Congratulations "+colleague.getName()+" !!! have fun driving your "+vehicle+" ");
								
			}
		}
			
			
				if(waitingToBuyCar.containsKey(vehicle)){
					
					buyCar.put(vehicle,waitingToBuyCar.get(vehicle));
					
					waitingToBuyCar.remove(vehicle);
					System.out.println("Congratulations "+colleague.getName()+" !!! have fun driving your "+vehicle+" ");

					}
			
				else{
				
				System.out.println("No worries "+colleague.getName() +" We will find your dream car soon...");
				waitingToBuyCar.put(vehicle,colleague.getName());
			
			
				}
				
	}

	@Override
	public void saleCars(String vehicle,Colleague colleague) {


		saleCar.add(vehicle);
		allSellers.put(vehicle, colleague.getName());
		System.out.println("Here's the money "+colleague.getName()+" we will sell your "+vehicle);
			
		if(waitingToBuyCar.get(vehicle)!=null){
				
		System.out.println("Congratulations !!! "+waitingToBuyCar.get(vehicle)
		+" have fun driving your "+vehicle+" ");
		
			buyCar.put(vehicle, waitingToBuyCar.get(vehicle));
			
			for(int index = 0 ;index < saleCar.size(); index++){
					
				if(saleCar.get(index).equals(vehicle)){
						
					saleCar.remove(index);
					waitingToBuyCar.remove(vehicle);
				}		
			 }
		  }		
	   }

	public void summary(){
		
		System.out.println(" Summary the buyers ");
		System.out.println();
		
		for (String key : buyCar.keySet()){
			
			System.out.println(buyCar.get(key)+" bout a "+key+" ! ");
		}
			System.out.println();
		System.out.println(" Summary the sellers ");
		System.out.println();

			for (String key : allSellers.keySet()){
				
				System.out.println(allSellers.get(key)+" sold a "+key);
			}
			
			
			
	}

}
