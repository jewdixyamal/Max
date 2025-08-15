package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: gj0  reason: default package */
public final /* synthetic */ class gj0 implements tj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e08 b;

    public /* synthetic */ gj0(e08 e08, int i) {
        this.a = i;
        this.b = e08;
    }

    public final void accept(Object obj) {
        e08 e08;
        switch (this.a) {
            case 0:
                fk9 fk9 = (fk9) obj;
                fk9.getClass();
                e08 e082 = this.b;
                long j = e082.c;
                long j2 = fk9.C0.h;
                int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                ConcurrentHashMap concurrentHashMap = fk9.c;
                kk9 kk9 = (kk9) fk9.b;
                er7 er7 = e082.a;
                if (i == 0) {
                    fk9.b2(new fj0(16));
                    e08 e083 = (e08) concurrentHashMap.get(Long.valueOf(fk9.C0.h));
                    if (e083 != null) {
                        fk9.H0.e(e083);
                    }
                    ((el9) kk9).B(er7.a, er7.b, false);
                } else {
                    if (!(j2 == -1 || (e08 = (e08) concurrentHashMap.get(Long.valueOf(j2))) == null)) {
                        d08 a2 = e08.a();
                        a2.d = i08.b;
                        concurrentHashMap.put(Long.valueOf(e08.c), new e08(a2));
                    }
                    long j3 = fk9.C0.h;
                    long j4 = e082.c;
                    if (j4 != j3) {
                        fk9.b2(new gj0(e082, 3));
                        e08 e084 = (e08) concurrentHashMap.get(Long.valueOf(fk9.C0.h));
                        if (e084 != null) {
                            d08 a3 = e084.a();
                            a3.d = i08.c;
                            concurrentHashMap.put(Long.valueOf(e084.c), new e08(a3));
                            fk9.H0.e(e084);
                        }
                        fk9.g2(j4);
                        ((el9) kk9).B(er7.a, er7.b, false);
                    }
                }
                ((el9) kk9).A(-1, e082.k);
                fk9.F0 = true;
                fk9.h2((ck9) null);
                fk9.e2();
                return;
            case 1:
                fk9 fk92 = (fk9) obj;
                fk92.getClass();
                e08 e085 = this.b;
                int i2 = (e085.j > fk92.C0.o ? 1 : (e085.j == fk92.C0.o ? 0 : -1));
                kk9 kk92 = (kk9) fk92.b;
                er7 er72 = e085.a;
                if (i2 == 0) {
                    ((el9) kk92).B(er72.a, er72.b, false);
                    return;
                } else if (((List) fk92.o.get(Long.valueOf(e085.c))) != null) {
                    fk92.b2(new gj0(e085, 4));
                    fk92.h2((ck9) null);
                    el9 el9 = (el9) kk92;
                    el9.A(e085.j, e085.k);
                    e08 e086 = (e08) fk92.c.get(Long.valueOf(fk92.C0.h));
                    if (e086 != null) {
                        fk92.H0.e(e086);
                    }
                    el9.B(er72.a, er72.b, false);
                    return;
                } else {
                    return;
                }
            case 2:
                ((gr7) obj).h = this.b.c;
                return;
            case 3:
                gr7 gr7 = (gr7) obj;
                gr7.h = this.b.c;
                gr7.o = -1;
                return;
            default:
                ((gr7) obj).o = this.b.j;
                return;
        }
    }
}
