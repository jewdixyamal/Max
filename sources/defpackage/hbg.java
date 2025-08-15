package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: hbg  reason: default package */
public final /* synthetic */ class hbg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8g b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int o;

    public /* synthetic */ hbg(k8g k8g, byte[] bArr, int i, int i2) {
        this.a = i2;
        this.b = k8g;
        this.c = bArr;
        this.o = i;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                int i = this.o;
                k8g k8g = this.b;
                Iterator it = ((CopyOnWriteArrayList) k8g.b).iterator();
                while (it.hasNext()) {
                    loc loc = (loc) it.next();
                    try {
                        loc.getClass();
                        int i2 = wag.a[au1.s(i)];
                        byte[] bArr = this.c;
                        loc.b.log(loc.a, "<- ".concat(i2 != 1 ? i2 != 2 ? "<unknown>" : xj6.a(bArr) : new String(bArr)));
                    } catch (Throwable th) {
                        ((a4c) k8g.a).reportException("CallsListeners", "rtc.command.handle.listeners.ondatareceive", th);
                    }
                }
                return;
            default:
                int i3 = this.o;
                k8g k8g2 = this.b;
                Iterator it2 = ((CopyOnWriteArrayList) k8g2.b).iterator();
                while (it2.hasNext()) {
                    loc loc2 = (loc) it2.next();
                    try {
                        loc2.getClass();
                        int i4 = wag.a[au1.s(i3)];
                        byte[] bArr2 = this.c;
                        loc2.b.log(loc2.a, "-> ".concat(i4 != 1 ? i4 != 2 ? "<unknown>" : xj6.a(bArr2) : new String(bArr2)));
                    } catch (Throwable th2) {
                        ((a4c) k8g2.a).reportException("CallsListeners", "rtc.command.handle.listeners.ondatasend", th2);
                    }
                }
                return;
        }
    }
}
