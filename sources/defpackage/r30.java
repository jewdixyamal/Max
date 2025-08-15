package defpackage;

import java.util.Set;

/* renamed from: r30  reason: default package */
public final class r30 {
    public static final r30 d;
    public final int a;
    public final int b;
    public final jx6 c;

    /* JADX WARNING: type inference failed for: r1v1, types: [ix6, pw6] */
    static {
        r30 r30;
        if (oaf.a >= 33) {
            ? pw6 = new pw6(4);
            for (int i = 1; i <= 10; i++) {
                pw6.a(Integer.valueOf(oaf.t(i)));
            }
            r30 = new r30(2, (Set) pw6.l());
        } else {
            r30 = new r30(2, 10);
        }
        d = r30;
    }

    public r30(int i, Set set) {
        this.a = i;
        jx6 j = jx6.j(set);
        this.c = j;
        m5f g = j.iterator();
        int i2 = 0;
        while (g.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) g.next()).intValue()));
        }
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r30)) {
            return false;
        }
        r30 r30 = (r30) obj;
        return this.a == r30.a && this.b == r30.b && oaf.a(this.c, r30.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        jx6 jx6 = this.c;
        return i + (jx6 == null ? 0 : jx6.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public r30(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
