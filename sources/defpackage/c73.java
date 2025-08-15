package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: c73  reason: default package */
public final class c73 {
    public static final String i = Integer.toString(0, 36);
    public static final String j = Integer.toString(1, 36);
    public static final String k = Integer.toString(2, 36);
    public static final String l = Integer.toString(3, 36);
    public static final String m = Integer.toString(4, 36);
    public static final String n = Integer.toString(5, 36);
    public static final String o = Integer.toString(6, 36);
    public static final String p = Integer.toString(7, 36);
    public final y9d a;
    public final int b;
    public final int c;
    public final int d;
    public final Uri e;
    public final CharSequence f;
    public final Bundle g;
    public final boolean h;

    static {
        int i2 = oaf.a;
    }

    public c73(y9d y9d, int i2, int i3, int i4, Uri uri, CharSequence charSequence, Bundle bundle, boolean z) {
        this.a = y9d;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = uri;
        this.f = charSequence;
        this.g = new Bundle(bundle);
        this.h = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ww6, pw6] */
    public static ffc a(List list, z9d z9d, k3b k3b) {
        ? pw6 = new pw6(4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            c73 c73 = (c73) list.get(i2);
            if (c(c73, z9d, k3b)) {
                pw6.a(c73);
            } else {
                if (c73.h) {
                    Bundle bundle = new Bundle(c73.g);
                    c73 = new c73(c73.a, c73.b, c73.c, c73.d, c73.e, c73.f, bundle, false);
                }
                pw6.a(c73);
            }
        }
        return pw6.j();
    }

    public static c73 b(int i2, Bundle bundle) {
        int i3;
        Bundle bundle2 = bundle;
        Bundle bundle3 = bundle2.getBundle(i);
        y9d a2 = bundle3 == null ? null : y9d.a(bundle3);
        int i4 = bundle2.getInt(j, -1);
        boolean z = false;
        int i5 = bundle2.getInt(k, 0);
        CharSequence charSequence = bundle2.getCharSequence(l, "");
        Bundle bundle4 = bundle2.getBundle(m);
        boolean z2 = i2 < 3 || bundle2.getBoolean(n, true);
        Uri uri = (Uri) bundle2.getParcelable(o);
        int i6 = bundle2.getInt(p, 0);
        Bundle bundle5 = Bundle.EMPTY;
        if (a2 == null) {
            a2 = null;
        }
        if (i4 != -1) {
            fm9.e("sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.", a2 == null);
            i3 = i4;
        } else {
            i3 = -1;
        }
        Uri uri2 = uri != null ? uri : null;
        if (bundle4 == null) {
            bundle4 = Bundle.EMPTY;
        }
        Bundle bundle6 = new Bundle(bundle4);
        if ((a2 == null) != (i3 == -1)) {
            z = true;
        }
        fm9.j("Exactly one of sessionCommand and playerCommand should be set", z);
        return new c73(a2, i3, i6, i5, uri2, charSequence, bundle6, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r2.a.contains(r0) == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(defpackage.c73 r1, defpackage.z9d r2, defpackage.k3b r3) {
        /*
            y9d r0 = r1.a
            if (r0 == 0) goto L_0x000f
            r2.getClass()
            jx6 r2 = r2.a
            boolean r2 = r2.contains(r0)
            if (r2 != 0) goto L_0x001a
        L_0x000f:
            r2 = -1
            int r1 = r1.b
            if (r1 == r2) goto L_0x001c
            boolean r1 = r3.a(r1)
            if (r1 == 0) goto L_0x001c
        L_0x001a:
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c73.c(c73, z9d, k3b):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c73)) {
            return false;
        }
        c73 c73 = (c73) obj;
        return f46.B(this.a, c73.a) && this.b == c73.b && this.c == c73.c && this.d == c73.d && f46.B(this.e, c73.e) && TextUtils.equals(this.f, c73.f) && this.h == c73.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.f, Boolean.valueOf(this.h), this.e});
    }
}
