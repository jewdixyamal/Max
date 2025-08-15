package defpackage;

import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.view.Surface;
import androidx.fragment.app.b;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: wt1  reason: default package */
public final /* synthetic */ class wt1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wt1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        cu8 cu8;
        av1 av1;
        switch (this.a) {
            case 0:
                ((Surface) this.b).release();
                ((SurfaceTexture) this.c).release();
                return;
            case 1:
                fu1 fu1 = (fu1) this.b;
                x99 x99 = fu1.H0;
                lq1 lq1 = (lq1) this.c;
                if (x99 == null) {
                    lq1.b(Boolean.FALSE);
                    return;
                }
                lq1.b(Boolean.valueOf(fu1.a.C(fu1.w(x99))));
                return;
            case 2:
                fu1 fu12 = (fu1) this.b;
                fu12.getClass();
                fu12.toString();
                LinkedHashMap linkedHashMap = (LinkedHashMap) fu12.a.a;
                String str = (String) this.c;
                if (linkedHashMap.containsKey(str)) {
                    m9f m9f = (m9f) linkedHashMap.get(str);
                    m9f.f = false;
                    if (!m9f.e) {
                        linkedHashMap.remove(str);
                    }
                }
                fu12.K();
                return;
            case 3:
                ((dad) this.b).a((fad) this.c);
                return;
            case 4:
                ((HashSet) ((st1) this.b).b.b).remove((uu1) this.c);
                return;
            case 5:
                ((lw1) this.b).a = (px1) this.c;
                return;
            case 6:
                List<l92> list = (List) this.c;
                p82 p82 = (p82) this.b;
                rm4 rm4 = p82.l;
                rm4 rm42 = p82.A;
                ((iye) rm42.get()).getClass();
                iye.a("ChatController.load().nonParticipantChats");
                try {
                    ((k24) ((c34) rm4.get())).a();
                    for (l92 l92 : list) {
                        ((k24) ((c34) rm4.get())).c.a(l92.b, Long.MAX_VALUE, mg4.REGULAR);
                        elc elc = ((k24) ((c34) rm4.get())).b;
                        long j = l92.b;
                        elc.getClass();
                        ((OneMeRoomDatabase) elc.a.m()).p(new dlc(0, new clc(elc, j, 1)));
                        ((k4a) ((pk) p82.p.get())).k(l92.c.a, true);
                    }
                    ((k24) ((c34) rm4.get())).c();
                    ((k24) ((c34) rm4.get())).b();
                    ((iye) rm42.get()).getClass();
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    ((k24) ((c34) rm4.get())).b();
                    throw th;
                }
            case 7:
                p82 p822 = (p82) this.b;
                p822.getClass();
                StringBuilder sb = new StringBuilder("syncPins, pins size = ");
                Map map = (Map) this.c;
                sb.append(map.size());
                hm9.m("p82", sb.toString(), new Object[0]);
                Iterator it = ((ps) ((au8) p822.s.get()).l(new ArrayList(map.keySet())).entrySet()).iterator();
                while (true) {
                    ss ssVar = (ss) it;
                    if (ssVar.hasNext()) {
                        ssVar.next();
                        Long l = (Long) map.get(ssVar.getKey());
                        if (!(l == null || (cu8 = (cu8) ssVar.getValue()) == null)) {
                            ((k4a) ((pk) p822.p.get())).D(l.longValue(), Collections.singletonList(Long.valueOf(cu8.c)));
                            hm9.m("p82", "syncPin, chatId = " + l, new Object[0]);
                        }
                    } else {
                        return;
                    }
                }
            case 8:
                b bVar = (b) ((yb3) this.b);
                int i = yb3.D0;
                bVar.a.a(new sb3((i3a) this.c, 0, bVar));
                return;
            case 9:
                uma uma = (uma) this.b;
                gpb gpb = (gpb) this.c;
                if (uma.b == uma.d) {
                    synchronized (uma) {
                        av1 = uma.a;
                        uma.a = null;
                        uma.b = gpb;
                    }
                    av1.getClass();
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 10:
                pe7 pe7 = (pe7) this.b;
                gpb gpb2 = (gpb) this.c;
                synchronized (pe7) {
                    try {
                        if (pe7.b == null) {
                            pe7.a.add(gpb2);
                        } else {
                            pe7.b.add(gpb2.get());
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
                return;
            case 11:
                py9 py9 = (py9) this.c;
                ki3 ki3 = (ki3) this.b;
                ki3.getClass();
                try {
                    py9.a(ki3.a.b);
                    return;
                } catch (InterruptedException | ExecutionException e) {
                    py9.onError(e);
                    return;
                }
            case Protos.Attaches.Attach.PRESENT /*12*/:
                for (qi3 qi3 : (List) this.b) {
                    Object obj = ((ej3) this.c).o;
                    qi3.d = obj;
                    qi3.d(qi3.e, obj);
                }
                return;
            case 13:
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.b;
                bm7 bm7 = (bm7) this.c;
                synchronized (constraintTrackingWorker.b) {
                    try {
                        if (constraintTrackingWorker.c) {
                            dcd dcd = constraintTrackingWorker.o;
                            String str2 = gj3.a;
                            dcd.j(new Object());
                        } else {
                            constraintTrackingWorker.o.l(bm7);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                mu3 mu3 = (mu3) this.b;
                mu3.getClass();
                ((Runnable) this.c).run();
                ((CountDownLatch) mu3.d).countDown();
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                List singletonList = Collections.singletonList((qy3) this.c);
                ((o84) ((ty2) this.b).Y).getClass();
                o84.o(singletonList);
                return;
            case 16:
                t04 t04 = (t04) this.b;
                t04.getClass();
                try {
                    Process.setThreadPriority(t04.b);
                } catch (Throwable unused) {
                }
                ((Runnable) this.c).run();
                return;
            case LangUtils.HASH_SEED /*17*/:
                u04 u04 = (u04) this.b;
                Process.setThreadPriority(u04.c);
                StrictMode.ThreadPolicy threadPolicy = u04.o;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                ((Runnable) this.c).run();
                return;
            case 18:
                qz7 qz7 = ((v78) ((qqd) this.b).b).R1;
                Handler handler = (Handler) qz7.b;
                if (handler != null) {
                    handler.post(new s60(qz7, (a70) this.c, 0));
                    return;
                }
                return;
            case 19:
                y94 y94 = (y94) this.b;
                aa4 aa4 = y94.o;
                if (aa4.p != 0 && !y94.c) {
                    Looper looper = aa4.t;
                    looper.getClass();
                    y94.b = aa4.e(looper, y94.a, (oy5) this.c, false);
                    aa4.n.add(y94);
                    return;
                }
                return;
            case 20:
                z94 z94 = (z94) this.b;
                ba4 ba4 = z94.o;
                if (ba4.p != 0 && !z94.c) {
                    Looper looper2 = ba4.t;
                    looper2.getClass();
                    z94.b = ba4.e(looper2, z94.a, (qy5) this.c, false);
                    ba4.n.add(z94);
                    return;
                }
                return;
            case 21:
                fb4 fb4 = (fb4) this.b;
                fb4.t0 = false;
                fb4.b((Uri) this.c);
                return;
            case 22:
                gb4 gb4 = (gb4) this.b;
                gb4.t0 = false;
                gb4.d((Uri) this.c);
                return;
            case 23:
                ((ce4) this.b).v0.add((ca0) this.c);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                ce4 ce4 = (ce4) this.b;
                zh6 zh6 = ce4.c;
                kee kee = (kee) this.c;
                Surface d = kee.d(zh6, new vx1(ce4, 1, kee));
                ce4.a.p(d);
                ce4.s0.put(kee, d);
                return;
            case 25:
                ce4 ce42 = (ce4) this.b;
                ce42.t0++;
                zm4 zm4 = ce42.a;
                o76.d((AtomicBoolean) zm4.c, true);
                o76.c((Thread) zm4.e);
                SurfaceTexture surfaceTexture = new SurfaceTexture(zm4.b);
                see see = (see) this.c;
                surfaceTexture.setDefaultBufferSize(see.b.getWidth(), see.b.getHeight());
                Surface surface = new Surface(surfaceTexture);
                d74 d74 = new d74(ce42, 5, see);
                zh6 zh62 = ce42.c;
                see.c(zh62, d74);
                see.b(surface, zh62, new be4(ce42, see, surfaceTexture, surface));
                surfaceTexture.setOnFrameAvailableListener(ce42, ce42.o);
                return;
            case 26:
                rf4 rf4 = (rf4) this.b;
                rf4.getClass();
                int i2 = ((jn) this.c).b;
                rf4.f.K();
                return;
            case 27:
                rf4 rf42 = (rf4) this.b;
                rf42.getClass();
                rf42.f.c(VideoFrameProcessingException.a((InterruptedException) this.c));
                return;
            case 28:
                Callable callable = (Callable) this.b;
                bkg bkg = (bkg) this.c;
                try {
                    ((ch4) bkg.b).i(callable.call());
                    return;
                } catch (Exception e2) {
                    ((ch4) bkg.b).j(e2);
                    return;
                }
            default:
                jl4 jl4 = (jl4) this.b;
                if (jl4.d.offer((Runnable) this.c)) {
                    jl4.a();
                    return;
                }
                throw new IllegalStateException("cannot enqueue any more runnables".toString());
        }
    }
}
