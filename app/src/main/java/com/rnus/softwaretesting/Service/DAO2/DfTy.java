
package com.rnus.softwaretesting.Service.DAO2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DfTy {

    @SerializedName("defect_type")
    @Expose
    private List<DefectType> defectType = null;

    public List<DefectType> getDefectType() {
        return defectType;
    }

    public void setDefectType(List<DefectType> defectType) {
        this.defectType = defectType;
    }

}
