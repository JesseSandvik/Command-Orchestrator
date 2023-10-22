package com.blckroot.relics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileSystemRelicTest {

    // **** File System Relic, File Exists ************************************************************************** //

    @Test
    void FILE_SYSTEM_RELIC__file_exists__null() {
        boolean expected = false;
        FileSystemRelic fileSystemRelic = new FileSystemRelic();

        boolean actual = fileSystemRelic.fileExists(null);
        assertEquals(expected, actual);
    }

    @Test
    void FILE_SYSTEM_RELIC__file_exists__empty() {
        boolean expected = false;
        FileSystemRelic fileSystemRelic = new FileSystemRelic();

        boolean actual = fileSystemRelic.fileExists("");
        assertEquals(expected, actual);
    }

    @Test
    void FILE_SYSTEM_RELIC__file_exists__blank() {
        boolean expected = false;
        FileSystemRelic fileSystemRelic = new FileSystemRelic();

        boolean actual = fileSystemRelic.fileExists("    ");
        assertEquals(expected, actual);
    }

    @Test
    void FILE_SYSTEM_RELIC__file_exists__does_not_exist() {
        boolean expected = false;
        FileSystemRelic fileSystemRelic = new FileSystemRelic();

        boolean actual = fileSystemRelic.fileExists("src/test/resources/bad-file-path");
        assertEquals(expected, actual);
    }

    @Test
    void FILE_SYSTEM_RELIC__file_exists() {
        boolean expected = true;
        FileSystemRelic fileSystemRelic = new FileSystemRelic();

        boolean actual = fileSystemRelic.fileExists("src/test/resources/echo");
        assertEquals(expected, actual);
    }

    // **** File System Relic, File Is Executable ******************************************************************* //

    @Test
    void FILE_SYSTEM_RELIC__file_is_executable__null() {
        boolean expected = false;
        FileSystemRelic fileSystemRelic = new FileSystemRelic();

        boolean actual = fileSystemRelic.fileIsExecutable(null);
        assertEquals(expected, actual);
    }

    @Test
    void FILE_SYSTEM_RELIC__file_is_executable__empty() {
        boolean expected = false;
        FileSystemRelic fileSystemRelic = new FileSystemRelic();

        boolean actual = fileSystemRelic.fileIsExecutable("");
        assertEquals(expected, actual);
    }

    @Test
    void FILE_SYSTEM_RELIC__file_is_executable__blank() {
        boolean expected = false;
        FileSystemRelic fileSystemRelic = new FileSystemRelic();

        boolean actual = fileSystemRelic.fileIsExecutable("    ");
        assertEquals(expected, actual);
    }

    @Test
    void FILE_SYSTEM_RELIC__file_is_executable__does_not_exist() {
        boolean expected = false;
        FileSystemRelic fileSystemRelic = new FileSystemRelic();

        boolean actual = fileSystemRelic.fileIsExecutable("src/test/resources/bad-file-path");
        assertEquals(expected, actual);
    }

    @Test
    void FILE_SYSTEM_RELIC__file_is_executable__does_not_execute() {
        boolean expected = false;
        FileSystemRelic fileSystemRelic = new FileSystemRelic();

        boolean actual = fileSystemRelic.fileIsExecutable("src/test/resources/");
        assertEquals(expected, actual);
    }

    @Test
    void FILE_SYSTEM_RELIC__file_is_executable() {
        boolean expected = true;
        FileSystemRelic fileSystemRelic = new FileSystemRelic();

        boolean actual = fileSystemRelic.fileIsExecutable("src/test/resources/echo");
        assertEquals(expected, actual);
    }
}
