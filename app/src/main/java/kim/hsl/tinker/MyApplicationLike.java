package kim.hsl.tinker;

import android.app.Application;
import android.content.Intent;

import com.tencent.tinker.anno.DefaultLifeCycle;

public class MyApplicationLike extends com.tencent.tinker.loader.app.ApplicationLike {

    //@DefaultLifeCycle(application = )
    public MyApplicationLike(
            Application application,
            int tinkerFlags,
            boolean tinkerLoadVerifyFlag,
            long applicationStartElapsedTime,
            long applicationStartMillisTime,
            Intent tinkerResultIntent) {

        super(
                application,
                tinkerFlags,
                tinkerLoadVerifyFlag,
                applicationStartElapsedTime,
                applicationStartMillisTime,
                tinkerResultIntent);
    }
}
