package Strategy.Ducks.Behavior.Fly;

public class CantFly implements FlyBehavior {
    @Override
    public void fly(){
        System.out.println("I Can't fly, too chicken");
    }
}
