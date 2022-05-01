package 天人感应.金钱起卦;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Random;

/**
 * @author pi
 * @date 2022/05/01 20:44:44
 **/
public class 钱币 {

    /**
     * 正面/背面
     */
    private String 朝上面;

    private static Random random;

    public String 抛出得到朝上面() {
        if (random.nextBoolean()) {
            return 钱币之象.正面朝上.get朝向();
        } else {
            return 钱币之象.反面朝上.get朝向();
        }
    }

    public 钱币(LocalDateTime timeStamp) {
        long seedNumber = 3;
        if (timeStamp != null) {
            ZonedDateTime zdt = ZonedDateTime.of(timeStamp, ZoneId.systemDefault());
            seedNumber = zdt.toInstant().toEpochMilli();
        }
        random = new Random(seedNumber);
    }
}
