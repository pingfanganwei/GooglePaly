package zlpro.cn.googlepaly.global;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * Created by H_lang on 2015/10/31.
 */
public class BaseApplication extends Application {

    private static Context context;
    private static Handler handler;
    private static int mainThreadId;

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();
        handler = new Handler();
        //获取主线程
        mainThreadId = android.os.Process.myUid();
    }

    public static Context getContext() {
        return context;
    }

    public static Handler getHandler() {
        return handler;
    }

    public static int getMainThreadId() {
        return mainThreadId;
    }
}
