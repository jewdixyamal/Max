package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: fl2  reason: default package */
public final class fl2 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object j;

    public fl2(a4c a4c) {
        this.a = a4c;
        this.b = new lh4(0);
        this.c = new lh4(0);
        this.d = new lh4(0);
        this.e = new lh4(0);
        this.f = new lh4(0);
        this.g = new HashMap();
        this.h = new lh4(0);
        this.i = new lh4(0);
        this.j = new sy4(29);
    }

    public static long a(ArrayList arrayList, m56 m56) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Long l = (Long) m56.invoke((hxd) it.next());
            if (l != null) {
                arrayList2.add(l);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((Number) next).longValue() != -1) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        long j2 = 0;
        while (it3.hasNext()) {
            j2 += ((Number) it3.next()).longValue();
        }
        return j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.fl2 r5, defpackage.fs8 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof defpackage.cl2
            if (r0 == 0) goto L_0x0016
            r0 = r7
            cl2 r0 = (defpackage.cl2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x001b
        L_0x0016:
            cl2 r0 = new cl2
            r0.<init>(r5, r7)
        L_0x001b:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            defpackage.od2.a0(r7)
            goto L_0x004e
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r5.b
            kke r7 = (defpackage.kke) r7
            w9a r7 = (defpackage.w9a) r7
            nx3 r7 = r7.b()
            dl2 r2 = new dl2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.Y = r3
            java.lang.Object r7 = defpackage.j47.t0(r7, r2, r0)
            if (r7 != r1) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r1 = r7
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl2.b(fl2, fs8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void c() {
        ((lh4) this.b).a = -1;
        ((lh4) this.c).a = -1;
        ((lh4) this.d).a = -1;
        ((lh4) this.e).a = -1;
        ((lh4) this.f).a = -1;
        ((HashMap) this.g).clear();
        ((lh4) this.h).a = -1;
        ((lh4) this.i).a = -1;
    }

    public void d(int i2, int i3) {
        q0e q0e;
        Object value;
        boolean z;
        boolean z2;
        do {
            q0e = (q0e) this.g;
            value = q0e.getValue();
            tzc tzc = (tzc) value;
            pzc pzc = tzc instanceof pzc ? (pzc) tzc : pzc.e;
            z = false;
            z2 = i3 != i2;
            if (1 != i2) {
                z = true;
            }
            pzc.getClass();
        } while (!q0e.c(value, new pzc(i3, i2, z2, z)));
    }

    public void e(nx8 nx8) {
        j47.T((ContextScope) this.c, (lx3) null, (vx3) null, new el2(this, nx8.b, nx8, (Continuation) null), 3);
    }

    public void f() {
        q0e q0e;
        Object value;
        q0e q0e2;
        Object value2;
        do {
            q0e = (q0e) this.h;
            value = q0e.getValue();
            gk6 gk6 = (gk6) value;
        } while (!q0e.c(value, (Object) null));
        do {
            q0e2 = (q0e) this.g;
            value2 = q0e2.getValue();
            tzc tzc = (tzc) value2;
            (tzc instanceof pzc ? (pzc) tzc : pzc.e).getClass();
        } while (!q0e2.c(value2, new pzc(0, 0, false, false)));
    }

    public fl2(il2 il2, je7 je7, je7 je72, je7 je73, kke kke, qj qjVar) {
        this.a = il2;
        this.b = kke;
        this.c = j1e.a(((w9a) kke).c().getImmediate().plus(qjVar));
        this.d = je7;
        this.e = je72;
        this.f = je73;
        q0e a2 = r0e.a(qzc.a);
        this.g = a2;
        this.i = new w7c(a2);
        q0e a3 = r0e.a((Object) null);
        this.h = a3;
        this.j = new w7c(a3);
    }

    public fl2() {
        this.b = mr0.l();
        this.a = mr0.l();
        this.e = mr0.l();
        this.f = mr0.l();
        this.c = mr0.l();
        this.d = mr0.l();
        this.g = mr0.l();
        this.h = mr0.l();
        this.i = mr0.l();
    }
}
