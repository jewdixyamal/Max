package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: hp4  reason: default package */
public final class hp4 extends ol implements hua, lme {
    public final uaa X;
    public final String Y = hp4.class.getName();
    public final long o;

    public hp4(long j, long j2, uaa uaa) {
        super(j);
        this.o = j2;
        this.X = uaa;
    }

    public final int c() {
        e52 C = m().C(this.o);
        String str = this.Y;
        if (C == null) {
            hm9.m(str, "onPreExecute: No chat. remove task", new Object[0]);
            return 3;
        }
        uaa uaa = this.X;
        if (uaa == null) {
            hm9.m(str, "onPreExecute: could not deserialize draft, remove task", new Object[0]);
            return 3;
        } else if (t20.a(uaa.a())) {
            return 1;
        } else {
            hm9.m(str, "onPreExecute: Attaches not ready. skip task", new Object[0]);
            return 2;
        }
    }

    public final void d() {
        hm9.p(this.Y, "onMaxFailCount", (Throwable) null);
        t().d(this.a);
    }

    public final void e(gle gle) {
        ip4 ip4 = (ip4) gle;
        String str = this.Y;
        hm9.m(str, "onSuccess: " + ip4, new Object[0]);
        p82 m = m();
        long j = this.o;
        e52 C = m.C(j);
        if (C == null) {
            hm9.m(str, "onSuccess: No chat. return", new Object[0]);
            return;
        }
        k92 k92 = C.b;
        uaa uaa = k92.f0;
        long j2 = k92.g0;
        if (uaa == null && j2 > ip4.c) {
            hm9.m0(str, "onSuccess: draft was discarded", new Object[0]);
        } else if (j2 > ip4.c) {
            hm9.m0(str, "local draft time more than response, ignore!", new Object[0]);
        } else {
            uaa uaa2 = this.X;
            if (uaa2 == null) {
                hm9.m0(str, "could not deserialize draft", new Object[0]);
                m().p(j);
                return;
            }
            p82 m2 = m();
            pl plVar = this.c;
            if (plVar == null) {
                plVar = null;
            }
            m2.k(this.o, ip4.c, ((jp4) plVar.S.getValue()).a(uaa2, Long.valueOf(ip4.c)));
        }
    }

    public final byte[] f() {
        Tasks.DraftSave draftSave = new Tasks.DraftSave();
        draftSave.requestId = this.a;
        draftSave.chatId = this.o;
        draftSave.draft = gp4.b(this.X);
        return qw8.toByteArray(draftSave);
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
        return iua.TYPE_DRAFT_SAVE;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        long j;
        e52 C = m().C(this.o);
        String str = this.Y;
        if (C == null) {
            hm9.m(str, "createRequest: No chat. return null", new Object[0]);
            return null;
        }
        uaa uaa = this.X;
        if (uaa == null) {
            hm9.m0(str, "could not deserialize draft", new Object[0]);
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
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        n7d f = ((jp4) plVar.S.getValue()).f(uaa);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        long j2 = i == 0 ? C.b.a : 0;
        tq2 tq2 = new tq2((sla) null, 12);
        if (i != 0) {
            tq2.i(j, "userId");
        }
        if (j2 != 0) {
            tq2.i(j2, ApiProtocol.PARAM_CHAT_ID);
        }
        tq2.n("draft", f.a());
        return tq2;
    }
}
