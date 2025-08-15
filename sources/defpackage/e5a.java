package defpackage;

import org.apache.http.cookie.ClientCookie;

/* renamed from: e5a  reason: default package */
public final class e5a {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public e5a(je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
    }

    public final q33 a() {
        return (q33) this.b.getValue();
    }

    public final Object b(String str, gu7 gu7) {
        String str2;
        long j;
        long p = ((hyc) a()).p();
        long j2 = ((hyc) a()).g.getLong("user.contactsLastSync", 0);
        long f = ((hyc) a()).f("user.presenceLastSync", 0);
        String name = e5a.class.getName();
        String G = nu0.G(new Long(p));
        String G2 = nu0.G(new Long(j2));
        String G3 = nu0.G(new Long(f));
        StringBuilder k = k7d.k("LoginTamTask: chatsLastSync = ", G, ", contactLastSync = ", G2, ", presenceLastSync = ");
        k.append(G3);
        hm9.m(name, k.toString(), new Object[0]);
        je7 je7 = this.c;
        String w = ((qyc) ((y7d) je7.getValue())).w(pyc.a, (String) null);
        if (((qyc) ((y7d) je7.getValue())).g.getInt(ClientCookie.VERSION_ATTR, 1) < 6) {
            ((qyc) ((y7d) je7.getValue())).k(6, ClientCookie.VERSION_ATTR);
            j = 0;
            str2 = null;
        } else {
            j = p;
            str2 = w;
        }
        return ((ome) this.a.getValue()).e(new jt7(str, ((ri4) this.d.getValue()).d(), j, j2, f, str2, ((hyc) a()).g.getLong("user.callsLastSync", 0), ((hyc) a()).g.getLong("app.last.login.time", 0), ((hyc) a()).g.getLong("user.draftsLastSync", -1)), gu7);
    }
}
