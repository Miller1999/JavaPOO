public class Doctor {
    // Attributes
    static int id = 0;
    String name;
    String speciality;

    // Constructor
    // Se puede pasar cualquier atributo dentro de los parentesis
    Doctor(String name, String speciality){
        this.name = name;
        this.speciality = speciality;
        id++;
    }

    // Methods
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor " + id);
    }

}