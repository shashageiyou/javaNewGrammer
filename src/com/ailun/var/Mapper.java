package com.ailun.var;

/**
 *
 * @author wlf
 * @date 2022/8/26-13:39
 */
@FunctionalInterface
public interface Mapper <A,B>{
	B map(A a);
}
