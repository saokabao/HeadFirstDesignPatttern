package Strategy.Ducks.Behavior.Fly;

public class FlyWithRocket implements FlyBehavior {

    @Override
    public void fly(){
        System.out.println("Flying with Rocket");
    }
}
