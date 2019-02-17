package utils;

import comm.ResultInfo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;


/**
 * @Title 说明
 * @description 描述
 * @author huishen
 * @version 1.0
 * @createAt 2017年12月16日 下午4:45:05
 * @Copyright: Copyright (c) 2017 bjsszt. All Rights Reserved
 */
public class FileUpload {
	public static ResultInfo uploadFile(String root, String pathname, String fileName, InputStream inputStream) {
		ResultInfo resultInfo = new ResultInfo();
		genFolder(root + pathname);
		if (ConfigProp.getConfig("useFtp").equals("false")) {
			try {
				FileOutputStream os = new FileOutputStream(root + pathname + fileName);
				byte[] buff = new byte[1024];
				int len=0;
				while((len=inputStream.read(buff))!=-1){
					os.write(buff,0,len);
				}
				os.flush(); // 关闭流
				inputStream.close();
				os.close();
				resultInfo.setMsg(pathname + fileName);
			} catch (Exception ex) {
				resultInfo.setSuccess(false);
				resultInfo.setMsg(ex.getMessage());
			}
		} else {
			HashMap<String, Object> result = FtpUploadUtil.uploadFile(root + pathname, fileName, inputStream);
			resultInfo.setSuccess((Boolean) result.get("success"));
			resultInfo.setMsg(String.valueOf(result.get("url")));
		}
		return resultInfo;
	}

	/**
	 * 自动生成目录文件夹
	 * 
	 * @param path
	 */
	public static void genFolder(String path) {
		File file = new File(path);
		// 如果文件夹不存在则创建
		if (!file.exists() && !file.isDirectory()) {
			file.mkdirs();
		}
	}
}
