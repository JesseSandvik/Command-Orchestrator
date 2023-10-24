package com.blckroot.relics;

interface OperatingSystemRelicContract {
    String getFileSeparator();
    String getLineSeparator();
    String getOperatingSystemArchitecture();
    String getOperatingSystemName();
    String getOperatingSystemVersion();
    String getUserCurrentDirectory();
    String getUserHomeDirectory();
    String getUserAccountName();
}
