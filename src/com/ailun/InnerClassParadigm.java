package com.ailun;

import java.util.Comparator;
import java.util.List;

/**
 * 内部类泛型
 * @author wlf
 * @date 2022/8/19-17:23
 */
public class InnerClassParadigm {
	public static void main(String[] args) {
		//java 8 编译错误 Cannot use '<>' with anonymous inner classes
		Comparator<String> comparator = new Comparator<>() {
			@Override
			public int compare(String o1, String o2) {
				return 0;
			}
		};
	}
}
