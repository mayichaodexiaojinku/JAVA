package com.Observer;

import java.util.Observable;

public class OfficialAccount extends Observable {
      public void publishNewInfo(String info){
    	  //��ʶ���Observable�����Ѿ��ı��ˣ��������������ǰ�Observable������changed��Ϊtrue.
    	  setChanged();
    	  //��֪ͨ���й۲���֮ǰ����Ҫ�ж�Observable������changed�Ƿ�Ϊtrue��������Ϊ�򲻻ᷢ��֪ͨ��
    	  notifyObservers(info);
      }
}
