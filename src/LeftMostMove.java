import java.util.List;

public class LeftMostMove implements MoveStrategy {
  @Override
  public Cell chooseNextLoc(List<Cell> possibleLocs) {
    Cell currLM = possibleLocs.get(0);
    final Cell currLM2 = currLM;
    currLM = possibleLocs.stream().filter(c -> c.leftOfComparison(currLM2) < 0)
    .reduce(currLM, (c1, c2) -> c2.leftOfComparison(c1) < 0 ? c2 : c1);

    return currLM;
  }

  public String toString() {
    return "left-most movement";
  }
}
