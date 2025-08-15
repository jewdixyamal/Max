package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.webrtc.EncodedImage;

/* renamed from: z26  reason: default package */
public final class z26 implements uoc {
    public volatile boolean a;
    public volatile e24 b;
    public final ConcurrentLinkedQueue c;
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e;
    public final cue f;
    public volatile yag g;
    public volatile boolean h;

    public z26() {
        new AtomicLong();
        this.e = new AtomicInteger();
        this.c = new ConcurrentLinkedQueue();
        this.f = new cue();
    }

    public static void b(yag yag) {
        if (yag != null) {
            synchronized (yag.a) {
                yag.a.notify();
            }
        }
    }

    public final void a(e24 e24, byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.get();
        byte b2 = wrap.get();
        wrap.getShort();
        if (b2 == 1) {
            this.h = true;
        }
    }

    public final synchronized void c(boolean z) {
        try {
            if (this.a) {
                this.a = false;
                yag yag = this.g;
                if (yag != null) {
                    yag.o = true;
                    if (z) {
                        synchronized (yag.b) {
                            yag.c = null;
                        }
                    }
                }
                b(yag);
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    EncodedImage encodedImage = (EncodedImage) it.next();
                    this.d.addAndGet(-encodedImage.buffer.remaining());
                    encodedImage.release();
                    it.remove();
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void d(e24 e24) {
        try {
            if (this.b != null) {
                this.b.e.remove(this);
                this.b.c(this);
            }
            c(true);
            this.b = e24;
            if (this.b != null) {
                this.b.e.add(this);
                this.b.a(this);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void e() {
        c(true);
        this.a = true;
        yag yag = new yag(this, this.b);
        this.g = yag;
        yag.start();
    }
}
