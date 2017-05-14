
package com.rnus.softwaretesting.Service.DAO2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DefectType {

    @SerializedName("dft_id")
    @Expose
    private String dftId;
    @SerializedName("dft_number")
    @Expose
    private String dftNumber;
    @SerializedName("dft_name")
    @Expose
    private String dftName;
    @SerializedName("dft_description")
    @Expose
    private String dftDescription;

    public String getDftId() {
        return dftId;
    }

    public void setDftId(String dftId) {
        this.dftId = dftId;
    }

    public String getDftNumber() {
        return dftNumber;
    }

    public void setDftNumber(String dftNumber) {
        this.dftNumber = dftNumber;
    }

    public String getDftName() {
        return dftName;
    }

    public void setDftName(String dftName) {
        this.dftName = dftName;
    }

    public String getDftDescription() {
        return dftDescription;
    }

    public void setDftDescription(String dftDescription) {
        this.dftDescription = dftDescription;
    }

}
