public class Complex {
    int real;
    double imaginary;
    Complex(int real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public  Complex add(Complex resu){
     int newReal=this.real+resu.real;
     double newImaginary=this.imaginary+resu.imaginary;
     return new Complex(newReal,newImaginary);
    }
            public static void main(String[] args) {
            Complex complex=new Complex(15,2.5);
            Complex complex1=new Complex(78,67);
            Complex result=complex.add(complex1);
            System.out.println("the sum of complex "+complex+" and "+complex1+" is  "+result);
    }
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
