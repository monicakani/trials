package  com.navis.core; //optional, 0 or 1 statement per .java file. its a good practice.
// They create namespaces

 public class User{

    int userId;
    String userName;

    public User(){}

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean validateMail()
    {
      if(userName.length()<8)
          return false;
      else
          return true;

    }

    public static void main( String[] args)
    {
        User u = new User(4,"mon");
        System.out.println(u.userId);
    }
}
