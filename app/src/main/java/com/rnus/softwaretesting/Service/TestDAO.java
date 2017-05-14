package com.rnus.softwaretesting.Service;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by RNUS on 7/5/2017.
 */

public class TestDAO implements Parcelable{


    private String dft_id;
    private String dft_number;
    private String dft_name;
    private String dft_description;

    public TestDAO(Parcel in) {
        dft_id = in.readString();
        dft_number = in.readString();
        dft_name = in.readString();
        dft_description = in.readString();

    }

    public static final Creator<TestDAO> CREATOR = new Creator<TestDAO>() {
        @Override
        public TestDAO createFromParcel(Parcel in) {
            return new TestDAO(in);
        }

        @Override
        public TestDAO[] newArray(int size) {
            return new TestDAO[size];
        }
    };

    public TestDAO() {

    }
    public String getDft_id() {
        return dft_id;
    }

    public void setDft_id(String dft_id) {
        this.dft_id = dft_id;
    }

    public String getDft_number() {
        return dft_number;
    }

    public void setDft_number(String dft_number) {
        this.dft_number = dft_number;
    }

    public String getDft_name() {
        return dft_name;
    }

    public void setDft_name(String dft_name) {
        this.dft_name = dft_name;
    }

    public String getDft_description() {
        return dft_description;
    }

    public void setDft_description(String dft_description) {
        this.dft_description = dft_description;
    }

    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(dft_id);
        dest.writeString(dft_number);
        dest.writeString(dft_name);
        dest.writeString(dft_description);

    }
}

