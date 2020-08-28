package com.shahed.javaee.dtos;

import java.util.List;

public class FieldItem {
    private String fieldIdentifier;
    private String fieldName;
    private int displayOrder;
    private String callBack;
    private int fieldType;
    private List<FieldOption> fieldOptionList;
    private String fieldValue;
    private String event;
    private String validationExpression;

    public FieldItem() {}

    public FieldItem(String fieldIdentifier,
                     String fieldName,
                     int displayOrder,
                     String callBack,
                     int fieldType,
                     List<FieldOption> fieldOptionList,
                     String fieldValue,
                     String event,
                     String validationExpression) {
        this.fieldIdentifier = fieldIdentifier;
        this.fieldName = fieldName;
        this.displayOrder = displayOrder;
        this.callBack = callBack;
        this.fieldType = fieldType;
        this.fieldOptionList = fieldOptionList;
        this.fieldValue = fieldValue;
        this.event = event;
        this.validationExpression = validationExpression;
    }

    public String getFieldIdentifier() {
        return fieldIdentifier;
    }

    public void setFieldIdentifier(String fieldIdentifier) {
        this.fieldIdentifier = fieldIdentifier;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getCallBack() {
        return callBack;
    }

    public void setCallBack(String callBack) {
        this.callBack = callBack;
    }

    public int getFieldType() {
        return fieldType;
    }

    public void setFieldType(int fieldType) {
        this.fieldType = fieldType;
    }

    public List<FieldOption> getFieldOptionList() {
        return fieldOptionList;
    }

    public void setFieldOptionList(List<FieldOption> fieldOptoinList) {
        this.fieldOptionList = fieldOptoinList;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getValidationExpression() {
        return validationExpression;
    }

    public void setValidationExpression(String validationExpression) {
        this.validationExpression = validationExpression;
    }
}
