package dingle1;
import java.io.*;
public class Exception1 {
     public static void main(String[] args){
	      try{
	    	  FileInputStream fis=new FileInputStream("text.txt");
	    	  int  b;
	    	  while((b=fis.read())!=-1)
	    	  {
	    		  System.out.println(b);
	    	  }
	    	  System.out.println("hahahaha");
	    	  fis.close();
	      }
	      catch(FileNotFoundException e)
	      {
	    	  System.out.println("该文件不存在！");
	      }
	      catch(IOException e)
	      {
	    	  System.out.println(e);
	      }
	      finally
	      {
	    	  System.out.println("over");
	      }
	      System.out.println("Start another work");
}
}
