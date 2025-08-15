package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.EglRenderer;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;
import ru.ok.tamtam.nano.Protos;

/* renamed from: kl4  reason: default package */
public final /* synthetic */ class kl4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kl4(rk5 rk5, Exception exc, long j) {
        this.a = 26;
        this.c = rk5;
        this.b = exc;
    }

    public final void run() {
        o05 o05;
        Executor executor;
        long j;
        boolean z;
        long j2;
        boolean z2;
        long j3;
        switch (this.a) {
            case 0:
                ll4 ll4 = (ll4) this.c;
                ll4.g--;
                SparseIntArray sparseIntArray = ll4.b;
                il4 il4 = (il4) this.b;
                int i = sparseIntArray.get(il4.o) - 1;
                int i2 = il4.o;
                if (i == 0) {
                    sparseIntArray.delete(i2);
                    ll4.c.remove(il4);
                    ll4.a.add(il4);
                    return;
                }
                sparseIntArray.put(i2, i);
                return;
            case 1:
                ml4 ml4 = (ml4) this.c;
                ml4.g--;
                SparseIntArray sparseIntArray2 = ml4.b;
                il4 il42 = (il4) this.b;
                int i3 = sparseIntArray2.get(il42.o) - 1;
                int i4 = il42.o;
                if (i3 == 0) {
                    sparseIntArray2.delete(i4);
                    ml4.c.remove(il42);
                    ml4.a.add(il42);
                    return;
                }
                sparseIntArray2.put(i4, i3);
                return;
            case 2:
                xo4.a((xo4) this.b, ((wo4) this.c).b.l);
                return;
            case 3:
                vs4 vs4 = (vs4) this.c;
                vs4.X++;
                see see = (see) this.b;
                boolean z3 = see.f;
                ts4 ts4 = vs4.a;
                o76.d((AtomicBoolean) ts4.c, true);
                o76.c((Thread) ts4.e);
                SurfaceTexture surfaceTexture = new SurfaceTexture(z3 ? ts4.o : ts4.p);
                Size size = see.b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                Surface surface = new Surface(surfaceTexture);
                see.b(surface, vs4.c, new us4(vs4, surfaceTexture, surface));
                if (see.f) {
                    vs4.t0 = surfaceTexture;
                    return;
                }
                vs4.u0 = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(vs4, vs4.o);
                return;
            case 4:
                vs4 vs42 = (vs4) this.c;
                zh6 zh6 = vs42.c;
                kee kee = (kee) this.b;
                Surface d = kee.d(zh6, new vx1(vs42, 2, kee));
                vs42.a.p(d);
                vs42.s0.put(kee, d);
                return;
            case 5:
                ((EglRenderer) this.c).lambda$releaseEglSurface$3((Runnable) this.b);
                return;
            case 6:
                ((EglRenderer) this.c).lambda$release$0((CountDownLatch) this.b);
                return;
            case 7:
                ((d15) this.c).m.remove((f17) this.b);
                return;
            case 8:
                b15 b15 = (b15) this.b;
                Objects.requireNonNull(b15);
                ((Executor) this.c).execute(new dd4(15, b15));
                return;
            case 9:
                ((d15) this.c).l.remove((lq1) this.b);
                return;
            case 10:
                ((py9) ((Map.Entry) this.c).getKey()).a((lt0) this.b);
                return;
            case 11:
                ((py9) this.c).a((lt0) this.b);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                LinkedHashMap linkedHashMap = ((z05) this.c).a;
                py9 py9 = (py9) this.b;
                py9.getClass();
                linkedHashMap.remove(py9);
                return;
            case 13:
                d15 d15 = ((b15) this.c).k;
                switch (au1.s(d15.D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.b;
                        d15.b(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(rh4.r(d15.D)));
                }
            case Protos.Attaches.Attach.LOCATION /*14*/:
                b15 b152 = (b15) this.c;
                MediaFormat mediaFormat = (MediaFormat) this.b;
                if (b152.j) {
                    String str = b152.k.a;
                    return;
                }
                switch (au1.s(b152.k.D)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        synchronized (b152.k.b) {
                            d15 d152 = b152.k;
                            o05 = d152.r;
                            executor = d152.s;
                        }
                        try {
                            executor.execute(new kl4((Object) o05, 15, (Object) mediaFormat));
                            return;
                        } catch (RejectedExecutionException unused) {
                            String str2 = b152.k.a;
                            return;
                        }
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(rh4.r(b152.k.D)));
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((o05) this.c).n(new q64(12, (Object) (MediaFormat) this.b));
                return;
            case 16:
                ((o05) this.c).j((e05) this.b);
                return;
            case LangUtils.HASH_SEED /*17*/:
                ((l05) this.c).a((Surface) this.b);
                return;
            case 18:
                u75 u75 = (u75) this.c;
                b85 b85 = (b85) this.b;
                int i5 = u75.T0 - b85.b;
                u75.T0 = i5;
                boolean z4 = true;
                if (b85.e) {
                    u75.U0 = b85.c;
                    u75.V0 = true;
                }
                if (i5 == 0) {
                    mue mue = ((a3b) b85.f).a;
                    if (!u75.r1.a.q() && mue.q()) {
                        u75.s1 = -1;
                        u75.t1 = 0;
                    }
                    if (!mue.q()) {
                        List asList = Arrays.asList(((b5b) mue).k);
                        fm9.k(asList.size() == u75.A0.size());
                        for (int i6 = 0; i6 < asList.size(); i6++) {
                            ((s75) u75.A0.get(i6)).c = (mue) asList.get(i6);
                        }
                    }
                    if (u75.V0) {
                        if (((a3b) b85.f).b.equals(u75.r1.b) && ((a3b) b85.f).d == u75.r1.s) {
                            z4 = false;
                        }
                        if (z4) {
                            if (mue.q() || ((a3b) b85.f).b.b()) {
                                j = ((a3b) b85.f).d;
                            } else {
                                a3b a3b = (a3b) b85.f;
                                yj8 yj8 = a3b.b;
                                long j4 = a3b.d;
                                Object obj = yj8.a;
                                hue hue = u75.z0;
                                mue.h(obj, hue);
                                j = j4 + hue.e;
                            }
                            z = z4;
                            u75.V0 = false;
                            u75.t2((a3b) b85.f, 1, z, u75.U0, j, -1, false);
                            return;
                        }
                        z = z4;
                    } else {
                        z = false;
                    }
                    j = -9223372036854775807L;
                    u75.V0 = false;
                    u75.t2((a3b) b85.f, 1, z, u75.U0, j, -1, false);
                    return;
                }
                return;
            case 19:
                t75 t75 = (t75) this.c;
                a85 a85 = (a85) this.b;
                int i7 = t75.O0 - a85.c;
                t75.O0 = i7;
                boolean z5 = true;
                if (a85.d) {
                    t75.P0 = a85.e;
                    t75.Q0 = true;
                }
                if (a85.f) {
                    t75.R0 = a85.g;
                }
                if (i7 == 0) {
                    lue lue = a85.b.a;
                    if (!t75.k1.a.q() && lue.q()) {
                        t75.l1 = -1;
                        t75.m1 = 0;
                    }
                    if (!lue.q()) {
                        List asList2 = Arrays.asList(((a5b) lue).s0);
                        np8.f(asList2.size() == t75.A0.size());
                        for (int i8 = 0; i8 < asList2.size(); i8++) {
                            ((r75) t75.A0.get(i8)).b = (lue) asList2.get(i8);
                        }
                    }
                    if (t75.Q0) {
                        if (a85.b.b.equals(t75.k1.b) && a85.b.d == t75.k1.s) {
                            z5 = false;
                        }
                        if (z5) {
                            if (lue.q() || a85.b.b.a()) {
                                j3 = a85.b.d;
                            } else {
                                z2b z2b = a85.b;
                                xj8 xj8 = z2b.b;
                                long j5 = z2b.d;
                                Object obj2 = xj8.a;
                                gue gue = t75.z0;
                                lue.h(obj2, gue);
                                j3 = j5 + gue.X;
                            }
                            j2 = j3;
                        } else {
                            j2 = -9223372036854775807L;
                        }
                        z2 = z5;
                    } else {
                        j2 = -9223372036854775807L;
                        z2 = false;
                    }
                    t75.Q0 = false;
                    t75.q2(a85.b, 1, t75.R0, false, z2, t75.P0, j2, -1);
                    return;
                }
                return;
            case 20:
                r4b r4b = (r4b) this.b;
                ((f85) this.c).getClass();
                try {
                    synchronized (r4b) {
                    }
                    r4b.a.a(r4b.d, r4b.e);
                    r4b.b(true);
                    return;
                } catch (ExoPlaybackException e) {
                    fm9.c("Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    r4b.b(true);
                    throw th;
                }
            case 21:
                s4b s4b = (s4b) this.b;
                ((g85) this.c).getClass();
                try {
                    synchronized (s4b) {
                    }
                    s4b.a.a(s4b.d, s4b.e);
                    s4b.b(true);
                    return;
                } catch (androidx.media3.exoplayer.ExoPlaybackException e2) {
                    z04.v("Unexpected error delivering message on external thread.", e2);
                    throw new RuntimeException(e2);
                } catch (Throwable th2) {
                    s4b.b(true);
                    throw th2;
                }
            case 22:
                fa5 fa5 = (fa5) this.c;
                fa5.getClass();
                ((nx0) fa5.a).v(new ea5(fa5, (CountDownLatch) this.b, 1));
                return;
            case 23:
                x99 x99 = (x99) this.c;
                x99.getClass();
                ((pm7) x99.b).f(-1, new q64(x99, 24, (f1f) this.b));
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                FeedbackListenerManagerImpl.onFeedback$lambda$2((FeedbackListenerManagerImpl) this.c, (ArrayList) ((List) this.b));
                return;
            case 25:
                rk5 rk5 = (rk5) this.c;
                rk5.getClass();
                rk5.k.c(VideoFrameProcessingException.a((InterruptedException) this.b));
                return;
            case 26:
                ((rk5) this.c).k.c(VideoFrameProcessingException.a((Exception) this.b));
                return;
            case 27:
                rk5 rk52 = (rk5) this.c;
                rk52.getClass();
                rk52.k.c(VideoFrameProcessingException.a((GlUtil$GlException) this.b));
                return;
            case 28:
                rk5 rk53 = (rk5) this.c;
                rk53.getClass();
                lsd lsd = (lsd) this.b;
                rk53.k.o(lsd.a, lsd.b);
                return;
            default:
                kp.x(((fn5) this.c).t0, ((en5) this.b).a);
                return;
        }
    }

    public /* synthetic */ kl4(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
