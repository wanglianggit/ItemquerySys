package com.ys.util;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

public class DownloadFile {

	public static void download(String path,String nameSuf,HttpServletResponse response) {

		try {
			//生成新的文件名
			String suffix = path.substring(path.indexOf("."));
			String name = nameSuf + suffix;
			//读取文件
			InputStream is = new FileInputStream(path);
			response.reset(); // 重点突出，清空response
			response.setCharacterEncoding("UTF-8"); // 重点突出
			response.setContentType("application/vnd.ms-excel");// 不同类型的文件对应不同的MIME类型 // 重点突出
			// attachment弹出对话框，提示用户进行下载保存本地
			response.setHeader("Content-Disposition", "attachment;filename="+ name);
			ServletOutputStream outputStream = response.getOutputStream();
			byte[] b = new byte[2048];
			int length = 0;
			while ((length = is.read(b)) != -1) {
				outputStream.write(b, 0, length);
				outputStream.flush();
			}
			outputStream.close();
			System.out.println("下载成功");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
