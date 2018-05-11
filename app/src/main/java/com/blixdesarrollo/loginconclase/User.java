package com.blixdesarrollo.loginconclase;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable{
    String usuario;
    String email;
    String password;
 
    public User(String usuario, String email, String password) {
        this.usuario = usuario;
        this.email = email;
        this.password = password;
    }

    protected User(Parcel in) {
        usuario = in.readString();
        email = in.readString();
        password = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(usuario);
        parcel.writeString(email);
        parcel.writeString(password);
    }
}
