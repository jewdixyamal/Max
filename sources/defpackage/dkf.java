package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.view.Surface;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ru.ok.tamtam.util.HandledException;

/* renamed from: dkf  reason: default package */
public final class dkf implements n3b, gd, AudioManager.OnAudioFocusChangeListener, p40 {
    public final q40 X;
    public ckf Y;
    public gef Z;
    public final o45 a;
    public final n65 b;
    public final String c = dkf.class.getName();
    public final u75 o;

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, ve] */
    public dkf(Context context, o45 o45, n65 n65, je7 je7, n4b n4b) {
        Object obj;
        this.a = o45;
        this.b = n65;
        this.X = new q40(context, this);
        if (n4b.b) {
            int i = n4b.g;
            if (i >= 0) {
                int i2 = n4b.d;
                if (i2 >= 0) {
                    int i3 = n4b.e;
                    if (i3 < i) {
                        throw new IllegalStateException("The min_buffer must be greater than or equal to playback_buffer".toString());
                    } else if (i3 >= i2) {
                        int i4 = n4b.f;
                        if (i4 >= i3) {
                            int i5 = n4b.h;
                            if (i5 > 0) {
                                ? obj2 = new Object();
                                obj2.a = 5000;
                                obj2.b = 13000;
                                obj2.c = 500;
                                obj2.d = 3000;
                                obj2.e = 4;
                                obj2.a = i3;
                                obj2.b = i4;
                                obj2.c = i;
                                obj2.d = i2;
                                obj2.e = i5;
                                obj = new ka9(obj2);
                            } else {
                                throw new IllegalStateException("The format_max_input_size_scale_up_factor must be greater than 0".toString());
                            }
                        } else {
                            throw new IllegalStateException("The max_buffer must be greater than or equal to min_buffer".toString());
                        }
                    } else {
                        throw new IllegalStateException("The min_buffer must be greater than or equal to playback_buffer_after_rebuffer".toString());
                    }
                } else {
                    throw new IllegalStateException("The playback_buffer_after_rebuffer must be greater than or equal to 0".toString());
                }
            } else {
                throw new IllegalStateException("The playback_buffer must be greater than or equal to 0".toString());
            }
        } else {
            int i6 = n4b.g;
            fc4.l("bufferForPlaybackMs", i6, 0, "0");
            int i7 = n4b.d;
            fc4.l("bufferForPlaybackAfterRebufferMs", i7, 0, "0");
            int i8 = n4b.e;
            fc4.l("minBufferMs", i8, i6, "bufferForPlaybackMs");
            fc4.l("minBufferMs", i8, i7, "bufferForPlaybackAfterRebufferMs");
            int i9 = n4b.f;
            fc4.l("maxBufferMs", i9, i8, "minBufferMs");
            obj = new fc4(new n64(1), i8, i9, i6, i7, n4b.c);
        }
        cf4 cf4 = new cf4(context, new kj6(6));
        oe4 f = cf4.f();
        f.getClass();
        me4 me4 = new me4(f);
        String iSO3Language = ((hyc) ((q33) je7.getValue())).v().getISO3Language();
        if (iSO3Language == null) {
            me4.h(new String[0]);
        } else {
            me4.h(new String[]{iSO3Language});
        }
        x65 x65 = new x65(context);
        fm9.k(!x65.v);
        x65.e = new lc4(3, cf4);
        fm9.k(!x65.v);
        x65.f = new lc4(7, obj);
        u75 a2 = x65.a();
        this.o = a2;
        a2.x0.a(this);
        i74 i74 = a2.D0;
        i74.getClass();
        i74.Y.a(this);
    }

    public final void F(fd fdVar, int i) {
        hm9.m(this.c, zr6.h(i, "Player. Video frames dropped: "), new Object[0]);
    }

    public final long F0() {
        gef gef = this.Z;
        if (gef != null) {
            return this.o.k() - gef.m();
        }
        return 0;
    }

    public final long G0() {
        gef gef = this.Z;
        if (gef == null) {
            return 0;
        }
        if (gef.k() > 0) {
            return gef.k() - gef.m();
        }
        u75 u75 = this.o;
        if (u75.c() > 0) {
            return u75.c();
        }
        return 0;
    }

    public final boolean H0() {
        u75 u75 = this.o;
        return u75.getPlaybackState() == 3 && !u75.u();
    }

    /* JADX WARNING: type inference failed for: r19v1, types: [huc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r19v2, types: [huc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r19v4, types: [huc, java.lang.Object] */
    public final void I0(gef gef) {
        Object obj;
        tr4 s;
        ckf ckf;
        gef gef2 = gef;
        gef gef3 = this.Z;
        tr4 tr4 = null;
        if (gef3 == null || !gef3.equals(gef2) || this.o.getPlaybackState() == 1) {
            String str = this.c;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, str, "Player. Prepare new video content: " + gef2, (Throwable) null);
            }
            ckf ckf2 = this.Y;
            if (ckf2 != null) {
                ckf2.y0();
            }
            boolean f = tpa.f(this.Z, gef2);
            this.Z = gef2;
            this.o.Y(true);
            String str2 = this.c;
            ir6 ir62 = hm9.m;
            if (ir62 != null && ir62.c()) {
                ir62.d(us7.X, str2, "Player. Prepare mediaSource by content:" + gef2, (Throwable) null);
            }
            Uri l = gef.l();
            n65 n65 = this.b;
            q24 q24 = gef.c0() ^ true ? (q24) n65.b.getValue() : (q24) n65.a.getValue();
            if (gef2 instanceof c24) {
                obj = new DashMediaSource$Factory(q24).e(tb8.c(l));
            } else if (gef2 instanceof zn6) {
                obj = new HlsMediaSource$Factory(q24).e(tb8.c(l));
            } else if (gef2 instanceof fe9) {
                List list = ((fe9) gef2).a;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    yt8 yt8 = new yt8(24, (Object) new va4());
                    Object obj2 = new Object();
                    ? obj3 = new Object();
                    tb8 c2 = tb8.c(((de9) list.get(i)).e);
                    c2.b.getClass();
                    c2.b.getClass();
                    eb8 eb8 = c2.b.c;
                    if (eb8 == null) {
                        s = tr4.a;
                    } else {
                        synchronized (obj2) {
                            try {
                                s = !eb8.equals((Object) null) ? pl8.s(eb8) : null;
                                s.getClass();
                            } catch (Throwable th) {
                                while (true) {
                                    throw th;
                                }
                            }
                        }
                    }
                    tr4 tr42 = s;
                    aob aob = r14;
                    aob aob2 = new aob(c2, q24, yt8, tr42, obj3, 1048576);
                    arrayList.add(aob);
                }
                ej0[] ej0Arr = (ej0[]) arrayList.toArray(new ej0[0]);
                obj = new cs8((ej0[]) Arrays.copyOf(ej0Arr, ej0Arr.length));
            } else if (gef2 instanceof x2f) {
                u75 u75 = this.o;
                u75.w2();
                long micros = u75.R0 == 2 ? TimeUnit.MILLISECONDS.toMicros(((x2f) gef2).b) : 0;
                yt8 yt82 = new yt8(24, (Object) new va4());
                Object obj4 = new Object();
                ? obj5 = new Object();
                tb8 c3 = tb8.c(l);
                c3.b.getClass();
                c3.b.getClass();
                eb8 eb82 = c3.b.c;
                if (eb82 == null) {
                    tr4 = tr4.a;
                } else {
                    synchronized (obj4) {
                        try {
                            if (!eb82.equals((Object) null)) {
                                tr4 = pl8.s(eb82);
                            }
                            tr4.getClass();
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                            }
                        }
                    }
                }
                obj = new e43(new aob(c3, q24, yt82, tr4, obj5, 1048576), micros, TimeUnit.MILLISECONDS.toMicros(((x2f) gef2).c), true, false, false);
            } else {
                yt8 yt83 = new yt8(24, (Object) new va4());
                Object obj6 = new Object();
                ? obj7 = new Object();
                tb8 c4 = tb8.c(l);
                c4.b.getClass();
                c4.b.getClass();
                eb8 eb83 = c4.b.c;
                if (eb83 == null) {
                    tr4 = tr4.a;
                } else {
                    synchronized (obj6) {
                        try {
                            if (!eb83.equals((Object) null)) {
                                tr4 = pl8.s(eb83);
                            }
                            tr4.getClass();
                        } catch (Throwable th3) {
                            while (true) {
                                throw th3;
                            }
                        }
                    }
                }
                obj = new aob(c4, q24, yt83, tr4, obj7, 1048576);
            }
            long k = f ? this.o.k() : Math.max(gef.d(), gef.m());
            if (gef.c0() || k == 0) {
                u75 u752 = this.o;
                u752.w2();
                List singletonList = Collections.singletonList(obj);
                u752.w2();
                u752.w2();
                u752.o2(singletonList, -1, -9223372036854775807L, true);
            } else {
                u75 u753 = this.o;
                u753.w2();
                List singletonList2 = Collections.singletonList(obj);
                u753.w2();
                u753.o2(singletonList2, 0, k, false);
            }
            this.o.prepare();
            ckf ckf3 = this.Y;
            if (ckf3 != null) {
                ckf3.i();
            }
            this.X.m(3);
            return;
        }
        String str3 = this.c;
        ir6 ir63 = hm9.m;
        if (ir63 != null && ir63.c()) {
            ir63.d(us7.X, str3, "Player. Restart same content: " + this.Z, (Throwable) null);
        }
        if (this.o.getPlaybackState() == 4) {
            hm9.m(this.c, "Player. Video ended. Seek to start", new Object[0]);
            K0();
        }
        if (this.o.getPlaybackState() == 3 && (ckf = this.Y) != null) {
            ckf.y(true);
        }
        this.o.Y(true);
        ckf ckf4 = this.Y;
        if (ckf4 != null) {
            ckf4.i();
        }
        this.X.m(3);
    }

    public final void J(fd fdVar, n54 n54) {
        hm9.m(this.c, "Player. Video renderer is disabled", new Object[0]);
    }

    public final void J0(long j) {
        String h = ey8.h(j, "Player. Seek to: ");
        String str = this.c;
        hm9.m(str, h, new Object[0]);
        gef gef = this.Z;
        if (gef != null) {
            u75 u75 = this.o;
            if (u75.c() == 0 || j <= u75.c() - gef.m()) {
                u75.W1(5, gef.m() + j);
                return;
            }
            hm9.m(str, "Player. Can't seek to: " + j + ", position greater than duration. Seek to end.", new Object[0]);
            u75.W1(5, u75.c() - gef.m());
        }
    }

    public final void K0() {
        gef gef = this.Z;
        u75 u75 = this.o;
        String str = this.c;
        if (gef == null || gef.m() <= 0 || gef.c0()) {
            hm9.m(str, "Player. Seek to start: 0", new Object[0]);
            u75.W1(5, 0);
            return;
        }
        hm9.m(str, "Player. Seek to start from content: %d", Long.valueOf(gef.m()));
        u75.W1(5, gef.m());
    }

    public final void L0(boolean z) {
        this.o.setRepeatMode(z ? 2 : 0);
    }

    public final void M0(Surface surface) {
        String str = this.c;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str, "Player. Set surface " + surface, (Throwable) null);
        }
        if (surface == null) {
            u75 u75 = this.o;
            u75.w2();
            u75.p2((Object) null);
            u75.k2(0, 0);
            return;
        }
        this.o.m(surface);
    }

    public final void N0() {
        u75 u75 = this.o;
        u75.w2();
        if (!u75.n1) {
            hm9.m(this.c, "Player. Stop", new Object[0]);
            u75.stop();
            ckf ckf = this.Y;
            if (ckf != null) {
                ckf.x();
            }
        }
    }

    public final void R(fd fdVar, pc8 pc8, IOException iOException, boolean z) {
        gef gef = this.Z;
        hm9.p(this.c, "Player. Load error, wasCanceled " + z + ", videoContent: " + gef, iOException);
    }

    public final boolean b() {
        u75 u75 = this.o;
        int playbackState = u75.getPlaybackState();
        return (playbackState == 2 || playbackState == 3) && u75.u() && u75.v0() == 0;
    }

    public final float e() {
        u75 u75 = this.o;
        u75.w2();
        return u75.h1;
    }

    public final void e0(fd fdVar, Object obj, long j) {
        String str = this.c;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str, "Player. First frame rendered: output=" + obj + " renderTimeMs=" + j, (Throwable) null);
        }
    }

    public final void f(float f) {
        ckf ckf = this.Y;
        if (ckf != null) {
            ckf.u(f);
        }
    }

    public final void f0(mue mue, int i) {
        hm9.m(this.c, "Player. onTimelineChanged %d", Integer.valueOf(i));
    }

    public final void g(float f) {
        u75 u75 = this.o;
        u75.w2();
        float f2 = u75.h1;
        String str = this.c;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str, "Player. New volume: " + f + ", prev: " + f2, (Throwable) null);
        }
        this.o.g(f);
        if (f2 <= 0.0f && f > 0.0f) {
            this.X.m(3);
        } else if (f2 != f && f <= 0.0f) {
            this.X.k();
        }
    }

    public final void h(int i) {
        String str = this.c;
        if (i == 1) {
            hm9.m(str, "Player. State changed: ExoPlayer.STATE_IDLE", new Object[0]);
        } else if (i != 2) {
            u75 u75 = this.o;
            if (i == 3) {
                hm9.m(str, "Player. State changed: ExoPlayer.STATE_READY", new Object[0]);
                ckf ckf = this.Y;
                if (ckf != null) {
                    ckf.y(u75.u());
                }
            } else if (i == 4) {
                hm9.m(str, "Player. State changed: ExoPlayer.STATE_ENDED", new Object[0]);
                u75.w2();
                if (u75.R0 == 1) {
                    hm9.m(str, "Player. State ended, but video is looping. Restart", new Object[0]);
                    play();
                    return;
                }
                ckf ckf2 = this.Y;
                if (ckf2 != null) {
                    ckf2.o();
                }
            }
        } else {
            hm9.m(str, "Player. State changed: ExoPlayer.STATE_BUFFERING", new Object[0]);
            ckf ckf3 = this.Y;
            if (ckf3 != null) {
                ckf3.y0();
            }
        }
    }

    public final void onAudioFocusChange(int i) {
        String str = this.c;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, zr6.h(i, "Player. On audio focus change: "), (Throwable) null);
        }
        this.X.j(i);
    }

    public final void pause() {
        u75 u75 = this.o;
        u75.w2();
        if (!u75.n1) {
            hm9.m(this.c, "Player. Pause", new Object[0]);
            u75.Y(false);
            ckf ckf = this.Y;
            if (ckf != null) {
                ckf.h();
            }
        }
    }

    public final void play() {
        hm9.m(this.c, "Player. Play", new Object[0]);
        u75 u75 = this.o;
        if (u75.getPlaybackState() == 4) {
            K0();
        }
        u75.Y(true);
        ckf ckf = this.Y;
        if (ckf != null) {
            ckf.i();
        }
        this.X.m(3);
    }

    public final void x0(PlaybackException playbackException) {
        hm9.p(this.c, "Player. Error", playbackException);
        ((cba) this.a).c(new HandledException(playbackException), false);
        ckf ckf = this.Y;
        if (ckf != null) {
            ckf.e();
        }
    }
}
