import lombok.Data;
@Data
public class Cow  extends Animal{



        Cow(String name){
            this.animalName="Camala";
        }
        @Override
        public void animalSound(){
            System.out.println("The cow moo's");
        }
    }

