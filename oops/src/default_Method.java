interface  camera{
    void takeSnap();
    void RecordVideo();
}
interface MyWifi{
    String[] getTheAdresses();
    void connectNetworks(String Network);

}
class cellPhone{
    void callnumber(int Phonenumber){
        System.out.println("calling the number" + Phonenumber);
    }
    void pickcall(){
        System.out.println("picking the call");
    }
}
class mySmartPhone extends cellPhone implements camera, MyWifi{
    public void takeSnap(){
        System.out.println("taking snap");
    }

    @Override
    public void RecordVideo() {
        System.out.println("recording The Video");
    }

    @Override
    public String[] getTheAdresses() {
        System.out.println("Getting the list of Networks");
        String[] networkList = {"musavir's", "jioWifi","moto54"};
        return networkList;
    }

    @Override
    public void connectNetworks(String Network) {
        System.out.println("connecting the Wifi Network" + Network);
    }
}

public class default_Method {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        String [] ae = ms.getTheAdresses();
        for (String items:ae){
            System.out.println(items);
        }
        cellPhone cp1 = new cellPhone();
        cp1.pickcall();

    }
}
