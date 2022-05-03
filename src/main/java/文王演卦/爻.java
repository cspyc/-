package 文王演卦;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author pi
 * @date 2022/04/23 11:31:48
 **/
public class 爻 {
    /**
     *  揺卦时，区分：太阴，少阳，少阴，太阴;在卦象中，只区分阴、阳
     */
    @JsonProperty("属性")
    private String 属性;

    @JsonProperty("爻名")
    private String 爻名;

    @JsonProperty("爻辞")
    private String 爻辞;

    @JsonProperty("象辞")
    private String 象辞;

    @JsonProperty("文言")
    private String 文言;

    public String get爻名() {
        return 爻名;
    }

    public String get爻辞() {
        return 爻辞;
    }

    public String get象辞() {
        return 象辞;
    }

    public String get文言() {
        return 文言;
    }
}
