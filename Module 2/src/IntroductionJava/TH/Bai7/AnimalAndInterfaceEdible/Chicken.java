package IntroductionJava.TH.Bai7.AnimalAndInterfaceEdible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Chicken: chuck chuck!!!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
