package com.skillstorm.training.day2;

public class Holder {
	   // Enthuware Test 1 Problem 59
	   int value = 1;
	   Holder link;
	   public Holder(int val){ this.value = val; }
	   public static void main(String[] args)
	   {
	      final Holder a = new Holder(5);
	      Holder b = new Holder(10);
	      a.link = b;
	      b.link = setIt(a, b);
	      System.out.println(a.link.value+" "+b.link.value);
	   }
	   
	   public static Holder setIt(final Holder x, final Holder y)
	   {
	       x.link = y.link;
	       return x;
	   }
	
	   // Enthuware Test 1 Problem 43
//	int value = 1;
//	Holder link;
//
//	public Holder(int val) {
//		this.value = val;
//	}
//
//	public static void main(String[] args) {
//		Holder a = new Holder(5); // com.skillstorm.training.day2.Holder@51565ec2
//		Holder b = new Holder(10); // com.skillstorm.training.day2.Holder@675d3402
//		a.link = b;
//		setIt(a, b);
//		System.out.println(a.link.value + ", " + b.link.value);
//	}
//
//	// x is com.skillstorm.training.day2.Holder@51565ec2
//	// y is com.skillstorm.training.day2.Holder@675d3402
//	public static void setIt(Holder x, Holder y) { 
//		y.link = x;
//	}

}
