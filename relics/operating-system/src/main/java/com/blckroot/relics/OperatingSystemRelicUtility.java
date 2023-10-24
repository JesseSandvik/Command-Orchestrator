package com.blckroot.relics;

import java.util.Properties;

class OperatingSystemRelicUtility implements OperatingSystemRelicContract {
    private final Properties properties;

    OperatingSystemRelicUtility() {
        this.properties = System.getProperties();
    }

    @Override
    public String getFileSeparator() {
        return properties.getProperty("file.separator");
    }

    @Override
    public String getLineSeparator() {
        return properties.getProperty("line.separator");
    }

    @Override
    public String getOperatingSystemArchitecture() {
        return properties.getProperty("os.arch");
    }

    @Override
    public String getOperatingSystemName() {
        return properties.getProperty("os.name");
    }

    @Override
    public String getOperatingSystemVersion() {
        return properties.getProperty("os.version");
    }

    @Override
    public String getUserCurrentDirectory() {
        return properties.getProperty("user.dir");
    }

    @Override
    public String getUserHomeDirectory() {
        return properties.getProperty("user.home");
    }

    @Override
    public String getUserAccountName() {
        return properties.getProperty("user.name");
    }
}
