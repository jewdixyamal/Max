package defpackage;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.PowerManager;
import java.util.Set;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.util.HandledException;

/* renamed from: f40  reason: default package */
public final class f40 implements MediaRecorder.OnInfoListener, fh9 {
    public static final /* synthetic */ int x0 = 0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final Context a;
    public final av0 b;
    public final uh9 c;
    public final je7 o;
    public final khe s0;
    public final khe t0 = new khe(new a40(this, 0));
    public final khe u0 = new khe(new a40(this, 1));
    public volatile long v0 = -1;
    public volatile long w0 = -1;

    public f40(Context context, av0 av0, je7 je7, uh9 uh9, je7 je72, je7 je73, je7 je74) {
        this.a = context;
        this.b = av0;
        this.c = uh9;
        this.o = je7;
        this.X = je72;
        this.Y = je73;
        this.Z = je74;
        this.s0 = new khe(new z30(0, je74));
        synchronized (uh9.o) {
            uh9.o.add(this);
        }
        av0.d(this);
    }

    public static void p(PowerManager.WakeLock wakeLock, int i) {
        if (wakeLock.isHeld()) {
            hm9.m("f40", "Releasing " + wakeLock, new Object[0]);
            wakeLock.release(i);
        }
    }

    public final void a(long j, ub8 ub8) {
        r(j, ub8, false);
    }

    public final void b(long j, ub8 ub8) {
        hm9.p("f40", "onError " + j + " type " + ub8, (Throwable) null);
        t();
        r(j, ub8, false);
        o();
        if (ub8 == ub8.c) {
            q(j, 0);
        }
    }

    public final void c(long j, ub8 ub8, long j2, ub8 ub82) {
        StringBuilder sb = new StringBuilder("onAudioChanged prev=");
        sb.append(j);
        sb.append(" prevType=");
        sb.append(ub8);
        au1.q(j2, ", curr=", " currType=", sb);
        sb.append(ub82);
        hm9.m("f40", sb.toString(), new Object[0]);
        boolean z = this.c.A;
        if (j != -1 && ub8 == ub8.c && !z) {
            q(j, 0);
        }
        r(j, ub8, false);
    }

    public final void d(long j, ub8 ub8) {
        hm9.m("f40", "onBuffering " + j + " type " + ub8, new Object[0]);
        kj6 kj6 = ub8.a;
        t();
        ub8 ub82 = ub8.c;
        khe khe = this.u0;
        if (ub8 == ub82) {
            if (!m()) {
                ((PowerManager.WakeLock) khe.getValue()).acquire();
            }
        } else if (m()) {
            p((PowerManager.WakeLock) khe.getValue(), 0);
        }
        r(j, ub8, false);
    }

    public final void e(long j, ub8 ub8, long j2) {
        hm9.m("f40", "onStop " + j + " type " + ub8, new Object[0]);
        t();
        r(j, ub8, false);
        o();
        if (ub8 == ub8.c) {
            q(j, j2);
        }
    }

    public final void f(long j, ub8 ub8) {
        hm9.m("f40", "onPause " + j + " type " + ub8, new Object[0]);
        r(j, ub8, false);
    }

    public final void g(long j, ub8 ub8) {
        hm9.m("f40", "onSkipToPrevious " + j + " type " + ub8, new Object[0]);
        r(j, ub8, false);
    }

    public final void h(long j, ub8 ub8) {
        hm9.m("f40", "onPlay " + j + " type " + ub8, new Object[0]);
        kj6 kj6 = ub8.a;
        t();
        ub8 ub82 = ub8.c;
        khe khe = this.u0;
        if (ub8 == ub82) {
            if (!m()) {
                ((PowerManager.WakeLock) khe.getValue()).acquire();
            }
        } else if (m()) {
            p((PowerManager.WakeLock) khe.getValue(), 0);
        }
        r(j, ub8, true);
    }

    public final void i(long j, ub8 ub8) {
        hm9.m("f40", "onPause " + j + " type " + ub8, new Object[0]);
        r(j, ub8, false);
        if (ub8 == ub8.c) {
            if (m()) {
                p((PowerManager.WakeLock) this.u0.getValue(), 0);
            }
            q(j, this.c.o());
        }
    }

