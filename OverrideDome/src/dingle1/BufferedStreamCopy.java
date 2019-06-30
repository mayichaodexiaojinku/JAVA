package dingle1;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamCopy
{
	public static void main(String[] args)throws IOException
	{
		//不推荐使用avsailable，文件过大时可能会溢出。
		//可以不受阻塞地从此输入流读取的估计字节数，如果到达末尾，则返回0
		int size;
		// 构造输入/出流对象
		FileInputStream f = new FileInputStream("src/dingle1/BufferedStreamCopy.java");
		FileOutputStream fout = new FileOutputStream("copy-of-file.txt");
		// 使用缓冲流
		BufferedInputStream bis = new BufferedInputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fout);
		System.out.println("Total Available Bytes: " + (size = bis.available()));//available返回的字节数保持从此输入流中读取而不阻塞。
		int n = size / 30;
		System.out.println("First " + n + " bytes of the file one read() at a time");
		// 使用read()和write
		for (int i = 0; i < n; i++)
		{
			bos.write(bis.read());
		}
		System.out.println("Still Available: " + bis.available());
		System.out.println("Reading the next " + n + " with one read(b[])");
		// 使用read(byte[]b )和write(byte[] b);
		byte b[] = new byte[n];//创建与文件一样大的字节数组。
		if (bis.read(b) != n)//将文件上的字节读取到字节数组中
		{
			System.err.println("couldn't read " + n + " bytes.");
		}
		bos.write(b);//将字节数组中的数据写到文件上
		System.out.println("Still Available: " + bis.available());
		// 使用read(b,offset,len)和write（b,offset,len）
		System.out.println("Reading the rest bytes  with  read(b[],offset,len)");
		int count = 0;
		while ((count = bis.read(b, 0, n)) != -1)
			bos.write(b, 0, count);
		System.out.println("Still Available: " + bis.available());
		bis.close();
		bos.flush();
		bos.close();
		f.close();
		fout.flush();
		fout.close();
	}
}
