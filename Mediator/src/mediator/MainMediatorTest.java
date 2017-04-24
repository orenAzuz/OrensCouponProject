package mediator;

public class MainMediatorTest {

	public static void main(String[] args) {

		CarAgencyMediator avis = new CarAgencyMediator();
		
		Haim haim = new Haim(avis,"Haim");
		OrChay orchai = new OrChay(avis,"Orchai");
		haim.buyCars("volvo");
		haim.saleCars("Mercedes");
		haim.buyCars("Lamborghini");
		orchai.buyCars("Mercedes");
		orchai.saleCars("Lamborghini");
		orchai.saleCars("volvo");
		System.out.println();
		avis.summary();

		
	}

}
