public class Game {


    public static void main(String[] args) {
        Engine engine = new Engine();
        Player player2 = new Grudger(1, null, new GoodBehaviour());
        Player player1 = new CopyCat(1, null, new GoodBehaviour());


        for (int i = 0; i < 10; i++) {
            engine.execute(player1, player2);
        }


        System.out.println(player1.getCoin());
        System.out.println(player2.getCoin());

    }
}
