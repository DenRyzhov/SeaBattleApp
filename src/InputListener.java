public interface InputListener {

    boolean add_new_ship(DeckCount decks, Orientation orient, Point start_cord);

    void attack(int x, int y);

    void quit_game();

    void auto_fill();
}