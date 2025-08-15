package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import one.me.sdk.arch.Widget;

/* renamed from: haa  reason: default package */
public final class haa extends x54 {
    public static final /* synthetic */ bc7[] f;
    public final je7 a;
    public boolean b = true;
    public final LinkedList c = new LinkedList();
    public final gaa d = new Object();
    public r61 e;

    static {
        oi9 oi9 = new oi9(haa.class, "router", "getRouter()Lone/me/sdk/arch/rootcontroller/RouterWrapper;");
        nec.a.getClass();
        f = new bc7[]{oi9};
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [gaa, java.lang.Object] */
    public haa(je7 je7) {
        this.a = je7;
    }

    public final ArrayList a() {
        ArrayList e2 = f().C().e();
        ArrayList arrayList = new ArrayList(z53.S(e2, 10));
        Iterator it = e2.iterator();
        while (it.hasNext()) {
            arrayList.add(new faa((coc) it.next()));
        }
        return arrayList;
    }

    public final int b() {
        if (!this.b) {
            return f().C().a.a.size();
        }
        List list = this.c;
        if (list.isEmpty()) {
            list = f().C().e();
        }
        return list.size();
    }

    public final void c(l64 l64) {
        coc d2 = d(l64, !a().isEmpty());
        if (this.b) {
            this.c.add(d2);
            return;
        }
        f().C().R(d2);
        r61 r61 = this.e;
        if (r61 != null) {
            ((ty3) r61.a.getValue()).getClass();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: zu3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.coc d(defpackage.l64 r4, boolean r5) {
        /*
            r3 = this;
            k64 r0 = r4.f
            java.lang.Object r0 = r0.a()
            one.me.sdk.arch.Widget r0 = (one.me.sdk.arch.Widget) r0
            r1 = 0
            coc r0 = defpackage.i24.e(r0, r1, r1)
            java.lang.String r2 = r4.a
            r0.d(r2)
            if (r5 == 0) goto L_0x0047
            j64 r5 = defpackage.j64.c
            j64 r4 = r4.e
            if (r4 == r5) goto L_0x0047
            k56 r5 = r4.a
            java.lang.Object r5 = r5.invoke()
            boolean r2 = r5 instanceof defpackage.zu3
            if (r2 == 0) goto L_0x0027
            zu3 r5 = (defpackage.zu3) r5
            goto L_0x0028
        L_0x0027:
            r5 = r1
        L_0x0028:
            if (r5 != 0) goto L_0x002e
            ch r5 = r3.e()
        L_0x002e:
            r0.c(r5)
            k56 r4 = r4.b
            java.lang.Object r4 = r4.invoke()
            boolean r5 = r4 instanceof defpackage.zu3
            if (r5 == 0) goto L_0x003e
            r1 = r4
            zu3 r1 = (defpackage.zu3) r1
        L_0x003e:
            if (r1 != 0) goto L_0x0044
            ch r1 = r3.e()
        L_0x0044:
            r0.a(r1)
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.haa.d(l64, boolean):coc");
    }

    public final ch e() {
        return ((se5) ((qe5) this.a.getValue())).u() ? new u18(0) : new ao6(0);
    }

    public final foc f() {
        return this.d.A(f[0]);
    }

    public final void g(k56 k56) {
        this.b = true;
        k56.invoke();
        this.b = false;
        LinkedList linkedList = this.c;
        if (!linkedList.isEmpty()) {
            ArrayList e2 = f().C().e();
            ArrayList arrayList = new ArrayList();
            for (Object next : linkedList) {
                if (!((Widget) ((coc) next).a).isDialog()) {
                    arrayList.add(next);
                }
            }
            ArrayList t0 = x53.t0(e2, arrayList);
            ArrayList e3 = f().T().e();
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : linkedList) {
                if (((Widget) ((coc) next2).a).isDialog()) {
                    arrayList2.add(next2);
                }
            }
            ArrayList t02 = x53.t0(e3, arrayList2);
            linkedList.clear();
            zu3 zu3 = null;
            f().T().P(t02, (zu3) null);
            znc C = f().C();
            coc coc = (coc) x53.q0(t0);
            if (coc != null) {
                zu3 = coc.b();
            }
            C.P(t0, zu3);
        }
    }
}
