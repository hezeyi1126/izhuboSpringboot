package springboot.hello.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import net.coobird.thumbnailator.Thumbnails;

public class FileUtil {

	public static String uploadFile(byte[] file, String filePath, String fileName) throws Exception { 
        File targetFile = new File(filePath);  
        if(!targetFile.exists()){    
            targetFile.mkdirs();    
        }       
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
        return filePath+fileName;
    }
	
	public static List<String> unzip(File sourceFile , String desPath) throws Exception {
		ZipFile zf = new ZipFile(sourceFile);
		System.out.println(zf);
		Enumeration<?> ent = zf.entries();
		List<String> filenames = new ArrayList<>();
		while(ent.hasMoreElements()) {
			ZipEntry entry = (ZipEntry)ent.nextElement();
			if(!entry.isDirectory()) {
				InputStream in = zf.getInputStream(entry);
				File parent = new File(desPath );
				if(!parent.exists()) {
					parent.mkdirs();
				}
//				File des = new File(desPath + entry.getName());
				
				FileOutputStream fos = new FileOutputStream(desPath + entry.getName());
				byte[] buffer = new byte[1024 * 2];
				int len = 0;
				while(( len = in.read(buffer)) != -1) {
					fos.write(buffer, 0, len);
				}
				
				in.close();
				fos.close();
				//压缩文件
				File des = new File(desPath + entry.getName());
				if(des.exists()) {
					Thumbnails.of(des)
					.scale(1f).outputQuality(0.4f)
					.toFile(des);
				}
			}
			filenames.add(entry.getName());
		}
		zf.close();
		return filenames;
	}
	

	public static void main(String[] args) throws Exception{
		unzip(new File("C:\\Users\\Administrator\\Pictures\\123\\123.zip") ,"C:\\Users\\Administrator\\Pictures\\124\\" );
	}
}
