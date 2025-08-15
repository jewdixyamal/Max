package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ur9  reason: default package */
public final class ur9 {
    public final m7b a;
    public final av0 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public ur9(m7b m7b, av0 av0, je7 je7, je7 je72, je7 je73) {
        this.a = m7b;
        this.b = av0;
        this.c = je7;
        this.d = je72;
        this.e = je73;
    }

    public final void a(le3 le3, gi9 gi9) {
        hm9.m("NotifConfigLogic", "onChatsAndFolders: step 1: chats", new Object[0]);
        Map map = le3.c;
        xs xsVar = new xs(0);
        if (map != null) {
            xs xsVar2 = new xs(0);
            for (Map.Entry entry : map.entrySet()) {
                long longValue = ((Number) entry.getKey()).longValue();
                xq2 xq2 = (xq2) entry.getValue();
                e52 z = ((p82) this.c.getValue()).z(longValue);
                if (z == null) {
                    p82 p82 = (p82) this.c.getValue();
                    p82.getClass();
                    u82 u82 = new u82();
                    u82.b = j92.b;
                    u82.a = longValue;
                    u82.l = longValue;
                    u82.c = i92.o;
                    u82.r0 = 2;
                    long e2 = ((k24) ((c34) p82.l.get())).b.e(new k92(u82));
                    p82.U(e2, p82.X(e2));
                    z = p82.h0(e2, false);
                }
                long j = z.a;
                xsVar.add(Long.valueOf(longValue));
                if (!gi9.d(j)) {
                    p82 p822 = (p82) this.c.getValue();
                    p822.getClass();
                    hm9.m("p82", "changeChatConfiguration, chatId = %d, chatSettings = %s", Long.valueOf(j), xq2);
                    p822.h(j, false, new v02(7, xq2));
                    xsVar2.add(Long.valueOf(j));
                }
            }
            if (!xsVar2.isEmpty()) {
                this.b.c(new vz2(xsVar2, true, false, (mg4) null, (h9b) null, 124));
            }
        }
        hm9.m("NotifConfigLogic", "onChatsAndFolders: step 2: folders", new Object[0]);
        sa2 sa2 = le3.e;
        if (sa2 != null) {
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                us7 us7 = us7.X;
                ir6.d(us7, "NotifConfigLogic", "onChatsAndFolders: step 2: folders not null " + ((ta2) this.d.getValue()), (Throwable) null);
            }
            ((zb2) ((ta2) this.d.getValue())).f(sa2.b, sa2.a);
        }
        if (!xsVar.isEmpty()) {
            zb2 zb2 = (zb2) ((ta2) this.d.getValue());
            vxd vxd = zb2.H0;
            if (vxd != null) {
                vxd.cancel((CancellationException) null);
            }
            zb2.H0 = j47.T(zb2.Z, zb2.Y, (vx3) null, new vb2(zb2, (Continuation) null), 2);
        }
        hm9.m("NotifConfigLogic", "onChatsAndFolders: post config event", new Object[0]);
        this.b.c(new su(2));
    }

    public final void b(le3 le3, boolean z) {
        hm9.m("NotifConfigLogic", "onConfiguration = " + le3, new Object[0]);
        hm9.m("NotifConfigLogic", "onConfiguration: step 1: hash", new Object[0]);
        String str = le3.a;
        m7b m7b = this.a;
        if (str != null) {
            ((p7b) m7b).b.m("hash", str);
        }
        hm9.m("NotifConfigLogic", "onConfiguration: step 2: serverSettings", new Object[0]);
        av0 av0 = this.b;
        a8d a8d = le3.b;
        if (a8d != null) {
            z7d z7d = ((p7b) m7b).b;
            Map map = a8d.b;
            if (map == null) {
                map = oz4.a;
            }
            z7d.getClass();
            String a2 = mqd.a(z7d.w(PmsKey.proxy, (String) null));
            PmsKey pmsKey = PmsKey.f102proxydomains;
            nz4 nz4 = nz4.a;
            List h = z7d.h(pmsKey.name(), nz4);
            SharedPreferences.Editor edit = z7d.g.edit();
            for (Map.Entry entry : map.entrySet()) {
                e3.i(edit, (String) entry.getKey(), entry.getValue());
            }
            ((ji5) edit).apply();
            xs xsVar = z7d.h;
            if (a2 != null) {
                String a3 = mqd.a(z7d.w(PmsKey.proxy, (String) null));
                if (!a2.equals(a3)) {
                    xsVar.getClass();
                    qs qsVar = new qs(xsVar);
                    while (qsVar.hasNext()) {
                        ((x7d) qsVar.next()).a(a2, a3);
                    }
                }
            }
            if (map.containsKey("debug-mode")) {
                try {
                    ((ml0) z7d.i.getValue()).e(Integer.valueOf(((Number) map.get("debug-mode")).intValue()));
                } catch (Throwable th) {
                    hm9.l0(z7d.e, "could not parse debug mode", th);
                }
            }
            List h2 = z7d.h(PmsKey.f102proxydomains.name(), nz4);
            if (!tpa.f(h, h2)) {
                xsVar.getClass();
                qs qsVar2 = new qs(xsVar);
                while (qsVar2.hasNext()) {
                    ((x7d) qsVar2.next()).b(h, h2);
                }
            }
            if (map.containsKey("react-errors")) {
                z7d.j.reset();
            }
            if (map.containsKey("saved-messages-aliases")) {
                z7d.k.reset();
            }
            Iterator it = z7d.l.iterator();
            while (it.hasNext()) {
                ((w7d) it.next()).a();
            }
            av0.c(new pi0());
        }
        hm9.m("NotifConfigLogic", "onConfiguration: step 3: user settings", new Object[0]);
        gaf gaf = le3.d;
        if (gaf != null) {
            p7b p7b = (p7b) m7b;
            p7b.c.z(gaf);
            if (tpa.f(gaf.u, Boolean.FALSE)) {
                t33 t33 = p7b.a;
                t33.m("app.pin_" + t33.t(), (String) null);
            }
            ie3 ie3 = (ie3) this.e.getValue();
            ie3.getClass();
            j47.T(ie3.b, (lx3) null, (vx3) null, new he3(ie3, (Continuation) null), 3);
        }
        if (!z) {
            hm9.m("NotifConfigLogic", "onConfiguration: step 5: chats settings", new Object[0]);
            a(le3, vv7.a);
            return;
        }
        hm9.m("NotifConfigLogic", "onConfiguration: post config event", new Object[0]);
        av0.c(new su(2));
    }
}