    public final void k(long j, ub8 ub8) {
        hm9.m("f40", "onSkipToNext " + j + " type " + ub8, new Object[0]);
        r(j, ub8, false);
    }

    public final boolean l() {
        Boolean bool;
        khe khe = this.t0;
        if (!khe.a()) {
            return false;
        }
        try {
            bool = Boolean.valueOf(((PowerManager.WakeLock) khe.getValue()).isHeld());
        } catch (Throwable th) {
            bool = new njc(th);
        }
        Throwable a2 = pjc.a(bool);
        if (a2 != null) {
            ((cba) ((o45) this.X.getValue())).c(new HandledException(a2), true);
        }
        Boolean bool2 = Boolean.FALSE;
        if (bool instanceof njc) {
            bool = bool2;
        }
        return ((Boolean) bool).booleanValue();
    }

    public final boolean m() {
        Boolean bool;
        khe khe = this.u0;
        if (!khe.a()) {
            return false;
        }
        try {
            bool = Boolean.valueOf(((PowerManager.WakeLock) khe.getValue()).isHeld());
        } catch (Throwable th) {
            bool = new njc(th);
        }
        Throwable a2 = pjc.a(bool);
        if (a2 != null) {
            ((cba) ((o45) this.X.getValue())).c(new HandledException(a2), true);
        }
        Boolean bool2 = Boolean.FALSE;
        if (bool instanceof njc) {
            bool = bool2;
        }
        return ((Boolean) bool).booleanValue();
    }

    public final void n() {
        hm9.m("f40", "onDeviceAwayFromEar", new Object[0]);
        if (l()) {
            khe khe = this.t0;
            boolean z = false;
            if (khe.a()) {
                p((PowerManager.WakeLock) khe.getValue(), 0);
            }
            uh9 uh9 = this.c;
            if (uh9.x) {
                if (uh9.m() == ub8.c) {
                    z = true;
                }
                if (z) {
                    uh9.q();
                }
            }
        }
    }

    public final void o() {
        khe khe = this.u0;
        try {
            if (khe.a()) {
                p((PowerManager.WakeLock) khe.getValue(), 0);
            }
            khe khe2 = this.t0;
            if (khe2.a()) {
                p((PowerManager.WakeLock) khe2.getValue(), 1);
            }
        } catch (Throwable th) {
            ((cba) ((o45) this.X.getValue())).c(new HandledException(th), true);
        }
    }

    @uae
    public final void onEvent(re9 re9) {
        uh9 uh9 = this.c;
        if (re9.X.contains(Long.valueOf(uh9.l())) && uh9.C == null) {
            hm9.m("f40", "stop", new Object[0]);
            t();
            uh9.t();
            o();
        }
    }

    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 800 || i == 801) {
            this.b.c(new su(1));
        }
    }

    public final void q(long j, long j2) {
        if (j != -1 && j2 >= 0) {
            j47.T((sx3) this.s0.getValue(), (lx3) null, (vx3) null, new c40(this, j2, j, (Continuation) null), 3);
        }
    }

    public final void r(long j, ub8 ub8, boolean z) {
        hm9.m("f40", "sendEvent " + j + ", " + ub8 + ", " + z, new Object[0]);
        if (j != -1) {
            if (j != this.v0 || this.w0 == -1) {
                hm9.m("f40", "track changed, should update chatId", new Object[0]);
                if (j != this.v0 || this.w0 == -1) {
                    j47.T((sx3) this.s0.getValue(), (lx3) null, (vx3) null, new e40(this, j, ub8, (Continuation) null), 3);
                    return;
                }
                s(j, ub8, this.w0);
                return;
            }
            s(j, ub8, this.w0);
        }
    }

    public final void s(long j, ub8 ub8, long j2) {
        hm9.m("f40", "send event internal trackId=" + j + " trackType=" + ub8 + " chatId=" + j2, new Object[0]);
        this.b.c(new a60(ub8.ordinal(), j, j2));
    }

    public final void t() {
        hm9.m("f40", "unsubscribe sensors controller", new Object[0]);
        b6d b6d = (b6d) this.o.getValue();
        Set set = b6d.c;
        if (set.remove(this) && set.size() == 0 && b6d.b != null) {
            b6d.a.unregisterListener(b6d);
        }
    }
}
