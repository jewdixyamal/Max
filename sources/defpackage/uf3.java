package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uf3  reason: default package */
public final class uf3 extends ffe implements a66 {
    public long X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ wf3 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uf3(wf3 wf3, Continuation continuation) {
        super(2, continuation);
        this.s0 = wf3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uf3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uf3 uf3 = new uf3(this.s0, continuation);
        uf3.Z = obj;
        return uf3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        r14 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bc, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bd, code lost:
        r12 = r14;
        r14 = r13;
        r13 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d2, code lost:
        defpackage.hm9.p(r13.getClass().getName(), "fail to update safe mode", r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e0, code lost:
        r13 = r13.getLocalizedMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e4, code lost:
        if (r13 != null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e6, code lost:
        defpackage.pnf.o(r4.u0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x0013, B:12:0x002c] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x0013, B:18:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b A[ExcHandler: TamErrorException (r13v10 'e' ru.ok.tamtam.errors.TamErrorException A[CUSTOM_DECLARE]), Splitter:B:5:0x0013] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r14) {
        /*
            r13 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r13.Y
            r2 = 0
            r3 = 2
            wf3 r4 = r13.s0
            r5 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 == r5) goto L_0x0026
            if (r1 != r3) goto L_0x001e
            java.lang.Object r13 = r13.Z
            sx3 r13 = (defpackage.sx3) r13
            defpackage.od2.a0(r14)     // Catch:{ TamErrorException -> 0x001b, all -> 0x0018 }
            goto L_0x00c2
        L_0x0018:
            r14 = move-exception
            goto L_0x00ce
        L_0x001b:
            r13 = move-exception
            goto L_0x00e0
        L_0x001e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0026:
            long r6 = r13.X
            java.lang.Object r1 = r13.Z
            sx3 r1 = (defpackage.sx3) r1
            defpackage.od2.a0(r14)     // Catch:{ TamErrorException -> 0x001b, all -> 0x0031 }
            r14 = r1
            goto L_0x005d
        L_0x0031:
            r14 = move-exception
            r13 = r1
            goto L_0x00ce
        L_0x0035:
            defpackage.od2.a0(r14)
            java.lang.Object r14 = r13.Z
            sx3 r14 = (defpackage.sx3) r14
            int r1 = defpackage.ft4.o     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r6 = java.lang.System.nanoTime()     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            kt4 r1 = defpackage.kt4.NANOSECONDS     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r6 = defpackage.z7.S(r6, r1)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            je7 r1 = r4.o     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.Object r1 = r1.getValue()     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            q6f r1 = (defpackage.q6f) r1     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            r13.Z = r14     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            r13.X = r6     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            r13.Y = r5     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.Object r1 = r1.a(r5, r13)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            if (r1 != r0) goto L_0x005d
            return r0
        L_0x005d:
            je7 r1 = r4.c     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.Object r1 = r1.getValue()     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            q33 r1 = (defpackage.q33) r1     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.String r8 = r4.b     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            t33 r1 = (defpackage.t33) r1     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.String r10 = "app.pin_"
            r9.<init>(r10)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r10 = r1.t()     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            r9.append(r10)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.String r9 = r9.toString()     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            r1.m(r9, r8)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            je7 r1 = r4.c     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.Object r1 = r1.getValue()     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            q33 r1 = (defpackage.q33) r1     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            t33 r1 = (defpackage.t33) r1     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.String r8 = "app.onboarding.safe_mode"
            r1.j(r8, r5)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            int r1 = defpackage.ft4.o     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r8 = java.lang.System.nanoTime()     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            kt4 r1 = defpackage.kt4.NANOSECONDS     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r8 = defpackage.z7.S(r8, r1)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r6 = defpackage.ft4.g(r8, r6)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            kt4 r1 = defpackage.kt4.SECONDS     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r8 = defpackage.z7.R(r5, r1)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r6 = defpackage.ft4.g(r8, r6)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            long r8 = defpackage.ft4.e(r6)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            r10 = 0
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c1
            r13.Z = r14     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            r13.Y = r3     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            java.lang.Object r13 = defpackage.j47.y(r6, r13)     // Catch:{ TamErrorException -> 0x001b, all -> 0x00bc }
            if (r13 != r0) goto L_0x00c1
            return r0
        L_0x00bc:
            r13 = move-exception
            r12 = r14
            r14 = r13
            r13 = r12
            goto L_0x00ce
        L_0x00c1:
            r13 = r14
        L_0x00c2:
            defpackage.j1e.o(r13)     // Catch:{ TamErrorException -> 0x001b, all -> 0x0018 }
            s35 r14 = r4.v0     // Catch:{ TamErrorException -> 0x001b, all -> 0x0018 }
            e5f r0 = defpackage.e5f.a     // Catch:{ TamErrorException -> 0x001b, all -> 0x0018 }
            defpackage.pnf.o(r14, r0)     // Catch:{ TamErrorException -> 0x001b, all -> 0x0018 }
            r2 = r5
            goto L_0x00eb
        L_0x00ce:
            boolean r0 = r14 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L_0x00eb
            java.lang.Class r13 = r13.getClass()
            java.lang.String r13 = r13.getName()
            java.lang.String r0 = "fail to update safe mode"
            defpackage.hm9.p(r13, r0, r14)
            goto L_0x00eb
        L_0x00e0:
            java.lang.String r13 = r13.getLocalizedMessage()
            if (r13 == 0) goto L_0x00eb
            s35 r14 = r4.u0
            defpackage.pnf.o(r14, r13)
        L_0x00eb:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf3.o(java.lang.Object):java.lang.Object");
    }
}
