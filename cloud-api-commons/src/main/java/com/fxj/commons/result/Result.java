package com.fxj.commons.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T>{

    private String code;
    private String message;
    private T data;

    public Result(StatusCode code, String message){
        this.code = code.getCode();
        this.message =message;
        this.data = null;
    }

    public Result(StatusCode code, String message, T data){
        this.code = code.getCode();
        this.message =message;
        this.data = data;
    }

}
