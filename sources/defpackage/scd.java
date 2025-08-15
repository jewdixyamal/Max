package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: scd  reason: default package */
public final class scd extends ffe implements a66 {
    public int X;
    public final /* synthetic */ add Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public scd(add add, Continuation continuation) {
        super(2, continuation);
        this.Y = add;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((scd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new scd(this.Y, continuation);
    }

    public final Object o(Object obj) {
        vfd vfd;
        int i = 1;
        tx3 tx3 = tx3.a;
        int i2 = this.X;
        e5f e5f = e5f.a;
        if (i2 == 0) {
            od2.a0(obj);
            add add = this.Y;
            q0e q0e = add.D0;
            kl7 l = j1e.l();
            se5 se5 = ((p7b) add.s()).e;
            se5.getClass();
            int i3 = 0;
            boolean n = se5.n(PmsKey.f37esiaenabled, false);
            fc3 fc3 = add.y0;
            if (n) {
                l.add((List) ((je7) fc3.c).getValue());
            }
            l.add((List) ((je7) fc3.o).getValue());
            l.add((List) ((je7) fc3.X).getValue());
            l.add((List) ((je7) fc3.Z).getValue());
            l.add((List) ((je7) fc3.b).getValue());
            l.add((List) ((je7) fc3.Y).getValue());
            add.b.getClass();
            z7d z7d = ((p7b) add.s()).b;
            Integer num = (Integer) ((ml0) z7d.i.getValue()).A();
            int intValue = num != null ? num.intValue() : (int) z7d.q(PmsKey.f28debugmode, (long) 0);
            v44 v44 = v44.DISABLED;
            if (intValue == 3) {
                l.add((List) ((je7) fc3.a).getValue());
            }
            kl7 d = j1e.d(l);
            ArrayList T = z53.T(d);
            ArrayList arrayList = new ArrayList(d.getSize());
            Iterator it = T.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                cfd cfd = cfd.a;
                String str = null;
                if (hasNext) {
                    hcd hcd = (hcd) it.next();
                    boolean b = ((lle) add.Z.getValue()).b();
                    boolean z = ((did) add.B0.getValue()).g;
                    switch (hcd.ordinal()) {
                        case 0:
                            vfd = new vfd(hcd.a, 3, new eqe(mha.h), (jfd) null, (jqe) null, Integer.valueOf(woc.O), cfd, (zed) null, (jqe) null, 0, (wed) null, 1944);
                            break;
                        case 1:
                            vfd = new vfd(hcd.a, 3, new eqe(mha.b), (jfd) null, (jqe) null, Integer.valueOf(woc.r0), cfd, (zed) null, (jqe) null, 0, (wed) null, 1944);
                            break;
                        case 2:
                            vfd = new vfd(hcd.a, 3, new eqe(mha.k), (jfd) null, (jqe) null, Integer.valueOf(woc.w1), cfd, b ? zed.a : null, (jqe) null, 0, (wed) null, 1816);
                            break;
                        case 3:
                            vfd = new vfd(hcd.a, 3, new eqe(mha.l), (jfd) null, (jqe) null, Integer.valueOf(woc.h1), cfd, (zed) null, (jqe) null, 0, (wed) null, 1944);
                            break;
                        case 4:
                            vfd = new vfd(hcd.a, 3, new eqe(mha.j), (jfd) null, (jqe) null, Integer.valueOf(woc.n1), cfd, (zed) null, (jqe) null, 0, (wed) null, 1944);
                            break;
                        case 5:
                            vfd = new vfd(hcd.a, 3, new eqe(jpc.t2), (jfd) null, (jqe) null, Integer.valueOf(woc.J), cfd, (zed) null, (jqe) null, 0, (wed) null, 1944);
                            break;
                        case 6:
                            vfd = new vfd(hcd.a, 4, new eqe(mha.c), (jfd) null, (jqe) null, Integer.valueOf(woc.f), cfd, (zed) null, (jqe) null, 0, (wed) null, 1944);
                            break;
                        case 7:
                            vfd = new vfd(hcd.a, 4, new eqe(mha.m), (jfd) null, (jqe) null, Integer.valueOf(woc.j1), cfd, (zed) null, (jqe) null, 0, (wed) null, 1944);
                            break;
                        case 8:
                            vfd = new vfd(hcd.a, 5, new eqe(mha.n), (jfd) null, (jqe) null, Integer.valueOf(woc.U), cfd, (zed) null, (jqe) null, 0, (wed) null, 1944);
                            break;
                        case 9:
                            vfd = new vfd(hcd.a, 5, new eqe(mha.a), (jfd) null, (jqe) null, Integer.valueOf(woc.c1), cfd, (zed) null, (jqe) null, 0, (wed) null, 1944);
                            break;
                        case 10:
                            vfd = new vfd(hcd.a, 6, new eqe(mha.d), (jfd) null, (jqe) null, Integer.valueOf(woc.F1), cfd, (zed) null, (jqe) null, 0, (wed) null, 1944);
                            break;
                        case 11:
                            vfd = new vfd(hcd.a, 0, z ? new eqe(mha.e) : new eqe(mha.g), jfd.X, z ? null : new eqe(mha.f), Integer.valueOf(woc.R), cfd, (zed) null, (jqe) null, tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density), (wed) null, 1408);
                            break;
                        case Protos.Attaches.Attach.PRESENT:
                            vfd = new vfd(hcd.a, 2, new eqe(mha.i), jfd.Y, (jqe) null, Integer.valueOf(yfa.u), (hfd) null, (zed) null, (jqe) null, 0, (wed) null, 2000);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList.add(vfd);
                } else {
                    List<icd> list = (List) ((p7b) add.s()).e.i.getValue();
                    if (list != null && !list.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i4 = -1;
                            } else if (((vfd) it2.next()).a != hcd.ESIA_CONNECT.a) {
                                i4++;
                            }
                        }
                        if (i4 >= 0) {
                            int i5 = i4 + 1;
                            int L = y53.L(arrayList);
                            i3 = i5 > L ? L : i5;
                        }
                        for (icd icd : list) {
                            int hashCode = icd.hashCode();
                            ai9 ai9 = add.J0;
                            int a = ai9.a(hashCode);
                            Object[] objArr = ai9.c;
                            Object obj2 = objArr[a];
                            ai9.b[a] = hashCode;
                            objArr[a] = icd;
                            long j = (long) hashCode;
                            String str2 = icd.b;
                            iqe iqe = new iqe(str2);
                            jfd jfd = jfd.b;
                            tx3 tx32 = tx3;
                            Long valueOf = Long.valueOf(icd.c);
                            Character u0 = w9e.u0(str2);
                            arrayList.add(i3, new vfd(j, 1, iqe, jfd, (jqe) null, (Integer) null, cfd, (zed) null, (jqe) null, 0, new wed(oag.a(u0 != null ? u0.toString() : str, valueOf), icd.a), 944));
                            i = 1;
                            i3++;
                            str = str;
                            tx3 = tx32;
                        }
                    }
                    this.X = i;
                    q0e.m(str, arrayList);
                    tx3 tx33 = tx3;
                    if (e5f == tx33) {
                        return tx33;
                    }
                }
            }
        } else if (i2 == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f;
    }
}
