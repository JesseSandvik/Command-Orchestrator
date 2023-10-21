package com.blckroot.model;

interface PositionalParameterContract {
    String getLabel();
    String getDescription();
    Object getValue();
    void setValue(Object value);
}
