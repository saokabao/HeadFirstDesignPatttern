package Strategy.Ducks.Behavior.Quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("shhh...");

    }
}
