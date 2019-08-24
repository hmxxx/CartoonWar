package com.neuedu.test0816;

public class TryCatchDemo {

	public static void mian(String[] args) {
		System.out.println(
			test(null)+","+test("0")+","+test("")
				);
	}
	public static int test(String str) {
		try {
			return str.charAt(0)-'0';
		}catch(NullPointerException e) {
			e.printStackTrace();return 1;
		}catch(RuntimException e) {
			e.printStackTrace();return 2;
		}
	}
}








