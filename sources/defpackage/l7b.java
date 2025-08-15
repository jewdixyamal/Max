package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.view.WindowInsetsAnimation;
import androidx.camera.core.ProcessingException;
import com.google.android.gms.tasks.Task;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.util.LangUtils;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: l7b  reason: default package */
public final class l7b implements nm0, f2a, JavaAudioDeviceModule.AudioRecordErrorCallback, erd, a76, l3a {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ l7b(int i, boolean z) {
        this.a = i;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 7:
                try {
                    Object apply = ((b66) this.c).apply(obj);
                    Objects.requireNonNull(apply, "The mapper function returned a null value.");
                    ((erd) this.b).a(apply);
                    return;
                } catch (Throwable th) {
                    c37.B(th);
                    onError(th);
                    return;
                }
            default:
                kee kee = (kee) obj;
                kee.getClass();
                try {
                    ((lee) ((nw4) this.c).b).c(kee);
                    return;
                } catch (ProcessingException unused) {
                    return;
                }
        }
    }

    public void b() {
        ((fab) ((iab) this.b)).i((Throwable) null);
    }

    public void c(zl4 zl4) {
        AtomicReference atomicReference;
        switch (this.a) {
            case 4:
                break;
            default:
                ((erd) this.b).c(zl4);
                return;
        }
        do {
            atomicReference = (AtomicReference) this.c;
            if (atomicReference.compareAndSet((Object) null, zl4)) {
                return;
            }
        } while (atomicReference.get() == null);
        zl4.g();
    }

    public void d(Throwable th) {
        int i = ((iee) this.b).f;
        if (i != 2 || !(th instanceof CancellationException)) {
            v3c.o(i);
        }
    }

    public void e(Object obj) {
        try {
            j47.s0((iab) this.b, obj);
        } catch (InterruptedException unused) {
        }
    }

    public void f() {
        byte[] bArr = oaf.f;
        wpa wpa = (wpa) this.c;
        wpa.getClass();
        wpa.E(bArr.length, bArr);
    }

    public lm0 g(sa4 sa4, long j) {
        int f;
        lm0 lm0;
        sa4 sa42 = sa4;
        long j2 = sa42.o;
        int min = (int) Math.min(20000, sa42.c - j2);
        wpa wpa = (wpa) this.c;
        wpa.D(min);
        sa42.q(wpa.a, 0, min, false);
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (wpa.a() >= 4) {
            if (km5.f(wpa.b, wpa.a) != 442) {
                wpa.H(1);
            } else {
                wpa.H(4);
                long e = opb.e(wpa);
                if (e != -9223372036854775807L) {
                    long b2 = ((tue) this.b).b(e);
                    if (b2 > j) {
                        if (j3 == -9223372036854775807L) {
                            return new lm0(-1, b2, j2);
                        }
                        lm0 = new lm0(0, -9223372036854775807L, j2 + ((long) i2));
                    } else if (100000 + b2 > j) {
                        lm0 = new lm0(0, -9223372036854775807L, j2 + ((long) wpa.b));
                    } else {
                        i2 = wpa.b;
                        j3 = b2;
                    }
                    return lm0;
                }
                int i3 = wpa.c;
                if (wpa.a() >= 10) {
                    wpa.H(9);
                    int u = wpa.u() & 7;
                    if (wpa.a() >= u) {
                        wpa.H(u);
                        if (wpa.a() >= 4) {
                            if (km5.f(wpa.b, wpa.a) == 443) {
                                wpa.H(4);
                                int A = wpa.A();
                                if (wpa.a() < A) {
                                    wpa.G(i3);
                                } else {
                                    wpa.H(A);
                                }
                            }
                            while (true) {
                                if (wpa.a() < 4 || (f = km5.f(wpa.b, wpa.a)) == 442 || f == 441 || (f >>> 8) != 1) {
                                    break;
                                }
                                wpa.H(4);
                                if (wpa.a() < 2) {
                                    wpa.G(i3);
                                    break;
                                }
                                wpa.G(Math.min(wpa.c, wpa.b + wpa.A()));
                            }
                        } else {
                            wpa.G(i3);
                        }
                    } else {
                        wpa.G(i3);
                    }
                } else {
                    wpa.G(i3);
                }
                i = wpa.b;
            }
        }
        return j3 != -9223372036854775807L ? new lm0(-2, j3, j2 + ((long) i)) : lm0.e;
    }

    public View h(int i, int i2, int i3, int i4) {
        hmf hmf = (hmf) this.b;
        int p = hmf.p();
        int r = hmf.r();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View t = hmf.t(i);
            int l = hmf.l(t);
            int w = hmf.w(t);
            ve veVar = (ve) this.c;
            veVar.b = p;
            veVar.c = r;
            veVar.d = l;
            veVar.e = w;
            if (i3 != 0) {
                veVar.a = i3;
                if (veVar.a()) {
                    return t;
                }
            }
            if (i4 != 0) {
                veVar.a = i4;
                if (veVar.a()) {
                    view = t;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean i(View view) {
        hmf hmf = (hmf) this.b;
        int p = hmf.p();
        int r = hmf.r();
        int l = hmf.l(view);
        int w = hmf.w(view);
        ve veVar = (ve) this.c;
        veVar.b = p;
        veVar.c = r;
        veVar.d = l;
        veVar.e = w;
        veVar.a = 24579;
        return veVar.a();
    }

    public void j() {
        nqd nqd = (nqd) ((sqd) this.b);
        if (!nqd.h()) {
            nqd.onError(new FetcherException(4, "Failed to fetch Vimeo video"));
        }
    }

    public void k(Object obj, String str) {
        AtomicReference atomicReference = (AtomicReference) ((khe) this.b).getValue();
        while (true) {
            Map map = (Map) atomicReference.get();
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            if (obj == null) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, obj);
            }
            while (true) {
                if (!atomicReference.compareAndSet(map, linkedHashMap)) {
                    if (atomicReference.get() != map) {
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void l(Task task) {
        ykg ykg = (ykg) this.b;
        qne qne = (qne) this.c;
        synchronized (ykg.f) {
            ykg.e.remove(qne);
        }
    }

    public void m() {
        hze.a(new u3c(18, this));
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 4:
                ((fab) ((iab) this.b)).i(th);
                return;
            default:
                ((erd) this.b).onError(th);
                return;
        }
    }

    public void onWebRtcAudioRecordError(String str) {
        ((y8) this.b).onWebRtcAudioRecordError(str);
        a4c a4c = (a4c) this.c;
        a4c.log("SharedPeerConnectionFac", "onWebRtcAudioRecordError: " + str);
        a4c.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordError", new Exception(wg0.i("onWebRtcAudioRecordError ", str)));
    }

    public void onWebRtcAudioRecordInitError(String str) {
        ((y8) this.b).onWebRtcAudioRecordInitError(str);
        a4c a4c = (a4c) this.c;
        a4c.log("SharedPeerConnectionFac", "onWebRtcAudioRecordInitError: " + str);
        a4c.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordInitError", new Exception(wg0.i("onWebRtcAudioRecordInitError ", str)));
    }

    public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        ((y8) this.b).onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        a4c a4c = (a4c) this.c;
        a4c.log("SharedPeerConnectionFac", "onWebRtcAudioRecordStartError: . " + str);
        a4c.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordStartError", new Exception(wg0.i("onWebRtcAudioRecordStartError ", str)));
    }

    public String toString() {
        switch (this.a) {
            case 16:
                return "Bounds{lower=" + ((v27) this.b) + " upper=" + ((v27) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ l7b(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ l7b(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public l7b(k56 k56) {
        this.a = 6;
        this.c = k56;
        this.b = new khe(new ie(9, (Object) this));
    }

    public l7b(int i) {
        this.a = i;
        switch (i) {
            case LangUtils.HASH_SEED /*17*/:
                ee6 ee6 = ee6.d;
                this.b = new SparseIntArray();
                this.c = ee6;
                return;
            default:
                this.b = new tt3(cpc.f, (jqe) new eqe(dpc.h), Integer.valueOf(woc.D0), (Integer) null, 20);
                this.c = new tt3(cpc.b, (jqe) new eqe(dpc.e), Integer.valueOf(gpc.u), (Integer) null, 20);
                return;
        }
    }

    public l7b(je7 je7) {
        this.a = 0;
        je7 je72 = iyc.l;
        this.b = new khe(new dr(je7));
        this.c = je72;
    }

    public l7b(tue tue) {
        this.a = 2;
        this.b = tue;
        this.c = new wpa();
    }

    public l7b(uye uye) {
        this.a = 11;
        this.b = uye.a;
        this.c = uye.b;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, ve] */
    public l7b(hmf hmf) {
        this.a = 14;
        this.b = hmf;
        ? obj = new Object();
        obj.a = 0;
        this.c = obj;
    }

    public l7b(WindowInsetsAnimation.Bounds bounds) {
        this.a = 16;
        this.b = v27.c(bounds.getLowerBound());
        this.c = v27.c(bounds.getUpperBound());
    }
}
