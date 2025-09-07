package state;

public class Character {
    public String name;
    public int xp;
    public int hp;
    private State state;

    public Character(String name) {
        this.name = name;
        this.xp = 0;
        this.hp = 100;
        this.state = new NoviceState();
    }

    public void train() {
        state.train(this);
    }

    public void meditate() {
        state.meditate(this);
    }

    public void fight() {
        state.fight(this);
    }
    public void setState(State state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public int getXp() {
        return xp;
    }

    public int getHp() {
        return hp;
    }

    public String getLevelName() {
        if (state instanceof NoviceState) {
            return "Novice";
        } else if (state instanceof IntermediateState) {
            return "Intermediate";
        } else if (state instanceof ExpertState) {
            return "Expert";
        } else if (state instanceof MasterState) {
            return "Master";
        } else {
            return "Unknown";
        }
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
