package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Process;
import org.apache.http.protocol.HTTP;

/* renamed from: o37  reason: default package */
public final class o37 {
    public static final String a = new Object().getClass().getName();

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[EDGE_INSN: B:20:0x0043->B:13:0x0043 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent a(android.content.Context r5, android.content.Intent r6) {
        /*
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            r0 = 0
            java.util.List r5 = r5.queryIntentActivities(r6, r0)
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0011
            return r1
        L_0x0011:
            android.content.Intent r0 = android.content.Intent.createChooser(r6, r1)
            java.util.Iterator r5 = r5.iterator()
        L_0x0019:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r5.next()
            r3 = r2
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            java.lang.String r4 = "org.telegram.messenger"
            boolean r4 = defpackage.tpa.f(r3, r4)
            if (r4 != 0) goto L_0x0042
            java.lang.String r4 = "org.telegram.messenger.beta"
            boolean r4 = defpackage.tpa.f(r3, r4)
            if (r4 != 0) goto L_0x0042
            java.lang.String r4 = "org.telegram.messenger.web"
            boolean r3 = defpackage.tpa.f(r3, r4)
            if (r3 == 0) goto L_0x0019
        L_0x0042:
            r1 = r2
        L_0x0043:
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            if (r1 == 0) goto L_0x007f
            java.lang.Object r5 = r6.clone()
            android.content.Intent r5 = (android.content.Intent) r5
            android.content.pm.ActivityInfo r6 = r1.activityInfo
            java.lang.String r6 = r6.packageName
            r5.setPackage(r6)
            android.content.ComponentName r6 = new android.content.ComponentName
            android.content.pm.ActivityInfo r2 = r1.activityInfo
            java.lang.String r3 = r2.packageName
            java.lang.String r2 = r2.name
            r6.<init>(r3, r2)
            r5.setComponent(r6)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r5.addFlags(r6)
            android.content.pm.LabeledIntent r6 = new android.content.pm.LabeledIntent
            android.content.pm.ActivityInfo r2 = r1.activityInfo
            java.lang.String r2 = r2.packageName
            int r3 = r1.labelRes
            int r1 = r1.icon
            r6.<init>(r5, r2, r3, r1)
            android.content.pm.LabeledIntent[] r5 = new android.content.pm.LabeledIntent[]{r6}
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            java.lang.String r6 = "android.intent.extra.INITIAL_INTENTS"
            r0.putExtra(r6, r5)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o37.a(android.content.Context, android.content.Intent):android.content.Intent");
    }

    public static Intent b(Context context, boolean z) {
        if (!z) {
            return new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT", Uri.fromParts("package", context.getPackageName(), (String) null));
        }
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setPackage("com.miui.securitycenter");
        intent.putExtra("extra_package_uid", Process.myUid());
        intent.putExtra("extra_pkgname", context.getPackageName());
        return intent;
    }

    public static void c(Context context, Uri uri, String str) {
        Object obj;
        try {
            die die = new die(context, 13);
            ((Intent) die.b).setType(str);
            die.Q(uri);
            die.S();
            obj = e5f.a;
        } catch (Throwable th) {
            obj = new njc(th);
        }
        Throwable a2 = pjc.a(obj);
        if (a2 != null) {
            hm9.p(a, "shareMedia: failed", a2);
        }
    }

    public static void d(Context context, CharSequence charSequence, Uri uri) {
        Object obj;
        try {
            die die = new die(context, 13);
            ((Intent) die.b).setType(HTTP.PLAIN_TEXT_TYPE);
            die.R(charSequence);
            die.Q(uri);
            Intent a2 = a(context, die.w());
            if (a2 != null) {
                context.startActivity(a2);
                obj = e5f.a;
            } else {
                obj = null;
            }
        } catch (Throwable th) {
            obj = new njc(th);
        }
        Throwable a3 = pjc.a(obj);
        if (a3 != null) {
            hm9.p(a, "showInviteDialog error", a3);
        }
    }
}
