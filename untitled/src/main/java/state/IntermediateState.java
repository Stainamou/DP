package state;

public class IntermediateState implements State {

    @Override
    public void train(Character character) {
        character.setXp(character.getXp() + 7);
        System.out.println(character.getName() + " trains and gains 7 xp.");
        checkStateTransition(character);
    }

    @Override
    public void meditate(Character character) {
        character.setHp(character.getHp() + 5);
        System.out.println(character.getName() + " meditates and gains 5 health points.");
        checkStateTransition(character);
    }

    @Override
    public void fight(Character character) {
        System.out.println("Fighting is not possible at Intermediate level.");
        checkStateTransition(character);
    }

    public void checkStateTransition(Character character) {
        if (character.getXp() >= 200) {
            character.setState(new ExpertState());
            System.out.println(character.getName() + " has advanced to Expert level!");
        }
    }

}
