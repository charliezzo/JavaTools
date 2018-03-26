package zcy.test;

import zcy.misc.ToolsConfig;
import zcy.shell.Execute;

public class ShellTest {
	public static void test() {
		System.out.println(Execute.execute("ifconfig", "utf-8", ToolsConfig.CR));
	}
}
