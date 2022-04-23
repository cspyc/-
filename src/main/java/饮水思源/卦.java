package 饮水思源;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * @author pi
 * @date 2022/04/23 11:29:02
 **/
public class 卦 {
    @JsonProperty("卦名")
    private String 卦名;

    @JsonProperty("卦象")
    private String 卦象;

    @JsonProperty("六爻")
    private List<爻> 六爻;

    @JsonProperty("卦辞")
    private String 卦辞;

    @JsonProperty("彖辞")
    private String 彖辞;

    @JsonProperty("象辞")
    private String 象辞;

    @JsonProperty("文言")
    private String 文言;

    public String 得卦名() {
        return 卦名;
    }

    public String 得卦象() {
        return 卦象;
    }

    public List<爻> 得六爻() {
        return 六爻;
    }

    public String 得卦辞() {
        return 卦辞;
    }

    public String 得彖辞() {
        return 彖辞;
    }

    public String 得象辞() {
        return 象辞;
    }

    public String 得文言() {
        return 文言;
    }
}
