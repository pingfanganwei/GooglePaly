package zlpro.cn.googlepaly.ui.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zlpro.cn.googlepaly.R;

/**
 * Created by H_lang on 2015/11/1.
 */
public class BaseFragmet extends Fragment
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
       return inflater.inflate(R.layout.fragment_base,null);
    }
}
