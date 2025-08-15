package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Looper;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.tamtam.util.HandledException;

/* renamed from: u65  reason: default package */
public final class u65 implements m3b, AudioManager.OnAudioFocusChangeListener {
    public static final /* synthetic */ int y0 = 0;
    public final qz7 X;
    public bq7 Y;
    public fef Z;
    public final zpd a;
    public final kad b;
    public final o45 c;
    public final m65 o;
    public float s0 = 0.0f;
    public dj0 t0;
    public int u0;
    public int v0;
    public int w0;
    public boolean x0;

    /* JADX WARNING: type inference failed for: r2v7, types: [ob6, java.lang.Object] */
    public u65(Context context, o45 o45, m65 m65, ef7 ef7, t33 t33) {
        Context context2 = context;
        this.c = o45;
        this.o = m65;
        ec4.a("bufferForPlaybackMs", 500, 0, "0");
        ec4.a("bufferForPlaybackAfterRebufferMs", 3000, 0, "0");
        ec4.a("minBufferMs", 7000, 500, "bufferForPlaybackMs");
        ec4.a("minBufferMs", 7000, 3000, "bufferForPlaybackAfterRebufferMs");
        ec4.a("maxBufferMs", 15000, 7000, "minBufferMs");
        ec4 ec4 = new ec4(new n64(0), 7000, 15000, 500, 3000);
        bf4 bf4 = new bf4(context2, new Object());
        pe4 b2 = bf4.b();
        String iSO3Language = t33.v().getISO3Language();
        if (iSO3Language == null) {
            b2.c(new String[0]);
        } else {
            b2.c(new String[]{iSO3Language});
        }
        cle cle = new cle(context2);
        w65 w65 = new w65(context2, cle);
        np8.f(!w65.p);
        w65.e = new lc4(4, bf4);
        np8.f(!w65.p);
        w65.f = new lc4(1, ec4);
        np8.f(!w65.p);
        w65.p = true;
        zpd zpd = new zpd(w65);
        this.a = zpd;
        zpd.Z1();
        t75 t75 = zpd.c;
        t75.getClass();
        z23 z23 = t75.x0;
        z23.getClass();
        ((CopyOnWriteArraySet) z23.d).add(new nm7(this));
        zpd.Z1();
        h74 h74 = t75.C0;
        h74.getClass();
        z23 z232 = h74.Y;
        z232.getClass();
        ((CopyOnWriteArraySet) z232.d).add(new nm7(this));
        this.b = new kad(zpd, bf4, t33, ef7, cle);
        this.X = new qz7(23, (Object) new dp(context2));
        context2.registerReceiver(new an(6, this), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
    }

    public static void u() {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new RuntimeException("This thread is NOT main!");
        }
    }

    public final void B() {
        u();
        fef fef = this.Z;
        zpd zpd = this.a;
        if (fef != null && fef.m() > 0) {
            fef fef2 = this.Z;
            if (!((ok0) fef2).c) {
                hm9.m("u65", "seekToStart seekTo: %d", Long.valueOf(fef2.m()));
                zpd.r(zpd.p0(), this.Z.m());
                return;
            }
        }
        hm9.m("u65", "seekToStart seekTo: 0", new Object[0]);
        zpd.r(zpd.p0(), 0);
    }

    public final void E() {
        hm9.m("u65", "Stop", new Object[0]);
        u();
        zpd zpd = this.a;
        zpd.Z1();
        t75 t75 = zpd.c;
        t75.s2();
        t75.s2();
        t75.I0.d(1, t75.u());
        t75.n2((ExoPlaybackException) null);
        ls5 ls5 = zw6.b;
        ffc ffc = ffc.X;
        bq7 bq7 = this.Y;
        if (bq7 != null) {
            bq7.p();
        }
    }

    public final void G(sze sze, b0f b0f) {
        ve8 ve8;
        u();
        if (!this.x0) {
            this.x0 = this.b.e();
        }
        bq7 bq7 = this.Y;
        if (bq7 != null && (ve8 = bq7.e) != null) {
            ve8.K();
        }
    }

    public final boolean b() {
        zpd zpd = this.a;
        zpd.Z1();
        t75 t75 = zpd.c;
        t75.s2();
        int i = t75.k1.e;
        if (i != 2 && i != 3) {
            return false;
        }
        zpd.Z1();
        if (!t75.u()) {
            return false;
        }
        zpd.Z1();
        t75.s2();
        return t75.k1.m == 0;
    }

    public final void g(float f) {
        u();
        zpd zpd = this.a;
        float e = zpd.e();
        zpd.Z1();
        t75 t75 = zpd.c;
        t75.s2();
        float i = maf.i(f, 0.0f, 1.0f);
        if (t75.e1 != i) {
            t75.e1 = i;
            t75.k2(1, 2, Float.valueOf(t75.I0.e * i));
            t75.x0.i(22, new b75(0, i));
        }
        bq7 bq7 = this.Y;
        if (bq7 != null) {
            ve8 ve8 = bq7.e;
            if (ve8 != null) {
                ve8.d1();
            }
            if (bq7.b.b()) {
                if (bq7.l()) {
                    bq7.a();
                } else {
                    bq7.p();
                }
            }
        }
        if (e <= 0.0f && f > 0.0f) {
            y();
        }
    }

