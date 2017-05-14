package com.rnus.softwaretesting.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rnus.softwaretesting.R;
import com.rnus.softwaretesting.Service.TestDAO;

import java.util.ArrayList;

/**
 * Created by RNUS on 7/5/2017.
 */

public class DefectAdapter extends RecyclerView.Adapter<DefectAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<TestDAO> mTestDao;

    public DefectAdapter(Context context, ArrayList<TestDAO> mTestDao) {
        this.mContext = context;
        this.mTestDao = mTestDao;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_list_defect, parent, false);
        ViewHolder holder = new DefectAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.df_1.setText("" + (position + 1));
        //holder.df_1.setText(mTestDao.get(position).getDft_id());
        //holder.df_1.setText(mTestDao.get(position).getDft_number());
        //holder.df_3.setText(mTestDao.get(position).getDft_name());
        holder.df_2.setText(mTestDao.get(position).getDft_description());
    }

    @Override
    public int getItemCount() {
        return mTestDao.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView df_1;
        private TextView df_2;
        private TextView df_3;
        private TextView df_4;
        public ViewHolder(View itemView) {
            super(itemView);
            df_1 = (TextView) itemView.findViewById(R.id.df_1);
            df_2 = (TextView) itemView.findViewById(R.id.df_2);
            df_3 = (TextView) itemView.findViewById(R.id.df_3);
            df_4 = (TextView) itemView.findViewById(R.id.df_4);
        }
    }
}
