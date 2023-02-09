public class Operations {
	
	public Complex add(Complex c1,Complex c2) {
		
		Complex res=new Complex();
		res.real=c1.real+c2.real;
		res.img=c1.img+c2.img;
		
		return res;
	}
	
	public Complex subtract(Complex c1,Complex c2) {
		
		Complex res=new Complex();
		res.real=c1.real-c2.real;
		res.img=c1.img-c2.img;
		
		return res;
		
	}
	
	public Complex Multiply(Complex c1,Complex c2) {
		
		Complex res=new Complex();
		res.real=c1.real*c2.real;
		res.img=c1.img*c2.img;
		
		return res;
	}
	

}
