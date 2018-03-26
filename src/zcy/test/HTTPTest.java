package zcy.test;

import zcy.misc.ToolsConfig;
import zcy.network.HTTP;

public class HTTPTest {
	public static void test() {
		HTTP http = new HTTP();
		System.out.println(http.get("http://blog.sina.com.cn/s/blog_85e93b5401011si8.html", null,
				null,null, ToolsConfig.LF));
//		System.out.println(http.post("http://localhost:8080/SSCSServer/LoginServer", null,
//				"table=manager&user=root&passwd=xOl8I8VR", null,null, Config.LF));
	}
}
