package SnakesAndLadders;

import java.util.ArrayList;

/**
 * Calls event methods in any registered GameListeners.
 * @author Sam Hirst
 * @version 1.1.0
 * @see GameListener
 * @since 1.0.0
 */
public final class GameTransmitter {
    /** @hidden */
    private GameTransmitter() {}

    /**
     * Notifies listeners that players will roll some dice to determine the player order.
     * @param listeners the list of registered listeners
     * @param rollResult the number of dice each player will roll
     * @see java.util.ArrayList
     * @see GameListener
     * @since 1.1.0
     */
    protected static void transmitDecidingPlayerOrder(ArrayList<GameListener> listeners, int numberOfDice) {
        for (GameListener listener : listeners) {
            listener.onDecidingPlayerOrder(numberOfDice);
        }
    }

    /**
     * Notifies listeners that the player order has been decided.
     * @param listeners the list of registered listeners
     * @param playerOrder the list of players in the order that they will play
     * @see java.util.ArrayList
     * @see GameListener
     * @since 1.1.0
     */
    protected static void trasmitDecidedPlayerOrder(ArrayList<GameListener> listeners, ArrayList<Player> playerOrder) {
        for (GameListener listener : listeners) {
            listener.onDecidedPlayerOrder(playerOrder);
        }
    }

    /**
     * Notifies listeners that a player has rolled the dice to determine the order of play.
     * @param listeners the list of registered listeners
     * @param player the player who rolled the dice
     * @param rollResult the result of the dice roll
     * @see java.util.ArrayList
     * @see GameListener
     * @see Player
     * @since 1.1.0
     */
    protected static void transmitPlayerInitialRoll(ArrayList<GameListener> listeners, Player player, int rollResult) {
        for (GameListener listener : listeners) {
            listener.onPlayerRollsDice(player, rollResult);
        }
    }

    /**
     * Notifies listeners that a player has started their turn.
     * @param listeners the list of registered listeners
     * @param player the player whose turn has started
     * @see java.util.ArrayList
     * @see GameListener
     * @see Player
     * @since 1.0.0
     */
    protected static void transmitPlayerStartsTurn(ArrayList<GameListener> listeners, Player player) {
        for (GameListener listener : listeners) {
            listener.onPlayerStartsTurn(player);
        }
    }

    /**
     * Notifies listeners that a player has rolled the dice.
     * @param listeners the list of registered listeners
     * @param player the player who rolled the dice
     * @param rollResult the result of the dice roll
     * @see java.util.ArrayList
     * @see GameListener
     * @see Player
     * @since 1.0.0
     */
    protected static void transmitPlayerRollsDice(ArrayList<GameListener> listeners, Player player, int rollResult) {
        for (GameListener listener : listeners) {
            listener.onPlayerRollsDice(player, rollResult);
        }
    }

    /**
     * Notifies listeners that a player landed on a square.
     * @param listeners the list of registered listeners
     * @param player the player who has moved to a new square
     * @param squareLandedOn the square which the player has landed on
     * @see java.util.ArrayList
     * @see GameListener
     * @see Player
     * @see Square
     * @since 1.0.0
     */
    protected static void transmitPlayerLandsOnSquare(ArrayList<GameListener> listeners, Player player, Square squareLandedOn) {
        for (GameListener listener : listeners) {
            listener.onPlayerLandsOnSquare(player, squareLandedOn);
        }
    }

    /**
     * Notifies listeners that a player climbed a ladder.
     * @param listeners the list of registered listeners
     * @param player the player who has moved to a new square
     * @param squareClimbedTo the square which the player has moved to
     * @see java.util.ArrayList
     * @see GameListener
     * @see Player
     * @see Square
     * @since 1.0.0
     */
    protected static void transmitPlayerClimbsLadder(ArrayList<GameListener> listeners, Player player, Square squareClimbedTo) {
        for (GameListener listener : listeners) {
            listener.onPlayerClimbsLadder(player, squareClimbedTo);
        }
    }

    /**
     * Notifies listeners that a player was chased by a snake.
     * @param listeners the list of registered listeners
     * @param player the player who has moved to a new square
     * @param squareChasedTo the square which the player has moved to
     * @see java.util.ArrayList
     * @see GameListener
     * @see Player
     * @see Square
     * @since 1.0.0
     */
    protected static void transmitPlayerChasedBySnake(ArrayList<GameListener> listeners, Player player, Square squareChasedTo) {
        for (GameListener listener : listeners) {
            listener.onPlayerChasedBySnake(player, squareChasedTo);
        }
    }

    /**
     * Notifies listeners that a player is unable to proceed because their dice roll was too high.
     * @param listeners the list of registered listeners
     * @param player the player who cannot proceed
     * @see java.util.ArrayList
     * @see GameListener
     * @see Player
     * @since 1.0.0
     */
    protected static void transmitPlayerCannotProceed(ArrayList<GameListener> listeners, Player player) {
        for (GameListener listener : listeners) {
            listener.onPlayerCannotProceed(player);
        }
    }

    /**
     * Notifies listeners that a player bounced back off the end of the board.
     * @param listeners the list of registered listeners
     * @param player the player who was bounced back
     * @see java.util.ArrayList
     * @see GameListener
     * @see Player
     * @since 1.0.0
     */
    protected static void transmitPlayerBouncedBack(ArrayList<GameListener> listeners, Player player) {
        for (GameListener listener : listeners) {
            listener.onPlayerBouncedBack(player);
        }
    }

    /**
     * Notifies listeners that a player is unable to proceed because their dice roll was too high.
     * @param listeners the list of registered listeners
     * @param player the player who will roll again
     * @see java.util.ArrayList
     * @see GameListener
     * @see Player
     * @since 1.1.0
     */
    protected static void transmitPlayerToRollAgain(ArrayList<GameListener> listeners, Player player) {
        for (GameListener listener : listeners) {
            listener.onPlayerToRollAgain(player);
        }
    }

    /**
     * Notifies listeners that a player has ended their turn.
     * @param listeners the list of registered listeners
     * @param player the player whose turn has ended
     * @see java.util.ArrayList
     * @see GameListener
     * @see Player
     * @since 1.0.0
     */
    protected static void transmitPlayerEndsTurn(ArrayList<GameListener> listeners, Player player) {
        for (GameListener listener : listeners) {
            listener.onPlayerEndsTurn(player);
        }
    }

    /**
     * Notifies listeners that a player has won.
     * @param listeners the list of registered listeners
     * @param player the player who has won
     * @see java.util.ArrayList
     * @see GameListener
     * @see Player
     * @since 1.0.0
     */
    protected static void transmitPlayerWins(ArrayList<GameListener> listeners, Player player) {
        for (GameListener listener : listeners) {
            listener.onPlayerWins(player);
        }
    }
}
