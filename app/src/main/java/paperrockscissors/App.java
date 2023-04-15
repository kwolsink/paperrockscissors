/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package paperrockscissors;

import paperrockscissors.players.ComputerPlayer;
import paperrockscissors.players.HumanPlayer;
import paperrockscissors.players.Player;
import paperrockscissors.players.strategies.RandomStrategy;
import paperrockscissors.rules.DefaultRules;

public class App {

    public static void main(String[] args) {
        CLI cli = new CLI();
        String humanName = cli.promptName();
        Player humanPlayer = new HumanPlayer(humanName, cli);
        Player computerPlayer = new ComputerPlayer("Computron", new RandomStrategy());
        Game defaultGame = new Game(cli, new DefaultRules(), humanPlayer, computerPlayer);
        defaultGame.nextRound();
    }
}
