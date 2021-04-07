
public class DuplicateElementsArray {

	public static void main(String[] args) {
		String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC","Java"};
		
		for(int i=0;i<strArray.length-1;i++)
		{
			for(int j=i+1;j<strArray.length-1;j++)
			{
				if(strArray[i].equals(strArray[j]) && (i!=j))
				{
					System.out.println("Duplicate Element are "+strArray[j]);
				}
			}
		}

	}

}
