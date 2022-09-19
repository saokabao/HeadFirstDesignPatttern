package Strategy.Ducks.Behavior.Quack;

public class Sqeak implements QuackBehavior {
    @Override
    public void quack(){
        System.out.println("Strategy.Ducks.Behavior.Quack.Sqeak sqeak ...");
    }
}
