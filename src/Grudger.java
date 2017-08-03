public class Grudger extends Player {
    public Grudger(int coin, Action experience, Behaviour behaviour) {
        super(coin, experience, behaviour);
    }

    @Override
    public Action getAction() {
        return behaviour.getAction();
    }

    @Override
    public void setExperince(Action action) {
        if (action.equals(Action.CHEAT)) {
            this.behaviour = new BadBehaviour();
        }
    }
}
