package com.ailun.switchDemo;

/**
 * switch 新语法
 * @author wlf
 * @date 2022/8/26-13:57
 */
public class SwitchTest {

	public static void main(String[] args) {
		switch1("J");
		switch1("abs");
	}

	public static void switch1(String param) {
		String result = switch (param) {
			case "J" -> "Java";
			case "js" -> "javaScript";
			case "go" -> "goland";
			default -> {
				if (param.startsWith("a")) {
					yield "A is A";
				}else {
					yield "未知";
				}
			}
		};
		System.out.println(result);
	}
}
