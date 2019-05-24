package com.selvi.app;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.selvi.libselvi.model.NewsItem;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by selv on 07/05/2019.
 */
public class AdapterMainActivity extends RecyclerView.Adapter<AdapterMainActivity.CustomViewHolder> {

    private List<NewsItem> dataList;
    private Context context;

    public AdapterMainActivity(Context context,List<NewsItem> dataList){
        this.context = context;
        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        public ImageView ivImage;
        public TextView tvTitle, tvAuthor, tvDate, tvDesc;

        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            ivImage = itemView.findViewById(R.id.ivImage);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDesc = itemView.findViewById(R.id.tvDesc);
            tvAuthor = itemView.findViewById(R.id.tvAuthor);
            tvDate = itemView.findViewById(R.id.tvDate);
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.news_item, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.tvTitle.setText(dataList.get(position).getTitle());
        holder.tvAuthor.setText(dataList.get(position).getAuthor());

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            holder.tvDesc.setText(Html.fromHtml(dataList.get(position).getShortDescription(), Html.FROM_HTML_MODE_LEGACY));
        } else {
            holder.tvDesc.setText(Html.fromHtml(dataList.get(position).getShortDescription()));
        }


        if (dataList.get(position).getImageUrl() != null) {
            if (dataList.get(position).getImageUrl().length() > 0) {
                Picasso.with(context).load(dataList.get(position).getImageUrl()).into(holder.ivImage);
            }
        }

        if (dataList.get(position).getCreatedDate() != null && !dataList.get(position).getCreatedDate().equals("0000-00-00 00:00:00") && !dataList.get(position).getCreatedDate().isEmpty()) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                Date date = formatter.parse(dataList.get(position).getCreatedDate());
                SimpleDateFormat dateFormat2 = new SimpleDateFormat("EEEE, dd LLLL yyyy HH:mm", new Locale("id", "ID"));

                String temp = dateFormat2.format(date);

                holder.tvDate.setText(temp + " WIB");
            } catch (Exception e) {
            }
        } else holder.tvDate.setText("");

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}