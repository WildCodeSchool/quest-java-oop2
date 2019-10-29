import java.util.ArrayList;

public class Nature {

    public static void main(String[] args) {

        // the riri reference receives a new instance of the Duck class
        Duck donald = new Duck("Donald"); 
        // use of a setter    
        donald.setAge(84);
        // use of getters      
        System.out.println("1. Duck name is : " + donald.getName());
        System.out.println("2. He is " + String.valueOf(donald.getAge()));
        System.out.println("3. He sings " + donald.sing());

        Eagle thorondor = new Eagle("Thorondor");
        System.out.println("4. Eagle name is : " + thorondor.getName());
        System.out.println("5. He is " + String.valueOf(thorondor.getAge()));
        System.out.println("6. He sings " + thorondor.sing());
        
        // as riri and thorondor are children of Bird
        // it is possible to store them in the same ArrayList
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(donald);
        birds.add(thorondor);
        
        System.out.println("7. Birds of the list : ");
        // list navigation
        for (Bird bird : birds) {
            System.out.println("- " + bird.getName());
        }
    }
}
