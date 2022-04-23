package 饮水思源;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author pi
 * @date 2022/04/23 21:44:13
 **/
public class 取卦 {
    public List<卦> 读取卦文() {
        List<卦> 六十四卦 = new ArrayList<>(64);
        BufferedReader bufferedReader = null;

        try {
            String url = this.getClass().getClassLoader().getResource("六十四卦.json").toURI().getPath();
            File 卦文文件 = new File(url);
            bufferedReader = new BufferedReader(new FileReader(卦文文件));
            String readLineData = "";
            StringBuilder allContent = new StringBuilder();
            while ((readLineData = bufferedReader.readLine()) != null) {
                allContent.append(readLineData);
            }
            ObjectMapper objectMapper = new ObjectMapper();
            JavaType collectionType = getCollectionType(objectMapper, List.class, 卦.class);
            六十四卦 = (List<卦>) objectMapper.readValue(String.valueOf(allContent), collectionType);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return 六十四卦;
    }

    public static JavaType getCollectionType(ObjectMapper mapper, Class<?> collectionClass, Class<?>... elementClass) {
        return mapper.getTypeFactory().constructParametricType(collectionClass, elementClass);
    }

    public Map<String, 卦> 创建六十四卦字典() {
        List<卦> 六十四卦 = this.读取卦文();
        Map<String,卦> 卦字典 = 六十四卦.stream()
                .collect(Collectors.toMap(卦::得卦象,卦->卦));
        return 卦字典;
    }
}
