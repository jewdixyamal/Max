package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: qad  reason: default package */
public final class qad {
    public static final p3b k;
    public static final qad l;
    public static final String m = Integer.toString(0, 36);
    public static final String n = Integer.toString(1, 36);
    public static final String o = Integer.toString(2, 36);
    public static final String p = Integer.toString(3, 36);
    public static final String q = Integer.toString(4, 36);
    public static final String r = Integer.toString(5, 36);
    public static final String s = Integer.toString(6, 36);
    public static final String t = Integer.toString(7, 36);
    public static final String u = Integer.toString(8, 36);
    public static final String v = Integer.toString(9, 36);
    public final p3b a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    static {
        p3b p3b = r0;
        p3b p3b2 = new p3b((Object) null, 0, (tb8) null, (Object) null, 0, 0, 0, -1, -1);
        k = p3b2;
        l = new qad(p3b, false, -9223372036854775807L, -9223372036854775807L, 0, 0, 0, -9223372036854775807L, -9223372036854775807L, 0);
        int i2 = oaf.a;
    }

    public qad(p3b p3b, boolean z, long j2, long j3, long j4, int i2, long j5, long j6, long j7, long j8) {
        p3b p3b2 = p3b;
        boolean z2 = z;
        fm9.f(z2 == (p3b2.h != -1));
        this.a = p3b2;
        this.b = z2;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = i2;
        this.g = j5;
        this.h = j6;
        this.i = j7;
        this.j = j8;
    }

    public static qad b(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundle3 = bundle2.getBundle(m);
        return new qad(bundle3 == null ? k : p3b.c(bundle3), bundle2.getBoolean(n, false), bundle2.getLong(o, -9223372036854775807L), bundle2.getLong(p, -9223372036854775807L), bundle2.getLong(q, 0), bundle2.getInt(r, 0), bundle2.getLong(s, 0), bundle2.getLong(t, -9223372036854775807L), bundle2.getLong(u, -9223372036854775807L), bundle2.getLong(v, 0));
    }

    public final qad a(boolean z, boolean z2) {
        boolean z3 = z;
        boolean z4 = z2;
        if (z3 && z4) {
            return this;
        }
        p3b b2 = this.a.b(z3, z4);
        int i2 = 0;
        boolean z5 = z3 && this.b;
        long j2 = z3 ? this.d : -9223372036854775807L;
        long j3 = z3 ? this.e : 0;
        if (z3) {
            i2 = this.f;
        }
        return new qad(b2, z5, this.c, j2, j3, i2, z3 ? this.g : 0, z3 ? this.h : -9223372036854775807L, z3 ? this.i : -9223372036854775807L, z3 ? this.j : 0);
    }

    public final Bundle c(int i2) {
        Bundle bundle = new Bundle();
        p3b p3b = this.a;
        if (i2 < 3 || !k.a(p3b)) {
            bundle.putBundle(m, p3b.d(i2));
        }
        boolean z = this.b;
        if (z) {
            bundle.putBoolean(n, z);
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            bundle.putLong(o, j2);
        }
        long j3 = this.d;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(p, j3);
        }
        long j4 = this.e;
        if (i2 < 3 || j4 != 0) {
            bundle.putLong(q, j4);
        }
        int i3 = this.f;
        if (i3 != 0) {
            bundle.putInt(r, i3);
        }
        long j5 = this.g;
        if (j5 != 0) {
            bundle.putLong(s, j5);
        }
        long j6 = this.h;
        if (j6 != -9223372036854775807L) {
            bundle.putLong(t, j6);
        }
        long j7 = this.i;
        if (j7 != -9223372036854775807L) {
            bundle.putLong(u, j7);
        }
        long j8 = this.j;
        if (i2 < 3 || j8 != 0) {
            bundle.putLong(v, j8);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qad.class != obj.getClass()) {
            return false;
        }
        qad qad = (qad) obj;
        return this.c == qad.c && this.a.equals(qad.a) && this.b == qad.b && this.d == qad.d && this.e == qad.e && this.f == qad.f && this.g == qad.g && this.h == qad.h && this.i == qad.i && this.j == qad.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        p3b p3b = this.a;
        sb.append(p3b.b);
        sb.append(", periodIndex=");
        sb.append(p3b.e);
        sb.append(", positionMs=");
        sb.append(p3b.f);
        sb.append(", contentPositionMs=");
        sb.append(p3b.g);
        sb.append(", adGroupIndex=");
        sb.append(p3b.h);
        sb.append(", adIndexInAdGroup=");
        sb.append(p3b.i);
        sb.append("}, isPlayingAd=");
        sb.append(this.b);
        sb.append(", eventTimeMs=");
        sb.append(this.c);
        sb.append(", durationMs=");
        sb.append(this.d);
        sb.append(", bufferedPositionMs=");
        sb.append(this.e);
        sb.append(", bufferedPercentage=");
        sb.append(this.f);
        sb.append(", totalBufferedDurationMs=");
        sb.append(this.g);
        sb.append(", currentLiveOffsetMs=");
        sb.append(this.h);
        sb.append(", contentDurationMs=");
        sb.append(this.i);
        sb.append(", contentBufferedPositionMs=");
        return zr6.k(sb, this.j, "}");
    }
}
