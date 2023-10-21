package com.blckroot.relics;

import java.io.File;

class FileSystemRelicUtility implements FileSystemRelicContract {
    @Override
    public Boolean fileExists(String filePath) {
        if (filePath != null && !filePath.isEmpty()) {
            return new File(filePath).exists();
        }
        return false;
    }

    @Override
    public Boolean fileIsExecutable(String filePath) {
        if (filePath != null && !filePath.isEmpty()) {
            File file = new File(filePath);

            if (!file.isDirectory()) {
                return new File(filePath).canExecute();
            }
        }
        return false;
    }
}
