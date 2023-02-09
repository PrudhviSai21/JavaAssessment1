import java.util.Scanner;

public class Complex {

	int real,img;
	Complex(){
		
	}
	
	Complex(int real,int img){
		this.real=real;
		this.img=img;
	}
	 public void ShowComplexNumber() {
		 System.out.println(this.real+"+"+this.img+"i");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Enter the value of c and d");
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		Complex c1=new Complex(a, b);
		Complex c2=new Complex(c, d);
		
		c1.ShowComplexNumber();
		c2.ShowComplexNumber();
		
		System.out.println("Enter the operation to perform +,-,*,/");
		String Op=sc.next();
		
		Operations o=new Operations();
		
		switch(Op) {
			case "+":
				Complex res=o.add(c1,c2);
				res.ShowComplexNumber();
				break;
			case "-":
				res=o.subtract(c1, c2);
				res.ShowComplexNumber();
				break;
			case "*":
				res=o.Multiply(c1, c2);
				res.ShowComplexNumber();
				break;
			default:
				System.out.println("Wrong Option Chosen");
		}
		
		sc.close();

	}

}
