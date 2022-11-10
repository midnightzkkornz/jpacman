// package nl.tudelft.jpacman.board;

// import static org.assertj.core.api.Assertions.assertThat;
// import static org.assertj.core.api.Assertions.assertThatThrownBy;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

// public class BoardTest {

//     private Square[][] grid = new Square[1][1];

//     @BeforeEach
//     void  setUp() {
//         grid[0][0] = new BasicSquare();
//     }

//     @Test
//     void testInvariant() {
//         Board board = new Board(grid);
//         assertThat(board.invariant()).isTrue();
//         System.out.println(board.invariant());
//     }

//     @Test
//     void testSquareAt() {
//         Board board = new Board(grid);
//         grid[0][0] = null; // false

//         assertThatThrownBy(() -> board.squareAt(0,0))
//             .isInstanceOf(AssertionError.class)
//             .hasMessageContaining("Follows from invariant.");
//     }

// }
