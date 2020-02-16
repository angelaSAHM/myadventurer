package com.mylittleadventurer.mylittleadventurer.adapter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.mylittleadventurer.mylittleadventurer.R;

/**
 * Created by AngelaPinaroc on 14/06/16.
 */
public class ImageSwipeAdapter extends PagerAdapter {

    private ImageView mImageViewRight, mImageViewLeft;

    private int [] image_resources = {R.drawable.story1_girl_page5, R.drawable.story2_boy_page7};

    private Context ctx;
    private LayoutInflater mLayoutInflater;
    private AssetManager mAssets;

    public ImageSwipeAdapter(Context ctx) {
        this.ctx = ctx;
    }


    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(FrameLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {




        mLayoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = mLayoutInflater.inflate(R.layout.layout_stories, container, false);



        Typeface titleTypeface = Typeface.createFromAsset(getActivity().getAssets(),"Quicksand-Bold.otf");
        Typeface titleSubTypeface = Typeface.createFromAsset(getActivity().getAssets(),"LobsterTwo-Bold.otf");

        ImageView imageView = (ImageView) item_view.findViewById(R.id.imgVwStoryCover);
        TextView textView = (TextView) item_view.findViewById(R.id.txtVwStoryTitle);
        textView.setTypeface(titleTypeface);

        TextView textViewMainTitle = (TextView) item_view.findViewById(R.id.txtVwMainTitle);
        textViewMainTitle.setTypeface(titleSubTypeface);
        imageView.setImageResource(image_resources[position]);

        mImageViewLeft = (ImageView) item_view.findViewById(R.id.imgVwLeft);
        mImageViewRight = (ImageView) item_view.findViewById(R.id.imgVwRight);



        if (position == 0) {
            textView.setText("A Time Travel Adventure");
            textViewMainTitle.setText(R.string.title_story1);
            mImageViewLeft.setVisibility(View.GONE);

        }

        if (position == 1) {
            textView.setText("A Forest Travel Adventure");
            textViewMainTitle.setText(R.string.title_story2);
            mImageViewRight.setVisibility(View.GONE);

        }

        container.addView(item_view);


        return item_view;
    }




    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((FrameLayout) object);
    }


    public Context getActivity() {
        return ctx;
    }
}
