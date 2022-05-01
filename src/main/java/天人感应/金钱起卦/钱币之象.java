package 天人感应.金钱起卦;

/**
 * @author pi
 * @date 2022/05/01 22:06:07
 **/
public enum 钱币之象 {
    /**
     * 正面朝上
     */
    正面朝上("正", "阳","钱币正面朝上"),
    /**
     * 反面朝上
     */
    反面朝上("反", "阴","钱币反面朝上"),
    /**
     * 少阳
     */
    少阳("正正反","阳", "———— 阳爻"),
    /**
     * 少阴
     */
    少阴("正反反", "阴","—— —— 阴爻"),
    /**
     * 老阴
     */
    老阴("正正正", "阴","x 变爻，在主卦中是阴爻，在变卦中是阳爻"),
    /**
     * 老阳
     */
    老阳("反反反","阳", "O 变爻，在主卦中是阳爻，在变卦中是阴爻");


    private String 朝向;

    private String 阴阳属性;

    private String 说明;

    钱币之象(String 朝向, String 阴阳属性, String 说明) {
        this.朝向 = 朝向;
        this.阴阳属性 = 阴阳属性;
        this.说明 = 说明;
    }

    public String get朝向() {
        return 朝向;
    }

    public String get阴阳属性() {
        return 阴阳属性;
    }

    public String get说明() {
        return 说明;
    }
}
