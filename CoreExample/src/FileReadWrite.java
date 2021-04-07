import java.io.File;
import java.io.IOException;


public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		try{
		File f=new File("C:\\Users\\vijay.shinare\\Desktop\\xyz.txt");
		//FileInputStreamReader =new FileInputStreamReader(f);
		if(f.createNewFile())
		{
			System.out.println("New File is created");
		}
		else
		{
			System.out.println("File already exist");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
