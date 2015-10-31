package zlpro.cn.googlepaly.ui.activiyt;

import android.os.Bundle;
import android.print.PageRange;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.Adapter;

import zlpro.cn.googlepaly.R;
import zlpro.cn.googlepaly.ui.Fragment.CategoryFragment;
import zlpro.cn.googlepaly.ui.Fragment.FragmentFactory;
import zlpro.cn.googlepaly.ui.activiyt.BaseActivity;
import zlpro.cn.googlepaly.ui.widget.PagerTab;
import zlpro.cn.googlepaly.utils.UIUtils;

/**
 * Created by H_lang on 2015/11/1.
 */
public class MainActivity extends BaseActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView()
    {
        PagerTab pagerTab = (PagerTab) findViewById(R.id.pagerTab);

        ViewPager viewPager = (ViewPager) findViewById(R.id.vp_main);
        PagerAdapter adapter = new MyAdatper(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

    }


    class MyAdatper extends FragmentPagerAdapter
    {
        private String[] mTabNames;

        public MyAdatper(FragmentManager fm)
        {
            super(fm);
            mTabNames = UIUtils.getStringArray(R.array.tab_names);
        }

        @Override
        public Fragment getItem(int position)
        {
            return FragmentFactory.createFragment(position);
        }

        @Override
        public int getCount()
        {
            return mTabNames.length;
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            return mTabNames[position];
        }
    }


}
