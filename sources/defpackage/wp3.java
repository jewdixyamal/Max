package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: wp3  reason: default package */
public class wp3 extends ol implements lme {
    public final long X;
    public final Object Y;
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp3(int i, long j, long j2, Object obj) {
        super(j);
        this.o = i;
        this.X = j2;
        this.Y = obj;
    }

    private final void v(gle gle) {
    }

    public void e(gle gle) {
        switch (this.o) {
            case 0:
                xp3 xp3 = (xp3) gle;
                pl plVar = null;
                if (this.X > 0) {
                    Map map = xp3.c;
                    pl plVar2 = this.c;
                    if (plVar2 == null) {
                        plVar2 = null;
                    }
                    map.put(Long.valueOf(((hyc) ((q33) plVar2.e.getValue())).t()), s7b.c);
                }
                pl plVar3 = this.c;
                if (plVar3 != null) {
                    plVar = plVar3;
                }
                ((w7b) plVar.N.getValue()).h(xp3.o, iz7.n(xp3.c));
                p82 m = m();
                Map map2 = xp3.c;
                m.getClass();
                ArrayList arrayList = new ArrayList(map2.keySet());
                hm9.m("p82", "invalidateChatsContacts, contactsIds.size() = " + arrayList.size(), new Object[0]);
                for (e52 e52 : m.E(p82.I)) {
                    ArrayList j = e52.j();
                    ArrayList arrayList2 = new ArrayList(j.size());
                    Iterator it = j.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList2.add(Long.valueOf(((uj3) it.next()).n()));
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    if (!Collections.disjoint(arrayList, arrayList2)) {
                        e52.o0((el3) m.r.get());
                    }
                }
                return;
            case 1:
                u((xe9) gle);
                return;
            default:
                return;
        }
    }

    public void g(pke pke) {
        switch (this.o) {
            case 0:
                l().c(new oi0(this.a, pke));
                return;
            case 1:
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                plVar.b().c(new ze9(this.a, pke, this.X, (List) this.Y));
                return;
            default:
                l().c(new oi0(this.a, pke));
                return;
        }
    }

    public final dle i() {
        switch (this.o) {
            case 0:
                tq2 tq2 = new tq2((sla) null, 9);
                long[] jArr = (long[]) this.Y;
                if (jArr != null) {
                    tq2.h("contactIds", jArr);
                }
                long j = this.X;
                if (j > 0) {
                    tq2.i(j, "sync");
                }
                return tq2;
            case 1:
                return new tq2(this.X, (List) this.Y);
            default:
                long j2 = this.X;
                if (j2 == 0) {
                    return null;
                }
                b10 b10 = (b10) this.Y;
                String str = b10 != null ? b10.a : null;
                dle dle = new dle((sla) null);
                dle.i(j2, ApiProtocol.PARAM_CHAT_ID);
                if (str != null) {
                    dle.p("type", str);
                }
                return dle;
        }
    }

    public void u(xe9 xe9) {
        e52 e52;
        xe9 xe92 = xe9;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (fs8 fs8 : xe92.o) {
            if (fs8.X != wx8.c) {
                arrayList2.add(fs8);
                arrayList.add(Long.valueOf(fs8.a));
            }
        }
        pl plVar = null;
        if (!arrayList2.isEmpty()) {
            pl plVar2 = this.c;
            if (plVar2 == null) {
                plVar2 = null;
            }
            e52 z = plVar2.c().z(xe92.c);
            if (z != null) {
                pl plVar3 = this.c;
                if (plVar3 == null) {
                    plVar3 = null;
                }
                au8 d = plVar3.d();
                List list = xe92.o;
                pl plVar4 = this.c;
                if (plVar4 == null) {
                    plVar4 = null;
                }
                d.g(z.a, ((p7b) ((m7b) plVar4.c.getValue())).a.t(), list);
            }
            e52 = z;
        } else {
            e52 = null;
        }
        pl plVar5 = this.c;
        if (plVar5 == null) {
            plVar5 = null;
        }
        plVar5.b().c(new af9(this.a, this.X, arrayList, xe92.o, (List) this.Y));
        if (e52 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                fs8 fs82 = (fs8) it.next();
                pl plVar6 = this.c;
                if (plVar6 == null) {
                    plVar6 = null;
                }
                cu8 j = plVar6.d().j(e52.a, fs82.a);
                if (j != null) {
                    pl plVar7 = this.c;
                    if (plVar7 == null) {
                        plVar7 = null;
                    }
                    plVar7.b().c(new l6f(e52.a, j.b, 0));
                }
            }
        }
        pl plVar8 = this.c;
        if (plVar8 != null) {
            plVar = plVar8;
        }
        r9d.y((s8g) plVar.g.getValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wp3(long j, long[] jArr, long j2) {
        super(j);
        this.o = 0;
        this.Y = jArr;
        this.X = j2;
    }
}
