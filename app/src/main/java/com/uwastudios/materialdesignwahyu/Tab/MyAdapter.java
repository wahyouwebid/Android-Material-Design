package com.uwastudios.materialdesignwahyu.Tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ImageSpan;

import com.uwastudios.materialdesignwahyu.CallFragment;
import com.uwastudios.materialdesignwahyu.ChatFragment;
import com.uwastudios.materialdesignwahyu.KontakFragment;
import com.uwastudios.materialdesignwahyu.R;

/**
 * Created by Ujang Wahyu on 18/08/2016.
 */
public class MyAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private String[] titles ={"LISTENING","RADING","WRITTNG"};
    int[] icon = new int[]{R.mipmap.ic_chat_white_48dp,R.mipmap.ic_contacts_white_48dp,R.mipmap.ic_call_white_48dp};
    private int heightIcon;


    public MyAdapter(FragmentManager fm, Context c){
        super(fm);
        mContext = c;
        double scale = c.getResources().getDisplayMetrics().density;
        heightIcon=(int)(24*scale+0.5f);
    }
    @Override
    public Fragment getItem(int position) {
        Fragment frag= null;

        if(position ==0){
            frag = new ChatFragment();
        }else if(position == 1){
            frag = new KontakFragment();
        }else if(position == 2){
            frag = new CallFragment();
        }

        Bundle b = new Bundle();
        b.putInt("position", position);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    public CharSequence getPageTitle(int position){
        Drawable d = mContext.getResources().getDrawable(icon[position]);
        d.setBounds(0,0,heightIcon,heightIcon);
        ImageSpan is = new ImageSpan(d);

        SpannableString sp = new SpannableString(" ");
        sp.setSpan(is,0,sp.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        return sp;
    }

}
