

	public class Fraction{
		private int numerator;
		private int denominator;
		public Fraction(){
			
		}
		public Fraction(int num ,int den){
			this.numerator=num;
			this.denominator=den;
		}
		public Fraction(Fraction f){
			this.numerator=f.numerator;
			this.denominator=f.denominator;
		}
		public Fraction add(Fraction f){
			Fraction sum=new Fraction();
			sum.numerator=this.numerator+f.numerator;
			sum.denominator=this.denominator+f.denominator;
			return sum;
		}
		public Fraction sub(Fraction f){
			Fraction diff=new Fraction();
			diff.numerator=this.numerator-f.numerator;
			diff.denominator=this.denominator-f.denominator;
			return diff;
		}
		public Fraction mul(Fraction f){
			Fraction product=new Fraction();
			product.numerator=this.numerator*f.numerator;
			product.denominator=this.denominator*f.denominator;
			return product;
		}
		public Fraction div(Fraction f){
			Fraction factor=new Fraction();
			factor.numerator=this.numerator/f.numerator;
			factor.denominator=this.denominator/f.denominator;
			return factor;
		}
		public void reducer(){
			
		}
		public String toString(){
			return "Fraction[num=" +this.numerator+ "den=" +this.denominator+"]";
		}
	}
