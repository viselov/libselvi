package com.selvi.libselvi.model;

/**
 * Created by selv on 07/05/2019.
 */
public class Basev2<T>  {

    private T data;
    private String status;
    private String message;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }
}
