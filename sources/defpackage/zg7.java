package defpackage;

import android.app.Activity;
import android.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.util.LinkedHashMap;

/* renamed from: zg7  reason: default package */
public abstract class zg7 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final wg7 a(Activity activity, boolean z) {
        wg7 wg7;
        wg7 wg72 = (wg7) a.get(activity);
        if (wg72 == null) {
            wg72 = null;
            if (!z || !(activity instanceof b)) {
                Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("LifecycleHandler");
                if (findFragmentByTag instanceof wg7) {
                    wg7 = (wg7) findFragmentByTag;
                }
            } else {
                a E = ((b) activity).S().E("LifecycleHandler");
                if (E instanceof wg7) {
                    wg7 = (wg7) E;
                }
            }
            wg72 = wg7;
        }
        if (wg72 != null) {
            wg72.H(activity);
        }
        return wg72;
    }
}
