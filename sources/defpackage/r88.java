package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;

/* renamed from: r88  reason: default package */
public final class r88 implements Handler.Callback {
    public final /* synthetic */ int a = 0;
    public final Handler b;
    public final /* synthetic */ Object c;

    public r88(s88 s88, r78 r78) {
        this.c = s88;
        Handler m = maf.m(this);
        this.b = m;
        r78.l(this, m);
    }

    public void a(long j) {
        Surface surface;
        t88 t88 = (t88) this.c;
        if (this == t88.u2 && t88.W0 != null) {
            if (j == Long.MAX_VALUE) {
                t88.J1 = true;
                return;
            }
            try {
                t88.y0(j);
                t88.E0(t88.p2);
                t88.L1.f++;
                cgf cgf = t88.V1;
                boolean z = cgf.e != 3;
                cgf.e = 3;
                cgf.l.getClass();
                cgf.g = oaf.S(SystemClock.elapsedRealtime());
                if (z && (surface = t88.d2) != null) {
                    aab aab = t88.S1;
                    Handler handler = (Handler) aab.a;
                    if (handler != null) {
                        handler.post(new tb2((Object) aab, (Object) surface, SystemClock.elapsedRealtime(), 8));
                    }
                    t88.g2 = true;
                }
                t88.g0(j);
            } catch (ExoPlaybackException e) {
                t88.K1 = e;
            }
        }
    }

    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                int i = message.arg1;
                int i2 = message.arg2;
                int i3 = maf.a;
                long j = (((long) i2) & 4294967295L) | ((((long) i) & 4294967295L) << 32);
                s88 s88 = (s88) this.c;
                if (this != s88.x2) {
                    return true;
                }
                if (j == Long.MAX_VALUE) {
                    s88.J1 = true;
                    return true;
                }
                try {
                    s88.q0(j);
                    s88.y0();
                    s88.L1.f++;
                    s88.x0();
                    s88.a0(j);
                    return true;
                } catch (com.google.android.exoplayer2.ExoPlaybackException e) {
                    s88.K1 = e;
                    return true;
                }
            default:
                if (message.what != 0) {
                    return false;
                }
                int i4 = message.arg1;
                int i5 = message.arg2;
                int i6 = oaf.a;
                a((((long) i5) & 4294967295L) | ((((long) i4) & 4294967295L) << 32));
                return true;
        }
    }

    public r88(t88 t88, s78 s78) {
        this.c = t88;
        Handler o = oaf.o(this);
        this.b = o;
        s78.o(this, o);
    }
}
