package com.ailun.string;

import java.nio.charset.StandardCharsets;

/**
 * string 由 chart数组 换成 byte数组
 * string新api
 *
 * @author wlf
 * @date 2022/8/26-14:09
 */
public class StringTest {

	public static void main(String[] args) {
		test3();
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
	public static void test3() {
		String s = "";
		System.out.printf("s is blank:%s \n", s.isBlank());
		String s1 = " 长坂英雄今犹在  ";
		//去掉收尾空格
		System.out.printf("s1.strip=%s,len=%d\n",s1.strip(),s1.strip().length());
		//去掉首部空格
		System.out.printf("s1.stripLeading=%s,len=%d\n",s1.stripLeading(),s1.stripLeading().length());
		//去掉尾部空格
		System.out.printf("s1.stripTrailing=%s,len=%d\n",s1.stripTrailing(),s1.stripTrailing().length());
		//重复2份
		System.out.printf("s1.repeat(2)=%s\n",s1.repeat(2));
		System.out.printf("s1.trim=%s,len=%d\n",s1.trim(),s1.trim().length());

	}

}
