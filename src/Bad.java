public class Bad extends Player {

    public Bad(int coin, Action experience, Behaviour behaviour) {
        super(coin, experience, behaviour);
    }

    @Override
    public Action getAction() {
        return behaviour.getAction();
    }
}
