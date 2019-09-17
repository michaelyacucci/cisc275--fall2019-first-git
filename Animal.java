public class Animal{

	String name;
	int legs;

	public Animal(String s, int l){
		name = s;
		legs = l;
	}

	public void setlegs(int l){
		legs = l;
	}

	public int getLegs(){
		return legs;
	}

	public void setName(String s){
		name = s;
	}

	public String getName(){
		return name;
	}

	public String toString(){
		return getName()+": "+getLegs()+" legs";
	}

}
