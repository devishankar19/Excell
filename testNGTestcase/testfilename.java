package testNGTestcase;

import utils.fileNameMaker;

public class testfilename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fileNameMaker fn = new fileNameMaker();
		String sn = fn.FileNameForLogin("abc", "def");
		
		System.out.println(sn);
		

	}

}
