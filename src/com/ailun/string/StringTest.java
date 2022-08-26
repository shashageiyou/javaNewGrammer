package com.ailun.string;

import java.nio.charset.StandardCharsets;

/**
 * @author wlf
 * @date 2022/8/26-14:09
 */
public class StringTest {

	public static void main(String[] args) {
		test1();
	}

	public static void test1() {
		//3引号表示长文本
		var s = """
												玉可碎而不可改其白，
												竹可焚而不可毁其节，
												身虽陨名可垂于竹帛也
				""";
		System.out.println(s.lines().count());
		//  使用\ 阻止换行
		var s1 = """
												玉可碎而不可改其白，\
												竹可焚而不可毁其节，\
												身虽陨名可垂于竹帛也\
				""";
		System.out.println(s1.lines().count());
	}
	public static void test2() {
		String s = "臣敢竭股肱之力，效忠贞之节，继之以死！";
		byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
	}

}
