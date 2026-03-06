package boardgame;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BoardTest {
  @Test
  public void boardRejectsInvalidSize() {
    BoardException ex = assertThrows(BoardException.class, () -> new Board(0, 8));
    assertTrue(ex.getMessage().contains("at least 1 row"));
  }
}
