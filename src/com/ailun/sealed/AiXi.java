package com.ailun.sealed;

/**
 * @author wlf
 * @date 2022/8/26-14:25
 */
public final class AiXi extends ADCarry{
	//独有的暴击伤害
	private double CriticalHitDamage;

	public AiXi() {
		this.CriticalHitDamage = 1.55;
		super.RemoteAttack = "40米的寒弓";
		super.AttackPower = 70;
	}

	public double getCriticalHitDamage() {
		return CriticalHitDamage;
	}

	public void setCriticalHitDamage(double criticalHitDamage) {
		CriticalHitDamage = criticalHitDamage;
	}

	@Override
	public String toString() {
		return "AiXi{" +
				"CriticalHitDamage=" + CriticalHitDamage +
				", RemoteAttack='" + RemoteAttack + '\'' +
				", AttackPower=" + AttackPower +
				'}';
	}
}
