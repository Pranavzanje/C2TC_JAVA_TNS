package com.cg.application;

import com.cg.framework.*;

public class GSPrimeAcc extends PrimeAcc {
	
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		
	}
//	public GSPrimeAcc() 
//	{
//		super(accNo, accNm, charges, isPrime);

//	}


	public void bookProduct(float charges) {
		System.out.println("Dear Prime User, Your Product Charges are: " +charges+ " Without delivery charges." );
	}

//see afterwards
//	@Override
//	public String toString() {
//		return "GSPrimeAcc [isPrime=" + isPrime + ", accNo=" + accNo + ", charges=" + charges + ", toString()="
//				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
//	};
	
	@Override
	public String toString() {
		return "GSPrimeAcc []";
	}
	

}
