package defpackage;

import android.content.Context;

/* renamed from: ba0  reason: default package */
public final class ba0 extends hz3 {
    public final Context a;
    public final d9f b;
    public final d9f c;
    public final String d;

    public ba0(Context context, d9f d9f, d9f d9f2, String str) {
        if (context != null) {
            this.a = context;
            if (d9f != null) {
                this.b = d9f;
                if (d9f2 != null) {
                    this.c = d9f2;
                    if (str != null) {
                        this.d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hz3)) {
            return false;
        }
        hz3 hz3 = (hz3) obj;
        if (this.a.equals(((ba0) hz3).a)) {
            ba0 ba0 = (ba0) hz3;
            if (this.b.equals(ba0.b) && this.c.equals(ba0.c) && this.d.equals(ba0.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return zr6.l(sb, this.d, "}");
    }
}
