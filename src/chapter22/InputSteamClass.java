package chapter22;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputSteamClass {
	public static void main(String[] args) {
		// 바이트 입력 스트림: InputSteam
		// 기본 타입 byte와 다른 의미
		// byte 8bit단위로 입출력하는 스트림
		try {
			InputStream is = new FileInputStream("test1.dat");
			while(true) {
				int data = is.read();
				if(data == -1) break;
				System.out.println(data);
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		

}
