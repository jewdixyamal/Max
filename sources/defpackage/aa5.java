package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: aa5  reason: default package */
public final class aa5 extends d8d implements hua {
    public static final /* synthetic */ int s0 = 0;
    public final long X;
    public final long Y;
    public final String Z;
    public final long b;
    public final String c;
    public final String o;

    public aa5(long j, long j2, String str, long j3, String str2, String str3) {
        this.b = j;
        this.c = str;
        this.o = str2;
        this.X = j2;
        this.Y = j3;
        this.Z = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r0 = defpackage.vx8.DELETED;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c() {
        /*
            r4 = this;
            long r0 = r4.X
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 1
            if (r2 > 0) goto L_0x000a
            return r3
        L_0x000a:
            au8 r4 = r4.n()
            cu8 r4 = r4.q(r0)
            if (r4 == 0) goto L_0x001c
            vx8 r0 = defpackage.vx8.DELETED
            vx8 r4 = r4.v0
            if (r4 != r0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            return r3
        L_0x001c:
            r4 = 3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa5.c():int");
    }

    public final void d() {
        r().d(this.b);
        e52 C = b().C(this.Y);
        long j = this.X;
        if (C != null) {
            e8d e8d = this.a;
            if (e8d == null) {
                e8d = null;
            }
            long j2 = C.b.a;
            ((sna) e8d.p.getValue()).getClass();
            sna.b(j2, j);
        }
        cu8 q = n().q(j);
        if (q == null || q.v0 == vx8.DELETED) {
            hm9.m("aa5", "onMaxFailCount: Message was deleted", new Object[0]);
            return;
        }
        n().x(q, iu8.ERROR);
        t().c(new l6f(q.t0, q.b, 0));
        r9d.y(u());
    }

    public final byte[] f() {
        Tasks.ExternalVideoSend externalVideoSend = new Tasks.ExternalVideoSend();
        externalVideoSend.requestId = this.b;
        externalVideoSend.externalUrl = this.c;
        externalVideoSend.attachLocalId = this.o;
        externalVideoSend.messageId = this.X;
        externalVideoSend.chatId = this.Y;
        externalVideoSend.stickerId = this.Z;
        return qw8.toByteArray(externalVideoSend);
    }

    public final long getId() {
        return this.b;
    }

    public final iua getType() {
        return iua.TYPE_EXTERNAL_GIF_SEND;
    }

    public final int h() {
        return 5;
    }

    public final void x() {
        e8d e8d = this.a;
        if (e8d == null) {
            e8d = null;
        }
        dg5 dg5 = (dg5) e8d.b.getValue();
        dg5.getClass();
        int ordinal = ((ag5) j47.f0(hz4.a, new cg5(dg5, this.b, this.c, this.o, this.X, this.Y, this.Z, (Continuation) null))).ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4) {
            if (ordinal == 5) {
                d();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
