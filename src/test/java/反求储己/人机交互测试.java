package 反求储己;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import 天人感应.金钱起卦.钱币;
import 天人感应.金钱起卦.钱币之象;
import 文王演卦.卦;
import 文王演卦.卦象;
import 文王演卦.用.取卦;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author pi
 * @date 2022/05/02 22:17:13
 **/
public class 人机交互测试 {
    private static Map<卦象, 卦> 卦字典;

    @BeforeAll
    public static void initial() {
        取卦 取卦 = new 取卦();
        卦字典 = 取卦.创建六十四卦字典();
    }

    @Test
    public void should_取反卦() throws Exception {
        List<钱币之象> 测试 = new ArrayList<>();
        测试.add(钱币之象.少阴);
        测试.add(钱币之象.老阴);
        测试.add(钱币之象.少阴);
        测试.add(钱币之象.老阳);
        测试.add(钱币之象.老阳);
        测试.add(钱币之象.老阴);

        System.out.println(new 算卦().取变卦(测试, 卦字典));

    }
}
