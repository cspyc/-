package 反求储己;

import 天人感应.金钱起卦.钱币之象;
import 文王演卦.卦;
import 文王演卦.卦象;

import java.util.List;
import java.util.Map;

/**
 * @author pi
 * @date 2022/05/02 22:21:52
 **/
public class 算卦 {

    public 卦 取卦(List<钱币之象> 六次摇爻结果, Map<卦象, 卦> 卦字典) throws Exception {
        String 六爻 = "";
        for (钱币之象 钱币之象 : 六次摇爻结果) {
            六爻 += 钱币之象.get阴阳属性();
        }
        卦象 卦象 = new 卦象(六爻);
        卦 卦 = 卦字典.get(卦象);
        if (卦 == null) {
            throw new Exception("根据卦象，未查找到对应的卦，请检查相关资料！");
        }
        return 卦;
    }

    public 卦 取变卦(List<钱币之象> 六次摇爻结果, Map<卦象, 卦> 卦字典) throws Exception {
        String 变卦六爻 = "";

        for (钱币之象 变爻 : 六次摇爻结果) {
            //老阴、老阳 为 变爻 -> 在变卦中，老阴变阳，老阳变阴
            if (变爻.equals(钱币之象.老阴)) {
                变爻 = 钱币之象.少阳;
            }

            if (变爻.equals(钱币之象.老阳)) {
                变爻 = 钱币之象.少阴;
            }
            变卦六爻 += 变爻.get阴阳属性();
        }
        System.out.println(变卦六爻);
        卦象 卦象 = new 卦象(变卦六爻);
        卦 卦 = 卦字典.get(卦象);
        if (卦 == null) {
            throw new Exception("根据卦象，未查找到对应的卦，请检查相关资料！");
        }
        return 卦;
    }
}
