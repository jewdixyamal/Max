package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: vp5  reason: default package */
public final class vp5 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ Object t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp5(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.s0 = obj;
        this.t0 = obj2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                vp5 vp5 = new vp5((Object) (a66) this.t0, (Continuation) obj3, 0);
                vp5.Z = (on5) obj;
                vp5.s0 = obj2;
                return vp5.o(e5f.a);
            case 1:
                vp5 vp52 = new vp5((Continuation) obj3, (Object) (e66) this.t0, 1);
                vp52.Z = (on5) obj;
                vp52.s0 = (Object[]) obj2;
                return vp52.o(e5f.a);
            case 2:
                vp5 vp53 = new vp5((Continuation) obj3, (Object) (g66) this.t0, 2);
                vp53.Z = (on5) obj;
                vp53.s0 = (Object[]) obj2;
                return vp53.o(e5f.a);
            case 3:
                vp5 vp54 = new vp5((Continuation) obj3, (Object) (h66) this.t0, 3);
                vp54.Z = (on5) obj;
                vp54.s0 = (Object[]) obj2;
                return vp54.o(e5f.a);
            case 4:
                vp5 vp55 = new vp5((Object) (c66) this.t0, (Continuation) obj3, 4);
                vp55.Z = (on5) obj;
                vp55.s0 = (Object[]) obj2;
                return vp55.o(e5f.a);
            case 5:
                vp5 vp56 = new vp5((Object) (vj7) this.t0, (Continuation) obj3, 5);
                vp56.Z = (on5) obj;
                vp56.s0 = (Throwable) obj2;
                return vp56.o(e5f.a);
            case 6:
                vp5 vp57 = new vp5((Object) (bp8) this.t0, (Continuation) obj3, 6);
                vp57.Z = (List) obj;
                vp57.s0 = (yn8) obj2;
                return vp57.o(e5f.a);
            case 7:
                vp5 vp58 = new vp5((Continuation) obj3, (Object) (bp8) this.t0, 7);
                vp58.Z = (on5) obj;
                vp58.s0 = obj2;
                return vp58.o(e5f.a);
            case 8:
                vp5 vp59 = new vp5((Continuation) obj3, (Object) (ltd) this.t0, 8);
                vp59.Z = (on5) obj;
                vp59.s0 = obj2;
                return vp59.o(e5f.a);
            case 9:
                on5 on5 = (on5) obj;
                vp5 vp510 = new vp5((cge) this.s0, (d7f) this.t0, (Continuation) obj3, 9);
                vp510.Z = (Throwable) obj2;
                vp510.o(e5f.a);
                return tx3.a;
            case 10:
                on5 on52 = (on5) obj;
                vp5 vp511 = new vp5((cge) this.s0, (v6f) this.t0, (Continuation) obj3, 10);
                vp511.Z = (Throwable) obj2;
                vp511.o(e5f.a);
                return tx3.a;
            default:
                on5 on53 = (on5) obj;
                vp5 vp512 = new vp5((ige) this.s0, (iy8) this.t0, (Continuation) obj3, 11);
                vp512.Z = (Throwable) obj2;
                vp512.o(e5f.a);
                return tx3.a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: on5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: on5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: on5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: on5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: on5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.X
            switch(r0) {
                case 0: goto L_0x03ca;
                case 1: goto L_0x0379;
                case 2: goto L_0x0323;
                case 3: goto L_0x02c9;
                case 4: goto L_0x027a;
                case 5: goto L_0x023a;
                case 6: goto L_0x0203;
                case 7: goto L_0x01ae;
                case 8: goto L_0x0132;
                case 9: goto L_0x00f1;
                case 10: goto L_0x005d;
                default: goto L_0x0005;
            }
        L_0x0005:
            tx3 r0 = defpackage.tx3.a
            int r1 = r13.Y
            r2 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r2) goto L_0x0016
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0016:
            java.lang.Object r13 = r13.Z
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            defpackage.od2.a0(r14)
            goto L_0x005b
        L_0x001e:
            defpackage.od2.a0(r14)
            java.lang.Object r14 = r13.Z
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            java.lang.Object r1 = r13.s0
            ige r1 = (defpackage.ige) r1
            r1.getClass()
            boolean r3 = r14 instanceof ru.ok.tamtam.errors.TamErrorException
            if (r3 == 0) goto L_0x005c
            r3 = r14
            ru.ok.tamtam.errors.TamErrorException r3 = (ru.ok.tamtam.errors.TamErrorException) r3
            pke r3 = r3.a
            java.lang.String r3 = r3.b
            java.lang.String r4 = "invalid.token"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x005c
            java.lang.Object r3 = r13.t0
            iy8 r3 = (defpackage.iy8) r3
            d7f r3 = defpackage.ige.a(r1, r3)
            je7 r1 = r1.b
            java.lang.Object r1 = r1.getValue()
            cge r1 = (defpackage.cge) r1
            r13.Z = r14
            r13.Y = r2
            java.lang.Object r13 = r1.d(r3, r13)
            if (r13 != r0) goto L_0x005a
            return r0
        L_0x005a:
            r13 = r14
        L_0x005b:
            r14 = r13
        L_0x005c:
            throw r14
        L_0x005d:
            tx3 r0 = defpackage.tx3.a
            int r1 = r13.Y
            r2 = 1
            if (r1 == 0) goto L_0x0076
            if (r1 == r2) goto L_0x006e
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x006e:
            java.lang.Object r13 = r13.Z
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            defpackage.od2.a0(r14)
            goto L_0x00b0
        L_0x0076:
            defpackage.od2.a0(r14)
            java.lang.Object r14 = r13.Z
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            boolean r1 = r14 instanceof one.me.sdk.transfer.exceptions.HttpUrlExpiredException
            java.lang.Object r3 = r13.t0
            v6f r3 = (defpackage.v6f) r3
            java.lang.Object r4 = r13.s0
            cge r4 = (defpackage.cge) r4
            if (r1 == 0) goto L_0x00b1
            r13.Z = r14
            r13.Y = r2
            java.lang.String r1 = r4.b
            java.lang.String r2 = "Url is expired, reset it in repository"
            defpackage.hm9.m0(r1, r2, new java.lang.Object[0])
            u6f r1 = r3.b()
            r2 = 0
            r1.d = r2
            r2 = 0
            r1.e = r2
            v6f r2 = new v6f
            r2.<init>(r1)
            java.lang.Object r13 = r4.f(r2, r13)
            if (r13 != r0) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            e5f r13 = defpackage.e5f.a
        L_0x00ac:
            if (r13 != r0) goto L_0x00af
            return r0
        L_0x00af:
            r13 = r14
        L_0x00b0:
            throw r13
        L_0x00b1:
            je7 r13 = r4.d
            java.lang.Object r13 = r13.getValue()
            q33 r13 = (defpackage.q33) r13
            t33 r13 = (defpackage.t33) r13
            r13.getClass()
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.DAYS
            r0 = 7
            long r5 = r13.toMillis(r0)
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x00f0
            long r5 = java.lang.System.currentTimeMillis()
            long r2 = r3.i
            long r5 = r5 - r2
            je7 r2 = r4.d
            java.lang.Object r2 = r2.getValue()
            q33 r2 = (defpackage.q33) r2
            t33 r2 = (defpackage.t33) r2
            r2.getClass()
            long r0 = r13.toMillis(r0)
            int r13 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x00f0
            ru.ok.tamtam.rx.TamTamObservables$TamObservableException r13 = new ru.ok.tamtam.rx.TamTamObservables$TamObservableException
            java.lang.String r0 = "timeout reached"
            r13.<init>(r0, r14)
            throw r13
        L_0x00f0:
            throw r14
        L_0x00f1:
            tx3 r0 = defpackage.tx3.a
            int r1 = r13.Y
            r2 = 1
            if (r1 == 0) goto L_0x010a
            if (r1 == r2) goto L_0x0102
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0102:
            java.lang.Object r13 = r13.Z
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            defpackage.od2.a0(r14)
            goto L_0x0131
        L_0x010a:
            defpackage.od2.a0(r14)
            java.lang.Object r14 = r13.Z
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            java.lang.Object r1 = r13.s0
            cge r1 = (defpackage.cge) r1
            java.lang.String r3 = r1.b
            java.lang.String r4 = "Got error during upload"
            defpackage.hm9.p(r3, r4, r14)
            w0f r3 = r1.a
            r3.e(r14)
            r13.Z = r14
            r13.Y = r2
            java.lang.Object r2 = r13.t0
            d7f r2 = (defpackage.d7f) r2
            java.lang.Object r13 = r1.h(r2, r13)
            if (r13 != r0) goto L_0x0130
            return r0
        L_0x0130:
            r13 = r14
        L_0x0131:
            throw r13
        L_0x0132:
            tx3 r0 = defpackage.tx3.a
            int r1 = r13.Y
            r2 = 1
            if (r1 == 0) goto L_0x0147
            if (r1 != r2) goto L_0x013f
            defpackage.od2.a0(r14)
            goto L_0x01ab
        L_0x013f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0147:
            defpackage.od2.a0(r14)
            java.lang.Object r14 = r13.Z
            on5 r14 = (defpackage.on5) r14
            java.lang.Object r1 = r13.s0
            java.lang.Number r1 = (java.lang.Number) r1
            r1.intValue()
            java.lang.Object r1 = r13.t0
            ltd r1 = (defpackage.ltd) r1
            je7 r3 = r1.e
            java.lang.Object r3 = r3.getValue()
            iy2 r3 = (defpackage.iy2) r3
            long r4 = r1.a
            jz2 r3 = (defpackage.jz2) r3
            w7c r3 = r3.m(r4)
            t03 r4 = new t03
            r5 = 11
            r4.<init>(r3, r5)
            je7 r3 = r1.f
            java.lang.Object r3 = r3.getValue()
            ds3 r3 = (defpackage.ds3) r3
            long r5 = r1.d
            w7c r3 = r3.c(r5)
            t03 r5 = new t03
            r6 = 11
            r5.<init>(r3, r6)
            m1d r3 = new m1d
            r6 = 0
            r7 = 2
            r3.<init>((java.lang.Object) r1, (kotlin.coroutines.Continuation) r6, (int) r7)
            j31 r6 = new j31
            r7 = 4
            r6.<init>(r4, r5, r3, r7)
            mn5 r3 = defpackage.od2.x(r6)
            kke r1 = r1.c
            w9a r1 = (defpackage.w9a) r1
            nx3 r1 = r1.b()
            mn5 r1 = defpackage.od2.F(r3, r1)
            r13.Y = r2
            java.lang.Object r13 = defpackage.od2.y(r1, r14, r13)
            if (r13 != r0) goto L_0x01ab
            goto L_0x01ad
        L_0x01ab:
            e5f r0 = defpackage.e5f.a
        L_0x01ad:
            return r0
        L_0x01ae:
            tx3 r0 = defpackage.tx3.a
            int r1 = r13.Y
            r2 = 1
            if (r1 == 0) goto L_0x01c3
            if (r1 != r2) goto L_0x01bb
            defpackage.od2.a0(r14)
            goto L_0x0200
        L_0x01bb:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x01c3:
            defpackage.od2.a0(r14)
            java.lang.Object r14 = r13.Z
            on5 r14 = (defpackage.on5) r14
            java.lang.Object r1 = r13.s0
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r13.t0
            bp8 r3 = (defpackage.bp8) r3
            do8 r4 = r3.Y
            kld r4 = r4.a
            v7c r5 = new v7c
            r5.<init>(r4)
            vp5 r4 = new vp5
            r6 = 0
            r7 = 6
            r4.<init>((java.lang.Object) r3, (kotlin.coroutines.Continuation) r6, (int) r7)
            j31 r3 = new j31
            r3.<init>(r1, r5, r4)
            vo8 r4 = new vo8
            r4.<init>(r1, r6)
            zn5 r1 = new zn5
            r1.<init>(r3, r4)
            r3 = 200(0xc8, double:9.9E-322)
            mn5 r1 = defpackage.od2.u(r1, r3)
            r13.Y = r2
            java.lang.Object r13 = defpackage.od2.y(r1, r14, r13)
            if (r13 != r0) goto L_0x0200
            goto L_0x0202
        L_0x0200:
            e5f r0 = defpackage.e5f.a
        L_0x0202:
            return r0
        L_0x0203:
            tx3 r0 = defpackage.tx3.a
            int r1 = r13.Y
            r2 = 1
            if (r1 == 0) goto L_0x0218
            if (r1 != r2) goto L_0x0210
            defpackage.od2.a0(r14)
            goto L_0x0233
        L_0x0210:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0218:
            defpackage.od2.a0(r14)
            java.lang.Object r14 = r13.Z
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r1 = r13.s0
            yn8 r1 = (defpackage.yn8) r1
            r3 = 0
            r13.Z = r3
            r13.Y = r2
            java.lang.Object r2 = r13.t0
            bp8 r2 = (defpackage.bp8) r2
            java.lang.Object r14 = defpackage.bp8.q(r1, r2, r14, r13)
            if (r14 != r0) goto L_0x0233
            goto L_0x0239
        L_0x0233:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.List r0 = defpackage.x53.D0(r14)
        L_0x0239:
            return r0
        L_0x023a:
            tx3 r0 = defpackage.tx3.a
            int r1 = r13.Y
            r2 = 1
            if (r1 == 0) goto L_0x024f
            if (r1 != r2) goto L_0x0247
            defpackage.od2.a0(r14)
            goto L_0x0277
        L_0x0247:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x024f:
            defpackage.od2.a0(r14)
            java.lang.Object r14 = r13.Z
            on5 r14 = (defpackage.on5) r14
            java.lang.Object r1 = r13.s0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            boolean r3 = r1 instanceof java.util.concurrent.CancellationException
            if (r3 != 0) goto L_0x0277
            java.lang.Object r3 = r13.t0
            vj7 r3 = (defpackage.vj7) r3
            java.lang.String r3 = r3.r
            java.lang.String r4 = "fail"
            defpackage.hm9.p(r3, r4, r1)
            oi7 r1 = defpackage.oi7.a
            r3 = 0
            r13.Z = r3
            r13.Y = r2
            java.lang.Object r13 = r14.a(r1, r13)
            if (r13 != r0) goto L_0x0277
            goto L_0x0279
        L_0x0277:
            e5f r0 = defpackage.e5f.a
        L_0x0279:
            return r0
        L_0x027a:
            tx3 r0 = defpackage.tx3.a
            int r1 = r13.Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x029a
            if (r1 == r3) goto L_0x0292
            if (r1 != r2) goto L_0x028a
            defpackage.od2.a0(r14)
            goto L_0x02c6
        L_0x028a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0292:
            java.lang.Object r1 = r13.Z
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r14)
            goto L_0x02ba
        L_0x029a:
            defpackage.od2.a0(r14)
            java.lang.Object r14 = r13.Z
            r1 = r14
            on5 r1 = (defpackage.on5) r1
            java.lang.Object r14 = r13.s0
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            r4 = 0
            r4 = r14[r4]
            r14 = r14[r3]
            r13.Z = r1
            r13.Y = r3
            java.lang.Object r3 = r13.t0
            c66 r3 = (defpackage.c66) r3
            java.lang.Object r14 = r3.invoke(r4, r14, r13)
            if (r14 != r0) goto L_0x02ba
            goto L_0x02c8
        L_0x02ba:
            r3 = 0
            r13.Z = r3
            r13.Y = r2
            java.lang.Object r13 = r1.a(r14, r13)
            if (r13 != r0) goto L_0x02c6
            goto L_0x02c8
        L_0x02c6:
            e5f r0 = defpackage.e5f.a
        L_0x02c8:
            return r0
        L_0x02c9:
            tx3 r0 = defpackage.tx3.a
            int r1 = r13.Y
            e5f r2 = defpackage.e5f.a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x02eb
            if (r1 == r4) goto L_0x02e3
            if (r1 != r3) goto L_0x02db
            defpackage.od2.a0(r14)
            goto L_0x0321
        L_0x02db:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x02e3:
            java.lang.Object r1 = r13.Z
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r14)
            goto L_0x0315
        L_0x02eb:
            defpackage.od2.a0(r14)
            java.lang.Object r14 = r13.Z
            r1 = r14
            on5 r1 = (defpackage.on5) r1
            java.lang.Object r14 = r13.s0
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            r5 = 0
            r7 = r14[r5]
            r8 = r14[r4]
            r9 = r14[r3]
            r5 = 3
            r10 = r14[r5]
            r5 = 4
            r11 = r14[r5]
            r13.Z = r1
            r13.Y = r4
            java.lang.Object r14 = r13.t0
            r6 = r14
            h66 r6 = (defpackage.h66) r6
            r12 = r13
            r6.k(r7, r8, r9, r10, r11, r12)
            if (r2 != r0) goto L_0x0314
            goto L_0x0322
        L_0x0314:
            r14 = r2
        L_0x0315:
            r4 = 0
            r13.Z = r4
            r13.Y = r3
            java.lang.Object r13 = r1.a(r14, r13)
            if (r13 != r0) goto L_0x0321
            goto L_0x0322
        L_0x0321:
            r0 = r2
        L_0x0322:
            return r0
        L_0x0323:
            tx3 r0 = defpackage.tx3.a
            int r1 = r13.Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0343
            if (r1 == r3) goto L_0x033b
            if (r1 != r2) goto L_0x0333
            defpackage.od2.a0(r14)
            goto L_0x0376
        L_0x0333:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x033b:
            java.lang.Object r1 = r13.Z
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r14)
            goto L_0x036a
        L_0x0343:
            defpackage.od2.a0(r14)
            java.lang.Object r14 = r13.Z
            r1 = r14
            on5 r1 = (defpackage.on5) r1
            java.lang.Object r14 = r13.s0
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            r4 = 0
            r6 = r14[r4]
            r7 = r14[r3]
            r8 = r14[r2]
            r4 = 3
            r9 = r14[r4]
            r13.Z = r1
            r13.Y = r3
            java.lang.Object r14 = r13.t0
            r5 = r14
            g66 r5 = (defpackage.g66) r5
            r10 = r13
            java.lang.Object r14 = r5.m(r6, r7, r8, r9, r10)
            if (r14 != r0) goto L_0x036a
            goto L_0x0378
        L_0x036a:
            r3 = 0
            r13.Z = r3
            r13.Y = r2
            java.lang.Object r13 = r1.a(r14, r13)
            if (r13 != r0) goto L_0x0376
            goto L_0x0378
        L_0x0376:
            e5f r0 = defpackage.e5f.a
        L_0x0378:
            return r0
        L_0x0379:
            tx3 r0 = defpackage.tx3.a
            int r1 = r13.Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0399
            if (r1 == r3) goto L_0x0391
            if (r1 != r2) goto L_0x0389
            defpackage.od2.a0(r14)
            goto L_0x03c7
        L_0x0389:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0391:
            java.lang.Object r1 = r13.Z
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r14)
            goto L_0x03bb
        L_0x0399:
            defpackage.od2.a0(r14)
            java.lang.Object r14 = r13.Z
            r1 = r14
            on5 r1 = (defpackage.on5) r1
            java.lang.Object r14 = r13.s0
            java.lang.Object[] r14 = (java.lang.Object[]) r14
            r4 = 0
            r4 = r14[r4]
            r5 = r14[r3]
            r14 = r14[r2]
            r13.Z = r1
            r13.Y = r3
            java.lang.Object r3 = r13.t0
            e66 r3 = (defpackage.e66) r3
            java.lang.Object r14 = r3.h(r4, r5, r14, r13)
            if (r14 != r0) goto L_0x03bb
            goto L_0x03c9
        L_0x03bb:
            r3 = 0
            r13.Z = r3
            r13.Y = r2
            java.lang.Object r13 = r1.a(r14, r13)
            if (r13 != r0) goto L_0x03c7
            goto L_0x03c9
        L_0x03c7:
            e5f r0 = defpackage.e5f.a
        L_0x03c9:
            return r0
        L_0x03ca:
            tx3 r0 = defpackage.tx3.a
            int r1 = r13.Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x03ea
            if (r1 == r3) goto L_0x03e2
            if (r1 != r2) goto L_0x03da
            defpackage.od2.a0(r14)
            goto L_0x040f
        L_0x03da:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x03e2:
            java.lang.Object r1 = r13.Z
            on5 r1 = (defpackage.on5) r1
            defpackage.od2.a0(r14)
            goto L_0x0403
        L_0x03ea:
            defpackage.od2.a0(r14)
            java.lang.Object r14 = r13.Z
            r1 = r14
            on5 r1 = (defpackage.on5) r1
            java.lang.Object r14 = r13.s0
            r13.Z = r1
            r13.Y = r3
            java.lang.Object r3 = r13.t0
            a66 r3 = (defpackage.a66) r3
            java.lang.Object r14 = r3.invoke(r14, r13)
            if (r14 != r0) goto L_0x0403
            goto L_0x0411
        L_0x0403:
            r3 = 0
            r13.Z = r3
            r13.Y = r2
            java.lang.Object r13 = r1.a(r14, r13)
            if (r13 != r0) goto L_0x040f
            goto L_0x0411
        L_0x040f:
            e5f r0 = defpackage.e5f.a
        L_0x0411:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp5.o(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp5(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.t0 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp5(Continuation continuation, Object obj, int i) {
        super(3, continuation);
        this.X = i;
        this.t0 = obj;
    }
}
