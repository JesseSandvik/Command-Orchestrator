package com.blckroot.relics;

public class OperatingSystemRelic implements OperatingSystemRelicContract {
    private final OperatingSystemRelicUtility operatingSystemRelicUtility;

    public OperatingSystemRelic() {
        this.operatingSystemRelicUtility = new OperatingSystemRelicUtility();
    }

    @Override
    public String getFileSeparator() {
        return operatingSystemRelicUtility.getFileSeparator();
    }

    @Override
    public String getLineSeparator() {
        return operatingSystemRelicUtility.getLineSeparator();
    }

    @Override
    public String getOperatingSystemArchitecture() {
        return operatingSystemRelicUtility.getOperatingSystemArchitecture();
    }

    @Override
    public String getOperatingSystemName() {
        return operatingSystemRelicUtility.getOperatingSystemName();
    }

    @Override
    public String getOperatingSystemVersion() {
        return operatingSystemRelicUtility.getOperatingSystemVersion();
    }

    @Override
    public String getUserCurrentDirectory() {
        return operatingSystemRelicUtility.getUserCurrentDirectory();
    }

    @Override
    public String getUserHomeDirectory() {
        return operatingSystemRelicUtility.getUserHomeDirectory();
    }

    @Override
    public String getUserAccountName() {
        return operatingSystemRelicUtility.getUserAccountName();
    }
}
