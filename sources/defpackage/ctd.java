package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* renamed from: ctd  reason: default package */
public final class ctd extends ijc implements a66 {
    public int X;
    public int Y;
    public /* synthetic */ Object Z;
    public Object c;
    public Iterator o;
    public final /* synthetic */ int s0;
    public final /* synthetic */ int t0;
    public final /* synthetic */ Iterator u0;
    public final /* synthetic */ boolean v0;
    public final /* synthetic */ boolean w0 = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ctd(int i, int i2, Iterator it, boolean z, Continuation continuation) {
        super(2, continuation);
        this.s0 = i;
        this.t0 = i2;
        this.u0 = it;
        this.v0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ctd) n((f6d) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ctd ctd = new ctd(this.s0, this.t0, this.u0, this.v0, continuation);
        ctd.Z = obj;
        return ctd;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            boolean r4 = r0.w0
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            boolean r9 = r0.v0
            int r10 = r0.t0
            int r11 = r0.s0
            r12 = 0
            if (r2 == 0) goto L_0x006b
            if (r2 == r3) goto L_0x004f
            if (r2 == r8) goto L_0x0020
            if (r2 == r7) goto L_0x003d
            if (r2 == r6) goto L_0x002d
            if (r2 != r5) goto L_0x0025
        L_0x0020:
            defpackage.od2.a0(r17)
            goto L_0x016d
        L_0x0025:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002d:
            java.lang.Object r2 = r0.c
            jkc r2 = (defpackage.jkc) r2
            java.lang.Object r4 = r0.Z
            f6d r4 = (defpackage.f6d) r4
            defpackage.od2.a0(r17)
            r2.a(r10)
            goto L_0x013d
        L_0x003d:
            java.util.Iterator r2 = r0.o
            java.lang.Object r8 = r0.c
            jkc r8 = (defpackage.jkc) r8
            java.lang.Object r13 = r0.Z
            f6d r13 = (defpackage.f6d) r13
            defpackage.od2.a0(r17)
            r8.a(r10)
            goto L_0x00d1
        L_0x004f:
            int r2 = r0.X
            java.util.Iterator r5 = r0.o
            java.lang.Object r6 = r0.c
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r7 = r0.Z
            f6d r7 = (defpackage.f6d) r7
            defpackage.od2.a0(r17)
            if (r9 == 0) goto L_0x0064
            r6.clear()
            goto L_0x0069
        L_0x0064:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r11)
        L_0x0069:
            r14 = r2
            goto L_0x0087
        L_0x006b:
            defpackage.od2.a0(r17)
            java.lang.Object r2 = r0.Z
            f6d r2 = (defpackage.f6d) r2
            r13 = 1024(0x400, float:1.435E-42)
            if (r11 <= r13) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r13 = r11
        L_0x0078:
            int r14 = r10 - r11
            java.util.Iterator r15 = r0.u0
            r5 = 0
            if (r14 < 0) goto L_0x00c8
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r13)
            r7 = r2
            r2 = r5
            r5 = r15
        L_0x0087:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x00ad
            java.lang.Object r9 = r5.next()
            if (r2 <= 0) goto L_0x0096
            int r2 = r2 + -1
            goto L_0x0087
        L_0x0096:
            r6.add(r9)
            int r9 = r6.size()
            if (r9 != r11) goto L_0x0087
            r0.Z = r7
            r0.c = r6
            r0.o = r5
            r0.X = r14
            r0.Y = r3
            r7.c(r6, r0)
            return r1
        L_0x00ad:
            boolean r2 = r6.isEmpty()
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x016d
            if (r4 != 0) goto L_0x00bc
            int r2 = r6.size()
            if (r2 != r11) goto L_0x016d
        L_0x00bc:
            r0.Z = r12
            r0.c = r12
            r0.o = r12
            r0.Y = r8
            r7.c(r6, r0)
            return r1
        L_0x00c8:
            jkc r8 = new jkc
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r8.<init>(r5, r13)
            r13 = r2
            r2 = r15
        L_0x00d1:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0139
            java.lang.Object r5 = r2.next()
            int r14 = r8.getSize()
            int r15 = r8.b
            if (r14 == r15) goto L_0x0131
            int r14 = r8.c
            int r6 = r8.o
            int r14 = r14 + r6
            int r14 = r14 % r15
            java.lang.Object[] r12 = r8.a
            r12[r14] = r5
            int r6 = r6 + 1
            r8.o = r6
            int r5 = r8.getSize()
            if (r5 != r15) goto L_0x0119
            int r5 = r8.o
            if (r5 >= r11) goto L_0x011c
            int r5 = r15 >> 1
            int r15 = r15 + r5
            int r15 = r15 + r3
            if (r15 <= r11) goto L_0x0102
            r15 = r11
        L_0x0102:
            int r5 = r8.c
            if (r5 != 0) goto L_0x010b
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r12, r15)
            goto L_0x0111
        L_0x010b:
            java.lang.Object[] r5 = new java.lang.Object[r15]
            java.lang.Object[] r5 = r8.toArray(r5)
        L_0x0111:
            jkc r6 = new jkc
            int r8 = r8.o
            r6.<init>(r8, r5)
            r8 = r6
        L_0x0119:
            r6 = 4
            r12 = 0
            goto L_0x00d1
        L_0x011c:
            if (r9 == 0) goto L_0x0120
            r3 = r8
            goto L_0x0125
        L_0x0120:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r8)
        L_0x0125:
            r0.Z = r13
            r0.c = r8
            r0.o = r2
            r0.Y = r7
            r13.c(r3, r0)
            return r1
        L_0x0131:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ring buffer is full"
            r0.<init>(r1)
            throw r0
        L_0x0139:
            if (r4 == 0) goto L_0x016d
            r2 = r8
            r4 = r13
        L_0x013d:
            int r5 = r2.o
            if (r5 <= r10) goto L_0x0158
            if (r9 == 0) goto L_0x0145
            r3 = r2
            goto L_0x014a
        L_0x0145:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
        L_0x014a:
            r0.Z = r4
            r0.c = r2
            r5 = 0
            r0.o = r5
            r2 = 4
            r0.Y = r2
            r4.c(r3, r0)
            return r1
        L_0x0158:
            r5 = 0
            boolean r6 = r2.isEmpty()
            r3 = r3 ^ r6
            if (r3 == 0) goto L_0x016d
            r0.Z = r5
            r0.c = r5
            r0.o = r5
            r3 = 5
            r0.Y = r3
            r4.c(r2, r0)
            return r1
        L_0x016d:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctd.o(java.lang.Object):java.lang.Object");
    }
}
