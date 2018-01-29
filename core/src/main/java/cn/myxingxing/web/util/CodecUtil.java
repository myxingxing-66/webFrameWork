package cn.myxingxing.web.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @Author: LiXing
 * @Description: 编码与解码工具类
 * @Date: Created in 17:49 18/1/27
 * @Modified By:
 */
public class CodecUtil {

    public static final Logger LOGGER = LoggerFactory.getLogger(CodecUtil.class);

    /**
     * 将URL编码
     *
     * @param sorece
     * @return
     */
    public static String encodeURL(String sorece) {
        String target;
        try {
            target = URLEncoder.encode(sorece, "UTF-8");
        } catch (Exception e) {
            LOGGER.error("encode url failure", e);
            throw new RuntimeException(e);
        }
        return target;
    }

    /**
     * 将URL解码
     *
     * @param source
     * @return
     */
    public static String decodeURL(String source) {
        String target;
        try {
            target = URLDecoder.decode(source, "UTF-8");
        } catch (Exception e) {
            LOGGER.error("decode url failure", e);
            throw new RuntimeException(e);
        }
        return target;
    }

}
