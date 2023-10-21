package com.blckroot.model;

import com.blckroot.forge.StringForge;

public class Option implements OptionContract {
    private final String longestName;
    private final String shortestName;
    private final String description;
    private String parameterLabel;
    private Object value;

    public Option(String[] names, String description) {
        StringForge stringForge = new StringForge();
        this.longestName = stringForge.getLongestStringInArray(names);
        this.shortestName = stringForge.getShortestStringInArray(names);
        this.description = description;
        this.parameterLabel = null;
    }

    public Option(String name, String description) {
        this.longestName = name;
        this.shortestName = null;
        this.description = description;
        this.parameterLabel = null;
    }

    @Override
    public String getLongestName() {
        return longestName;
    }

    @Override
    public String getShortestName() {
        return shortestName;
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
