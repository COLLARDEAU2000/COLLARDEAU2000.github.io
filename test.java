public class Person {
    // les champs ou attributs de la classe
    private String nom;
    private int age;
    
    // le constructeur de la classe
    public Person(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void parler() {
        System.out.println("Bonjour, je m'appelle " + this.nom + " et j'ai " + this.age + " ans.");
    }
}
