import java.util.Scanner;


public class Fibonacci {

	public void suma (int lim){
		int a = 1;
		int b =a;
		System.out.print(a+" "+b+" ");
		
		for(int i=2; i< lim ;  i++ ){
			
			a+=b;
			b=a-b;
			System.out.print((a)+" ");
		}
		System.out.println();
	}
	
	public void showMessage(){
		
		System.out.println("HOLA nuevo BRAnch");
		System.out.println("Nueva aplicacion");
	}
	
	
	public static void main(String[] args) {
		
		Fibonacci a = new Fibonacci();
		Scanner s = new Scanner(System.in);
		a.showMessage();
		System.out.println("ingrese su numero");
		a.suma(s.nextInt());
		
		
		
	}

}
