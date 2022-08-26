package com.ailun.stream;

import java.util.Arrays;
import java.util.List;

/**
 * 新增stream api
 * @author wlf
 * @date 2022/8/26-16:48
 */
public class StreamTest {


	public static void main(String[] args) {
		var list = Arrays.asList(1, 4, 6, 77, 88, 99, 22, 44, 16);
		//返回符合条件的
		//如果此流是无序的，丢弃{不匹配}元素之后的子元素
		List<Integer> integers = list.stream().takeWhile(x -> x < 20).toList();
		System.out.println(integers);
		//丢弃符合条件的
		//如果是无序的，丢弃第一个{符合}元素之后的所有子元素
		List<Integer> collect = list.stream().dropWhile(x -> x < 20).toList();
		System.out.println(collect);
	}
}
