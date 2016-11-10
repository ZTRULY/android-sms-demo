package com.avos.sms;

import android.app.Application;
import com.avos.avoscloud.AVOSCloud;

/**
 * Created by lzw on 14-8-21.
 */
public class App extends Application {
  public void onCreate() {
    // 请用你的AppId，AppKey。并在管理台启用手机号码短信验证
    AVOSCloud.initialize(this, "1ha2c8pykvoylq5xvngpfjhn4f7dcrczw0r3ui0f8ycbrc25",
        "ip1ld5m0uc2f9phnknzw3jak014cx796tid24gq89vaw7w15");
  }
}
