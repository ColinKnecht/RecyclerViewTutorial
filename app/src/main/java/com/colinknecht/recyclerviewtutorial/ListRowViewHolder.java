package com.colinknecht.recyclerviewtutorial;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by colinknecht on 6/23/17.
 */

public class ListRowViewHolder extends RecyclerView.ViewHolder {

    protected ImageView thumbnail;
    protected TextView title;
    protected TextView subReddit;
    protected TextView author;
    protected TextView url;
    protected RelativeLayout mRelativeLayout;

    public ListRowViewHolder(View view) {
        super(view);
        this.thumbnail = (ImageView) view.findViewById(R.id.iv_thumbnail);
        this.title = (TextView) view.findViewById(R.id.tv_title);
        this.subReddit = (TextView) view.findViewById(R.id.tv_subreddit);
        this.author = (TextView) view.findViewById(R.id.tv_author);
        this.url = (TextView) view.findViewById(R.id.tv_URL);
        this.mRelativeLayout = (RelativeLayout) view.findViewById(R.id.relative_layout);

        view.setClickable(true);

    }

}
