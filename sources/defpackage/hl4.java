package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: hl4  reason: default package */
public final /* synthetic */ class hl4 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hl4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                ((il4) this.b).getClass();
                return true;
            case 1:
                so4 so4 = (so4) this.b;
                so4.getClass();
                int i = message.what;
                CopyOnWriteArraySet copyOnWriteArraySet = so4.e;
                if (i == 1) {
                    so4.h = true;
                    so4.l = Collections.unmodifiableList((List) message.obj);
                    boolean d = so4.d();
                    Iterator it = copyOnWriteArraySet.iterator();
                    while (it.hasNext()) {
                        ((qo4) it.next()).a(so4);
                    }
                    if (d) {
                        so4.a();
                    }
                } else if (i == 2) {
                    int i2 = message.arg1;
                    int i3 = message.arg2;
                    int i4 = so4.f - i2;
                    so4.f = i4;
                    so4.g = i3;
                    if (i3 == 0 && i4 == 0) {
                        Iterator it2 = copyOnWriteArraySet.iterator();
                        while (it2.hasNext()) {
                            ((qo4) it2.next()).c();
                        }
                    }
                } else if (i == 3) {
                    oo4 oo4 = (oo4) message.obj;
                    so4.l = Collections.unmodifiableList(oo4.c);
                    boolean d2 = so4.d();
                    boolean z = oo4.b;
                    dn4 dn4 = oo4.a;
                    if (z) {
                        Iterator it3 = copyOnWriteArraySet.iterator();
                        while (it3.hasNext()) {
                            ((qo4) it3.next()).f(so4, dn4);
                        }
                    } else {
                        Iterator it4 = copyOnWriteArraySet.iterator();
                        while (it4.hasNext()) {
                            ((qo4) it4.next()).e(dn4, oo4.d);
                        }
                    }
                    if (d2) {
                        so4.a();
                    }
                } else {
                    throw new IllegalStateException();
                }
                return true;
            case 2:
                pm7 pm7 = (pm7) this.b;
                Iterator it5 = pm7.d.iterator();
                while (it5.hasNext()) {
                    om7 om7 = (om7) it5.next();
                    if (!om7.d && om7.c) {
                        tm5 e = om7.b.e();
                        om7.b = new rm5(1);
                        om7.c = false;
                        pm7.c.d(om7.a, e);
                    }
                    if (pm7.b.a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            case 3:
                z23 z23 = (z23) this.b;
                Iterator it6 = ((CopyOnWriteArraySet) z23.d).iterator();
                while (it6.hasNext()) {
                    nm7 nm7 = (nm7) it6.next();
                    if (nm7.c) {
                        sm5 d3 = nm7.b.d();
                        nm7.b = new rm5(0);
                        nm7.c = false;
                        ((lm7) z23.c).e(nm7.a, d3);
                    }
                    if (((aie) z23.a).a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            case 4:
                va8 va8 = (va8) this.b;
                va8.getClass();
                if (message.what == 1) {
                    try {
                        w98 w98 = (w98) va8.c;
                        w98.w.m0(w98.c);
                    } catch (RemoteException unused) {
                        z04.c0("Error in sending flushCommandQueue");
                    }
                }
                return true;
            case 5:
                ba8 ba8 = (ba8) this.b;
                ba8.getClass();
                if (message.what == 1) {
                    da8 da8 = ba8.e;
                    da8.G(false, da8.l);
                }
                return true;
            case 6:
                l1f l1f = (l1f) this.b;
                if (l1f.z && message.what != 4) {
                    return true;
                }
                try {
                    int i5 = message.what;
                    int i6 = 0;
                    if (i5 == 1) {
                        while (true) {
                            ArrayList arrayList = l1f.k;
                            if (i6 >= arrayList.size()) {
                                return true;
                            }
                            ((e6d) arrayList.get(i6)).start();
                            i6++;
                        }
                    } else if (i5 == 2) {
                        l1f.f((yqc) message.obj);
                        return true;
                    } else if (i5 == 3) {
                        l1f.c();
                        return true;
                    } else if (i5 != 4) {
                        return false;
                    } else {
                        l1f.d(message.arg1, (ExportException) message.obj);
                        return true;
                    }
                } catch (ExportException e2) {
                    l1f.d(2, e2);
                    return true;
                } catch (RuntimeException e3) {
                    l1f.d(2, ExportException.e(e3));
                    return true;
                }
                break;
            default:
                hrf hrf = (hrf) this.b;
                hrf.getClass();
                int i7 = message.what;
                if (i7 == 1) {
                    hrf.q.o("recconect requested");
                    hrf.g.execute(new ule(17, hrf));
                } else if (i7 == 2) {
                    b9b b9b = hrf.q;
                    b9b.o("handleServerPingTimeout, timeout=" + hrf.r);
                    synchronized (hrf.b) {
                        try {
                            if (hrf.c != null) {
                                hrf.n.onFailedByPings();
                                ((m8c) hrf.c).b(4000, "dispose");
                                hrf.c = null;
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                    hrf.d();
                } else {
                    throw new RuntimeException("unhandled message " + message.what);
                }
                return true;
        }
    }
}
