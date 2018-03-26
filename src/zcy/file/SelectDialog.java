package zcy.file;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

public class SelectDialog {
	private JFileChooser fileChooser;

	private void DialogInit(String title) {
		try {
			fileChooser = new JFileChooser();
			FileSystemView fileSystemView = FileSystemView.getFileSystemView();
			fileChooser.setCurrentDirectory(fileSystemView.getHomeDirectory());
			fileChooser.setDialogTitle(title);
			fileChooser.setApproveButtonText("确定");
		} catch (Exception e) {
		}
	}

	public String fileOpenDialog() {
		try {
			DialogInit("选择");
			fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
			if (fileChooser.showOpenDialog(fileChooser) == JFileChooser.APPROVE_OPTION) {
				return fileChooser.getSelectedFile().getPath();
			}
		} catch (Exception e) {
		}
		return null;
	}

	public String fileSaveDialog() {
		try {
			DialogInit("保存");
			if (fileChooser.showSaveDialog(fileChooser) == JFileChooser.APPROVE_OPTION) {
				if (fileChooser.getSelectedFile().exists()) {
					if (JOptionPane.showConfirmDialog(null, "文件已存在，是否覆盖�?", "提示",
							JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
						return fileChooser.getSelectedFile().getPath();
					}
				} else {
					return fileChooser.getSelectedFile().getPath();
				}
			}
		} catch (Exception e) {
		}
		return null;
	}
}
