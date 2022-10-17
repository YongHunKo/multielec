package com.multi.frame;

import java.io.FileOutputStream;
import org.springframework.web.multipart.MultipartFile;

public class Util {
	public static void saveFile(MultipartFile mf, String admindir, String custdir) {
		byte [] data;
		String img = mf.getOriginalFilename();
		try {
			data = mf.getBytes();
			FileOutputStream fo = 
					new FileOutputStream(admindir+img);
			fo.write(data);
			fo.close();
			FileOutputStream fo2 = 
					new FileOutputStream(custdir+img);
			fo2.write(data);
			fo2.close();
		}catch(Exception e) {
			
		}
		
	}
	
}




