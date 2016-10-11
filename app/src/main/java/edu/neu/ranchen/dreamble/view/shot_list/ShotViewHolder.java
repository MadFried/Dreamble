package edu.neu.ranchen.dreamble.view.shot_list;

import android.view.View;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;


import butterknife.BindView;
import edu.neu.ranchen.dreamble.view.base.BaseViewHolder;
import edu.neu.ranchen.dreamble.R;

class ShotViewHolder extends BaseViewHolder {

    @BindView(R.id.shot_clickable_cover) public View cover;
    @BindView(R.id.shot_like_count) public TextView likeCount;
    @BindView(R.id.shot_bucket_count) public TextView bucketCount;
    @BindView(R.id.shot_view_count) public TextView viewCount;
    @BindView(R.id.shot_image) public SimpleDraweeView image;
//    @BindView(R.id.shot_image) public ImageView image;

    public ShotViewHolder(View itemView) {
        super(itemView);
    }
}
