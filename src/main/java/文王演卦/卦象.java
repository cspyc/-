package 文王演卦;

import java.util.Objects;

/**
 * @author pi
 * @date 2022/05/01 18:17:09
 **/
public class 卦象 {

    private String 阴阳表述;

    public String get阴阳表述() {
        return 阴阳表述;
    }

    public void set阴阳表述(String 阴阳表述) {
        this.阴阳表述 = 阴阳表述;
    }

    public 卦象(String 阴阳表述) {
        this.阴阳表述 = 阴阳表述;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        卦象 卦象 = (卦象) o;
        return Objects.equals(阴阳表述, 卦象.阴阳表述);
    }

    @Override
    public int hashCode() {
        return Objects.hash(阴阳表述);
    }
}
