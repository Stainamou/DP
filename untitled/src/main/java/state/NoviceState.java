package state;

public class NoviceState implements State {

    @Override
    public void train(Character character) {
        character.setXp(character.getXp() + 10);
        System.out.println(character.getName() + " trains and gains 10 xp.");
        checkStateTransition(character);
    }

    @Override
    public void meditate(Character character) {
        System.out.println("Meditation is not possible at Novice level.");
        checkStateTransition(character);
    }

    @Override
    public void fight(Character character) {
        System.out.println("Fighting is not possible at Novice level.");
        checkStateTransition(character);
    }

    public void checkStateTransition(Character character) {
        if (character.getXp() >= 100) {
            character.setState(new IntermediateState());
            System.out.println(character.getName() + " has advanced to Intermediate level!");
        }
    }
}
