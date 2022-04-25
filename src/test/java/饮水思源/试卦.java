package 饮水思源;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author pi
 * @date 2022/04/25 23:13:45
 **/
public class 试卦 {
    @Test
    public void should_convert_卦象() throws Exception {
        卦 卦 = new 卦();
        String input = "001001";
        String expected卦象 = "阴阴阳阴阴阳";
        String actualResult = 卦.字符换卦象(input);
        Assertions.assertEquals(expected卦象,actualResult);
    }
}
