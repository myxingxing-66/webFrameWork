package cn.myxingxing.web.helper;

import cn.myxingxing.web.bean.FormParam;
import cn.myxingxing.web.bean.Param;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * @Author: LiXing
 * @Description: 请求助手类
 * @Date: Created in 17:18 18/1/30
 * @Modified By:
 */
public final class RequestHelper {

    public static Param createParam(HttpServletRequest request) throws IOException {
        List<FormParam> formParamList = new ArrayList<>();

        return null;
    }

    private static List<FormParam> parseParameterNames(HttpServletRequest request){
        List<FormParam> formParamList = new ArrayList<>();
        Enumeration<String> paramNames = request.getParameterNames();
        while (paramNames.hasMoreElements()){
            String fieldName = paramNames.nextElement();
            String[] fieldValues = request.getParameterValues(fieldName);
        }
        return null;
    }

}
