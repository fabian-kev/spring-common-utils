package com.fabiankevin.commonutils.file;

import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public final class FileUtils {

    public String fileToString(String resourcePath){
        String data = null;
        try {
            data = new BufferedReader(new InputStreamReader(new ClassPathResource(resourcePath).getInputStream()))
                    .lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
