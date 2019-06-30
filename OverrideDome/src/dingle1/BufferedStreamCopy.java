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
		//���Ƽ�ʹ��avsailable���ļ�����ʱ���ܻ������
		//���Բ��������شӴ���������ȡ�Ĺ����ֽ������������ĩβ���򷵻�0
		int size;
		// ��������/��������
		FileInputStream f = new FileInputStream("src/dingle1/BufferedStreamCopy.java");
		FileOutputStream fout = new FileOutputStream("copy-of-file.txt");
		// ʹ�û�����
		BufferedInputStream bis = new BufferedInputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fout);
		System.out.println("Total Available Bytes: " + (size = bis.available()));//available���ص��ֽ������ִӴ��������ж�ȡ����������
		int n = size / 30;
		System.out.println("First " + n + " bytes of the file one read() at a time");
		// ʹ��read()��write
		for (int i = 0; i < n; i++)
		{
			bos.write(bis.read());
		}
		System.out.println("Still Available: " + bis.available());
		System.out.println("Reading the next " + n + " with one read(b[])");
		// ʹ��read(byte[]b )��write(byte[] b);
		byte b[] = new byte[n];//�������ļ�һ������ֽ����顣
		if (bis.read(b) != n)//���ļ��ϵ��ֽڶ�ȡ���ֽ�������
		{
			System.err.println("couldn't read " + n + " bytes.");
		}
		bos.write(b);//���ֽ������е�����д���ļ���
		System.out.println("Still Available: " + bis.available());
		// ʹ��read(b,offset,len)��write��b,offset,len��
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
