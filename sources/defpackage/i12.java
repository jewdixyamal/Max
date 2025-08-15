package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CountDownLatch;

/* renamed from: i12  reason: default package */
public final /* synthetic */ class i12 implements xff {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i12(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        boolean z;
        switch (this.a) {
            case 0:
                ((gd6) ((jo7) this.b).a).a((hd6) this.c);
                return;
            case 1:
                fa5 fa5 = (fa5) this.b;
                fa5.y0 = 0;
                fa5.X = (ba5) ((gd6) this.c);
                return;
            case 2:
                rk5 rk5 = (rk5) this.b;
                jee jee = (jee) this.c;
                synchronized (rk5) {
                    try {
                        if (rk5.p == null) {
                            if (!oaf.a(rk5.D, jee)) {
                                jee jee2 = rk5.D;
                                if (jee2 != null) {
                                    if (jee != null) {
                                        if (!jee2.a.equals(jee.a)) {
                                        }
                                    }
                                    rk5.i();
                                }
                                jee jee3 = rk5.D;
                                if (jee3 != null && jee != null && jee3.b == jee.b && jee3.c == jee.c) {
                                    if (jee3.d == jee.d) {
                                        z = false;
                                        rk5.C = z;
                                        rk5.D = jee;
                                        return;
                                    }
                                }
                                z = true;
                                rk5.C = z;
                                rk5.D = jee;
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
            case 3:
                l0f l0f = (l0f) this.b;
                l0f.getClass();
                Pair pair = (Pair) this.c;
                long longValue = ((Long) pair.second).longValue();
                ((gd6) l0f.X).e((va8) l0f.o, (hd6) pair.first, longValue);
                return;
            case 4:
                sg9 sg9 = ((soe) this.b).X;
                sg9.getClass();
                int i = ((hd6) this.c).a;
                mr0.p();
                m1f m1f = sg9.a;
                SparseArray sparseArray = m1f.x0;
                fm9.k(oaf.l(sparseArray, i));
                ug9 ug9 = (ug9) sparseArray.get(i);
                ug9.a.c(ug9.b);
                sparseArray.remove(i);
                m1f.b();
                return;
            default:
                nx0 nx0 = (nx0) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                synchronized (nx0.Z) {
                    nx0.Y = false;
                }
                countDownLatch.countDown();
                return;
        }
    }
}
