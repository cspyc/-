package 反求储己;

import 天人感应.金钱起卦.摇卦;
import 天人感应.金钱起卦.钱币之象;
import 文王演卦.卦;
import 文王演卦.卦象;
import 文王演卦.用.取卦;

import java.util.Map;
import java.util.Scanner;

/**
 * @author pi
 * @date 2022/05/01 23:22:28
 **/
public class 人机交互 {
    public static void main(String[] args) {
        System.out.println("周易占卜");
        String 六爻 = "";
        摇卦 摇卦 = new 摇卦();
        取卦 取卦 = new 取卦();
        Map<卦象, 卦> 卦字典 = 取卦.创建六十四卦字典();

//        Scanner scanner = new Scanner(System.in);

        try {
            for (int i = 1; i <= 6; i++) {
//                System.out.println("请按任意键后回车，完成第" + i + "次抛出钱币");
//                if (scanner.hasNext()) {
//                String str1 = scanner.next();

                钱币之象 爻 = 摇卦.同时抛出三枚钱币();
                六爻 += 爻.get阴阳属性();
                System.out.println(爻.get阴阳属性() + "-------" + 爻);
//                }

            }

            卦象 卦象 = new 卦象(六爻);
            卦 卦 = 卦字典.get(卦象);
            System.out.println(卦.得卦名());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序出错........" + e.getMessage());
        }

    }
}
