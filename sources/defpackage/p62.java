package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p62  reason: default package */
public final class p62 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k72 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p62(k72 k72, Continuation continuation) {
        super(2, continuation);
        this.Y = k72;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((p62) n((o22) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p62 p62 = new p62(this.Y, continuation);
        p62.X = obj;
        return p62;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [m22] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        if (r9.f == false) goto L_0x0041;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            defpackage.od2.a0(r9)
            java.lang.Object r9 = r8.X
            o22 r9 = (defpackage.o22) r9
            k72 r8 = r8.Y
            q0e r0 = r8.c
            java.lang.Object r1 = r0.getValue()
            m22 r1 = (defpackage.m22) r1
            r2 = 0
            if (r1 == 0) goto L_0x0069
            q0e r3 = r8.h
            java.lang.Object r3 = r3.getValue()
            o22 r3 = (defpackage.o22) r3
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0028
            boolean r3 = r3.b(r9)
            if (r3 != r4) goto L_0x0028
            r3 = r4
            goto L_0x0029
        L_0x0028:
            r3 = r5
        L_0x0029:
            if (r9 == 0) goto L_0x002d
            n22 r2 = r9.b
        L_0x002d:
            r6 = -1
            if (r2 != 0) goto L_0x0032
            r2 = r6
            goto L_0x003a
        L_0x0032:
            int[] r7 = defpackage.o62.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r7[r2]
        L_0x003a:
            if (r2 == r6) goto L_0x005f
            if (r2 == r4) goto L_0x0049
            r9 = 2
            if (r2 != r9) goto L_0x0043
        L_0x0041:
            r5 = r4
            goto L_0x005f
        L_0x0043:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L_0x0049:
            java.lang.String r2 = r9.c
            if (r2 == 0) goto L_0x0056
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r2 = r5
            goto L_0x0057
        L_0x0056:
            r2 = r4
        L_0x0057:
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x005f
            boolean r9 = r9.f
            if (r9 != 0) goto L_0x005f
            goto L_0x0041
        L_0x005f:
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.w
            boolean r9 = r9.get()
            m22 r2 = defpackage.m22.a(r1, r3, r5, r9, r4)
        L_0x0069:
            r0.setValue(r2)
            khe r9 = r8.g
            java.lang.Object r9 = r9.getValue()
            f22 r9 = (defpackage.f22) r9
            java.util.List r9 = r9.a(r8)
            q0e r8 = r8.d
            r8.setValue(r9)
            e5f r8 = defpackage.e5f.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p62.o(java.lang.Object):java.lang.Object");
    }
}
