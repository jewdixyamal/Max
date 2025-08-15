package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* renamed from: lx0  reason: default package */
public final class lx0 {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public a94 e;

    public lx0(int i, String str, a94 a94) {
        this.a = i;
        this.b = str;
        this.e = a94;
    }

    public final upd a(long j, long j2) {
        dx0 dx0 = new dx0(this.b, j, -1, -9223372036854775807L, (File) null);
        TreeSet treeSet = this.c;
        upd upd = (upd) treeSet.floor(dx0);
        if (upd != null && upd.b + upd.c > j) {
            return upd;
        }
        upd upd2 = (upd) treeSet.ceiling(dx0);
        if (upd2 != null) {
            long j3 = upd2.b - j;
            j2 = j2 == -1 ? j3 : Math.min(j3, j2);
        }
        return new dx0(this.b, j, j2, -9223372036854775807L, (File) null);
    }

    public final boolean b(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            jx0 jx0 = (jx0) arrayList.get(i);
            long j3 = jx0.b;
            int i2 = (j3 > -1 ? 1 : (j3 == -1 ? 0 : -1));
            long j4 = jx0.a;
            if (i2 == 0) {
                if (j >= j4) {
                    return true;
                }
            } else if (j2 != -1 && j4 <= j && j + j2 <= j4 + j3) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lx0.class != obj.getClass()) {
            return false;
        }
        lx0 lx0 = (lx0) obj;
        return this.a == lx0.a && this.b.equals(lx0.b) && this.c.equals(lx0.c) && this.e.equals(lx0.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rh4.d(this.a * 31, 31, this.b);
    }
}
