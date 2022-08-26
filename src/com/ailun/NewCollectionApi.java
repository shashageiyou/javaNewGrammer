package com.ailun;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 集合新增api
 *
 * @author wlf
 * @date 2022/8/26-13:29
 */
public class NewCollectionApi {
	public static void main(String[] args) {
		list();
		map();
		set();
	}

	public static void list() {
		//创建不可变集合
		List<Integer> integerList = List.of(1, 2, 34);
		System.out.println(integerList);
		//修改会报错
		//integerList.add(5)
		List<Integer> integers = List.copyOf(integerList);
		System.out.println(integerList == integers);
	}

	public static void map() {
		//创建不可变map
		Map<String, String> map = Map.of("key", "value", "key1", "value");
		System.out.println(map);
	}
	public static void set() {
		//重复元素会报错
		//Set<Integer> set = Set.of(1, 2, 3, 3);
		Set<Integer> set = Set.of(1, 2, 3);
		System.out.println(set);
	}
}
