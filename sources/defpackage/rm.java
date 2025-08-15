package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: rm  reason: default package */
public abstract class rm {
    public static Boolean X = null;
    public static boolean Y = false;
    public static final xs Z = new xs(0);
    public static final qm a = new qm(new ok4(4));
    public static final int b = -100;
    public static yq7 c = null;
    public static yq7 o = null;
    public static final Object s0 = new Object();
    public static final Object t0 = new Object();

    public static boolean b(Context context) {
        if (X == null) {
            try {
                int i = ap.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, ap.class), zo.a() | 128).metaData;
                if (bundle != null) {
                    X = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                X = Boolean.FALSE;
            }
        }
        return X.booleanValue();
    }

    public static void e(rm rmVar) {
        synchronized (s0) {
            try {
                xs xsVar = Z;
                xsVar.getClass();
                qs qsVar = new qs(xsVar);
                while (qsVar.hasNext()) {
                    rm rmVar2 = (rm) ((WeakReference) qsVar.next()).get();
                    if (rmVar2 == rmVar || rmVar2 == null) {
                        qsVar.remove();
                    }
                }
            } finally {
            }
        }
    }

    public abstract void a();

    public abstract void c();

    public abstract void d();

    public abstract boolean f(int i);

    public abstract void g(int i);

    public abstract void h(View view);

    public abstract void i(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void j(CharSequence charSequence);
}
