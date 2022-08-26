package com.ailun;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * try catch 新语法
 * @author wlf
 * @date 2022/8/19-17:32
 */
public class SimpleTryWithResources {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream in = new FileInputStream("/Users/wanglianfeng/hello.lua");
		FileOutputStream out = new FileOutputStream("/Users/wanglianfeng/xx.lua");
		//关闭流
		try (in; out) {
			//将输入流转到输出流
			in.transferTo(out);
		} catch (Exception e) {
			System.out.println(e);
		}



	}
}
