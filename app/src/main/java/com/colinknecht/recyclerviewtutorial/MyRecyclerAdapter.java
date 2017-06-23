package com.colinknecht.recyclerviewtutorial;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by colinknecht on 6/23/17.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<ListRowViewHolder> {

    private List<ListItems> mListItemsList;
    private Context mContext;
    //ImageLoader from volley.jar?
    private int focusedItem = 0;

    public MyRecyclerAdapter(Context context, List<ListItems> itemsList) {
        this.mListItemsList = itemsList;
        this.mContext = context;
    }


    @Override
    public ListRowViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_row,null);
        ListRowViewHolder rowHolder = new ListRowViewHolder(v);

        rowHolder.mRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView redditUrl = (TextView) v.findViewById(R.id.tv_URL);
                String postUrl = redditUrl.getText().toString();
                Intent intent = new Intent(mContext, WebActivity.class);
                intent.putExtra("url",postUrl);
                mContext.startActivity(intent);
            }
        });
        return rowHolder;
    }

    @Override
    public void onBindViewHolder(ListRowViewHolder listRowViewHolder, int position) {
        ListItems listItems = mListItemsList.get(position);

        listRowViewHolder.itemView.setSelected(focusedItem == position);

        listRowViewHolder.getLayoutPosition();
//         mImageLoader = MySingleton.getInstance(mContext).getImageLoader();

//        listRowViewHolder.thumbnail.setImageURI(listItems.getThumbnail(), mImageLoader);
//        listRowViewHolder.thumbnail.setDefaultImageResId(R.drawable.reddit_placeholder);

        listRowViewHolder.title.setText(Html.fromHtml(listItems.getTitle()));
        listRowViewHolder.subReddit.setText(Html.fromHtml(listItems.getSubreddit()));
        listRowViewHolder.author.setText(Html.fromHtml(listItems.getAuthor()));
        listRowViewHolder.url.setText(Html.fromHtml(listItems.getUrl()));

    }

    public void clearAdapter() {
        mListItemsList.clear();
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return (null != mListItemsList ? mListItemsList.size() : 0);
    }

}
