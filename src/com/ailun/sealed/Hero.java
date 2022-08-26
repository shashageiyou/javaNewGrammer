package com.ailun.sealed;

/**
 * sealed 表示一个密封类，
 * 所有密封类需要指明 能被哪些类继承 即 permits 后的类 可以指定多个
 * 密封类的子类 只能是密封类 或者 final修饰的类
 *
 * @author wlf
 * @date 2022/8/26-14:23
 */

public sealed abstract class Hero permits ADCarry {
	//通用属性 攻击力
	protected int AttackPower;

	public int getAttackPower() {
		return AttackPower;
	}

	public void setAttackPower(int attackPower) {
		AttackPower = attackPower;
	}
}
