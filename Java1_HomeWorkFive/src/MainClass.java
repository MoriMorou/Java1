import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pleasa add distance for runnig: ");
        double distance_run = in.nextInt();
        System.out.println("Pleasa add distance for swimming: ");
        double distance_sw = in.nextInt();
        System.out.println("Pleasa add height for jumping: ");
        double distance_jump = in.nextInt();

        Cat CatOne = new Cat("Cat Marusa", 200, 0, 2);
        Dog DogOne = new Dog("Dog Tima", 500, 10, 0.5);
        Dog DogTwo = new Dog("Dog Sona", 600, 10, 0.5);
        Horse HorseOne = new Horse("Horse Pegasus", 1500, 100, 3);
        Bird BirdOne = new Bird("Bird Roma", 5, 0, 0.2);

        CatOne.running(distance_run);
        CatOne.swimming(distance_sw);
        CatOne.jumping(distance_jump);

        DogOne.running(distance_run);
        DogOne.swimming(distance_sw);
        DogOne.jumping(distance_jump);

        DogTwo.running(distance_run);
        DogTwo.swimming(distance_sw);
        DogTwo.jumping(distance_jump);

        HorseOne.running(distance_run);
        HorseOne.swimming(distance_sw);
        HorseOne.jumping(distance_jump);

        BirdOne.running(distance_run);
        BirdOne.swimming(distance_sw);
        BirdOne.jumping(distance_jump);
    }
}

