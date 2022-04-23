package 饮水思源;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

/**
 * @author pi
 * @date 2022/04/23 11:28:18
 **/
public class 读取易经测试 {
    @Test
    public void should_read_yi_file() throws Exception {
        取卦 取卦 = new 取卦();
        List<卦> 六十四卦 = 取卦.读取卦文();

        Assertions.assertEquals("乾：乾为天",六十四卦.get(0).得卦名());
    }

    @Test
    public void should_map_gua_into_dictionary() throws Exception {
        取卦 取卦 = new 取卦();
        Map<String,卦> 卦字典 = 取卦.创建六十四卦字典();
        Assertions.assertEquals("乾：乾为天",卦字典.get("阳阳阳阳阳阳").得卦名());
    }
}
