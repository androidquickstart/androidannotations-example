package com.androidkickstarter.app;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsItem;
import org.androidannotations.annotations.OptionsMenu;
import org.androidannotations.annotations.WindowFeature;
import org.androidannotations.annotations.res.StringRes;

import android.app.Activity;
import android.view.Window;
import android.widget.Toast;

/**
 * 集成 androidannotations 的使用示例.
 * 基础代码通过 [AndroidKickstartR](http://androidkickstartr.com/) 生成.
 * 
 * 更多注解请参考: https://github.com/excilys/androidannotations/wiki
 * 
 * @author Sun
 * @version MainActivity.java 2014-5-5 10:10:12
 */
@EActivity(R.layout.activity_main)
@OptionsMenu(R.menu.activity_main)
@WindowFeature(Window.FEATURE_NO_TITLE)
public class MainActivity extends Activity {
    @StringRes
    String helloWorld;
    @StringRes
    String menuSettings;

    @AfterViews
    void afterViews() {
    }

    @Click
    void testButton() {
        Toast.makeText(this, this.helloWorld, Toast.LENGTH_LONG).show();
    }

    @OptionsItem
    void menuSettings() {
        Toast.makeText(this, this.menuSettings, Toast.LENGTH_LONG).show();
    }
}
