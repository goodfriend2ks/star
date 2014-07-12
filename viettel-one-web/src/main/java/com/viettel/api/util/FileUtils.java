package com.viettel.api.util;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * VuongBD 24/03/2014 Xu ly cac file
 */
// FIXME(VuongBD): Yêu cầu sử dụng SLF4J, khai báo logger dạng instance variable
// tránh khởi tạo lại nhiều lần
public class FileUtils {

	public static boolean createFolder(String path) {
		File theDir = new File(path);

		// if the directory does not exist, create it
		if (!theDir.exists()) {
			boolean result = theDir.mkdirs();

			if (result) {
				Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE,
						null, "Folder : " + path + " created");
				return true;
			} else {
				Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE,
						null, "Create folder : " + path + " error");
				return false;
			}
		} else {
			Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null,
					"Folder : " + path + " is exists");
			return true;
		}
	}

	public static boolean moveFile_2(String oldPath, String newPath) {
		File oldFile = new File(oldPath);
		File newFile = new File(newPath + File.separator);

		// if the directory does not exist, create it
		if (!newFile.exists()) {
			boolean result = newFile.mkdirs();

			if (result) {
				Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE,
						null, "Folder : " + newFile.getPath() + " is created");

			} else {
				Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE,
						null, "Folder : " + newFile.getPath() + " error");
				return false;
			}
		}

		// check is directory
		if (oldFile.isDirectory()) {

			// directory is empty, then delete it
			if (oldFile.list().length == 0) {
				Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE,
						null,
						"Directory is deleted : " + oldFile.getAbsolutePath());
				delete(oldPath);
				return true;

			} else {

				String[] entries = oldFile.list();
				for (String s : entries) {
					File currentFile = new File(oldFile.getPath(), s);
					try {
						// new file
						Path destination = Paths.get(newFile.getPath() + "\\"
								+ currentFile.getName());
						Files.copy(currentFile.toPath(), destination,
								REPLACE_EXISTING);
					} catch (IOException e) {
						Logger.getLogger(FileUtils.class.getName()).log(
								Level.SEVERE, null, e.getMessage());
						return false;
					}
				}
				delete(oldPath);
				return true;
			}
		}
		return true;
	}

	public static boolean renameFile(String oldPath, String newPath) {
		File oldFile = new File(oldPath);
		File newFile = new File(newPath);
		if (newFile.exists()) {
			Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null,
					"File : " + newFile.getPath() + " exists");
			return true;
		}

		boolean success = false;
		try {
			success = oldFile.renameTo(newFile);
		} catch (Exception ex) {
			Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null,
					"File rename error : " + ex.getMessage());
		}
		return success == true ? true : false;
	}

	public static void delete(String path) {

		File file = new File(path);
		if (file.isDirectory()) {

			// directory is empty, then delete it
			if (file.list().length == 0) {

				file.delete();
				Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE,
						null, "File is deleted : " + file.getAbsolutePath());

			} else {

				String[] entries = file.list();
				for (String s : entries) {
					File currentFile = new File(file.getPath(), s);
					currentFile.delete();
				}
				file.delete();
			}

		} else {	
			if (file.exists()) {
				file.delete();
			}	
			Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null,
					"File is deleted : " + file.getAbsolutePath());
		}
	}

	public static void deleteFileInFolder(String path, String nameFile) {
		File file = new File(path);
		if (file.isDirectory()) {
			if (file.list().length > 0) {
				String[] entries = file.list();
				for (String s : entries) {
					File currentFile = new File(file.getPath(), s);
					if (currentFile.getName().equals(nameFile)) {
						currentFile.delete();
					}
				}
			}
		}
	}

	public static List<String> getFileNameInFolder(String path) {
		List<String> kq = new ArrayList<String>();
		File file = new File(path);
		if (file.isDirectory()) {
			if (file.list().length > 0) {
				String[] entries = file.list();
				for (String s : entries) {
					File currentFile = new File(file.getPath(), s);
					kq.add(currentFile.getName());
				}
			}
		}
		return kq;
	}

	public static boolean coppyFileIntoFolder(File file, String path,
			String name) {
		boolean flag = createFolder(path);
		if (flag == true) {
			try {
				File fileCpp = new File(path + File.separator + name);
				if (file.renameTo(fileCpp)) {
					return true;
				} else {

					Path destination = Paths.get(fileCpp.getPath());

					Files.copy(file.toPath(), destination, REPLACE_EXISTING);
				}

			} catch (Exception e) {
				Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE,
						null, e.getMessage());
			}

		}
		return true;
	}
}
