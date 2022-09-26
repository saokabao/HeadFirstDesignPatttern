import Strategy.Ducks.Behavior.Fly.CantFly;
import Strategy.Ducks.Behavior.Fly.FlyWithRocket;
import Strategy.Ducks.Behavior.Quack.MuteQuack;
import Strategy.Ducks.Duck;
import Strategy.Ducks.MallardDuck;
import Strategy.FileEncryption.Driver;

public class Problems_and_Patterns {

    public static void testDucks(){
        Duck duck  = new MallardDuck(new CantFly(), new MuteQuack()); // setting behavior at compile-time
        duck.performFly();
        duck.performQuack();
        duck.swim();

        //getting mallard duck a rocket
        duck.setFlyBehavior(new FlyWithRocket());   // setting behavior at runtime.
        duck.performFly();

        duck.setQuackBehavior(new MuteQuack());
        duck.performQuack();
    }

    public static void testFileEncryption(){
        Driver d = new Driver();
        d.execute();
    }

    public static void main(String[] args){

        testDucks();
        //testFileEncryption();

    }
}


