package com.mao.clazz;

/**
 * @auther MaoYongjie
 * @date 2021/9/10 18:56
 * @Description:
 */
public class GenericType<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        System.out.println(Long.valueOf("127.36"));
    }
}

