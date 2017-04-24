
public interface Test {
	
	public String doSomething(String s);
	
	public default  String sendNumber(int i){
		
		return cal(i);
	}

	public static String cal(int i){
		
		if(i % 2 != 0){
			
			return "odd !";
		}
		return "even !";
	}

}
