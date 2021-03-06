import java.util.Comparator;
import java.util.TreeSet;


class StateComparator implements Comparator<GameState> {
  public int compare(GameState a, GameState b) {
    for(int i = 0; i < 22; ++i) {
      if(a.state[i] < b.state[i])
        return -1;
      else if(b.state[i] < a.state[i])
        return 1;
    }

    return 0;
  }

  public boolean equals(GameState a, GameState b) {
    for(int i = 0; i < 22; ++i) {
      if(a.state[i] != b.state[i])
        return false;
    }
    return true;
  }
}
