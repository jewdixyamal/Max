package defpackage;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: fp  reason: default package */
public abstract class fp {
    public static <T> T a(Context context, Class<T> cls) {
        return context.getSystemService(cls);
    }

    public static int b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    public static int c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    public static String d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
