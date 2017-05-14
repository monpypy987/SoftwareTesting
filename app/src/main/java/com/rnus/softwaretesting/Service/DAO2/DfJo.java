
package com.rnus.softwaretesting.Service.DAO2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DfJo {

    @SerializedName("defectjoin")
    @Expose
    private List<Defectjoin> defectjoin = null;

    public List<Defectjoin> getDefectjoin() {
        return defectjoin;
    }

    public void setDefectjoin(List<Defectjoin> defectjoin) {
        this.defectjoin = defectjoin;
    }

}
