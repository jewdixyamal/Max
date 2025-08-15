package defpackage;

import java.text.CollationKey;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: oq3  reason: default package */
public final class oq3 {
    public final lqd a;
    public final u7b b;
    public final el3 c;
    public final p82 d;
    public final ri4 e;
    public final hbd f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();

    public oq3(m7b m7b, u7b u7b, el3 el3, p82 p82, ri4 ri4, hbd hbd, ztc ztc) {
        lqd lqd = new lqd(new q1a(1, new v02(22, m7b)).m(ztc));
        this.a = lqd;
        lqd.k(new j28(1, new un0(28)));
        this.b = u7b;
        this.c = el3;
        this.d = p82;
        this.e = ri4;
        this.f = hbd;
    }

    public static int a(uj3 uj3, uj3 uj32, Collator collator) {
        CollationKey collationKey = uj3.X;
        if (collationKey == null) {
            collationKey = collator.getCollationKey(uj3.d().toLowerCase());
            uj3.X = collationKey;
        }
        CollationKey collationKey2 = uj32.X;
        if (collationKey2 == null) {
            collationKey2 = collator.getCollationKey(uj32.d().toLowerCase());
            uj32.X = collationKey2;
        }
        boolean z = false;
        boolean z2 = !oag.t(uj3.d()) && Character.isLetter(uj3.d().charAt(0));
        if (!oag.t(uj32.d()) && Character.isLetter(uj32.d().charAt(0))) {
            z = true;
        }
        return ((!z2 || !z) && (z2 || z)) ? z2 ? -1 : 1 : collationKey.compareTo(collationKey2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c4, code lost:
        r6 = r3.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.List r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            ri4 r0 = r8.e     // Catch:{ all -> 0x003e }
            boolean r0 = r0.d()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x009f
            hbd r0 = r8.f     // Catch:{ all -> 0x003e }
            jbd r0 = (defpackage.jbd) r0     // Catch:{ all -> 0x003e }
            int r0 = r0.h     // Catch:{ all -> 0x003e }
            r1 = 3
            if (r0 == r1) goto L_0x0014
            goto L_0x009f
        L_0x0014:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x003e }
            r0.<init>()     // Catch:{ all -> 0x003e }
            java.util.concurrent.ConcurrentHashMap r1 = r8.g     // Catch:{ all -> 0x003e }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x003e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x003e }
        L_0x0023:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x0041
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x003e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x003e }
            el3 r3 = r8.c     // Catch:{ all -> 0x003e }
            long r4 = r2.longValue()     // Catch:{ all -> 0x003e }
            r2 = 1
            uj3 r2 = r3.i(r4, r2)     // Catch:{ all -> 0x003e }
            r0.add(r2)     // Catch:{ all -> 0x003e }
            goto L_0x0023
        L_0x003e:
            r9 = move-exception
            goto L_0x010c
        L_0x0041:
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x003e }
        L_0x0045:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x0065
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x003e }
            uj3 r2 = (defpackage.uj3) r2     // Catch:{ all -> 0x003e }
            java.util.concurrent.ConcurrentHashMap r3 = r8.g     // Catch:{ all -> 0x003e }
            long r4 = r2.n()     // Catch:{ all -> 0x003e }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x003e }
            boolean r3 = r3.containsKey(r4)     // Catch:{ all -> 0x003e }
            if (r3 != 0) goto L_0x0045
            r0.add(r2)     // Catch:{ all -> 0x003e }
            goto L_0x0045
        L_0x0065:
            u7b r1 = r8.b     // Catch:{ all -> 0x003e }
            us r1 = r1.d()     // Catch:{ all -> 0x003e }
            lqd r2 = r8.a     // Catch:{ all -> 0x003e }
            java.lang.Object r2 = r2.e()     // Catch:{ all -> 0x003e }
            java.text.Collator r2 = (java.text.Collator) r2     // Catch:{ all -> 0x003e }
            nq3 r3 = new nq3     // Catch:{ all -> 0x003e }
            r4 = 0
            r3.<init>(r8, r1, r2, r4)     // Catch:{ all -> 0x003e }
            java.util.Collections.sort(r0, r3)     // Catch:{ all -> 0x003e }
            r1 = 0
        L_0x007d:
            int r2 = r0.size()     // Catch:{ all -> 0x003e }
            if (r1 >= r2) goto L_0x009d
            java.util.concurrent.ConcurrentHashMap r2 = r8.g     // Catch:{ all -> 0x003e }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x003e }
            uj3 r3 = (defpackage.uj3) r3     // Catch:{ all -> 0x003e }
            long r3 = r3.n()     // Catch:{ all -> 0x003e }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x003e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x003e }
            r2.put(r3, r4)     // Catch:{ all -> 0x003e }
            int r1 = r1 + 1
            goto L_0x007d
        L_0x009d:
            monitor-exit(r8)
            goto L_0x00a0
        L_0x009f:
            monitor-exit(r8)
        L_0x00a0:
            ei9 r0 = new ei9
            r1 = 6
            r0.<init>(r1)
            java.util.Iterator r1 = r9.iterator()
        L_0x00aa:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0102
            java.lang.Object r2 = r1.next()
            uj3 r2 = (defpackage.uj3) r2
            p82 r3 = r8.d
            long r4 = r2.n()
            e52 r3 = r3.F(r4)
            r4 = 0
            if (r3 == 0) goto L_0x00d5
            es8 r6 = r3.c
            if (r6 == 0) goto L_0x00d5
            cu8 r6 = r6.a
            boolean r6 = r6.x()
            if (r6 != 0) goto L_0x00d5
            long r6 = r3.m()
            goto L_0x00d6
        L_0x00d5:
            r6 = r4
        L_0x00d6:
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x00e3
            long r2 = r2.n()
            long r4 = -r6
            r0.d(r2, r4)
            goto L_0x00aa
        L_0x00e3:
            java.util.concurrent.ConcurrentHashMap r3 = r8.g
            long r6 = r2.n()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object r3 = r3.get(r6)
            java.lang.Integer r3 = (java.lang.Integer) r3
            long r6 = r2.n()
            if (r3 == 0) goto L_0x00fe
            int r2 = r3.intValue()
            long r4 = (long) r2
        L_0x00fe:
            r0.d(r6, r4)
            goto L_0x00aa
        L_0x0102:
            ca3 r8 = new ca3
            r1 = 1
            r8.<init>(r1, r0)
            r9.sort(r8)
            return
        L_0x010c:
            monitor-exit(r8)     // Catch:{ all -> 0x003e }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oq3.b(java.util.List):void");
    }

    public final void c(ArrayList arrayList, m56 m56) {
        Collections.sort(arrayList, new nq3(this, m56, new HashMap(), 1));
    }
}
