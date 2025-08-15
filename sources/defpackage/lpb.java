package defpackage;

import java.util.List;

/* renamed from: lpb  reason: default package */
public final class lpb implements x7d {
    public final je7 a;
    public final je7 b;

    public lpb(je7 je7, je7 je72) {
        this.a = je7;
        this.b = je72;
    }

    public final void a(String str, String str2) {
        hm9.m("lpb", "onProxyEnableChange: oldValue=" + str + ", newValue=" + str2, new Object[0]);
        ((tke) this.a.getValue()).f(str2);
        if (str2 != null && str2.length() != 0) {
            ((ty3) this.b.getValue()).b("proxy", str2);
        }
    }

    public final void b(List list, List list2) {
        hm9.m("lpb", "onProxyDomainsChanged: oldValue=" + list + ", newValue=" + list2, new Object[0]);
        tke tke = (tke) this.a.getValue();
        synchronized (tke) {
            tke.g = list2;
        }
        if (!list2.isEmpty()) {
            ((ty3) this.b.getValue()).b("proxyDomains", x53.n0(list2, (String) null, (String) null, (String) null, (m56) null, 63));
        }
    }
}
