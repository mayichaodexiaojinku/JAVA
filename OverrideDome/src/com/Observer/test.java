package com.Observer;

public class test {

	public static void main(String[] args) {
		OfficialAccount  officialAccount = new OfficialAccount();
		User userA = new User("Wechat User-A");
		User userB = new User("Wechat User-B");
		User userC = new User("Wechat User-C");
		//将观察者注册到可观察对象的观察者列表中
		officialAccount.addObserver(userA);
		officialAccount.addObserver(userB);
		officialAccount.addObserver(userC);
		//发布消息
		officialAccount.publishNewInfo(" new info");
		officialAccount.deleteObserver(userA);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%");
		//发布消息
		officialAccount.publishNewInfo(" new info ++");
		

	}

}
