package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ug6  reason: default package */
public final class ug6 extends ffe implements c66 {
    public int X;
    public /* synthetic */ on5 Y;
    public /* synthetic */ Object[] Z;
    public final /* synthetic */ List s0;
    public final /* synthetic */ xg6 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ug6(Continuation continuation, List list, xg6 xg6) {
        super(3, continuation);
        this.s0 = list;
        this.t0 = xg6;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ug6 ug6 = new ug6((Continuation) obj3, this.s0, this.t0);
        ug6.Y = (on5) obj;
        ug6.Z = (Object[]) obj2;
        return ug6.o(e5f.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.X
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L_0x0023
            if (r1 == r2) goto L_0x0019
            if (r1 != r4) goto L_0x0011
            defpackage.od2.a0(r11)
            goto L_0x007d
        L_0x0011:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0019:
            java.lang.Object[] r1 = r10.Z
            uj3[] r1 = (defpackage.uj3[]) r1
            on5 r2 = r10.Y
            defpackage.od2.a0(r11)     // Catch:{ all -> 0x006f }
            goto L_0x006f
        L_0x0023:
            defpackage.od2.a0(r11)
            on5 r11 = r10.Y
            java.lang.Object[] r1 = r10.Z
            uj3[] r1 = (defpackage.uj3[]) r1
            gi9 r5 = new gi9
            r5.<init>((java.lang.Object) r3)
            int r6 = r1.length
            r7 = 0
        L_0x0033:
            if (r7 >= r6) goto L_0x004f
            r8 = r1[r7]
            boolean r8 = defpackage.i24.r(r8)
            if (r8 == 0) goto L_0x004c
            java.util.List r8 = r10.s0
            java.lang.Object r8 = r8.get(r7)
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            r5.a(r8)
        L_0x004c:
            int r7 = r7 + 1
            goto L_0x0033
        L_0x004f:
            boolean r6 = r5.j()
            if (r6 == 0) goto L_0x0070
            xg6 r6 = r10.t0
            je7 r6 = r6.c     // Catch:{ all -> 0x006e }
            java.lang.Object r6 = r6.getValue()     // Catch:{ all -> 0x006e }
            xb9 r6 = (defpackage.xb9) r6     // Catch:{ all -> 0x006e }
            long r7 = defpackage.xg6.i     // Catch:{ all -> 0x006e }
            r10.Y = r11     // Catch:{ all -> 0x006e }
            r10.Z = r1     // Catch:{ all -> 0x006e }
            r10.X = r2     // Catch:{ all -> 0x006e }
            java.lang.Object r2 = r6.t(r5, r7, r10)     // Catch:{ all -> 0x006e }
            if (r2 != r0) goto L_0x006e
            return r0
        L_0x006e:
            r2 = r11
        L_0x006f:
            r11 = r2
        L_0x0070:
            r10.Y = r3
            r10.Z = r3
            r10.X = r4
            java.lang.Object r10 = r11.a(r1, r10)
            if (r10 != r0) goto L_0x007d
            return r0
        L_0x007d:
            e5f r10 = defpackage.e5f.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ug6.o(java.lang.Object):java.lang.Object");
    }
}
