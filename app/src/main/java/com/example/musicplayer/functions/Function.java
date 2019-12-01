package com.example.musicplayer.functions;

/**
 * 函数式接口function 抽象方法apply是将泛型参数对象转换成了泛型R对象，
 * 常用于将输入信息映射成另一种另一种类型的输出
 */
public interface Function<T, R> {
    R apply(T t);
}
