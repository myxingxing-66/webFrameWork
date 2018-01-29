package cn.myxingxing.web.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @Author: LiXing
 * @Description:
 * @Date: Created in 16:31 18/1/27
 * @Modified By:
 */
public final class ArrayUtil {

    /**
     * 判断数组是否非空
     *
     * @param array
     * @return
     */
    public static boolean isNotEmpty(Object[] array) {
        return !ArrayUtils.isEmpty(array);
    }

    /**
     * 判断数组是否为空
     *
     * @param array
     * @return
     */
    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }
}
