package org.company;

public class CompanyInfo {
	private void companyName(String name) {
		System.out.println("Company Name :"+name);

	}
	private void companyName(int id, long c) {
		System.out.println("Company ID:"+id+"\nContact Number :"+c);
		
}
	private void companyName(long l, String A) {
	System.out.println("Company License No :"+l+"\n Company Address :"+A);
	System.out.println("Company GST Number: GTYUNBM78787787");
	System.out.println("Company License No :"+l+"\n Company Address :"+A);
	
	}
public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
	c.companyName("HCL");
	c.companyName(1122, 8778803877l);
	c.companyName(5347824l, "No 602/3, Elcot Economic Zone,\n Medavakkam High Road, \n Sholinganallur, Chennai - 600119.");
}

}

