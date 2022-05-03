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
        for (int i = 0; i < 100; i++) {
            System.out.println(摇卦.同时抛出三枚钱币());
        }

    }

    @Test
    public void should_generate_爻_using_线程池() throws Exception {
        摇卦 摇卦 = new 摇卦();
        for (int i = 0; i < 10000; i++) {
            System.out.println(摇卦.同时抛出三枚钱币_线程池());
        }


    }
}
