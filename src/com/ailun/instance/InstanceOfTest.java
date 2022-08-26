package com.ailun.instance;

import java.util.List;

/**
 * @author wlf
 * @date 2022/8/26-14:16
 */
public class InstanceOfTest {

	public static void main(String[] args) {
		test("aaa");
		test(List.of(11));
	}

	public static void test(Object o) {
		if (o instanceof String) {
			System.out.println(((String) o).length());
		} else if (o instanceof List<?>) {
			System.out.println(((List<?>) o).size());
		}
	}
}
