package com.fabiankevin.commonutils.file;

import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSample {
    public void samplePath(){
        //to get user home
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.dir"));

    }

    public void createDirectoriesIfNowExists() throws IOException {
        Path path = Paths.get(System.getProperty("user.home") + File.separator + "/sample");
        if(Files.notExists(path) ){
            Files.createDirectories(path);
        }
    }

    public void getFileDifferentWays(){
        //no need to add classpath:
        try {
            //it will look at /src/main/resources/stub/
            InputStream inputStreamClasspath = new ClassPathResource("/stub").getInputStream();

//            InputStream inputStreamFile -

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
