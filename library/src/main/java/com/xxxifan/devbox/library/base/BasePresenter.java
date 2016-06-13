package com.xxxifan.devbox.library.base;

/**
 * Created by xifan on 5/16/16.
 */
public interface BasePresenter<T> {
    void setView(T view);

    void onDestroy();
}
