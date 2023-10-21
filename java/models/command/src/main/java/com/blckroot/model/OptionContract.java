package com.blckroot.model;

interface OptionContract {
    String getLongestName();
    String getShortestName();
    String getDescription();
    String getParameterLabel();
    void setParameterLabel(String parameterLabel);
    Object getValue();
    void setValue(Object value);
}
