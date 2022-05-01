package 天人感应.金钱起卦;

import org.junit.jupiter.api.Test;

/**
 * @author pi
 * @date 2022/05/01 20:30:15
 **/
public class 金钱起卦测试 {
    @Test
    public void should_generate_yao() throws Exception {
        摇卦 摇卦 = new 摇卦();
        System.out.println(摇卦.同时抛出三枚钱币());
    }
}
