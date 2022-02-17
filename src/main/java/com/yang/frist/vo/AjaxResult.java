package com.yang.frist.vo;

public class AjaxResult {

    /**
     *  是否成功
     */
    private boolean success = true;
    /**
     *  状态
     */
    private Integer code;

    /**
     * 数据
     */
    private Object data;

    /**
     * 信息
     */
    private String message;

    /**
     * 类型
     */
    private String type;

    private AjaxResultType resultType;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AjaxResultType getResultType() {
        return resultType;
    }

    public void setResultType(AjaxResultType resultType) {
        this.resultType = resultType;
    }
}
