package com.colinknecht.recyclerviewtutorial;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by colinknecht on 6/23/17.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<ListViewRowHolder> {

    private List<ListItems> mListItemsList;
    private Context mContext;
    //ImageLoader from volley.jar?
    private int focusedItem = 0;

    public MyRecyclerAdapter(Context context, List<ListItems> itemsList) {
        this.mListItemsList = itemsList;
        this.mContext = context;
    }


    @Override
    public ListViewRowHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row,null);
        ListViewRowHolder rowHolder = new ListViewRowHolder(v);

        rowHolder.mRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
        return null;
    }

    @Override
    public void onBindViewHolder(ListViewRowHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
