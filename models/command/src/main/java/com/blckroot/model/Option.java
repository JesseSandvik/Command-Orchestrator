package com.blckroot.model;

import com.blckroot.relics.StringRelic;

public class Option implements OptionContract {
    private final String longName;
    private final String shortName;
    private final String synopsis;
    private String parameterLabel;
    private Object value;

    public Option(String[] names, String synopsis) {
        StringRelic stringRelic = new StringRelic();
        this.longName = stringRelic.getLongestStringInArray(names);
        this.shortName = stringRelic.getShortestStringInArray(names);
        this.synopsis = synopsis;
        this.parameterLabel = null;
    }

    public Option(String name, String synopsis) {
        this.longName = name;
        this.shortName = null;
        this.synopsis = synopsis;
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
    public String getSynopsis() {
        return synopsis;
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
