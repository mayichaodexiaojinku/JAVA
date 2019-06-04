package dingle1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception2 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		  try{
			  fis=new FileInputStream("text.txt"); 
			  int  b;
	    	  while((b=fis.read())!=-1)
	    	  {
	    		  System.out.println(b);
	    	  }
		  }
	       catch(FileNotFoundException e)
		      {
		    	  System.out.println("该文件不存在！");
		      }
		   catch(IOException e)
		      {
		    	  System.out.println(e);
		      }
		   finally{
			   if(fis!=null){
				   try{
					   fis.close();
				   }
				   catch(IOException e){
				   }
			        }
			    System.out.println("over");
		      }
		      System.out.println("Start another work");
		  }
	}

