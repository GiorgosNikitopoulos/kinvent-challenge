package com.example.kinvent_challenge;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class SwipeAdapter extends FragmentStatePagerAdapter {
    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Chef chef = new Chef();
        switch(position) {
            case 0:
                //ShopPage shopPage = new ShopPage();
                //return shopPage;
                return ShopPage.newInstance(chef);
            case 1:
                //EmptyPage emptyPage = new EmptyPage();
                //return emptyPage;
                return EmptyPage.newInstance(chef);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
