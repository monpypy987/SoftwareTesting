package com.rnus.softwaretesting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.rnus.softwaretesting.Service.DAO2.DfTy;
import com.rnus.softwaretesting.Service.Service;
import com.rnus.softwaretesting.Service.TestDAO;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Button bLogin;
    private com.rnus.softwaretesting.Service.Service service;
    private TestDAO testDAO;
    private ArrayList<TestDAO> mtestDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bLogin = (Button) findViewById(R.id.bLogin);

        bLogin.setOnClickListener(onClickLoginListener);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.51.4.17")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(Service.class);

        mtestDAO = new ArrayList<>();

        service.select_defect().enqueue(new Callback<DfTy>() {
            @Override
            public void onResponse(Call<DfTy> call, Response<DfTy> response) {
                for (int i = 0; i < response.body().getDefectType().size(); i++ ){
                    testDAO = new TestDAO();
                    testDAO.setDft_id(response.body().getDefectType().get(i).getDftId());
                    testDAO.setDft_number(response.body().getDefectType().get(i).getDftNumber());
                    testDAO.setDft_name(response.body().getDefectType().get(i).getDftName());
                    testDAO.setDft_description(response.body().getDefectType().get(i).getDftDescription());
                    mtestDAO.add(testDAO);
                }
            }

            @Override
            public void onFailure(Call<DfTy> call, Throwable t) {

            }
        });
        bLogin.setOnClickListener(onClickLoginListener);
    }
    private View.OnClickListener  onClickLoginListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(),DefectTy.class);
            intent.putExtra("data", mtestDAO);
            startActivity(intent);
        }
    };


}
