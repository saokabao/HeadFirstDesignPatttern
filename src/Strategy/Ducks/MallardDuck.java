package Strategy.Ducks;

import Strategy.Ducks.Behavior.Fly.FlyBehavior;
import Strategy.Ducks.Behavior.Fly.FlyWithWings;
import Strategy.Ducks.Behavior.Quack.Quack;
import Strategy.Ducks.Behavior.Quack.QuackBehavior;

public class MallardDuck extends Duck {
    public MallardDuck(FlyBehavior fb, QuackBehavior qb){
        super(fb, qb);
    }
}
