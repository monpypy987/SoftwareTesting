package com.rnus.softwaretesting.Service;

import com.rnus.softwaretesting.Service.DAO2.DfJo;
import com.rnus.softwaretesting.Service.DAO2.DfTy;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by RNUS on 7/5/2017.
 */

public interface Service {
    /*@GET("/TSP57/ISERL/application/views/stm/test_report/service1.php")
    Call<DefectType> select_defect();*/

    @GET("/TSP57/ISERL/application/views/stm/test_report/sv_DefectType.php")
    Call<DfTy> select_defect();

    @GET("/TSP57/ISERL/application/views/stm/test_report/sv_Defectjoin.php")
    Call<DfJo> select_defectjoin();
}
