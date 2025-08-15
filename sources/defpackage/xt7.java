package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: xt7  reason: default package */
public final class xt7 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;

    public xt7(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je75;
        this.f = je76;
    }

    public final void a(pke pke) {
        ((p7b) ((m7b) this.a.getValue())).a.l("user.lastSentLogTime", 0L);
        ((p7b) ((m7b) this.a.getValue())).a.l("user.lastSentCriticalLogTime", 0L);
        hm9.q("xt7", "onLoginFail", pke);
        if ("login.blocked".equals(pke.b) || "login.flood".equals(pke.b) || "login.token".equals(pke.b)) {
            ((p7b) ((m7b) this.a.getValue())).a.m("server.loginError", pke.b);
            ((f5a) this.b.getValue()).g(true);
        } else if ("session.state".equals(pke.b)) {
            String str = pke.c;
            hm9.m("xt7", "session state error: " + str + " do nothing", new Object[0]);
        } else if (!(pke instanceof gke)) {
            if ("proto.state".equals(pke.b)) {
                ((cba) ((o45) this.c.getValue())).c(new TamErrorException(pke), true);
            }
            ((yle) this.f.getValue()).i();
        } else if (((f5a) this.b.getValue()).d() && ((jbd) ((hbd) this.d.getValue())).h == 2) {
            ((cu7) this.e.getValue()).q();
        }
    }
}
