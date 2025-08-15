package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.LongSparseArray;
import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.webrtc.protocol.exceptions.RtcRetryLimitExceedException;

/* renamed from: koc  reason: default package */
public final class koc {
    public final noc a;
    public final AtomicReference b = new AtomicReference((Object) null);
    public final pbg c = new pbg(this);
    public final vag d = new vag(2, this);
    public final HandlerThread e;
    public final Handler f;
    public final Handler g = new Handler(Looper.getMainLooper());
    public final Handler h = new Handler(Looper.getMainLooper());
    public final xjc i = new xjc();
    public final AtomicBoolean j = new AtomicBoolean(false);
    public long k = 0;
    public final LongSparseArray l = new LongSparseArray();
    public final LinkedList m = new LinkedList();
    public final k8g n;
    public final a4c o;

    public koc(aab aab) {
        noc noc = (noc) aab.b;
        if (noc != null) {
            this.a = noc;
            a4c a4c = (a4c) aab.a;
            this.o = a4c;
            this.n = new k8g(a4c);
            HandlerThread handlerThread = new HandlerThread("RtcCommExec");
            this.e = handlerThread;
            handlerThread.start();
            this.f = new Handler(handlerThread.getLooper());
            return;
        }
        throw new IllegalArgumentException("Illegal 'serializer' value: null");
    }

    public final void a() {
        this.g.removeCallbacksAndMessages((Object) null);
        LinkedList linkedList = this.m;
        linkedList.clear();
        int i2 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.l;
            if (i2 < longSparseArray.size()) {
                long keyAt = longSparseArray.keyAt(i2);
                uag uag = (uag) longSparseArray.valueAt(i2);
                uag.e = 0;
                uag.f = 0;
                linkedList.offer(Long.valueOf(keyAt));
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b() {
        Handler handler = this.h;
        k8g k8g = this.n;
        e24 e24 = (e24) this.b.get();
        if (e24 != null && e24.b()) {
            LinkedList linkedList = this.m;
            for (Long l2 = (Long) linkedList.poll(); l2 != null; l2 = (Long) linkedList.poll()) {
                LongSparseArray longSparseArray = this.l;
                uag uag = (uag) longSparseArray.get(l2.longValue());
                if (uag != null) {
                    try {
                        sh0 W = this.a.W(uag.b, uag.c);
                        byte[] bArr = (byte[]) W.c;
                        int i2 = W.b;
                        boolean e2 = e24.e(i2, bArr);
                        if (e2) {
                            hoc hoc = uag.c;
                            k8g.getClass();
                            gbg gbg = new gbg(k8g, hoc, 2);
                            Handler handler2 = (Handler) k8g.c;
                            handler2.post(gbg);
                            handler2.post(new hbg(k8g, bArr, i2, 1));
                        }
                        if (e2) {
                            if (uag.c.a()) {
                                k8g.e(uag.c);
                                longSparseArray.remove(uag.b);
                            }
                            handler.post(new ule(20, uag));
                        } else {
                            c(uag.b);
                        }
                    } catch (Throwable th) {
                        hoc hoc2 = uag.c;
                        k8g.getClass();
                        ((Handler) k8g.c).post(new ewc(k8g, hoc2, th, 17));
                        k8g.e(uag.c);
                        handler.post(new fre(uag, 27, th));
                        longSparseArray.remove(uag.b);
                    }
                }
            }
        }
    }

    public final void c(long j2) {
        long j3 = j2;
        LongSparseArray longSparseArray = this.l;
        uag uag = (uag) longSparseArray.get(j3);
        if (uag != null && !this.j.get()) {
            ioc ioc = uag.d;
            long j4 = ioc.e;
            int i2 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
            xjc xjc = this.i;
            if (i2 >= 0) {
                xjc.getClass();
                long j5 = ioc.f;
                if (j5 >= 0) {
                    float f2 = ioc.g;
                    if (f2 >= 0.0f) {
                        float f3 = ioc.h;
                        if (f3 >= 0.0f) {
                            xjc.a = f3;
                            long j6 = uag.f;
                            if (j6 >= 0) {
                                uag.e++;
                                float max = Math.max((float) j4, Math.min((float) ((long) (((float) j6) * f2)), (float) j5));
                                long nextGaussian = (long) (max + ((float) (((Random) xjc.b).nextGaussian() * ((double) max) * ((double) xjc.a))));
                                uag.f = nextGaussian;
                                if (uag.e >= 0) {
                                    RtcRetryLimitExceedException rtcRetryLimitExceedException = new RtcRetryLimitExceedException();
                                    k8g k8g = this.n;
                                    k8g.getClass();
                                    hoc hoc = ioc.b;
                                    ((Handler) k8g.c).post(new ewc(k8g, hoc, rtcRetryLimitExceedException, 17));
                                    k8g.e(hoc);
                                    this.h.post(new fre(uag, 27, rtcRetryLimitExceedException));
                                    longSparseArray.remove(j3);
                                    return;
                                }
                                this.g.postDelayed(new joc(this, j3, 1), nextGaussian);
                                return;
                            }
                            throw new IllegalArgumentException(ey8.h(j6, "Illegal 'latestRetryTimeout' value: "));
                        }
                        throw new IllegalArgumentException("Illegal 'retryBackoffJitter' value: " + f3);
                    }
                    throw new IllegalArgumentException("Illegal 'retryBackoffFactor' value: " + f2);
                }
                throw new IllegalArgumentException(ey8.h(j5, "Illegal 'maxRetryTimeoutMs' value: "));
            }
            xjc.getClass();
            throw new IllegalArgumentException(ey8.h(j4, "Illegal 'minRetryTimeoutMs' value: "));
        }
    }

    public final void d(ioc ioc) {
        if (this.j.get()) {
            this.o.log("RTCCommand", "execute on disposed");
        }
        this.f.post(new flc(this, 4, ioc));
    }
}
