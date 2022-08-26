package com.ailun;

import java.util.Optional;

/**
 * 获取本进程信息
 *
 * @author wlf
 * @date 2022/8/19-16:58
 */
public class ProcessTest {
	public static void main(String[] args) {
		ProcessHandle processHandle = ProcessHandle.current();
		ProcessHandle.Info info = processHandle.info();
		Optional<String> s = info.commandLine();
		if (s.isPresent()) {
			String s1 = s.get();
			System.out.println(s1);
		}
		System.out.println(info);
		Thread.onSpinWait();

	}
}
