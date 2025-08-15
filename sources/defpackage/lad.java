package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: lad  reason: default package */
public final class lad extends ol implements lme {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lad(long j, int i) {
        super(j);
        this.o = i;
    }

    private final void u(pke pke) {
    }

    public final void e(gle gle) {
        switch (this.o) {
            case 0:
                nad nad = (nad) gle;
                ((p7b) r()).b.l("app-update-type", Long.valueOf((long) nad.X));
                pl plVar = null;
                if (nad.X == 1) {
                    pl plVar2 = this.c;
                    if (plVar2 == null) {
                        plVar2 = null;
                    }
                    n6a n6a = (n6a) plVar2.i.getValue();
                    n6a.d.getClass();
                    ((t33) n6a.b).m("version.force.update.received", "25.8.1");
                    pl plVar3 = this.c;
                    if (plVar3 != null) {
                        plVar = plVar3;
                    }
                    ((n6a) plVar.i.getValue()).b();
                    return;
                }
                if (nad.c != null) {
                    z7d z7d = ((p7b) r()).b;
                    String str = nad.c;
                    z7d.getClass();
                    String a = mqd.a(str);
                    PmsKey pmsKey = PmsKey.proxy;
                    String a2 = mqd.a(z7d.w(pmsKey, (String) null));
                    if (!tpa.f(a, a2)) {
                        z7d.m(pmsKey.name(), a);
                        xs xsVar = z7d.h;
                        xsVar.getClass();
                        qs qsVar = new qs(xsVar);
                        while (qsVar.hasNext()) {
                            ((x7d) qsVar.next()).a(a2, a);
                        }
                    }
                }
                if (nad.o != null) {
                    ((p7b) r()).a.m("app.location.country.code", nad.o);
                }
                z7d z7d2 = ((p7b) r()).b;
                List emptyList = nad.Y == null ? Collections.emptyList() : new ArrayList(nad.Y);
                z7d2.getClass();
                PmsKey pmsKey2 = PmsKey.f102proxydomains;
                List h = z7d2.h(pmsKey2.name(), nz4.a);
                if (!tpa.f(h, emptyList)) {
                    SharedPreferences.Editor edit = z7d2.g.edit();
                    e3.i(edit, pmsKey2.name(), emptyList);
                    ((ji5) edit).apply();
                    xs xsVar2 = z7d2.h;
                    xsVar2.getClass();
                    qs qsVar2 = new qs(xsVar2);
                    while (qsVar2.hasNext()) {
                        ((x7d) qsVar2.next()).b(h, emptyList);
                    }
                }
                l().c(new su(this.a, 11));
                String f = k().f();
                if (f != null && f.length() != 0 && !k().e()) {
                    pl plVar4 = this.c;
                    if (plVar4 != null) {
                        plVar = plVar4;
                    }
                    ((cu7) plVar.j.getValue()).q();
                    return;
                }
                return;
            default:
                l().c(new vbd(this.a, ((ubd) gle).c));
                return;
        }
    }

    public final void g(pke pke) {
        switch (this.o) {
            case 0:
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                oad oad = (oad) plVar.h.getValue();
                oad.getClass();
                String str = oad.f;
                hm9.m(str, "onSessionInitFail, error = " + pke, new Object[0]);
                if ("session.state".equals(pke.b)) {
                    String str2 = pke.c;
                    hm9.m(str, "session state error: " + str2 + " do nothing", new Object[0]);
                    return;
                } else if (!(pke instanceof gke)) {
                    if ("proto.state".equals(pke.b)) {
                        bc7 bc7 = oad.e[0];
                        ((cba) ((o45) oad.a.get())).c(new TamErrorException(pke), true);
                    }
                    bc7 bc72 = oad.e[3];
                    ((yle) oad.d.get()).i();
                    return;
                } else {
                    bc7[] bc7Arr = oad.e;
                    bc7 bc73 = bc7Arr[1];
                    if (((jbd) ((hbd) oad.b.get())).h == 2) {
                        bc7 bc74 = bc7Arr[2];
                        k4a k4a = (k4a) ((pk) oad.c.get());
                        k4a.v(k4a, new lad(((p7b) k4a.y()).a.o(), 0));
                        return;
                    }
                    return;
                }
            default:
                return;
        }
    }

    public final dle i() {
        switch (this.o) {
            case 0:
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                t9f h = ((ri4) plVar.b.getValue()).h();
                pl plVar2 = this.c;
                if (plVar2 == null) {
                    plVar2 = null;
                }
                String a = ((ri4) plVar2.b.getValue()).a();
                long F = ((p7b) r()).a.F();
                pl plVar3 = this.c;
                if (plVar3 == null) {
                    plVar3 = null;
                }
                String str = (String) ((ti4) ((ri4) plVar3.b.getValue())).l.get();
                dle dle = new dle((sla) null);
                HashMap hashMap = new HashMap();
                hashMap.put("deviceType", h.a);
                hashMap.put("pushDeviceType", z7b.a(h.j));
                hashMap.put("appVersion", h.b);
                hashMap.put("buildNumber", Integer.valueOf(h.c));
                String str2 = h.d;
                if (!(str2 == null || str2.length() == 0)) {
                    hashMap.put("appKey", str2);
                }
                hashMap.put("osVersion", h.e);
                hashMap.put("locale", h.f);
                hashMap.put("deviceLocale", h.g);
                hashMap.put("deviceName", h.h);
                hashMap.put("screen", h.i);
                hashMap.put("timezone", h.k.getID());
                dle.n("userAgent", hashMap);
                dle.p("deviceId", a);
                dle.i(F, "clientSessionId");
                if (oag.u(str)) {
                    dle.p("mt_instanceid", str);
                }
                return dle;
            default:
                return new gs9((sla) null, 9);
        }
    }
}
