public class Dog{

	private
	String name;
	int legs;

	public Dog(String s, int l){
		name = s;
		legs = l;
	}

	public void setName(String s){
		name = s;
	}

	public void setLegs(int l){
		legs = l;
	}

	public String getName(){
		return name;
	}

	public int getLegs(){
		return legs;
	}

}
