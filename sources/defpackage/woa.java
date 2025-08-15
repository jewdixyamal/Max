package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: woa  reason: default package */
public abstract class woa {
    public static final String a = a14.O("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z) {
        String str = "disabled";
        String str2 = a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            a14 u = a14.u();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : str);
            u.n(str2, sb.toString());
        } catch (Exception e) {
            a14 u2 = a14.u();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            if (z) {
                str = "enabled";
            }
            sb2.append(str);
            u2.o(str2, sb2.toString(), e);
        }
    }
}
