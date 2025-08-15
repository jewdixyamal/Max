package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: kf9  reason: default package */
public final class kf9 extends ol implements lme, hua {
    public final String X;
    public final long Y;
    public final long Z;
    public final String o;
    public final kv0 s0;
    public final nv0 t0;

    public kf9(long j, String str, String str2, long j2, long j3, kv0 kv0, nv0 nv0) {
        super(j);
        this.o = str;
        this.X = str2;
        this.Y = j2;
        this.Z = j3;
        this.s0 = kv0;
        this.t0 = nv0;
    }

    public final int c() {
        return 1;
    }

    public final void d() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        plVar.e().d(this.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.gle r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = 1
            r2 = r27
            lf9 r2 = (defpackage.lf9) r2
            pl r3 = r0.c
            if (r3 == 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r3 = 0
        L_0x000d:
            au8 r3 = r3.d()
            long r5 = r0.Z
            cu8 r3 = r3.q(r5)
            if (r3 == 0) goto L_0x01ba
            vx8 r5 = defpackage.vx8.DELETED
            vx8 r6 = r3.v0
            if (r6 != r5) goto L_0x0021
            goto L_0x01ba
        L_0x0021:
            fs8 r5 = r2.c
            if (r5 == 0) goto L_0x0106
            pl r6 = r0.c
            if (r6 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r6 = 0
        L_0x002b:
            p82 r6 = r6.c()
            long r7 = r3.t0
            e52 r3 = r6.C(r7)
            pl r6 = r0.c
            if (r6 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r6 = 0
        L_0x003b:
            je7 r6 = r6.D
            java.lang.Object r6 = r6.getValue()
            jrc r6 = (defpackage.jrc) r6
            es8 r7 = r3.c
            cu8 r7 = r7.a
            long r10 = r7.c
            r6.getClass()
            java.lang.String r15 = "jrc"
            java.lang.String r7 = "onSaveMessage: insert new message"
            defpackage.hm9.m(r15, r7, new java.lang.Object[0])
            boolean r7 = r3.F()
            if (r7 != 0) goto L_0x0066
            m7b r7 = r6.e
            p7b r7 = (defpackage.p7b) r7
            t33 r7 = r7.a
            long r7 = r7.t()
            r16 = r7
            goto L_0x0068
        L_0x0066:
            r16 = 0
        L_0x0068:
            au8 r7 = r6.a
            long r8 = r3.a
            r21 = r10
            r10 = r16
            r12 = r5
            long r7 = r7.f(r8, r10, r12)
            au8 r9 = r6.a
            cu8 r7 = r9.q(r7)
            if (r7 != 0) goto L_0x007f
            goto L_0x0106
        L_0x007f:
            t6b r8 = r6.b
            r8.b(r3, r7)
            k92 r8 = r3.b
            e92 r8 = r8.n
            mg4 r9 = r7.U0
            int r8 = r8.c(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r10 = "onSaveMessage: chunks count = %d"
            defpackage.hm9.m(r15, r10, r8)
            r18 = 1
            r20 = 0
            p82 r8 = r6.c
            long r11 = r3.a
            r3 = r15
            r15 = r8
            r16 = r11
            r19 = r7
            e52 r8 = r15.T(r16, r18, r19, r20, r21)
            if (r8 == 0) goto L_0x0106
            k92 r11 = r8.b
            e92 r11 = r11.n
            java.util.ArrayList r9 = r11.d(r9)
            int r9 = r9.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            defpackage.hm9.m(r3, r10, r9)
            vz2 r3 = new vz2
            long r9 = r8.a
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r3.<init>(r9, r1)
            av0 r9 = r6.d
            r9.c(r3)
            mna r3 = new mna
            long r10 = r7.b
            r22 = 0
            long r13 = r8.a
            long r4 = r5.Y
            r12 = r2
            long r1 = r7.Y
            mg4 r15 = r7.U0
            r25 = r15
            r15 = r3
            r16 = r13
            r18 = r4
            r20 = r10
            r23 = r1
            r15.<init>(r16, r18, r20, r22, r23, r25)
            r9.c(r3)
            boolean r1 = r7.n()
            if (r1 == 0) goto L_0x0107
            cz r1 = r6.f
            r1.a(r7)
            goto L_0x0107
        L_0x0106:
            r12 = r2
        L_0x0107:
            r1 = 0
            r0.u(r1)
            f52 r2 = r12.o
            java.lang.String r3 = r12.X
            if (r2 == 0) goto L_0x01bd
            boolean r3 = defpackage.oag.t(r3)
            if (r3 != 0) goto L_0x01bd
            pl r3 = r0.c
            if (r3 == 0) goto L_0x011c
            goto L_0x011d
        L_0x011c:
            r3 = 0
        L_0x011d:
            p82 r3 = r3.c()
            java.util.List r4 = java.util.Collections.singletonList(r2)
            gi9 r3 = r3.c0(r4)
            boolean r4 = r3.j()
            if (r4 == 0) goto L_0x0179
            long[] r2 = r3.b
            long[] r3 = r3.a
            int r4 = r3.length
            int r4 = r4 + -2
            if (r4 < 0) goto L_0x0171
            r5 = r1
        L_0x0139:
            r6 = r3[r5]
            long r9 = ~r6
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r6
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x016c
            int r9 = r5 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r1
        L_0x0153:
            if (r11 >= r9) goto L_0x0168
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r6
            r14 = 128(0x80, double:6.32E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L_0x0164
            int r1 = r5 << 3
            int r1 = r1 + r11
            r1 = r2[r1]
            goto L_0x0190
        L_0x0164:
            long r6 = r6 >> r10
            r8 = 1
            int r11 = r11 + r8
            goto L_0x0153
        L_0x0168:
            r8 = 1
            if (r9 != r10) goto L_0x0171
            goto L_0x016d
        L_0x016c:
            r8 = 1
        L_0x016d:
            if (r5 == r4) goto L_0x0171
            int r5 = r5 + r8
            goto L_0x0139
        L_0x0171:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "The LongSet is empty"
            r0.<init>(r1)
            throw r0
        L_0x0179:
            pl r1 = r0.c
            if (r1 == 0) goto L_0x017e
            goto L_0x017f
        L_0x017e:
            r1 = 0
        L_0x017f:
            p82 r1 = r1.c()
            long r2 = r2.a
            e52 r1 = r1.z(r2)
            if (r1 == 0) goto L_0x018e
            long r1 = r1.a
            goto L_0x0190
        L_0x018e:
            r1 = 0
        L_0x0190:
            pl r3 = r0.c
            if (r3 == 0) goto L_0x0195
            goto L_0x0196
        L_0x0195:
            r3 = 0
        L_0x0196:
            p82 r3 = r3.c()
            r4 = 1
            r3.Y(r1, r4)
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x01bd
            pl r0 = r0.c
            if (r0 == 0) goto L_0x01aa
            r4 = r0
            goto L_0x01ab
        L_0x01aa:
            r4 = 0
        L_0x01ab:
            av0 r0 = r4.b()
            su r1 = new su
            r2 = 9
            r1.<init>(r2)
            r0.c(r1)
            goto L_0x01bd
        L_0x01ba:
            r26.d()
        L_0x01bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf9.e(gle):void");
    }

    public final byte[] f() {
        Tasks.MsgSendCallback msgSendCallback = new Tasks.MsgSendCallback();
        msgSendCallback.requestId = this.a;
        msgSendCallback.callbackId = this.o;
        msgSendCallback.payload = this.X;
        msgSendCallback.timestamp = this.Y;
        msgSendCallback.messageId = this.Z;
        msgSendCallback.buttonType = this.t0.a;
        Tasks.MsgSendCallback.ButtonPosition buttonPosition = new Tasks.MsgSendCallback.ButtonPosition();
        kv0 kv0 = this.s0;
        buttonPosition.row = kv0.a;
        buttonPosition.column = kv0.b;
        msgSendCallback.buttonPosition = buttonPosition;
        return qw8.toByteArray(msgSendCallback);
    }

    public final void g(pke pke) {
        if (!f46.U(pke.b)) {
            d();
            u(false);
            pl plVar = this.c;
            pl plVar2 = null;
            if (plVar == null) {
                plVar = null;
            }
            cu8 q = plVar.d().q(this.Z);
            if (q == null || q.v0 == vx8.DELETED) {
                d();
                return;
            }
            pl plVar3 = this.c;
            if (plVar3 != null) {
                plVar2 = plVar3;
            }
            plVar2.b().c(new oi0(pke));
            return;
        }
        u(true);
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_MSG_SEND_CALLBACK;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        Long valueOf = Long.valueOf(this.Y);
        String str = this.t0.a;
        tq2 tq2 = new tq2((sla) null, 27);
        tq2.p("callbackId", this.o);
        tq2.p(ApiProtocol.PARAM_PAYLOAD, this.X);
        ((HashMap) tq2.b).put("timestamp", valueOf);
        if (str != null) {
            tq2.p("type", str);
        }
        return tq2;
    }

    public final void u(boolean z) {
        pl plVar = this.c;
        pl plVar2 = null;
        if (plVar == null) {
            plVar = null;
        }
        au8 d = plVar.d();
        long j = this.Z;
        cu8 q = d.q(j);
        if (q == null || q.v0 == vx8.DELETED) {
            d();
            return;
        }
        pl plVar3 = this.c;
        if (plVar3 == null) {
            plVar3 = null;
        }
        r79 r79 = (r79) plVar3.x.getValue();
        xa1 xa1 = new xa1((Object) this, z, 3);
        r79.getClass();
        r79.a.n(j, new wp((m56) xa1, r79));
        pl plVar4 = this.c;
        if (plVar4 != null) {
            plVar2 = plVar4;
        }
        plVar2.b().c(new l6f(q.t0, q.b, 0));
    }
}
