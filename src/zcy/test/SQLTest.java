package zcy.test;

import zcy.error.DataBaseTypeException;
import zcy.sql.SQL;
import zcy.sql.SQLFactory;

public class SQLTest {
	public static void test() {
		// try {
		// String command = "day1";
		// String command = "root";
		// SQL sql = SQLFactory.getSQL("mysql");
		// sql.open("127.0.0.1", "3306", "sscs", "root", "", "utf-8");
		// SQL sql = SQLFactory.getSQL("sql server");
		// sql.open("172.21.90.4", "1433", "student", "sa", "", "");
		// String[][] res = sql.query("select * from manager");
		// String[][] res = sql.query("select * from manager where username='" + command
		// + "'");
		// sql.close();
		// for (int i = 0; i < res.length; i++) {
		// for (int j = 0; j < res[i].length; j++) {
		// System.out.print(res[i][j] + " ");
		// }
		// System.out.println();
		// }
		// } catch (DataBaseTypeException e) {
		// e.printStackTrace();
		// }
		try {
			SQL sql = SQLFactory.getSQL("sqlite");
			sql.open("test.db", null, null, null, null, null);
			sql.update("create table if not exists student(id int,name char(5))");
			sql.update("insert into student values(345,'567')");
			String[][] res = sql.query("select * from student");
			sql.close();
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[i].length; j++) {
					System.out.print(res[i][j] + " ");
				}
				System.out.println();
			}
		} catch (DataBaseTypeException e) {
			e.printStackTrace();
		}
	}
}
