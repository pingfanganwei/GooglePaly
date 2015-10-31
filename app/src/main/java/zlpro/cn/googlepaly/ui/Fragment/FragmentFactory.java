package zlpro.cn.googlepaly.ui.Fragment;

import java.util.HashMap;

/**
 * 生成碎片的工厂
 * Created by H_lang on 2015/11/1.
 */
public class FragmentFactory
{
    private static HashMap<Integer,BaseFragmet> mFargment = new HashMap<Integer,BaseFragmet>();

    public static BaseFragmet createFragment(int position)
    {
        BaseFragmet fragment = mFargment.get(position);

        if (fragment == null)
        {
            switch (position) {
                case 0:
                    fragment = new HomeFragment();
                    break;
                case 1:
                    fragment = new AppFragment();
                    break;
                case 2:
                    fragment = new GameFragment();
                    break;
                case 3:
                    fragment = new SubjectFragment();
                    break;
                case 4:
                    fragment = new RecommendFragment();
                    break;
                case 5:
                    fragment = new CategoryFragment();
                    break;
                case 6:
                    fragment = new HotFragment();
                    break;
                default:
                    break;
            }
            mFargment.put(position,fragment);
        }
        return fragment;
    }
}
