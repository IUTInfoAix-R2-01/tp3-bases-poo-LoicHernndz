package part3.ex1;

public class MyComplex {
	private double real;
	private double imag;
	
	public MyComplex() {
		real = 0.0;
		imag = 0.0;
	}
	
	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public double getReal() {
		return real;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public double getImag() {
		return imag;
	}
	
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public String toString() {
		return real + " + " + imag+"i";
	}
	
	public boolean isReal() {
		return (imag==0);
	}
	
	public boolean isImaginary() {
		return (real==0);
	}
	
	public boolean equals(double real, double imag) {
		return (this.imag == imag) && (this.real == real);
	}
	
	public boolean equals(MyComplex another) {
		return (this.imag == another.getImag()) && (this.real == another.getReal());
	}
	
	public double magnitude() {
		return Math.sqrt(real*real + imag*imag);
	}
	
	public double argument() {
		return Math.atan2(imag, real);
	}
	
	public MyComplex add(MyComplex right) {
		real += right.getReal();
		imag += right.getImag();
		return this;
	}
	
	public MyComplex addNew(MyComplex right) {
		return new MyComplex(real + right.getReal(), imag + right.getImag());
	}
	
	public MyComplex subtract(MyComplex right) {
		real -= right.getReal();
		imag -= right.getImag();
		return this;
	}
	
	public MyComplex subtractNew(MyComplex right) {
		return new MyComplex(real - right.getReal(), imag - right.getImag());
	}
	
	public MyComplex multiply(MyComplex right) {
		real *= right.getReal();
		imag *= right.getImag();
		return this;
	}
	
	public MyComplex divide(MyComplex right) {
		real /= right.getReal();
		imag /= right.getImag();
		return this;
	}
	
	public void conjugate() {
		imag = -imag;
	}
}
