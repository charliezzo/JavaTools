package zcy.test;

import zcy.file.SelectDialog;

public class DialogTest {
	public static void test() {
		SelectDialog selectDialog = new SelectDialog();
		System.out.println("open:" + selectDialog.fileOpenDialog());
		System.out.println("save:" + selectDialog.fileSaveDialog());
	}
}
