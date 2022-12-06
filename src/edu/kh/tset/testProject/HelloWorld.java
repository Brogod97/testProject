package edu.kh.tset.testProject;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World~!"); // 영문
		System.out.println("헬로 월드~!"); // 한글
		System.out.println("123456~!"); // 숫자

		System.out.println("1 + 2"); // 단순 문자열이므로, 계산되지 않고 그대로 출력 됨
		System.out.println(1 + 2); // 문자열이 아니므로, 연산된 값이 나옴

		System.out.println("14 * 19 =" + 266);
	}
}

/*
Hello World~!
헬로 월드~!
123456~!
1 + 2
3
*/