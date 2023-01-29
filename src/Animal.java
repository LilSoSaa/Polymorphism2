import lombok.Data;

public class Animal {

    String animalName;

    public  void animalName(String animalName) {
        this.animalName = animalName;
    }

public void animalSound(){
        System.out.println("Default animal sound!");

    }
}

