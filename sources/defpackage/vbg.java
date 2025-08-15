package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: vbg  reason: default package */
public final class vbg {
    public static final long E;
    public static final String[] F = {"OMX.google.", "OMX.SEC.", "c2.android"};
    public static final long G;
    public final ax A;
    public boolean B;
    public volatile boolean C;
    public int D;
    public final a4c a;
    public final ypc b;
    public final byte[] c = new byte[8192];
    public final HandlerThread d;
    public final Handler e;
    public m2a f;
    public t54 g;
    public final long h;
    public long i;
    public Integer j;
    public Integer k;
    public final AtomicInteger l;
    public final AtomicInteger m;
    public final AtomicInteger n;
    public final AtomicInteger o;
    public final AtomicInteger p;
    public final AtomicInteger q;
    public final AtomicInteger r;
    public final AtomicInteger s;
    public final AtomicInteger t;
    public final cue u;
    public final cue v;
    public final cue w;
    public final cue x;
    public final AtomicInteger y;
    public final AtomicInteger z;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        E = timeUnit.toNanos(1) / 10;
        G = timeUnit.toMillis(3);
    }

    public vbg(a4c a4c, vte vte, ypc ypc) {
        HandlerThread handlerThread = new HandlerThread("DecoderWrapperControl");
        this.d = handlerThread;
        this.f = null;
        this.h = -1;
        this.i = 0;
        this.l = new AtomicInteger(0);
        this.m = new AtomicInteger(0);
        this.n = new AtomicInteger(0);
        this.o = new AtomicInteger(0);
        this.p = new AtomicInteger(0);
        this.q = new AtomicInteger(0);
        this.r = new AtomicInteger(0);
        this.s = new AtomicInteger(0);
        this.t = new AtomicInteger(0);
        this.u = new cue();
        this.v = new cue();
        this.w = new cue();
        this.x = new cue();
        this.y = new AtomicInteger(0);
        this.z = new AtomicInteger(0);
        this.B = false;
        this.a = a4c;
        this.b = ypc;
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
        this.A = new ax(vte);
    }

    public final void a() {
        if (!this.C) {
            this.C = true;
            HandlerThread handlerThread = this.d;
            Handler handler = this.e;
            ule ule = new ule(21, this);
            handler.removeCallbacksAndMessages((Object) null);
            handler.post(ule);
            handlerThread.quitSafely();
        }
    }

    public final void b() {
        m2a m2a = this.f;
        if (m2a != null) {
            try {
                ((ByteArrayOutputStream) m2a.e).close();
            } catch (IOException unused) {
            }
        }
        this.f = null;
    }
}
