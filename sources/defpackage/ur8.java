package defpackage;

import java.util.ArrayList;

/* renamed from: ur8  reason: default package */
public final class ur8 implements a04 {
    public static final hd3 b;
    public final ArrayList a = new ArrayList();

    static {
        sm9 sm9 = sm9.a;
        hj8 hj8 = new hj8(6);
        sm9.getClass();
        rv0 rv0 = new rv0(hj8, sm9);
        dkc dkc = dkc.a;
        hj8 hj82 = new hj8(7);
        dkc.getClass();
        b = new hd3(rv0, new rv0(hj82, dkc));
    }

    public final long c(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j3 = ((b04) arrayList.get(i)).b;
            long j4 = ((b04) arrayList.get(i)).d;
            if (j < j3) {
                j2 = j2 == -9223372036854775807L ? j3 : Math.min(j2, j3);
            } else {
                if (j < j4) {
                    j2 = j2 == -9223372036854775807L ? j4 : Math.min(j2, j4);
                }
                i++;
            }
        }
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean d(b04 b04, long j) {
        long j2 = b04.b;
        fm9.f(j2 != -9223372036854775807L);
        fm9.f(b04.c != -9223372036854775807L);
        boolean z = j2 <= j && j < b04.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((b04) arrayList.get(size)).b) {
                arrayList.add(size + 1, b04);
                return z;
            }
        }
        arrayList.add(0, b04);
        return z;
    }

    public final zw6 i(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((b04) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    b04 b04 = (b04) arrayList.get(i);
                    if (j >= b04.b && j < b04.d) {
                        arrayList2.add(b04);
                    }
                    if (j < b04.b) {
                        break;
                    }
                }
                ffc r = zw6.r(b, arrayList2);
                ww6 i2 = zw6.i();
                for (int i3 = 0; i3 < r.size(); i3++) {
                    i2.f(((b04) r.get(i3)).a);
                }
                return i2.j();
            }
        }
        return zw6.m();
    }

    public final long n(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((b04) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long j2 = ((b04) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j3 = ((b04) arrayList.get(i)).b;
            long j4 = ((b04) arrayList.get(i)).d;
            if (j4 > j) {
                if (j3 > j) {
                    break;
                }
                j2 = Math.max(j2, j3);
            } else {
                j2 = Math.max(j2, j4);
            }
        }
        return j2;
    }

    public final void u(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i < arrayList.size()) {
                int i2 = (j > ((b04) arrayList.get(i)).b ? 1 : (j == ((b04) arrayList.get(i)).b ? 0 : -1));
                if (i2 > 0 && j > ((b04) arrayList.get(i)).d) {
                    arrayList.remove(i);
                    i--;
                } else if (i2 < 0) {
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }
}
