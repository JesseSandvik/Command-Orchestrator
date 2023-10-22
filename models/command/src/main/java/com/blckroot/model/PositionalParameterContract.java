package com.blckroot.model;

interface PositionalParameterContract {
    String getLabel();
    String getSynopsis();
    Object getValue();
    void setValue(Object value);
}
