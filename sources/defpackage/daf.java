package defpackage;

import android.content.Context;
import android.os.UserManager;

/* renamed from: daf  reason: default package */
public abstract class daf {
    public static boolean a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
