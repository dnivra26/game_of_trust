import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Engine {

    int process(Action cooperate) {
        if (cooperate.equals(Action.COOPERATE)) {
            return 3;
        } else {
            return 0;
        }
    }

    public void execute(Player player1, Player player2) {
        player1.setCoin(player1.getCoin() - getMyContribution(player1.getAction()) + process(player2.getAction()));
        player2.setCoin(player2.getCoin() - getMyContribution(player2.getAction()) + process(player1.getAction()));
        player1.setExperience(player2.getAction());
        player2.setExperience(player1.getAction());
    }

    private int getMyContribution(Action action) {
        if (action.equals(Action.COOPERATE)) {
            return 1;
        } else {
            return 0;
        }
    }
}
