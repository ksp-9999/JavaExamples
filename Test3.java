package AbsrtractDemo;
abstract class Vehicle{
	public abstract int getNoWheels();
	public static void main(String[] args){
	Bus b= new Bus();
	System.out.println(b.getNoWheels());
	Auto a= new Auto();
	System.out.println(a.getNoWheels());
	}
}
class Bus extends Vehicle{
	public int getNoWheels(){
		return 7;
	}
}
class Auto extends Vehicle{
	public int getNoWheels(){
		return 3;
	}
}