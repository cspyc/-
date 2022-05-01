package 天人感应.金钱起卦;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;


/**
 * @author pi
 * @date 2022/05/01 20:42:16
 **/
public class 钱币测试 {

    @Test
    public void should_return_random_朝上面() throws Exception {
        钱币 钱币 = new 钱币(LocalDateTime.now());
        int coinTrue = 0;
        int coinFalse = 0;
        long seedNumber = 3;

        for (int i = 0; i < 3; i++) {
            String 朝上面 = 钱币.抛出得到朝上面();
            if (朝上面.equals(钱币之象.正面朝上.get朝向())) {
                coinTrue++;
            } else {
                coinFalse++;
            }
        }
        System.out.println("正面：" + coinTrue);
        System.out.println("背面：" + coinFalse);
    }
}
