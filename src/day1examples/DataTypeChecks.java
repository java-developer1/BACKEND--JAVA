package day1examples;

public class DataTypeChecks {
private int input;
private int array[];


public DataTypeChecks(int input, int[] array) {
	super();
	this.input = input;
	this.array = array;
}
public int squareOfANumber(){
	return input*input;	
	
}
public void display(){
	int number[]=new int[array.length];
	for(int i=0;i<array.length;i++){
		//int element=array[i];
		//int elementSquare=element*element;
//		 number[i]=elementSquare;
		number[i]=array[i]*array[i];
	}
	
	for (int i:number){
		System.out.println(i);
	}
	
	
}

}
