/**
 * 
 */
/**
 * @author 82312
 *
 */
//微信用户是具体的观察者对象
package com.Observer;
import java.util.Observable;
import java.util.Observer;
public class User implements Observer{
	private String name;
	public User(String name){
		this.name = name ;
	}
	public void update(Observable o,Object arg){
		System.out.println("微信用户 ：" +name+",内容为："+arg);
	}
}