    public final void h(int i) {
        ve8 ve8;
        ve8 ve82;
        u();
        if (i == 1) {
            hm9.m("u65", "onPlayerStateChanged ExoPlayer.STATE_IDLE", new Object[0]);
        } else if (i == 2) {
            hm9.m("u65", "onPlayerStateChanged ExoPlayer.STATE_BUFFERING", new Object[0]);
            bq7 bq7 = this.Y;
            if (bq7 != null && (ve8 = bq7.e) != null) {
                ve8.y0();
            }
        } else if (i == 3) {
            hm9.m("u65", "onPlayerStateChanged ExoPlayer.STATE_READY", new Object[0]);
            bq7 bq72 = this.Y;
            if (bq72 != null && (ve82 = bq72.e) != null) {
                ve82.j1();
            }
        } else if (i == 4) {
            hm9.m("u65", "onPlayerStateChanged ExoPlayer.STATE_ENDED", new Object[0]);
            if (this.a.getRepeatMode() == 1) {
                hm9.m("u65", "State ended, but video is looping. Restart", new Object[0]);
                play();
                return;
            }
            bq7 bq73 = this.Y;
            if (bq73 != null) {
                ve8 ve83 = bq73.e;
                if (ve83 != null) {
                    ve83.o();
                }
                bq73.p();
            }
        }
    }

    public final void onAudioFocusChange(int i) {
        hm9.m("u65", "On audio focus change, %d", Integer.valueOf(i));
        zpd zpd = this.a;
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    hm9.k("u65", "onAudioFocusChange: AUDIOFOCUS_LOSS");
                    if (b() && zpd.e() > 0.0f) {
                        hm9.k("u65", "onAudioFocusChange: AUDIOFOCUS_LOSS. Stop");
                        pause();
                    }
                } else if (i == 1) {
                    if (!b()) {
                        hm9.k("u65", "onAudioFocusChange: AUDIOFOCUS_GAIN. Resuming player");
                        play();
                    }
                    float e = zpd.e();
                    if (e > 0.0f && ((double) e) < 1.0d) {
                        hm9.k("u65", "onAudioFocusChange: AUDIOFOCUS_GAIN. Volume up");
                        g(1.0f);
                    }
                }
            } else if (b() && zpd.e() > 0.0f) {
                hm9.k("u65", "onAudioFocusChange: AUDIOFOCUS_LOSS_TRANSIENT. Pausing current player");
                pause();
            }
        } else if (b() && zpd.e() > 0.0f) {
            hm9.k("u65", "onAudioFocusChange: AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK. Setting volume to 0.2");
            g(0.2f);
        }
    }

    public final void pause() {
        hm9.m("u65", "Pause", new Object[0]);
        u();
        this.a.Y(false);
        bq7 bq7 = this.Y;
        if (bq7 != null) {
            ve8 ve8 = bq7.e;
            if (ve8 != null) {
                ve8.h();
            }
            bq7.p();
        }
    }

    public final void play() {
        hm9.m("u65", "Play", new Object[0]);
        u();
        zpd zpd = this.a;
        zpd.Z1();
        t75 t75 = zpd.c;
        t75.s2();
        if (t75.k1.e == 4) {
            B();
        }
        zpd.Y(true);
        bq7 bq7 = this.Y;
        if (bq7 != null) {
            bq7.m();
        }
        y();
    }

    public final void r(PlaybackException playbackException) {
        u();
        hm9.p("u65", "onPlayerError", playbackException);
        if (playbackException != null) {
            ((cba) this.c).c(new HandledException(playbackException), false);
        }
        bq7 bq7 = this.Y;
        if (bq7 != null) {
            ve8 ve8 = bq7.e;
            if (ve8 != null) {
                ve8.D1(playbackException);
            }
            bq7.p();
        }
    }

    public final long v() {
        fef fef = this.Z;
        if (fef == null) {
            return 0;
        }
        int i = (fef.k() > 0 ? 1 : (fef.k() == 0 ? 0 : -1));
        zpd zpd = this.a;
        if (i > 0) {
            zpd.Z1();
            return Math.min(zpd.c.c(), this.Z.k() - this.Z.m());
        }
        zpd.Z1();
        return zpd.c.c();
    }

    public final void x(int i) {
        hm9.m("u65", "onTimelineChanged %d", Integer.valueOf(i));
    }

    public final void y() {
        if (this.a.e() > 0.0f && b()) {
            ((AudioManager) this.X.get()).requestAudioFocus(new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(this).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build()).build());
        }
    }
}
