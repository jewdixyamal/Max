package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vf3  reason: default package */
public final class vf3 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ wf3 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vf3(String str, wf3 wf3, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
        this.s0 = wf3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vf3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vf3 vf3 = new vf3(this.Z, this.s0, continuation);
        vf3.Y = obj;
        return vf3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: sx3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r11.X
            e5f r2 = defpackage.e5f.a
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 1
            r8 = 2
            wf3 r9 = r11.s0
            if (r1 == 0) goto L_0x003b
            if (r1 == r7) goto L_0x0037
            if (r1 == r8) goto L_0x0033
            if (r1 == r6) goto L_0x002f
            if (r1 == r5) goto L_0x0027
            if (r1 != r4) goto L_0x001f
            defpackage.od2.a0(r12)
            goto L_0x00ac
        L_0x001f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0027:
            java.lang.Object r1 = r11.Y
            sx3 r1 = (defpackage.sx3) r1
            defpackage.od2.a0(r12)
            goto L_0x0090
        L_0x002f:
            defpackage.od2.a0(r12)
            goto L_0x0083
        L_0x0033:
            defpackage.od2.a0(r12)
            goto L_0x0077
        L_0x0037:
            defpackage.od2.a0(r12)
            goto L_0x0066
        L_0x003b:
            defpackage.od2.a0(r12)
            java.lang.Object r12 = r11.Y
            r1 = r12
            sx3 r1 = (defpackage.sx3) r1
            khe r12 = defpackage.j15.a
            java.lang.String r12 = r11.Z
            java.lang.String r12 = defpackage.j15.a(r12)
            boolean r10 = defpackage.j1e.z(r1)
            if (r10 != 0) goto L_0x0052
            return r2
        L_0x0052:
            java.lang.String r10 = r9.b
            boolean r12 = defpackage.tpa.f(r12, r10)
            q0e r10 = r9.Z
            if (r12 != 0) goto L_0x0084
            tf3 r12 = defpackage.tf3.c
            r11.X = r7
            r10.m(r3, r12)
            if (r2 != r0) goto L_0x0066
            return r0
        L_0x0066:
            int r12 = defpackage.ft4.o
            kt4 r12 = defpackage.kt4.SECONDS
            long r4 = defpackage.z7.R(r8, r12)
            r11.X = r8
            java.lang.Object r12 = defpackage.j47.y(r4, r11)
            if (r12 != r0) goto L_0x0077
            return r0
        L_0x0077:
            q0e r12 = r9.Z
            tf3 r1 = defpackage.tf3.a
            r11.X = r6
            r12.m(r3, r1)
            if (r2 != r0) goto L_0x0083
            return r0
        L_0x0083:
            return r2
        L_0x0084:
            tf3 r12 = defpackage.tf3.b
            r11.Y = r1
            r11.X = r5
            r10.m(r3, r12)
            if (r2 != r0) goto L_0x0090
            return r0
        L_0x0090:
            boolean r12 = defpackage.j1e.z(r1)
            if (r12 != 0) goto L_0x0097
            return r2
        L_0x0097:
            r11.Y = r3
            r11.X = r4
            bc7[] r12 = defpackage.wf3.w0
            r9.getClass()
            uf3 r12 = new uf3
            r12.<init>(r9, r3)
            java.lang.Object r11 = defpackage.j1e.k(r12, r11)
            if (r11 != r0) goto L_0x00ac
            return r0
        L_0x00ac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf3.o(java.lang.Object):java.lang.Object");
    }
}
