package Strategy.Ducks;

import Strategy.Ducks.Behavior.Fly.FlyWithWings;
import Strategy.Ducks.Behavior.Quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
}
