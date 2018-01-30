package cn.myxingxing.web.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author: LiXing
 * @Description: 字符串工具类
 * @Date: Created in 14:00 18/1/9
 * @Modified By:
 */
public final class StringUtil {

    /**
     * 字符串分隔符
     */
    public static final String SEPARATOR = String.valueOf((char) 29);

    /**
     * 判断字符串是否为空
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    /**
     * 判断字符串是否非空
     *
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * 分割固定格式的字符串
     */
    public static String[] splitString(String str, String separator) {
        return StringUtils.splitByWholeSeparator(str, separator);
    }

}
