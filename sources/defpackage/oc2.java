package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: oc2  reason: default package */
public final class oc2 extends ol implements lme {
    public final Object X;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oc2(long j, Serializable serializable, int i) {
        super(j);
        this.o = i;
        this.X = serializable;
    }

    public final void e(gle gle) {
        List list;
        switch (this.o) {
            case 0:
                pc2 pc2 = (pc2) gle;
                gi9 c0 = m().c0(Collections.singletonList(pc2.c));
                l().c(new vz2(c0));
                av0 l = l();
                long[] jArr = c0.b;
                long[] jArr2 = c0.a;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr2[i];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    l.c(new qc2(pc2.c.X0, this.a, jArr[(i << 3) + i3], (String) this.X));
                                    return;
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                            }
                        }
                        if (i != length) {
                            i++;
                        }
                    }
                }
                throw new NoSuchElementException("The LongSet is empty");
            case 1:
                ym3 ym3 = (ym3) gle;
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                ((bn3) plVar.O.getValue()).a(ym3, (long[]) this.X, this.a);
                return;
            default:
                ahe ahe = (ahe) gle;
                pl plVar2 = this.c;
                if (plVar2 == null) {
                    plVar2 = null;
                }
                av0 b = plVar2.b();
                List list2 = ahe.c;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Object next : list2) {
                        try {
                            if (((wm3) next) != um3.A0) {
                                arrayList.add(next);
                            }
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    list = arrayList;
                } else {
                    list = Collections.emptyList();
                }
                b.c(new dhe(list, ahe.o, (HashMap) ((Map) this.X)));
                return;
        }
    }

    public final void g(pke pke) {
        switch (this.o) {
            case 0:
                l().c(new oi0(this.a, pke));
                return;
            case 1:
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                bn3 bn3 = (bn3) plVar.O.getValue();
                bn3.getClass();
                if ("not.found".equals(pke.b)) {
                    el3 el3 = (el3) bn3.b.getValue();
                    for (long o2 : (long[]) this.X) {
                        el3.o(o2);
                    }
                }
                ((av0) bn3.a.getValue()).c(new oi0(this.a, pke));
                return;
            default:
                pl plVar2 = this.c;
                if (plVar2 == null) {
                    plVar2 = null;
                }
                plVar2.b().c(new oi0(this.a, pke));
                return;
        }
    }

    public final dle i() {
        switch (this.o) {
            case 0:
                return new au((String) this.X);
            case 1:
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                ((ri4) plVar.b.getValue()).e();
                return new tq2((long[]) this.X);
            default:
                gs9 gs9 = new gs9(sla.SYNC, 13);
                HashMap hashMap = new HashMap();
                ((Map) this.X).forEach(new r33(1, hashMap));
                gs9.n("contactList", hashMap);
                return gs9;
        }
    }
}
