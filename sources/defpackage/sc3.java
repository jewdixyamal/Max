package defpackage;

import java.util.List;

/* renamed from: sc3  reason: default package */
public final class sc3 implements j6d {
    public final ffc a;
    public long b;

    public sc3(List list, List list2) {
        ww6 i = zw6.i();
        fm9.f(list.size() == list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            i.a(new rc3((j6d) list.get(i2), (List) list2.get(i2)));
        }
        this.a = i.j();
        this.b = -9223372036854775807L;
    }

    public final boolean a() {
        int i = 0;
        while (true) {
            ffc ffc = this.a;
            if (i >= ffc.size()) {
                return false;
            }
            if (((rc3) ffc.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    public final long f() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            ffc ffc = this.a;
            if (i >= ffc.size()) {
                break;
            }
            long f = ((rc3) ffc.get(i)).f();
            if (f != Long.MIN_VALUE) {
                j = Math.min(j, f);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final boolean o(qo7 qo7) {
        boolean z;
        boolean z2 = false;
        do {
            long f = f();
            if (f == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            z = false;
            while (true) {
                ffc ffc = this.a;
                if (i >= ffc.size()) {
                    break;
                }
                long f2 = ((rc3) ffc.get(i)).f();
                boolean z3 = f2 != Long.MIN_VALUE && f2 <= qo7.a;
                if (f2 == f || z3) {
                    z |= ((rc3) ffc.get(i)).o(qo7);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    public final long r() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            ffc ffc = this.a;
            if (i >= ffc.size()) {
                break;
            }
            rc3 rc3 = (rc3) ffc.get(i);
            long r = rc3.r();
            if ((rc3.b().contains(1) || rc3.b().contains(2) || rc3.b().contains(4)) && r != Long.MIN_VALUE) {
                j = Math.min(j, r);
            }
            if (r != Long.MIN_VALUE) {
                j2 = Math.min(j2, r);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.b = j;
            return j;
        } else if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j3 = this.b;
            return j3 != -9223372036854775807L ? j3 : j2;
        }
    }

    public final void t(long j) {
        int i = 0;
        while (true) {
            ffc ffc = this.a;
            if (i < ffc.size()) {
                ((rc3) ffc.get(i)).t(j);
                i++;
            } else {
                return;
            }
        }
    }
}
