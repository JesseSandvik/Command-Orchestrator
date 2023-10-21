package com.blckroot.model;

import com.blckroot.forge.StringForge;

public class Option implements OptionContract {
    private final String longName;
    private final String shortName;
    private final String description;
    private String parameterLabel;
    private Object value;

    public Option(String[] names, String description) {
        StringForge stringForge = new StringForge();
        this.longName = stringForge.getLongestStringInArray(names);
        this.shortName = stringForge.getShortestStringInArray(names);
        this.description = description;
        this.parameterLabel = null;
    }

    public Option(String name, String description) {
        this.longName = name;
        this.shortName = null;
        this.description = description;
        this.parameterLabel = null;
    }

    @Override
    public String getLongName() {
        return longName;
    }

    @Override
    public String getShortName() {
        return shortName;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getParameterLabel() {
        return parameterLabel;
    }

    @Override
    public void setParameterLabel(String parameterLabel) {
        this.parameterLabel = parameterLabel;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public void setValue(Object value) {
        this.value = value;
    }
}
