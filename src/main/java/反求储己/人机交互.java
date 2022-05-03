package 反求储己;

import 天人感应.金钱起卦.摇卦;
import 天人感应.金钱起卦.钱币之象;
import 文王演卦.卦;
import 文王演卦.卦象;
import 文王演卦.爻;
import 文王演卦.用.取卦;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author pi
 * @date 2022/05/01 23:22:28
 **/
public class 人机交互 {
    private static Map<卦象, 卦> 卦字典;

    static {
        取卦 取卦 = new 取卦();
        卦字典 = 取卦.创建六十四卦字典();
    }

    public static void main(String[] args) {
        new 人机交互().交互入口();
    }

    public void 交互入口() {
        System.out.println("周易占卜");
        List<钱币之象> 六次摇爻结果 = new ArrayList<>();
        摇卦 摇卦 = new 摇卦();
        算卦 算卦 = new 算卦();

        List<String> 卦象标记 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            for (int i = 1; i <= 6; i++) {
                System.out.println("请按 1 后回车，完成第" + i + "次抛出钱币");
                if (scanner.hasNext()) {
                    String input = scanner.next();
                    if ("1".equals(input)) {
                        钱币之象 爻 = 摇卦.同时抛出三枚钱币();
                        六次摇爻结果.add(爻);
                        卦象标记.add(爻.get记号());
                        System.out.println(爻.get阴阳属性() + "-------" + 爻);
                    } else {
                        System.out.println("请输入正确的字符！");
                        i = i - 1;
                    }
                }
            }

            卦 卦 = 算卦.取卦(六次摇爻结果, 卦字典);
            卦 变卦 = 算卦.取变卦(六次摇爻结果, 卦字典);
            System.out.println(如何选卦爻词());
            System.out.println(输出卦象(卦象标记));
            System.out.println(输出卦文(卦));
            System.out.println("-----------------变卦----------------");
            System.out.println(输出卦文(变卦));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序出错........" + e.getMessage());
        }
    }


    private static String 输出卦象(List<String> 卦象标记) {
        String 最终结果 = "";
        //需要反向输出，内卦在下，外卦在上
        for (int i = 卦象标记.size() - 1; i >= 0; i--) {
            最终结果 += 卦象标记.get(i) + "\n";
        }
        return 最终结果;
    }

    private static String 输出卦文(卦 卦) {
        String 最终结果 = "";
        String 卦名 = 卦.得卦名() + "\n";
        String 卦词 = 卦.得卦辞() + "\n";
        String 彖词 = 卦.得彖辞() + "\n";
        String 象词 = 卦.得象辞() + "\n";
        String 文言 = 卦.得文言() + "\n";
        List<爻> 六爻 = 卦.得六爻();
        String 爻词 = "";
        for (爻 爻 : 六爻) {
            爻词 += "\n" + 爻.get爻名() + ":" + 爻.get爻辞() + "\n" + 爻.get象辞() + "\n" + 爻.get文言() + "\n";
        }
        最终结果 = 卦名 + 卦词 + 彖词 + 象词 + 文言 + 爻词;
        return 最终结果;
    }

    private static String 如何选卦爻词() {
        return "得到一卦后，可以先看此卦卦辞，卦辞是对卦象内容的整体概括。" +
                "卦辞所提示的哲理带有很大的抽象性、包容性、多维性、启示性，是广义的、多层次的、富于变化的。所以不可拘泥于文句的直接含义，呆板地理解。" + "\n" +
                "除了卦辞外，还可以根据爻辞占断吉凶" + "\n" +
                "1．六爻不变：卦中六个爻都不是变爻，这叫“静卦”，用本卦的卦辞解卦。" + "\n" +
                "2．一个爻变：卦中有一个变爻，就用这个变爻的爻辞解卦。" + "\n" +
                "3．二个爻变：卦中有两个变爻，用这两个变爻的爻辞解卦，以上爻为主。" + "\n" +
                "4．三个爻变：卦中有三个变爻，用本卦卦辞结合变卦卦辞作综合考虑。" + "\n" +
                "5．四个爻变：卦中有四个变爻，用另外两个静爻的爻辞解卦，并以下爻爻辞为主。" + "\n" +
                "6．五个爻变：卦中有五个变爻，用变卦的静爻爻辞解卦。" + "\n" +
                "7．六爻皆变：如果是乾、坤两卦就用用九、用六的爻辞解卦，其他卦则用变卦的卦辞解卦。" + "\n";
    }
}
