package defpackage;

import java.util.Arrays;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: dp4  reason: default package */
public final class dp4 extends ol implements hua, lme {
    public final long X;
    public final String Y = dp4.class.getName();
    public final long o;

    public dp4(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = j3;
    }

    public final int c() {
        return 1;
    }

    public final void d() {
        hm9.p(this.Y, "onMaxFailCount", (Throwable) null);
        t().d(this.a);
    }

    public final void e(gle gle) {
        String str = this.Y;
        hm9.m(str, "onSuccess: " + gle, new Object[0]);
        e52 C = m().C(this.o);
        if (C == null) {
            hm9.G(str, "no chat, ignore!", (Throwable) null);
            return;
        }
        k92 k92 = C.b;
        if (k92.f0 != null) {
            long j = k92.g0;
            if (j == 0) {
                hm9.G(str, "local draft not yet sync, ignore!", (Throwable) null);
                return;
            }
            long j2 = this.X;
            if (j < j2) {
                m().k(this.o, this.X, (uaa) null);
                hm9.k0(str, (Exception) null, "chat has server draft older than current DRAFT_DISCARD server time, diff = %d, clear it", Arrays.copyOf(new Object[]{Long.valueOf(j2 - j)}, 1));
                return;
            }
            return;
        }
        hm9.G(str, "draft already is null, ignore!", (Throwable) null);
        m().k(this.o, this.X, (uaa) null);
    }

    public final byte[] f() {
        Tasks.DraftDiscard draftDiscard = new Tasks.DraftDiscard();
        draftDiscard.requestId = this.a;
        draftDiscard.chatId = this.o;
        draftDiscard.serverTime = this.X;
        return qw8.toByteArray(draftDiscard);
    }

    public final void g(pke pke) {
        if (!f46.U(pke.b)) {
            d();
        }
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_DRAFT_DISCARD;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        long j;
        e52 C = m().C(this.o);
        if (C == null) {
            hm9.m(this.Y, "createRequest: No chat. return null", new Object[0]);
            return null;
        }
        if (C.M()) {
            uj3 l = C.l();
            Long valueOf = l != null ? Long.valueOf(l.n()) : null;
            if (valueOf != null) {
                j = valueOf.longValue();
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            j = 0;
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        long j2 = i == 0 ? C.b.a : 0;
        tq2 tq2 = new tq2((sla) null, 11);
        if (i != 0) {
            tq2.i(j, "userId");
        }
        if (j2 != 0) {
            tq2.i(j2, ApiProtocol.PARAM_CHAT_ID);
        }
        long j3 = this.X;
        if (j3 != 0) {
            tq2.i(j3, "time");
        }
        return tq2;
    }
}
