package com.hcl;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PwdService {
	int i=10;

	public static String encode(String txt) {
		
		int i=10;
		int j=20;

		Encoder encode = Base64.getEncoder();
		return encode.encodeToString(txt.getBytes());

	}
	public static String decode(String encodetxt) {

		Decoder decoder= Base64.getDecoder();
		byte[] decode=decoder.decode(encodetxt);
		
		return new String(decode);

	}
	
	
	public static void main(String[] args) {
		String value=PwdService.encode("puttun");
		System.out.println(value);
		
		String decode=PwdService.decode(value);
		
		System.out.println(decode);
		
	}

}
