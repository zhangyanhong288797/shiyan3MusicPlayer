package com.example.musicplayer.functions;

//import android.support.annotation.NonNull;

import androidx.annotation.NonNull;

/**
 * accept为一个有参数但没有返回值的函数 它接受一个泛型参数T 无返回（
 * A functional interface (callback) that accepts two values (of possibly different types).
 *
 * @param <T1> the first value type
 * @param <T2> the second value typevoid)
 */
public interface BiConsumer<T1, T2> {

    /**
     * Performs an operation on the given values.
     *
     * @param t1 the first value
     * @param t2 the second value
     */
    void accept(@NonNull T1 t1, @NonNull T2 t2);
}
