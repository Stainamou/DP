package state;

public class ExpertState implements State {

    @Override
    public void train(Character character) {
        character.setXp(character.getXp() + 5);
        System.out.println(character.getName() + " trains and gains 5 xp.");
        checkStateTransition(character);
    }

    @Override
    public void meditate(Character character) {
        character.setHp(character.getHp() + 10);
        System.out.println(character.getName() + " meditates and gains 10 health points.");
        checkStateTransition(character);
    }

    @Override
    public void fight(Character character) {
        character.setHp(character.getHp() - 10);
        character.setXp(character.getXp() + 15);
        System.out.println(character.getName() + " fights and loses 10 health points but gains 15 xp.");
        checkStateTransition(character);
    }

    public void checkStateTransition(Character character) {
        if (character.getXp() >= 350) {
            character.setState(new MasterState());
            System.out.println(character.getName() + " has advanced to Master level!");
        }
    }
}
