public class CopyCat extends Player {

    public CopyCat(int coin, Action experience, Behaviour behaviour) {
        super(coin, experience, behaviour);
    }

    @Override
    public Action getAction() {
        return experience == null ? Action.COOPERATE : experience;
    }

    @Override
    public void setExperince(Action action) {
        if (action.equals(Action.COOPERATE)) {
            this.behaviour = new GoodBehaviour();
        } else {
            this.behaviour = new BadBehaviour();
        }
    }
}
