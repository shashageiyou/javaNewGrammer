package com.ailun.instance;

import java.util.List;

/**
 *instance of 不再需要强转。
 * @author wlf
 * @date 2022/8/26-14:16
 */
public class InstanceOfTest {

	public static void main(String[] args) {
		test("aaa");
		test(List.of(11));
	}

	public static void test(Object o) {
		if (o instanceof String s) {
			System.out.println(s.length());
		} else if (o instanceof List<?> list) {
			System.out.println(list.size());
		}
	}
}
