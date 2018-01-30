package cn.myxingxing.web.util;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

/**
 * @Author: LiXing
 * @Description: 文件操作工具类
 * @Date: Created in 17:12 18/1/30
 * @Modified By:
 */
public final class FileUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(FileUtil.class);

    /**
     * 获取文件真实名(自动去掉文件路径)
     *
     * @param fileName
     * @return
     */
    public static String getRealFileName(String fileName) {
        return FilenameUtils.getName(fileName);
    }

    /**
     * 创建文件
     *
     * @param filePath
     * @return
     */
    public static File createFile(String filePath) {
        File file;
        try {
            file = new File(filePath);
            File parentDir = file.getParentFile();
            if (!parentDir.exists()) {
                FileUtils.forceMkdir(parentDir);
            }
        } catch (Exception e) {
            LOGGER.error("create file failure", e);
            throw new RuntimeException(e);
        }
        return file;
    }
}
