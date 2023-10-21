package com.blckroot.relics;

interface FileSystemRelicContract {
    Boolean fileExists(String filePath);
    Boolean fileIsExecutable(String filePath);
}
