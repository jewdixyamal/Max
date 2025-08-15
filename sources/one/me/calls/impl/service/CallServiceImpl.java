package one.me.calls.impl.service;

import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.android.calls.CallNotifierBroadcastReceiver;
import one.me.android.calls.CallNotifierFixActivity;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lone/me/calls/impl/service/CallServiceImpl;", "Landroid/app/Service;", "<init>", "()V", "gl1", "hl1", "calls-impl_release"}, k = 1, mv = {2, 0, 0})
public final class CallServiceImpl extends Service {
    public static final hl1 s0 = new Object();
    public static Handler t0;
    public static final wbd u0;
    public final khe X = new khe(new dk1(6));
    public final khe Y = new khe(new dk1(7));
    public MediaSession Z;
    public final khe a = new khe(new dk1(2));
    public final khe b = new khe(new dk1(3));
    public final khe c = new khe(new dk1(4));
    public final khe o = new khe(new dk1(5));

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, hl1] */
    static {
        wbd wbd = new wbd();
        wbd.add(-1);
        wbd.add(2);
        wbd.add(32);
        if (Build.VERSION.SDK_INT >= 30) {
            wbd.add(128);
            wbd.add(64);
        }
        u0 = z7.a(wbd);
    }

    public final vs1 a() {
        return (vs1) this.a.getValue();
    }

    public final void b(int i, Notification notification, boolean z, boolean z2) {
        int i2;
        khe khe = this.X;
        int i3 = 2;
        try {
            if (Build.VERSION.SDK_INT < 34) {
                i2 = -1;
            } else {
                i2 = ((eua) khe.getValue()).b(eua.h) ? 130 : 2;
                if (((eua) khe.getValue()).b(eua.l)) {
                    i2 |= 64;
                }
                if (((xuc) this.o.getValue()).c() || z2) {
                    i2 |= 32;
                }
            }
            hm9.m("CallServiceTag", "CallService start foreground with particular types: ".concat(hl1.a(i2)), new Object[0]);
            a().a();
            startForeground(i, notification, i2);
            hm9.m("CallServiceTag", "CallService crosscheck types: ".concat(hl1.a(getForegroundServiceType())), new Object[0]);
        } catch (Throwable th) {
            hm9.p("CallServiceTag", "CallService can't start foreground service due to " + th.getMessage() + ". Try to start with simple permissions.", th);
            try {
                if (Build.VERSION.SDK_INT < 34) {
                    i3 = -1;
                }
                startForeground(i, notification, i3);
                hm9.m("CallServiceTag", "CallService started with types: ".concat(hl1.a(getForegroundServiceType())), new Object[0]);
            } catch (Exception unused) {
                hm9.p("CallServiceTag", "CallService can't start foreground service. Try show usual notification isIncoming=" + z + ".", th);
                if (z) {
                    vs1 a2 = a();
                    a2.getClass();
                    hm9.m("CallsNotification", "showNotification id=" + i + " notification", new Object[0]);
                    a2.e().a((String) null, i, notification);
                }
            }
        }
    }

    public final void c(d04 d04, y21 y21, boolean z) {
        PendingIntent broadcast;
        PendingIntent pendingIntent;
        boolean z2;
        PendingIntent broadcast2;
        d04 d042 = d04;
        y21 y212 = y21;
        boolean z3 = z;
        boolean f = tpa.f(y212, y21.h);
        boolean z4 = d042.g;
        j1e j1e = d042.a;
        if (f) {
            hm9.m("CallServiceTag", "CallService show default push due to chat info is empty.", new Object[0]);
            b(239, a().c(this, y212, j1e != null ? j1e.A() : false, z4), true, z3);
            return;
        }
        hz4 hz4 = hz4.a;
        Class<CallNotifierFixActivity> cls = CallNotifierFixActivity.class;
        Class<CallNotifierBroadcastReceiver> cls2 = CallNotifierBroadcastReceiver.class;
        if (!z4 || d042.f) {
            boolean z5 = z3;
            hm9.m("CallServiceTag", "CallService show active notification.", new Object[0]);
            vs1 a2 = a();
            CharSequence charSequence = y212.c;
            String obj = charSequence != null ? charSequence.toString() : null;
            a2.getClass();
            hm9.m("CallsNotification", "showActiveCallNotification", new Object[0]);
            ((bea) a2.d.getValue()).m();
            if (obj == null) {
                obj = (String) a2.f.getValue();
            }
            Bitmap bitmap = (Bitmap) j47.f0(hz4, new ts1(a2, y212.d, (Continuation) null));
            ((p84) a2.c.getValue()).getClass();
            bu9 bu9 = new bu9(this, "ru.oneme.app.new.activeCalls");
            bu9.k = -1;
            bu9.v = "call";
            bu9.F.icon = ((Number) a2.j.getValue()).intValue();
            je7 je7 = a2.i;
            bu9.f = bu9.c((String) je7.getValue());
            bu9.e = bu9.c(obj);
            ya1 d = a2.d();
            bu9.g = d.a(d.c(), new k8(22));
            bu9.i(2, true);
            ya1 d2 = a2.d();
            bu9.h = d2.a(d2.c(), new k8(22));
            bu9.i(128, false);
            Application c2 = a2.d().c();
            if (gcf.a >= 31) {
                Intent intent = new Intent(c2, cls);
                intent.setAction("action-finished-call");
                broadcast = PendingIntent.getActivity(c2, 0, intent, 201326592);
            } else {
                Intent intent2 = new Intent(c2, cls2);
                intent2.setAction("action-finished-call");
                broadcast = PendingIntent.getBroadcast(c2, 0, intent2, 201326592);
            }
            PendingIntent pendingIntent2 = broadcast;
            if (pendingIntent2 != null) {
                bu9.q(new gu9(2, vs1.b(obj, (String) je7.getValue(), bitmap), pendingIntent2, (PendingIntent) null, (PendingIntent) null));
            }
            b(239, bu9.b(), false, z5);
            return;
        }
        hm9.m("CallServiceTag", "CallService show incoming notification.", new Object[0]);
        vs1 a3 = a();
        boolean A = j1e != null ? j1e.A() : false;
        a3.getClass();
        hm9.m("CallsNotification", "showIncomingCallNotification", new Object[0]);
        CharSequence charSequence2 = y212.c;
        if (charSequence2 == null) {
            charSequence2 = (String) a3.f.getValue();
        }
        Bitmap bitmap2 = (Bitmap) j47.f0(hz4, new us1(a3, y212, (Continuation) null));
        ((p84) a3.c.getValue()).getClass();
        bu9 bu92 = new bu9(this, "ru.oneme.app.new.incomingCalls.");
        bu92.F.icon = A ? ((Number) a3.k.getValue()).intValue() : ((Number) a3.j.getValue()).intValue();
        bu92.e = bu9.c(charSequence2);
        je7 je72 = a3.g;
        je7 je73 = a3.h;
        bu92.f = bu9.c(A ? (String) je73.getValue() : (String) je72.getValue());
        bu92.k = 2;
        bu92.i(2, true);
        bu92.i(16, true);
        Application c3 = a3.d().c();
        int i = gcf.a;
        if (i >= 31) {
            Intent intent3 = new Intent(c3, cls);
            ya1.b(intent3, y212, A);
            z2 = false;
            pendingIntent = PendingIntent.getActivity(c3, 0, intent3, 201326592);
        } else {
            z2 = false;
            Intent intent4 = new Intent(c3, cls2);
            ya1.b(intent4, y212, A);
            pendingIntent = PendingIntent.getBroadcast(c3, 0, intent4, 201326592);
        }
        bu92.h = pendingIntent;
        bu92.i(128, true);
        bu92.l = z2;
        bu92.v = "call";
        ya1 d3 = a3.d();
        PendingIntent a4 = d3.a(d3.c(), new xa1(d3, y212, A));
        if (a4 != null) {
            Application c4 = a3.d().c();
            if (i >= 31) {
                Intent intent5 = new Intent(c4, cls);
                intent5.setAction("action-decline-call");
                broadcast2 = PendingIntent.getActivity(c4, 0, intent5, 201326592);
            } else {
                Intent intent6 = new Intent(c4, cls2);
                intent6.setAction("action-decline-call");
                broadcast2 = PendingIntent.getBroadcast(c4, 0, intent6, 201326592);
            }
            PendingIntent pendingIntent3 = broadcast2;
            if (pendingIntent3 != null) {
                bu92.q(new gu9(1, vs1.b(charSequence2, A ? (String) je73.getValue() : (String) je72.getValue(), bitmap2), (PendingIntent) null, pendingIntent3, a4));
            }
        }
        b(240, bu92.b(), true, z);
    }

    public final /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        hm9.m("CallServiceTag", "CallService onCreate", new Object[0]);
        d04 d04 = (d04) ((wr1) ((kr1) this.b.getValue())).I.getValue();
        y21 y21 = (y21) ((l31) ((b31) this.c.getValue())).k.getValue();
        vs1 a2 = a();
        j1e j1e = d04.a;
        b(239, a2.c(this, y21, j1e != null ? j1e.A() : false, d04.g), true, false);
    }

    public final void onDestroy() {
        hm9.m("CallServiceTag", "service call onDestroy", new Object[0]);
        a().a();
        MediaSession mediaSession = this.Z;
        if (mediaSession != null) {
            mediaSession.release();
            hm9.m("CallServiceTag", "media session stop", new Object[0]);
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        hm9.m("CallServiceTag", "CallService onStartCommand", new Object[0]);
        khe khe = this.b;
        d04 d04 = (d04) ((wr1) ((kr1) khe.getValue())).I.getValue();
        y21 y21 = (y21) ((l31) ((b31) this.c.getValue())).k.getValue();
        if (!d04.g || ((wr1) ((kr1) khe.getValue())).q()) {
            MediaSession mediaSession = this.Z;
            if (mediaSession != null) {
                mediaSession.release();
                hm9.m("CallServiceTag", "media session stop", new Object[0]);
            }
        } else if (this.Z == null) {
            jl1 jl1 = new jl1(this);
            MediaSession mediaSession2 = new MediaSession(this, "CallServiceTag");
            mediaSession2.setFlags(3);
            mediaSession2.setPlaybackState(new PlaybackState.Builder().setState(3, 0, 0.0f).build());
            mediaSession2.setPlaybackToRemote(jl1);
            mediaSession2.setCallback(new MediaSession.Callback());
            mediaSession2.setActive(true);
            this.Z = mediaSession2;
            hm9.m("CallServiceTag", "media session started", new Object[0]);
        }
        if (intent != null) {
            v25 v25 = gl1.Y;
            if (v25.get(intent.getIntExtra("ACTION", 0)) != gl1.b) {
                if (v25.get(intent.getIntExtra("ACTION", 0)) == gl1.a) {
                    hm9.m("CallServiceTag", "CallService start.", new Object[0]);
                    return 2;
                }
                i95 i95 = d04.j;
                if ((i95 instanceof c95) || (i95 instanceof b95) || (i95 instanceof d95)) {
                    hm9.m("CallServiceTag", "CallService finished due to call is failed or finished.", new Object[0]);
                    hl1.c().postDelayed(new l40(i2, 3, this), 500);
                    return 2;
                } else if (v25.get(intent.getIntExtra("ACTION", 0)) == gl1.c) {
                    hm9.m("CallServiceTag", "CallService restart.", new Object[0]);
                    c(d04, y21, false);
                    return 2;
                } else if (v25.get(intent.getIntExtra("ACTION", 0)) == gl1.o) {
                    hm9.m("CallServiceTag", "CallService restart for screen sharing.", new Object[0]);
                    c(d04, y21, true);
                    return 2;
                } else {
                    hm9.m("CallServiceTag", "CallService simple start, no action.", new Object[0]);
                    return 2;
                }
            }
        }
        hm9.m("CallServiceTag", "CallService finished.", new Object[0]);
        hl1.c().postDelayed(new l40(-1, 3, this), 500);
        return 2;
    }
}
