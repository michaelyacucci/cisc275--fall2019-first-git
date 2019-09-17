public class Dog extends Animal{

	String name;

	public Dog(String s, int l){
		super(l);
		name = s;
	}

	public void setName(String s){
		name = s;
	}

	public void setLegs(int l){
		super.legs = l;
	}

	public String getName(){
		return name;
	}

	public int getLegs(){
		return super.getLegs();
	}

}
