package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: kj  reason: default package */
public final class kj {
    public final bg4 a;
    public final kad b;
    public volatile Integer c;
    public volatile e24 d;
    public volatile g24 e;
    public final jj f = new jj(this);
    public volatile rw4 g;
    public volatile long h;

    public kj(bg4 bg4, kad kad, Integer num) {
        this.a = bg4;
        this.b = kad;
        this.c = num;
        Integer num2 = this.c;
        this.g = (num2 != null && num2.intValue() == 1) ? null : new rw4(this);
        bg4.getClass();
    }

    public final void a(int i, tu0 tu0) {
        String str;
        g24 g24;
        Boolean bool = null;
        boolean z = true;
        ij ijVar = (i != 1 || !(tu0 instanceof zh)) ? new ij(i, (int) (SystemClock.elapsedRealtime() - this.h), tu0) : null;
        if (!(ijVar == null || (g24 = this.e) == null)) {
            AtomicInteger atomicInteger = g24.X;
            int i2 = atomicInteger.get();
            int i3 = g24.b;
            kad kad = g24.a;
            if (i2 > i3) {
                ((AtomicInteger) kad.c).incrementAndGet();
                z = false;
            } else {
                g24.o.add(ijVar);
                ((AtomicInteger) kad.o).incrementAndGet();
                atomicInteger.incrementAndGet();
                ReentrantLock reentrantLock = g24.s0;
                reentrantLock.lock();
                try {
                    g24.t0.signal();
                } finally {
                    reentrantLock.unlock();
                }
            }
            bool = Boolean.valueOf(z);
        }
        if (!tpa.f(bool, Boolean.TRUE)) {
            if (!(tu0 instanceof yh)) {
                if (tu0 instanceof zh) {
                    nd7.e(16);
                    String l = Long.toString(((long) ((zh) tu0).n) & 4294967295L, 16);
                    int i4 = 6;
                    if (l.length() > 6) {
                        i4 = 8;
                    }
                    str = wg0.i("bgColor: 0x", w9e.H0(l, i4, '0'));
                } else if (tu0 instanceof ai) {
                    str = "EOS";
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                ((a4c) this.a.b).log("AniSend", "package was not sent: " + str);
                return;
            }
            ((yh) tu0).getClass();
            throw null;
        }
    }

    public final void b() {
        e24 e24 = this.d;
        if (e24 != null) {
            jj jjVar = this.f;
            if (jjVar != null) {
                e24.c.remove(jjVar);
            } else {
                throw new IllegalArgumentException("Illegal 'listener' value: null");
            }
        }
        this.d = null;
        g24 g24 = this.e;
        if (g24 != null) {
            if (!g24.v0) {
                g24.v0 = true;
                g24.interrupt();
            }
            ReentrantLock reentrantLock = g24.u0;
            reentrantLock.lock();
            try {
                g24.c = null;
            } finally {
                reentrantLock.unlock();
            }
        }
        this.e = null;
    }

    public final void c(int i) {
        rw4 rw4 = this.g;
        Integer num = this.c;
        if (rw4 != null) {
            rw4.b = Integer.valueOf(i);
            rw4.a();
        } else if (num != null) {
            int intValue = num.intValue();
            if (intValue == 2) {
                a(intValue, new zh(i));
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("AnimojiSender has neither version nor startup data");
            a4c a4c = (a4c) this.a.b;
            String message = illegalStateException.getMessage();
            if (message == null) {
                message = "animoji error";
            }
            a4c.reportException("AniSend", message, illegalStateException);
            rw4 rw42 = new rw4(this);
            rw42.b = Integer.valueOf(i);
            rw42.a();
            this.g = rw42;
        }
    }

    public final void d(e24 e24) {
        b();
        this.d = e24;
        jj jjVar = this.f;
        if (jjVar != null) {
            e24.c.add(jjVar);
            this.h = SystemClock.elapsedRealtime();
            kad kad = this.b;
            ((AtomicInteger) kad.a).set(0);
            ((AtomicInteger) kad.b).set(0);
            ((AtomicInteger) kad.c).set(0);
            ((AtomicInteger) kad.o).set(0);
            this.e = new g24(e24, this.b);
            g24 g24 = this.e;
            if (g24 != null) {
                g24.start();
            }
            rw4 rw4 = this.g;
            if (rw4 != null) {
                rw4.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Illegal 'listener' value: null");
    }
}
