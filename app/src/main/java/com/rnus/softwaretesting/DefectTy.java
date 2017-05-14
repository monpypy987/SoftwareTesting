package com.rnus.softwaretesting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rnus.softwaretesting.Adapter.DefectAdapter;
import com.rnus.softwaretesting.Service.TestDAO;

import java.util.ArrayList;

public class DefectTy extends AppCompatActivity {
    private ArrayList<TestDAO> mtestDAO;
    private Intent in;
    private RecyclerView Report;
    private RecyclerView.LayoutManager mLayoutParam;
    private DefectAdapter mDefectAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defect_ty);
        in = getIntent();
        mtestDAO = new ArrayList<>();
        mtestDAO = in.getParcelableArrayListExtra("data");

       /* for (int i = 0; i < mtestDAO.size(); i++) {
            Log.d("test", "" + mtestDAO.get(i).getDf_id());
        }*/

        Report = (RecyclerView) findViewById(R.id.Report);
        //LineChart lineChart = (LineChart) findViewById(R.id.chart_id);

        Report.setHasFixedSize(true);
        mLayoutParam = new LinearLayoutManager(this);
        Report.setLayoutManager(mLayoutParam);

        mDefectAdapter = new DefectAdapter(DefectTy.this,mtestDAO);
        Report.setAdapter(mDefectAdapter);
    }
}
