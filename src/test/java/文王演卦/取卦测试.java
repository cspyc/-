package 文王演卦;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import 文王演卦.用.取卦;

import java.util.List;
import java.util.Map;

/**
 * @author pi
 * @date 2022/04/23 11:28:18
 **/
public class 取卦测试 {
    @Test
    public void should_read_yi_file() throws Exception {
        取卦 取卦 = new 取卦();
        List<卦> 六十四卦 = 取卦.读取卦文();

        Assertions.assertEquals("乾：乾为天",六十四卦.get(0).得卦名());
        Assertions.assertEquals("既济：水火既济",六十四卦.get(62).得卦名());
    }

    @Test
    public void should_map_gua_into_dictionary() throws Exception {
        取卦 取卦 = new 取卦();
        Map<卦象,卦> 卦字典 = 取卦.创建六十四卦字典();
        卦象 测试卦象 = new 卦象("阳阳阳阳阳阳");
        Assertions.assertEquals("乾：乾为天",卦字典.get(测试卦象).得卦名());
    }
}
