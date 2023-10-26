package Class23;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public Registration(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public void setEmail(String email){
        if(email.contains("yahoo")){
            this.email=email;
        }else{
            System.out.println("Not a valid email provider");
        }
    }

    public void setUserName(String userName){
        if(!userName.isEmpty() && userName.length()>6){
            this.userName=userName;
        }else{
            System.out.println("Username does not meet requirements");
        }
    }

    public void setPassword(String password){
        if(!password.isEmpty() && password !=userName && password.length()>6){
            this.password=password;
        } else{
            System.out.println("Invalid password");
        }
    }

    public String getEmail(){
        return email;
    }
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
}
