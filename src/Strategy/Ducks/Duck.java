package Strategy.Ducks;

import Strategy.Ducks.Behavior.Fly.FlyBehavior;
import Strategy.Ducks.Behavior.Quack.QuackBehavior;

public abstract class Duck { // why abstract, cause its not going to be concrete
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

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