package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: gbg  reason: default package */
public final /* synthetic */ class gbg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8g b;
    public final /* synthetic */ hoc c;

    public /* synthetic */ gbg(k8g k8g, hoc hoc, int i) {
        this.a = i;
        this.b = k8g;
        this.c = hoc;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                hoc hoc = this.c;
                k8g k8g = this.b;
                Iterator it = ((CopyOnWriteArrayList) k8g.b).iterator();
                while (it.hasNext()) {
                    loc loc = (loc) it.next();
                    try {
                        loc.d.put(hoc, Long.valueOf(loc.c.getAndIncrement()));
                    } catch (Throwable th) {
                        ((a4c) k8g.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsubmit", th);
                    }
                }
                return;
            case 1:
                hoc hoc2 = this.c;
                k8g k8g2 = this.b;
                Iterator it2 = ((CopyOnWriteArrayList) k8g2.b).iterator();
                while (it2.hasNext()) {
                    try {
                        ((loc) it2.next()).d.remove(hoc2);
                    } catch (Throwable th2) {
                        ((a4c) k8g2.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandremove", th2);
                    }
                }
                return;
            default:
                hoc hoc3 = this.c;
                k8g k8g3 = this.b;
                Iterator it3 = ((CopyOnWriteArrayList) k8g3.b).iterator();
                while (it3.hasNext()) {
                    loc loc2 = (loc) it3.next();
                    try {
                        Long l = (Long) loc2.d.get(hoc3);
                        if (l != null) {
                            loc2.b.log(loc2.a, "-> [" + l + "]: " + hoc3);
                        }
                    } catch (Throwable th3) {
                        ((a4c) k8g3.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsent", th3);
                    }
                }
                return;
        }
    }
}
