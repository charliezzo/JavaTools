package zcy.test;

import zcy.error.CountShortException;
import zcy.password.XOR;

public class XORTest {
	public static void test() {
		XOR xor = new XOR();
//		String[] result=xor.encryption("this is a test text message", 64);
		String[] result=xor.encryption("这是�?段测试文�?", 64);
		for(int count = 0;count<result.length;count++) {
			System.out.print(result[count]+"    ");
		}
		System.out.println();
		try {
			System.out.println(xor.decryption(result[0], result[1]));
		} catch (CountShortException e) {
			e.printStackTrace();
		}
	}
}
