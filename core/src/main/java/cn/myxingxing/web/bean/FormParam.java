package cn.myxingxing.web.bean;

/**
 * @Author: LiXing
 * @Description:
 * @Date: Created in 16:21 18/1/30
 * @Modified By:
 */
public class FormParam {

    private String fieldName;
    private Object fieldValue;

    public FormParam(String fieldName, Object fieldValue) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }
}
