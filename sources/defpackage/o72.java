package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: o72  reason: default package */
public final class o72 extends ol implements lme, hua {
    public final da3 X;
    public final String Y = o72.class.getName();
    public final long o;

    public o72(long j, long j2, da3 da3) {
        super(j);
        this.o = j2;
        this.X = da3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r3 = r3.b.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c() {
        /*
            r3 = this;
            p82 r0 = r3.m()
            long r1 = r3.o
            e52 r3 = r0.C(r1)
            if (r3 == 0) goto L_0x001b
            k92 r3 = r3.b
            i92 r3 = r3.c
            i92 r0 = defpackage.i92.o
            if (r3 == r0) goto L_0x001b
            i92 r0 = defpackage.i92.X
            if (r3 != r0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = 1
            return r3
        L_0x001b:
            r3 = 3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o72.c():int");
    }

    public final void d() {
        t().d(this.a);
    }

    public final void e(gle gle) {
        l().c(new p72(this.a, this.o));
    }

    public final byte[] f() {
        Tasks.ChatComplain chatComplain = new Tasks.ChatComplain();
        chatComplain.requestId = this.a;
        chatComplain.chatId = this.o;
        da3 da3 = this.X;
        chatComplain.complaint = da3 == null ? "" : da3.a;
        return qw8.toByteArray(chatComplain);
    }

    public final void g(pke pke) {
        if (!f46.U(pke.b)) {
            d();
            l().c(new oi0(pke));
        }
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_CHAT_COMPLAIN;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        e52 C = m().C(this.o);
        if (C == null) {
            hm9.m(this.Y, "chat is null", new Object[0]);
            return null;
        }
        long j = C.b.a;
        au auVar = new au((sla) null, 16);
        auVar.i(j, ApiProtocol.PARAM_CHAT_ID);
        da3 da3 = this.X;
        if (da3 != null) {
            auVar.p("complaint", da3.a);
        }
        return auVar;
    }
}
