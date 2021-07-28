package stream.others;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException{
		File file = new File("D:\\GIthub_edu"); //생성할 파일의 경로 지정
		file.createNewFile(); //파일 생성
		
		//파일의 구성정보 출력
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete(); //파일 삭제
	}

}
