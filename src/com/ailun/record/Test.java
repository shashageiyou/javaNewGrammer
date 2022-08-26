package com.ailun.record;

/**
 * @author wlf
 * @date 2022/8/26-14:20
 */
public class Test {
	public static void main(String[] args) {
		User user = new User("张三",105,"乱葬岗");
		int age = user.age();
		String name = user.name();
	}
}
