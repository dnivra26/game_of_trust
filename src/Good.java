public class Good extends Player{

    public Good(int coin, Action experience, Behaviour behaviour) {
        super(coin, experience, behaviour);
    }

    @Override
    public Action getAction() {
        return behaviour.getAction();
    }
}
