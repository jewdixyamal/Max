package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ya9  reason: default package */
public final class ya9 extends t68 {
    public final int e = 12;
    public final je7 f;
    public final khe g;

    public ya9(je7 je7, je7 je72, je7 je73, je7 je74) {
        super(je72, je73);
        this.f = je74;
        this.g = new khe(new z30(19, je7));
    }

    public final qw8 a() {
        List y0 = x53.y0((Iterable) ((AtomicReference) this.c).get(), this.e);
        p07 p07 = new p07();
        int size = y0.size();
        o07[] o07Arr = new o07[size];
        for (int i = 0; i < size; i++) {
            xa9 xa9 = (xa9) y0.get(i);
            ArrayList b = ((nob) this.f.getValue()).b(xa9.b);
            q07[] q07Arr = b != null ? (q07[]) b.toArray(new q07[0]) : null;
            o07 o07 = new o07();
            o07.a = xa9.a;
            o07.b = xa9.b.toString();
            o07.c = xa9.c.a;
            o07.d = xfg.j(xa9.d);
            if (!(q07Arr == null || q07Arr.length == 0)) {
                o07.e = q07Arr;
            }
            o07Arr[i] = o07;
        }
        p07.a = o07Arr;
        return p07;
    }

    public final zy b() {
        return (zy) this.g.getValue();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00ab */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean e(byte[] r13) {
        /*
            r12 = this;
            java.lang.String r0 = "loadData finish "
            long r1 = java.lang.System.nanoTime()
            java.lang.String r3 = r12.c()
            ir6 r4 = defpackage.hm9.m
            r5 = 0
            if (r4 != 0) goto L_0x0010
            goto L_0x001d
        L_0x0010:
            boolean r6 = r4.c()
            if (r6 == 0) goto L_0x001d
            us7 r6 = defpackage.us7.Y
            java.lang.String r7 = "loadData start"
            r4.d(r6, r3, r7, r5)
        L_0x001d:
            p07 r3 = new p07     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r3.<init>()     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            qw8 r13 = defpackage.qw8.mergeFrom(r3, r13)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            p07 r13 = (defpackage.p07) r13     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            o07[] r3 = r13.a     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            int r3 = r3.length     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r4.<init>(r3)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            o07[] r13 = r13.a     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r3 = 0
        L_0x0033:
            int r6 = r13.length     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            if (r3 >= r6) goto L_0x0078
            int r6 = r3 + 1
            r3 = r13[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006d }
            xa9 r7 = new xa9     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.lang.String r8 = r3.a     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.lang.String r9 = r3.b     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            q07[] r10 = r3.e     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            je7 r11 = r12.f     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.lang.Object r11 = r11.getValue()     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            nob r11 = (defpackage.nob) r11     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.lang.CharSequence r9 = r11.a(r9, r10)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            int r10 = r3.c     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            if (r10 != 0) goto L_0x0057
            hy3 r10 = defpackage.hy3.b     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            goto L_0x005d
        L_0x0057:
            hy3 r11 = new hy3     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r11.<init>(r10)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r10 = r11
        L_0x005d:
            zw5 r3 = r3.d     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.util.EnumSet r3 = defpackage.xfg.m(r3)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r7.<init>(r8, r9, r10, r3)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r4.add(r7)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r3 = r6
            goto L_0x0033
        L_0x006b:
            r13 = move-exception
            goto L_0x00d7
        L_0x006d:
            r13 = move-exception
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.lang.String r13 = r13.getMessage()     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r3.<init>(r13)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            throw r3     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
        L_0x0078:
            java.lang.Object r13 = r12.c     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.util.concurrent.atomic.AtomicReference r13 = (java.util.concurrent.atomic.AtomicReference) r13     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            r13.set(r4)     // Catch:{ InterruptedException -> 0x006b, all -> 0x00ab }
            java.lang.String r12 = r12.c()
            ir6 r13 = defpackage.hm9.m
            if (r13 != 0) goto L_0x0088
            goto L_0x00a8
        L_0x0088:
            boolean r3 = r13.c()
            if (r3 == 0) goto L_0x00a8
            us7 r3 = defpackage.us7.Y
            int r4 = defpackage.ft4.o
            long r6 = java.lang.System.nanoTime()
            long r6 = r6 - r1
            kt4 r1 = defpackage.kt4.NANOSECONDS
            long r1 = defpackage.z7.S(r6, r1)
            java.lang.String r1 = defpackage.ft4.j(r1)
            java.lang.String r0 = r0.concat(r1)
            r13.d(r3, r12, r0, r5)
        L_0x00a8:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            return r12
        L_0x00ab:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00d8 }
            java.lang.String r12 = r12.c()
            ir6 r3 = defpackage.hm9.m
            if (r3 != 0) goto L_0x00b6
            goto L_0x00d6
        L_0x00b6:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x00d6
            us7 r4 = defpackage.us7.Y
            int r6 = defpackage.ft4.o
            long r6 = java.lang.System.nanoTime()
            long r6 = r6 - r1
            kt4 r1 = defpackage.kt4.NANOSECONDS
            long r1 = defpackage.z7.S(r6, r1)
            java.lang.String r1 = defpackage.ft4.j(r1)
            java.lang.String r0 = r0.concat(r1)
            r3.d(r4, r12, r0, r5)
        L_0x00d6:
            return r13
        L_0x00d7:
            throw r13     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r13 = move-exception
            java.lang.String r12 = r12.c()
            ir6 r3 = defpackage.hm9.m
            if (r3 == 0) goto L_0x0101
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0101
            us7 r4 = defpackage.us7.Y
            int r6 = defpackage.ft4.o
            long r6 = java.lang.System.nanoTime()
            long r6 = r6 - r1
            kt4 r1 = defpackage.kt4.NANOSECONDS
            long r1 = defpackage.z7.S(r6, r1)
            java.lang.String r1 = defpackage.ft4.j(r1)
            java.lang.String r0 = r0.concat(r1)
            r3.d(r4, r12, r0, r5)
        L_0x0101:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya9.e(byte[]):java.lang.Boolean");
    }
}
