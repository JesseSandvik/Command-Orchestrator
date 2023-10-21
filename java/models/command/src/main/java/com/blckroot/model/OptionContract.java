package com.blckroot.model;

interface OptionContract {
    String getLongName();
    String getShortName();
    String getSynopsis();
    String getParameterLabel();
    void setParameterLabel(String parameterLabel);
    Object getValue();
    void setValue(Object value);
}
