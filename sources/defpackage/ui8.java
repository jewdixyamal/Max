package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;

/* renamed from: ui8  reason: default package */
public final class ui8 {
    public Context a;
    public final ContentResolver b;

    static {
        boolean z = xi8.b;
    }

    public ui8(Context context) {
        this.a = context;
        this.b = context.getContentResolver();
        this.a = context;
    }

    public final boolean a(ti8 ti8, String str) {
        int i = ti8.b;
        return i < 0 ? this.a.getPackageManager().checkPermission(str, ti8.a) == 0 : this.a.checkPermission(str, i, ti8.c) == 0;
    }

    public boolean b(ti8 ti8) {
        if (this.a.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", ti8.b, ti8.c) != 0) {
            try {
                if (this.a.getPackageManager().getApplicationInfo(ti8.a, 0) == null) {
                    return false;
                }
                if (!a(ti8, "android.permission.STATUS_BAR_SERVICE") && !a(ti8, "android.permission.MEDIA_CONTENT_CONTROL") && ti8.c != 1000) {
                    String string = Settings.Secure.getString(this.b, "enabled_notification_listeners");
                    if (string == null) {
                        return false;
                    }
                    String[] split = string.split(":");
                    int i = 0;
                    while (i < split.length) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(split[i]);
                        if (unflattenFromString == null || !unflattenFromString.getPackageName().equals(ti8.a)) {
                            i++;
                        }
                    }
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
        return true;
    }
}
