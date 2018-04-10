package String;

public class Bai8 {

	public static void main(String[] args) {
		String str1="Hoa hồng có gai";
		String str2="Bông hồng rất đẹp";
		String ktStr="Hoa";
		System.out.println("Chuỗi 1 là: "+str1+"\nChuỗi 2 là: "+str2);
		System.out.println("Chuỗi con kiểm tra là: "+ktStr);
		boolean ktStr1 = str1.startsWith(ktStr);
        boolean ktStr2 = str2.startsWith(ktStr);
        if(ktStr1==true)
        {
        	System.out.println("Chuỗi : "+str1+" có "+ktStr+" ======>"+ktStr1);
        }else {
        	System.out.println("Chuỗi : "+str1+" không có "+ktStr+" ======>"+ktStr1);
        }
        if(ktStr2==true)
        {
        	System.out.println("Chuỗi : "+str2+" có "+ktStr+" ======>"+ktStr2);
        }else {
        	System.out.println("Chuỗi : "+str2+" không có "+ktStr+" ======>"+ktStr2);
        }
	}

}
