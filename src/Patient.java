public class Patient {
    public int id = 0;
    String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    double weight;
    double height;
    String blood;

    Patient(String name,String email){
        id++;
        this.name = name;
        this.email = email;
    }
}
