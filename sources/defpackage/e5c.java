package defpackage;

import android.os.Bundle;

/* renamed from: e5c  reason: default package */
public abstract class e5c {
    public static final String a = Integer.toString(0, 36);

    static {
        int i = oaf.a;
    }

    public static e5c a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        boolean z = false;
        boolean z2 = true;
        if (i == 0) {
            String str2 = pj6.d;
            if (bundle.getInt(str, -1) != 0) {
                z2 = false;
            }
            fm9.f(z2);
            return bundle.getBoolean(pj6.d, false) ? new pj6(bundle.getBoolean(pj6.e, false)) : new pj6();
        } else if (i == 1) {
            String str3 = ysa.c;
            if (bundle.getInt(str, -1) == 1) {
                z = true;
            }
            fm9.f(z);
            float f = bundle.getFloat(ysa.c, -1.0f);
            return f == -1.0f ? new ysa() : new ysa(f);
        } else if (i == 2) {
            String str4 = ayd.d;
            if (bundle.getInt(str, -1) == 2) {
                z = true;
            }
            fm9.f(z);
            int i2 = bundle.getInt(ayd.d, 5);
            float f2 = bundle.getFloat(ayd.e, -1.0f);
            return f2 == -1.0f ? new ayd(i2) : new ayd(i2, f2);
        } else if (i == 3) {
            String str5 = lte.d;
            if (bundle.getInt(str, -1) != 3) {
                z2 = false;
            }
            fm9.f(z2);
            return bundle.getBoolean(lte.d, false) ? new lte(bundle.getBoolean(lte.e, false)) : new lte();
        } else {
            throw new IllegalArgumentException(zr6.h(i, "Unknown RatingType: "));
        }
    }

    public abstract boolean b();

    public abstract Bundle c();
}
