package Strategy.Ducks.Behavior.Quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack(){
        System.out.println("Strategy.Ducks.Behavior.Quack.Quack quack ...");
    }
}
