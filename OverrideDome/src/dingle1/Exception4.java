package dingle1;
import java.io.*;
public class Exception4{
    public static void main(String[] args)throws IOException{
    	String str;
    	BufferedReader buf;
    	buf=new BufferedReader(new InputStreamReader(System.in));
    	while(true){
    		try{
    			System.out.print("�������ַ�����");
    			str=buf.readLine();
    			if(str.length()>0)
    				break;
    			else
    				throw new IOException();
    		    }
    		catch(IOException e)
    		{System.out.println("���������ַ���!");
    		continue;
    		}
    	}
    	String s=str.toUpperCase();
    	System.out.println("ת������ַ���Ϊ��"+s);
    	
    }
}
