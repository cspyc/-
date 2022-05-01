package 文王演卦;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import 文王演卦.用.取卦;

import java.util.Map;

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

    @Test
    public void should_get_卦_from_dictionary_by_卦象() throws Exception {
        String 测试卦象 = "阴阴阳阴阴阳";
        取卦 取卦 = new 取卦();
        Map<卦象,卦> 卦字典 =  取卦.创建六十四卦字典();
        卦象 卦象 = new 卦象(测试卦象);
        String expected卦名 = "艮：艮为山";
        卦 得卦 = 卦字典.get(卦象);
        Assertions.assertEquals(expected卦名,得卦.得卦名());

    }
}
