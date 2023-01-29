import lombok.Data;
@Data
public class Lion extends Animal {



Lion(String name){
    this.animalName="Gerry";
}
@Override
public void animalSound(){
    System.out.println("The lion roars");
}
}
