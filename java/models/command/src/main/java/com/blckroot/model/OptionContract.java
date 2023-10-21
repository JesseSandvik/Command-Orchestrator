package com.blckroot.model;

interface OptionContract {
    String getLongName();
    String getShortName();
    String getDescription();
    String getParameterLabel();
    void setParameterLabel(String parameterLabel);
    Object getValue();
    void setValue(Object value);
}
