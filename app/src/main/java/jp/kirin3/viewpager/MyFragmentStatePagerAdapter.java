package jp.kirin3.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.TextView;

public class MyFragmentStatePagerAdapter extends FragmentStatePagerAdapter {


    public MyFragmentStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch(i){
            case 0:

                return new Fragment0();
            case 1:
                return new Fragment1();
            default:
                return new Fragment2();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }
}