/**
 * 
 */
/**
 * @author 82312
 *
 */
//΢���û��Ǿ���Ĺ۲��߶���
package com.Observer;
import java.util.Observable;
import java.util.Observer;
public class User implements Observer{
	private String name;
	public User(String name){
		this.name = name ;
	}
	public void update(Observable o,Object arg){
		System.out.println("΢���û� ��" +name+",����Ϊ��"+arg);
	}
}