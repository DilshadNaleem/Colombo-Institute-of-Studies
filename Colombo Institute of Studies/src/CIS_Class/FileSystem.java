
package CIS_Class;

//Import necessary classes for file handling operations in the code
import java.io.* ;

public class FileSystem 
{
    private static  String FILE_PATH = "ColomboInstituteOfStudies/" ;
    private File file;
    private String fileName;
    
    public FileSystem(String fileName)
    {
        this.fileName = fileName;
        createANewFile();
    }
    public boolean createANewFile() 
    {
        try 
        {
            file = new File (FILE_PATH + fileName);
            if(file.createNewFile())
            {
                System.out.println("File Created : " + file.getName());
                return true;
            }
            else 
            {
                System.out.println("File Already Exists! ");
                return false;
            }     
        } 
        catch(IOException e) 
            {
            System.out.println("Something went wrong with creating the file : " + e);
            return false;
            }
    }
    
    public BufferedReader readfile() 
    {
        if(!createANewFile())
        {
           try 
           {
               FileReader reader = new FileReader (file);
               return new BufferedReader (reader);
           }
           catch (IOException e)
           {
               System.out.println("Something went wrong while reading the file :" + e);
           }
        }
        return null;
    }
}
