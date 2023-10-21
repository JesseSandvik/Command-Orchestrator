package com.blckroot.forge;

import picocli.CommandLine;

interface CommandLineBuilderContract {
    CommandLineBuilder addStandardUsageHelpOption();
    CommandLineBuilder addStandardVersionHelpOption();
    CommandLine build();
}
