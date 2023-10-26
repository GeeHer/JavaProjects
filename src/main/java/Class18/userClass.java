package Class18;

public class userClass {
     String name;
     int number;
    public  userClass(String name, int number){
        this.name=name;
        this.number=number;

    }
}

class userInfo extends userClass{
     String address;
    public userInfo(String name, int number,String address){
        super(name,number);
        this.address=address;

    }
    public void userDetails(){
        System.out.println(name+" "+number+" "+address);
    }
}

class Task1Tester{
    public static void main(String[] args) {
        userInfo t1= new userInfo("Guillermo", 301928374, "USA");
        t1.userDetails();

    }

}
