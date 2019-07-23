package day1examples;

public class ArrayList {
	int array[];

	public ArrayList(int[] array) {
		super();
		this.array = array;
	}
	
	public void display(){
		for(int i=0;i<array.length;i++){
			System.out.println("print"+array[i]);
		}
	}

}
