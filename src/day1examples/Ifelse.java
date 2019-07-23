package day1examples;

public class Ifelse {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int array[]={1,2,3,4,5};
		for (int i=0;i<array.length;i++){
			System.out.println("print"+array[i]);
			
		}
		///advanced for loop 
		for (int b:array){
			System.out.println("print"+b);
		}
		
//switch 
		switch(a){
		case 1:
		System.out.println("ram");
		break;
		case 2:
			System.out.println("bhupal");
			break;
		case 3:
			System.out.println("chowdary");
			break;
		case 4:
			System.out.println("ram bhupal");
			break;
		
		
		}
		
		//while
		int b=0;
		do{
			System.out.println(b);
			b++;
		}
		while(b>10);
	}

}
