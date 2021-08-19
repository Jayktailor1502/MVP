package com.example.mvp;

public interface MainActivityContract {

    interface View {
        void onSuccess(String s);
        void onDestroy(String s);
    }

    interface Presenter {
        void doLogin(String email, String password);
    }
}
