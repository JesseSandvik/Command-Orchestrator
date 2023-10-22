package com.blckroot.relics;

public class FileSystemRelic implements FileSystemRelicContract {
    private final FileSystemRelicUtility fileSystemRelicUtility;

    public FileSystemRelic() {
        this.fileSystemRelicUtility = new FileSystemRelicUtility();
    }

    @Override
    public Boolean fileExists(String filePath) {
        return fileSystemRelicUtility.fileExists(filePath);
    }

    @Override
    public Boolean fileIsExecutable(String filePath) {
        return fileSystemRelicUtility.fileIsExecutable(filePath);
    }
}
