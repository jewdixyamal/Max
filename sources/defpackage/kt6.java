package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* renamed from: kt6  reason: default package */
public final /* synthetic */ class kt6 implements dad {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kt6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(fad fad) {
        switch (this.a) {
            case 0:
                pt6 pt6 = (pt6) this.b;
                if (pt6.c() != null) {
                    kq0.e();
                    cad cad = pt6.t;
                    if (cad != null) {
                        cad.b();
                        pt6.t = null;
                    }
                    fw6 fw6 = pt6.s;
                    if (fw6 != null) {
                        fw6.a();
                        pt6.s = null;
                    }
                    pt6.p.c();
                    pt6.e();
                    vb0 vb0 = pt6.g;
                    vb0.getClass();
                    bad F = pt6.F((st6) pt6.f, vb0);
                    pt6.r = F;
                    ArrayList arrayList = new ArrayList(1);
                    Object obj = new Object[]{F.c()}[0];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                    pt6.E(Collections.unmodifiableList(arrayList));
                    pt6.q();
                    return;
                }
                return;
            case 1:
                fu6 fu6 = (fu6) this.b;
                if (fu6.c() != null) {
                    vje vje = fu6.x;
                    vje.getClass();
                    kq0.e();
                    vje.Y = true;
                    yhc yhc = vje.o;
                    if (yhc != null) {
                        kq0.e();
                        if (!yhc.d.b.isDone()) {
                            Exception exc = new Exception("The request is aborted silently and retried.", (Throwable) null);
                            kq0.e();
                            yhc.g = true;
                            bm7 bm7 = yhc.i;
                            Objects.requireNonNull(bm7);
                            bm7.cancel(true);
                            yhc.e.d(exc);
                            yhc.f.b((Object) null);
                            vje vje2 = yhc.b;
                            vje2.getClass();
                            kq0.e();
                            vje2.a.addFirst(yhc.a);
                            vje2.c();
                        }
                    }
                    fu6.F(true);
                    vb0 vb02 = fu6.g;
                    vb02.getClass();
                    bad G = fu6.G(fu6.e(), (gu6) fu6.f, vb02);
                    fu6.v = G;
                    ArrayList arrayList2 = new ArrayList(1);
                    Object obj2 = new Object[]{G.c()}[0];
                    Objects.requireNonNull(obj2);
                    arrayList2.add(obj2);
                    fu6.E(Collections.unmodifiableList(arrayList2));
                    fu6.q();
                    vje vje3 = fu6.x;
                    vje3.getClass();
                    kq0.e();
                    vje3.Y = false;
                    vje3.c();
                    return;
                }
                return;
            case 2:
                x99 x99 = (x99) this.b;
                x99.b = x99.h();
                tt1 tt1 = (tt1) x99.X;
                if (tt1 != null) {
                    fu1 fu1 = tt1.b;
                    fu1.getClass();
                    try {
                        if (((Boolean) f8.g(new tt1(fu1, 0)).b.get()).booleanValue()) {
                            x99 x992 = fu1.H0;
                            fu1 fu12 = fu1;
                            fu1.c.execute(new vt1(fu12, fu1.w(x992), (fad) x992.b, (w99) x992.c, (vb0) null, Collections.singletonList(q9f.Y), 0));
                            return;
                        }
                        return;
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e);
                    }
                } else {
                    return;
                }
            case 3:
                h8b h8b = (h8b) this.b;
                if (h8b.c() != null) {
                    h8b.H((i8b) h8b.f, h8b.g);
                    h8b.q();
                    return;
                }
                return;
            case 4:
                Iterator it = ((ead) this.b).m.iterator();
                while (it.hasNext()) {
                    ((dad) it.next()).a(fad);
                }
                return;
            default:
                ((rdf) this.b).N();
                return;
        }
    }
}
