package zcy.test;

import zcy.error.FileTypeException;
import zcy.safe.SQLSafe;

public class SQLSafeTest {
	public static void test() {
		System.out.println(SQLSafe.SQLInjection("#"));
		try {
			System.out.println(SQLSafe.SQLInjection("test.json", "utf-8", "#"));
			System.out.println(SQLSafe.SQLInjection("test.json", "utf-8", "&"));
			
			System.out.println(SQLSafe.SQLInjection("test.xml", "utf-8", "#"));
			System.out.println(SQLSafe.SQLInjection("test.xml", "utf-8", "&"));
		} catch (FileTypeException e) {
			e.printStackTrace();
		}
	}
}
