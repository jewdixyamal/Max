package defpackage;

import android.os.Bundle;

/* renamed from: hb8  reason: default package */
public final class hb8 {
    public static final hb8 f = new fb8().a();
    public static final String g = Integer.toString(0, 36);
    public static final String h = Integer.toString(1, 36);
    public static final String i = Integer.toString(2, 36);
    public static final String j = Integer.toString(3, 36);
    public static final String k = Integer.toString(4, 36);
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        int i2 = oaf.a;
    }

    public hb8(fb8 fb8) {
        long j2 = fb8.a;
        long j3 = fb8.b;
        long j4 = fb8.c;
        float f2 = fb8.d;
        float f3 = fb8.e;
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = f2;
        this.e = f3;
    }

    public static hb8 b(Bundle bundle) {
        fb8 fb8 = new fb8();
        hb8 hb8 = f;
        fb8.a = bundle.getLong(g, hb8.a);
        fb8.b = bundle.getLong(h, hb8.b);
        fb8.c = bundle.getLong(i, hb8.c);
        fb8.d = bundle.getFloat(j, hb8.d);
        fb8.e = bundle.getFloat(k, hb8.e);
        return new hb8(fb8);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, fb8] */
    public final fb8 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        hb8 hb8 = f;
        long j2 = hb8.a;
        long j3 = this.a;
        if (j3 != j2) {
            bundle.putLong(g, j3);
        }
        long j4 = hb8.b;
        long j5 = this.b;
        if (j5 != j4) {
            bundle.putLong(h, j5);
        }
        long j6 = hb8.c;
        long j7 = this.c;
        if (j7 != j6) {
            bundle.putLong(i, j7);
        }
        float f2 = hb8.d;
        float f3 = this.d;
        if (f3 != f2) {
            bundle.putFloat(j, f3);
        }
        float f4 = hb8.e;
        float f5 = this.e;
        if (f5 != f4) {
            bundle.putFloat(k, f5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb8)) {
            return false;
        }
        hb8 hb8 = (hb8) obj;
        return this.a == hb8.a && this.b == hb8.b && this.c == hb8.c && this.d == hb8.d && this.e == hb8.e;
    }

    public final int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        long j4 = this.c;
        int i2 = ((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31;
        float f2 = this.d;
        int i3 = 0;
        int floatToIntBits = (i2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.e;
        if (f3 != 0.0f) {
            i3 = Float.floatToIntBits(f3);
        }
        return floatToIntBits + i3;
    }
}
