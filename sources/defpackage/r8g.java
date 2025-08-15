package defpackage;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.os.ResultReceiver;
import android.view.MenuItem;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* renamed from: r8g  reason: default package */
public final class r8g implements Runnable {
    public final Object X;
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object o;

    public /* synthetic */ r8g(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
    }

    public final void run() {
        cba cba;
        hua hua;
        je7 je7;
        ilc ilc;
        Object obj = this.X;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.o;
        switch (this.a) {
            case 0:
                d8d d8d = (d8d) obj3;
                hm9.m("s8g", "set beans for task = %s", d8d);
                d8d.a = (e8d) ((je7) obj4).getValue();
                try {
                    hm9.m("s8g", "start processing task = %s", d8d);
                    d8d.x();
                    hm9.m("s8g", "finished processing task = %s", d8d);
                    return;
                } catch (Exception e) {
                    hm9.p("s8g", "exception = " + e.getMessage() + ", task = " + d8d, e);
                    cba = (cba) ((o45) obj);
                    cba.c(e, true);
                    d8d.w();
                    if (d8d instanceof hua) {
                        hua = (hua) d8d;
                        je7 = (je7) obj2;
                        ((eoe) je7.getValue()).c(hua.getId());
                        une j = ((eoe) je7.getValue()).j(hua.getId());
                        if (j != null && j.c >= 10) {
                            hua.d();
                            break;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    cba.c(new Exception("TaskRunnable: failed to execute onMaxFailCount method for task " + hua.getId() + " type " + hua.getType(), th), true);
                    break;
                }
            case 1:
                yz1 yz1 = (yz1) obj3;
                if (yz1 != null) {
                    gaa gaa = (gaa) obj;
                    ((zz1) gaa.a).L0 = true;
                    yz1.b.c(false);
                    ((zz1) gaa.a).L0 = false;
                }
                MenuItem menuItem = (MenuItem) obj2;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((wq8) obj4).q(menuItem, (or8) null, 4);
                    return;
                }
                return;
            case 2:
                if (((AtomicBoolean) obj3).compareAndSet(false, true)) {
                    ((hc3) obj2).d();
                    gb3 gb3 = (gb3) obj;
                    pa3 pa3 = gb3.X;
                    if (pa3 == null) {
                        ((ab3) obj4).onError(new TimeoutException(q45.e(gb3.b, gb3.c)));
                        return;
                    }
                    pa3.i(new gd1(5, this));
                    return;
                }
                return;
            case 3:
                gaa gaa2 = (gaa) obj;
                s68 s68 = (s68) ((cj8) gaa2.a).X.get(((c78) ((b78) obj3)).a.getBinder());
                if (s68 != null) {
                    cj8 cj8 = (cj8) gaa2.a;
                    cj8.getClass();
                    HashMap hashMap = s68.f;
                    String str = (String) obj2;
                    IBinder iBinder = (IBinder) obj4;
                    if (iBinder == null) {
                        try {
                            hashMap.remove(str);
                        } catch (Throwable th2) {
                            cj8.Y = null;
                            throw th2;
                        }
                    } else {
                        List list = (List) hashMap.get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (iBinder == ((mpa) it.next()).a) {
                                    it.remove();
                                }
                            }
                            if (list.size() == 0) {
                                hashMap.remove(str);
                            }
                        }
                    }
                    cj8.Y = null;
                    return;
                }
                return;
            case 4:
                gaa gaa3 = (gaa) obj;
                s68 s682 = (s68) ((cj8) gaa3.a).X.get(((c78) ((b78) obj3)).a.getBinder());
                Bundle bundle = (Bundle) obj2;
                if (s682 == null) {
                    Objects.toString(bundle);
                    return;
                }
                cj8 cj82 = (cj8) gaa3.a;
                cj82.Y = s682;
                if (bundle == null) {
                    Bundle bundle2 = Bundle.EMPTY;
                }
                ((ResultReceiver) obj4).send(-1, (Bundle) null);
                cj82.Y = null;
                return;
            case 5:
                ry1 ry1 = (ry1) obj2;
                try {
                    j47.f0(((lx3) obj3).minusKey(vu4.b), new klc((ilc) obj4, (sy1) ry1, (llc) ((a66) obj), (Continuation) null));
                    return;
                } catch (Throwable th3) {
                    ry1.cancel(th3);
                    return;
                }
            case 6:
                g6g.h((View) obj3, (k6g) obj2, (l7b) obj4);
                ((ValueAnimator) obj).start();
                return;
            default:
                dcd dcd = (dcd) obj4;
                UUID uuid = (UUID) obj3;
                String uuid2 = uuid.toString();
                a14 u = a14.u();
                String str2 = b8g.c;
                StringBuilder sb = new StringBuilder("Updating progress for ");
                sb.append(uuid);
                sb.append(" (");
                d24 d24 = (d24) obj2;
                sb.append(d24);
                sb.append(")");
                u.n(str2, sb.toString());
                b8g b8g = (b8g) obj;
                WorkDatabase workDatabase = b8g.a;
                WorkDatabase workDatabase2 = b8g.a;
                workDatabase.c();
                try {
                    h8g l = workDatabase2.y().l(uuid2);
                    if (l != null) {
                        if (l.b == m7g.b) {
                            z7g z7g = new z7g(uuid2, d24);
                            a8g x = workDatabase2.x();
                            ilc = (ilc) x.a;
                            ilc.b();
                            ilc.c();
                            ((x7g) x.b).C(z7g);
                            ilc.r();
                            ilc.l();
                        } else {
                            a14 u2 = a14.u();
                            u2.R(str2, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
                        }
                        dcd.j((Object) null);
                        workDatabase2.r();
                        workDatabase2.l();
                        return;
                    }
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } catch (Throwable th4) {
                    try {
                        a14.u().r(b8g.c, "Error updating Worker progress", th4);
                        dcd.k(th4);
                    } catch (Throwable th5) {
                        workDatabase2.l();
                        throw th5;
                    }
                }
        }
        ((eoe) je7.getValue()).d(hua.getId());
        hm9.m("s8g", "remove task because it cause too many exceptions: ".concat(r8g.class.getName()), new Object[0]);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "WorkerService.TaskRunnable{" + ((d8d) this.b) + '}';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ r8g(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.X = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public r8g(d8d d8d, je7 je7, o45 o45, je7 je72) {
        this.a = 0;
        this.b = d8d;
        this.c = je7;
        this.X = o45;
        this.o = je72;
    }

    public r8g(gaa gaa, c78 c78, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 4;
        this.X = gaa;
        this.b = c78;
        this.c = bundle;
        this.o = resultReceiver;
    }
}
