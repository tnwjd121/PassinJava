package chapter22;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

// File 클래스
public class FileClass {
	public static void main(String[] args) {
		// File 인스턴스 생성
		File file1 = new File("file1.txt");
		// 파일 또는 폴더가 존재하지 않으면 생성
		// exists() - 파일이나 폴더가 존재한다면 true리턴 그렇지 않다면 false리턴
//		if(!file1.exists()) {
		if(file1.exists() == false) {
			// createNewFile() - 새로운 파일을 생성합니다.
			System.out.println("파일 생성 완료");
			try {
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("파일 이미 존재합니다.");
		}
		File newFile = new File("File-copy.txt");
		// toPath() - 운영체제에 맞게 주소를 리턴
		// 윈도우 \,/ 리눅스 /
		System.out.println(file1.toPath());
		//copy(복사할 파일 주소, 복사될 파일 주소, 옵션)
		try {
			Files.copy(file1.toPath(), newFile.toPath(),StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//StandardCopyOption.REPLACE_EXISTING
		// -파일이 존재하더라도 그대로 덮어씁니다.
		
	}

}
