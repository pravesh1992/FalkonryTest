import org.junit.Test;

public class SolutionTest {

  @Test
  public void test1_ababa_input() {
    int[] result = Solution.usernameDisparity(new String[]{"ababa"});
    assert result != null;
    assert result.length == 1;
    assert result[0] == 9;
  }

  @Test
  public void test1_aa_input() {
    int[] result = Solution.usernameDisparity(new String[]{"aa"});
    assert result != null;
    assert result.length == 1;
    assert result[0] == 3;
  }

  @Test
  public void test1_ababaa_input() {
    int[] result = Solution.usernameDisparity(new String[]{"ababaa"});
    assert result != null;
    assert result.length == 1;
    assert result[0] == 11;
  }
}
