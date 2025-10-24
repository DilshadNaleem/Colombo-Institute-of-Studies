
package CIS_Class;

import java.io.* ;
public class HR extends User 
{
 FileSystem createfolder = new FileSystem("Users.txt");
 
 public HR() {
        super(null, null, null);
    }
    
    HR manager = new HR();
    
    private String userName;

    public HR(String userName, String email, String password, String userType) {
        super(email, password, userType);
        this.userName = userName;
    }
    
    public String getUserName()
    {
        return userName ;
    }
    
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
    
    public boolean registerNewUser()
    {
         try (BufferedWriter writer = new BufferedWriter(new FileWriter("User.txt", true))) {
            String line = manager.getEmail()+ "," + getUserName() + "," + manager.getUserType() + "," +
                    manager.getPassword();
            writer.write(line);
            writer.newLine();
            return true;
        } catch (IOException e) {
            System.out.println("Error inserting data: " + e.getMessage());
            return false;
        }
    }
    
    public String viewAllUsers() 
     {
        String Cashiers, allUsers = "";
        String[] words = null;
       
        try (BufferedReader emp = createfolder.readfile()) {
            while ((Cashiers = emp.readLine()) != null) {
                words = Cashiers.split(",");
                
                allUsers += words[0]+"\t"+words[2]+"\n";
            }
        } 

        catch (Exception e) 
        {}
        
        return allUsers;
    } 
}

 