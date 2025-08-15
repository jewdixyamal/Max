package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ft2  reason: default package */
public final class ft2 implements s24 {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public ft2(je7 je7, khe khe, khe khe2) {
        this.a = khe;
        this.b = je7;
        this.c = khe2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable a(java.util.Set r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.et2
            if (r0 == 0) goto L_0x0013
            r0 = r7
            et2 r0 = (defpackage.et2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            et2 r0 = new et2
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            ft2 r5 = r0.o
            defpackage.od2.a0(r7)
            goto L_0x00ad
        L_0x002a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0032:
            defpackage.od2.a0(r7)
            je7 r7 = r5.b
            java.lang.Object r7 = r7.getValue()
            yu2 r7 = (defpackage.yu2) r7
            tu2 r2 = r5.b()
            r0.o = r5
            r0.Z = r3
            jz2 r7 = (defpackage.jz2) r7
            p82 r0 = r7.l()
            r0.getClass()
            if (r6 == 0) goto L_0x0098
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x0057
            goto L_0x0098
        L_0x0057:
            r0.e()
            java.util.concurrent.ConcurrentHashMap r0 = r0.f
            java.util.Objects.requireNonNull(r0)
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x006a
            java.util.List r6 = java.util.Collections.emptyList()
            goto L_0x009c
        L_0x006a:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r6.size()
            r3.<init>(r4)
            java.util.Iterator r6 = r6.iterator()
        L_0x0077:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x0096
            java.lang.Object r4 = r6.next()
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x008f }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x008f }
            e52 r4 = (defpackage.e52) r4     // Catch:{ all -> 0x008f }
            if (r4 == 0) goto L_0x0077
            r3.add(r4)     // Catch:{ all -> 0x008f }
            goto L_0x0077
        L_0x008f:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L_0x0096:
            r6 = r3
            goto L_0x009c
        L_0x0098:
            java.util.List r6 = java.util.Collections.emptyList()
        L_0x009c:
            at r0 = new at
            r3 = 2
            r0.<init>(r3, r6)
            c6d r6 = r7.h(r0, r2)
            java.util.List r7 = defpackage.l6d.i0(r6)
            if (r7 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x00b8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r0 = r7.next()
            r1 = r0
            e52 r1 = (defpackage.e52) r1
            boolean r2 = r1.h0()
            if (r2 == 0) goto L_0x00b8
            boolean r2 = r1.e0()
            if (r2 == 0) goto L_0x00b8
            k92 r1 = r1.b
            long r1 = r1.k
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x00b8
            r6.add(r0)
            goto L_0x00b8
        L_0x00df:
            java.util.ArrayList r5 = r5.c(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft2.a(java.util.Set, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public final tu2 b() {
        at5 a2 = ((wt2) this.a.getValue()).a();
        if (a2.b()) {
            return ru2.a;
        }
        return new su2(a2.v0, a2.Y, a2.w0, a2.x0, a2.A0);
    }

    public final ArrayList c(List list) {
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((vu2) this.c.getValue()).a((e52) it.next()));
        }
        return arrayList;
    }

    public final List f(long j, vk6 vk6, int i, int i2, long j2, long j3) {
        return c(((jz2) ((yu2) this.b.getValue())).s(b(), j, vk6 != null ? Long.valueOf(vk6.getId()) : null, i2));
    }
}
