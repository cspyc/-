package 文王演卦;

/**
 * @author pi
 * @date 2022/05/01 18:33:41
 **/
public enum 阴阳映零壹 {
    /**
     * 阴
     */
    阴("0","阴"),

    /**
     * 阳
     */
    阳("1","阳");
    /**
     *  零壹-二进制
     */

    private String 零壹;


    /**
     * 阴阳
     */
    private String 阴阳;

    阴阳映零壹(String 零壹, String 阴阳) {
        this.零壹 = 零壹;
        this.阴阳 = 阴阳;
    }

    public String 取零壹编码() {
        return 零壹;
    }

    public String 取阴阳值() {
        return 阴阳;
    }
}
