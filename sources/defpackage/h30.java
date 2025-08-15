package defpackage;

import android.media.AudioAttributes;
import android.os.Bundle;

/* renamed from: h30  reason: default package */
public final class h30 {
    public static final h30 g = new h30(0, 0, 1, 1, 0);
    public static final String h = Integer.toString(0, 36);
    public static final String i = Integer.toString(1, 36);
    public static final String j = Integer.toString(2, 36);
    public static final String k = Integer.toString(3, 36);
    public static final String l = Integer.toString(4, 36);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public gaa f;

    static {
        int i2 = oaf.a;
    }

    public h30(int i2, int i3, int i4, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
    }

    public static h30 a(Bundle bundle) {
        String str = h;
        int i2 = 0;
        int i3 = bundle.containsKey(str) ? bundle.getInt(str) : 0;
        String str2 = i;
        int i4 = bundle.containsKey(str2) ? bundle.getInt(str2) : 0;
        String str3 = j;
        int i5 = bundle.containsKey(str3) ? bundle.getInt(str3) : 1;
        String str4 = k;
        int i6 = bundle.containsKey(str4) ? bundle.getInt(str4) : 1;
        String str5 = l;
        if (bundle.containsKey(str5)) {
            i2 = bundle.getInt(str5);
        }
        return new h30(i3, i4, i5, i6, i2);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [gaa, java.lang.Object] */
    public final gaa b() {
        if (this.f == null) {
            ? obj = new Object();
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
            int i2 = oaf.a;
            if (i2 >= 29) {
                d30.a(usage, this.d);
            }
            if (i2 >= 32) {
                f30.a(usage, this.e);
            }
            obj.a = usage.build();
            this.f = obj;
        }
        return this.f;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(h, this.a);
        bundle.putInt(i, this.b);
        bundle.putInt(j, this.c);
        bundle.putInt(k, this.d);
        bundle.putInt(l, this.e);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h30.class != obj.getClass()) {
            return false;
        }
        h30 h30 = (h30) obj;
        return this.a == h30.a && this.b == h30.b && this.c == h30.c && this.d == h30.d && this.e == h30.e;
    }

    public final int hashCode() {
        return ((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }
}
