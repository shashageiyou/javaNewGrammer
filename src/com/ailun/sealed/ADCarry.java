package com.ailun.sealed;

/**
 * @author wlf
 * @date 2022/8/26-14:24
 */
public sealed class ADCarry extends Hero permits AiXi{

	//攻击方式 远程
	protected String RemoteAttack;


	public String getRemoteAttack() {
		return RemoteAttack;
	}

	public void setRemoteAttack(String remoteAttack) {
		RemoteAttack = remoteAttack;
	}
}
