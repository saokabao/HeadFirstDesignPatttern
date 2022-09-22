package Strategy.Ducks;

import Strategy.Ducks.Behavior.Fly.FlyBehavior;
import Strategy.Ducks.Behavior.Quack.Quack;
import Strategy.Ducks.Behavior.Quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

   public Duck(FlyBehavior fb, QuackBehavior qb){
        System.out.println("Creating new duck ...");
        this.flyBehavior = fb;
        this.quackBehavior = qb;
    }
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks swim, even decoys");
    }

    public void setFlyBehavior(FlyBehavior fb){
        this.flyBehavior =  fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        this.quackBehavior = qb;
    }
}

// program to an interface, not an implementation.