package defpackage;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: lig  reason: default package */
public abstract class lig {
    public static final HashMap a = new HashMap();

    static {
        new HashSet(Arrays.asList(new String[]{"app_update", "review"}));
        new HashSet(Arrays.asList(new String[]{"native", "unity"}));
        wg0.h("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("PlayCoreVersion");
    }
}
