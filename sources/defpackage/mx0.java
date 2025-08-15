package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* renamed from: mx0  reason: default package */
public final class mx0 {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public b94 e;

    public mx0(int i, String str, b94 b94) {
        this.a = i;
        this.b = str;
        this.e = b94;
    }

    public final long a(long j, long j2) {
        fm9.f(j >= 0);
        fm9.f(j2 >= 0);
        vpd b2 = b(j, j2);
        boolean z = true ^ b2.o;
        long j3 = Long.MAX_VALUE;
        long j4 = b2.c;
        if (z) {
            if (j4 != -1) {
                j3 = j4;
            }
            return -Math.min(j3, j2);
        }
        long j5 = j + j2;
        if (j5 >= 0) {
            j3 = j5;
        }
        long j6 = b2.b + j4;
        if (j6 < j3) {
            for (vpd vpd : this.c.tailSet(b2, false)) {
                long j7 = vpd.b;
                if (j7 <= j6) {
                    j6 = Math.max(j6, j7 + vpd.c);
                    if (j6 >= j3) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Math.min(j6 - j, j2);
    }

    public final vpd b(long j, long j2) {
        ex0 ex0 = new ex0(this.b, j, -1, -9223372036854775807L, (File) null);
        TreeSet treeSet = this.c;
        vpd vpd = (vpd) treeSet.floor(ex0);
        if (vpd != null && vpd.b + vpd.c > j) {
            return vpd;
        }
        vpd vpd2 = (vpd) treeSet.ceiling(ex0);
        if (vpd2 != null) {
            long j3 = vpd2.b - j;
            j2 = j2 == -1 ? j3 : Math.min(j3, j2);
        }
        return new ex0(this.b, j, j2, -9223372036854775807L, (File) null);
    }

    public final boolean c(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            kx0 kx0 = (kx0) arrayList.get(i);
            long j3 = kx0.b;
            int i2 = (j3 > -1 ? 1 : (j3 == -1 ? 0 : -1));
            long j4 = kx0.a;
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
        if (obj == null || mx0.class != obj.getClass()) {
            return false;
        }
        mx0 mx0 = (mx0) obj;
        return this.a == mx0.a && this.b.equals(mx0.b) && this.c.equals(mx0.c) && this.e.equals(mx0.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rh4.d(this.a * 31, 31, this.b);
    }
}
