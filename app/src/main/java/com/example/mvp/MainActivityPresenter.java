package com.example.mvp;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    MainActivityContract.View view ;

    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
    }


    @Override
    public void doLogin(String email, String password) {
        //email = jaytailor@gmail.com
        //pass = jaytailor123

        if ( email.equals("jaytailor@gmail.com") && password.equals("jaytailor123")){
            view.onSuccess("Login Successful");
        } else {
            view.onDestroy("Login Failed");
        }
    }
}
