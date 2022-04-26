# Card-Drawing
In this simple program, first an arraylist is hard-coded with each "card" in a standard 52 card deck. Then, instead of shuffling, as one would a normal deck, a "card" is selected from the arraylist at a random index, and is subsequently removed from the deck.

There are two classes in this program. the deckOfCards class is an object that represents the deck of cards that the program will "draw from." Its constructor creates a list of arrays of strings and individually adds each of the "cards". Each array of strings in the list represents one card. The 0th index of the array represents the value of the card, and the 1st index of the array represents the card's suit.
