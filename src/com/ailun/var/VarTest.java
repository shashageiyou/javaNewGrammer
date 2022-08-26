package com.ailun.var;

/**
 * 局部变量 可使用var 自动推导类型
 * @author wlf
 * @date 2022/8/26-13:44
 */
public class VarTest {
	public static void main(String[] args) {
		type();
		streamVar();
	}

	public static void type() {
		var a = 1;
		var b = "俺是你die ";
		var c = a + b;
		System.out.printf("c=%s,len=%d \n",c,c.length());
		//去掉尾部空格
		var s = c.stripTrailing();
		System.out.printf("s=%s,len=%d \n", s,s.length());
	}
	public static void streamVar() {
		//lambda 可以使用var
		Mapper<String, Integer> mapper = (var a)->a.length();
		System.out.println(mapper.map("ssss"));
	}
}
