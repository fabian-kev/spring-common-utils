package com.fabiankevin.commonutils.date;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DateFormat {

    ISO_8601_DATE("yyyy-MM-dd"),
    ISO_8601_DATETIME("yyyy-MM-dd hh:mm:ss");


    private String value;
}