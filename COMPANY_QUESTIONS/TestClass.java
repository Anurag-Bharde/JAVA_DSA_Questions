package wokr;

import java.util.*; import java.lang.*;

public class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        Map<String, String> inputMap = new HashMap<>();
        String[] parts = input.split(";");
        for (String part : parts) {
            String[] keyValue = part.split(":");
            inputMap.put(keyValue[0], keyValue[1]);
        }
        List<String> playerNames = Arrays.asList(inputMap.get("players").split(","));
        char trump = inputMap.get("trump").charAt(0);
        Game game = new Game(playerNames, trump);
        for (String playerName : playerNames) {

            if (inputMap.containsKey(playerName)) {

                game.addCardToPlayer(playerName, inputMap.get(playerName));
            }
        }
        Player self = game.players.get(inputMap.get("self"));
        for (String cardStr : inputMap.get("cards").split(",")) {
            self.addCard(cardStr);
        }
        Card optimalCard = game.getOptimalCard(self);
        System.out.println(optimalCard.suit + optimalCard.value);
    }
}
class Player {
    String name;
    List<Card> cards = new ArrayList<>();
    Player(String name) {
        this.name = name;
    }
    void addCard(String cardStr) {
        this.cards.add(new Card(cardStr.charAt(0), cardStr.substring(1)));
    }
}
class Card implements Comparable<Card> {
    char suit;
    String value;
    String allvalues = "2345678910jqka";
    Card(char suit, String value) {
        this.suit =suit;
        this.value = value;
    }
    @Override
    public int compareTo(Card other) {
        if(other == null){
            return 0;
        }

        return allvalues.indexOf(this.value) - allvalues.indexOf(other.value);
    }
}
class Game {
    Map<String, Player> players = new HashMap<>();
    List<Card> playedCards = new ArrayList<>();
    char trump;
    List<String> playerNames;

    Game(List<String> playerNames, char trump) {
        for (String name : playerNames) {

            players.put(name, new Player(name));
        }
        this.trump=trump;
        this.playerNames = playerNames;
    }

    void addCardToPlayer(String playerName, String cardStr) {
        Card card = new Card(cardStr.charAt(0), cardStr.substring(1));
        players.get(playerName).addCard(cardStr);
        playedCards.add(card);
    }

    public Card getOptimalCard(Player self) {
        String teammate = (playerNames.indexOf(self.name) % 2 == 0) ? playerNames.get(playerNames.indexOf(self.name) + 2) : playerNames.get(playerNames.indexOf(self.name) - 2);
        Card highestCard = playedCards.get(0);
        for (Card card : playedCards) {
            if ((highestCard.suit == card.suit && card.compareTo(highestCard) > 0) || (card.suit == trump && highestCard.suit != trump)) {
                highestCard = card;
            }
        }
// Scenario 1: If the teammate has the highest card, play the smallest card.
        if (players.get(teammate).cards.contains(highestCard)) {
            return getSmallestCard(self.cards, '0');
        }

        // Scenario 2: Opponent's highest card is non-trump
        if (highestCard.suit != trump) {
            Card smallestBiggerCard = getSmallestCardBiggerThan(self.cards, highestCard, highestCard.suit);
            if (smallestBiggerCard != null) {
                return smallestBiggerCard;
            }

            return getSmallestCard(self.cards, '0');
        }
        // If no card can beat the opponent's, play the smallest card.
        // Scenario 3: Check if the enemy has a trump card that's higher than any of teammate's trump card, then play the smalle
        Card highestTeammateTrumpCard = getHighestCard(players.get(teammate).cards, trump);
        Card highestEnemyTrumpCard = null;
        for (String playerName : playerNames) {
            if (playerName.equals(teammate) || playerName.equals(self.name)) continue;
            Card tempCard = getHighestCard(players.get(playerName).cards, trump);
            if (tempCard != null && (highestEnemyTrumpCard == null || tempCard.compareTo(highestEnemyTrumpCard) > 0)) {
                highestEnemyTrumpCard = tempCard;
            }
        }
        if (highestTeammateTrumpCard == null || (highestEnemyTrumpCard != null && highestEnemyTrumpCard.compareTo(highestTeammateTrumpCard) > 0)) {
            Card smallestTrumpHigherThanEnemy = getSmallestCardBiggerThan(self.cards, highestEnemyTrumpCard, trump);
            if (smallestTrumpHigherThanEnemy != null) {
                return smallestTrumpHigherThanEnemy;
            }
        }
// Scenario 4: Play the smallest card (fallback) return getSmallestCard(self.cards, '0');
        return getSmallestCard(self.cards, '0');
    }
    private Card getHighestCard(List<Card> cards,char suit){
        cards.sort(Comparator.reverseOrder());
        for (Card card : cards) {
            if (card.suit == suit) {
                return card;
            }
        }
        return null;
    }
    private Card getSmallestCard (List < Card > cards,char suit) {
        cards.sort(Comparator.naturalOrder());
        for (Card card : cards) {
            if (suit == '0' || card.suit == suit) {
                return card;
            }
        }
        return null;
    }
    private Card getSmallestCardBiggerThan (List < Card > cards, Card targetCard,char targetSuit){
        Card smallestBiggerCard = null;
        for (Card card : cards) {
            if (card.suit == targetSuit && card.compareTo(targetCard) > 0) {
                if (smallestBiggerCard == null || card.compareTo(smallestBiggerCard) < 0) {
                    smallestBiggerCard = card;
                }
            }
        }

        return smallestBiggerCard;
    }
}
