package com.ailun;

/**
 * 接口新增私有方法
 *
 * @author wlf
 * @date 2022/8/19-17:13
 */
public interface PrivateMethodOfInterface {

	 default void callPolice() {
		Object o = generatorPolice();
	}

	default void joinPolice() {
		Object o = generatorPolice();
	}

	private Object generatorPolice() {
		return "one police";
	}
}
