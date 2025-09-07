package state;

public class MasterState implements State {

    @Override
    public void train(Character character) {
        System.out.println(character.getName() + " is a Master. The game is complete!");
    }

    @Override
    public void meditate(Character character) {
        System.out.println(character.getName() + " is a Master. The game is complete!");
    }


    @Override
    public void fight(Character character) {
        System.out.println(character.getName() + " is a Master. The game is complete!");
    }
}
