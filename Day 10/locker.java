class Locker{
    private int Id,pinCode;
    private String storeItem;
    private boolean isLocked;
    Locker(int Id,int pinCode){
        this.pinCode=pinCode;
        this.Id=Id;
        isLocked=true;
    }
    public void storeItem(String item,int pin){
        if(pin==pinCode){
            if(!isLocked){
                storeItem=item;
                System.out.println(x:"Stored successfully");
            }
            else{
                System.out.println(x:"Locker is locked");
            }
        }
        else{
            System.out.println(x:"Invalid pin");
        }
    }
    public void unlock(int pin){
        if(pin==pinCode){
            if(isLocked){
                isLocked=false;
                System.out.println(x:"Locker opened successfully");
            }
            else{
                System.out.println(x:"Locker is already opened");
            }
        }
        else{
            System.out.println(x:"Invalid pin");
        }
    }
    public void lock(){
        isLocked=true;
        System.out.println(x:"Locker is locked");
    }
    public void retrieveItem(int pin){
        if(pin==pinCode){
            if(!isLocked && storeItem!=null){
                System.out.println(x:"Retrieved item:"+storeItem);
            }
            else if(isLocked){
                System.out.println(x:"Locker is locked");
            }
            else{
                System.out.println(x:"Locker is empty");
            }
        }
        else{
            System.out.println(x:"Invalid pin");
        }
    }
}
public class Task{
    public static void main(String[] args) {
        Locker l=new Locker(1,1234);
        l.storeItem("Book",1234);
        l.unlock(1234);
        l.storeItem("Book",1234);
        l.retrieveItem(1234);
        l.lock();
    }
}