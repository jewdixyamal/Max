package defpackage;

import java.io.File;

/* renamed from: ex0  reason: default package */
public abstract class ex0 implements Comparable {
    public final File X;
    public final long Y;
    public final String a;
    public final long b;
    public final long c;
    public final boolean o;

    public ex0(String str, long j, long j2, long j3, File file) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.o = file != null;
        this.X = file;
        this.Y = j3;
    }

    /* renamed from: a */
    public final int compareTo(ex0 ex0) {
        String str = ex0.a;
        String str2 = this.a;
        if (!str2.equals(str)) {
            return str2.compareTo(ex0.a);
        }
        int i = ((this.b - ex0.b) > 0 ? 1 : ((this.b - ex0.b) == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.b);
        sb.append(", ");
        return zr6.k(sb, this.c, "]");
    }
}
