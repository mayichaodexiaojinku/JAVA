package com.Observer;

public class test {

	public static void main(String[] args) {
		OfficialAccount  officialAccount = new OfficialAccount();
		User userA = new User("Wechat User-A");
		User userB = new User("Wechat User-B");
		User userC = new User("Wechat User-C");
		//���۲���ע�ᵽ�ɹ۲����Ĺ۲����б���
		officialAccount.addObserver(userA);
		officialAccount.addObserver(userB);
		officialAccount.addObserver(userC);
		//������Ϣ
		officialAccount.publishNewInfo(" new info");
		officialAccount.deleteObserver(userA);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%");
		//������Ϣ
		officialAccount.publishNewInfo(" new info ++");
		

	}

}
