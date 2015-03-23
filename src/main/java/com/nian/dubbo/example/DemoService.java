package com.nian.dubbo.example;

public interface DemoService {
	public void sayHello();
	public String returnHello();
	public MsgInfo returnMsgInfo(MsgInfo info);
}
