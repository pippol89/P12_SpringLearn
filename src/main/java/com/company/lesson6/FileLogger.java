package com.company.lesson6;

import javax.annotation.PostConstruct;
import java.io.File;

public class FileLogger implements Logger {
    private File file;

    public FileLogger(File file) {
        this.file = file;
    }

    @Override
    public void write() {
        System.out.println("We are write information in file");
    }

    @PostConstruct
    public void init() {
        System.out.println("FileLogger init()");
    }
}
