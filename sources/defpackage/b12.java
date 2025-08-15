package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: b12  reason: default package */
public abstract class b12 implements dbe {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public x02 d;
    public long e;
    public long f;
    public long g;

    public b12() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new p54(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            v02 v02 = new v02(1, this);
            z02 z02 = new z02();
            z02.s0 = v02;
            arrayDeque.add(z02);
        }
        this.c = new PriorityQueue();
        this.g = -9223372036854775807L;
    }

    public final void a(long j) {
        this.g = j;
    }

    public final void b(long j) {
        this.e = j;
    }

    public final void d(ibe ibe) {
        fm9.f(ibe == this.d);
        x02 x02 = (x02) ibe;
        long j = this.g;
        if (j == -9223372036854775807L || x02.Z >= j) {
            long j2 = this.f;
            this.f = 1 + j2;
            x02.w0 = j2;
            this.c.add(x02);
        } else {
            x02.v();
            this.a.add(x02);
        }
        this.d = null;
    }

    public abstract c12 e();

    public final Object f() {
        fm9.k(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        x02 x02 = (x02) arrayDeque.pollFirst();
        this.d = x02;
        return x02;
    }

    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0;
        this.e = 0;
        while (true) {
            PriorityQueue priorityQueue = this.c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            x02 x02 = (x02) priorityQueue.poll();
            int i = oaf.a;
            x02.v();
            arrayDeque.add(x02);
        }
        x02 x022 = this.d;
        if (x022 != null) {
            x022.v();
            arrayDeque.add(x022);
            this.d = null;
        }
    }

    public abstract void g(x02 x02);

    /* renamed from: h */
    public kbe c() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.c;
            if (priorityQueue.isEmpty()) {
                break;
            }
            int i = oaf.a;
            if (((x02) priorityQueue.peek()).Z > this.e) {
                break;
            }
            x02 x02 = (x02) priorityQueue.poll();
            boolean f2 = x02.f(4);
            ArrayDeque arrayDeque2 = this.a;
            if (f2) {
                kbe kbe = (kbe) arrayDeque.pollFirst();
                kbe.a(4);
                x02.v();
                arrayDeque2.add(x02);
                return kbe;
            }
            g(x02);
            if (i()) {
                c12 e2 = e();
                kbe kbe2 = (kbe) arrayDeque.pollFirst();
                long j = x02.Z;
                kbe2.c = j;
                kbe2.X = e2;
                kbe2.Y = j;
                x02.v();
                arrayDeque2.add(x02);
                return kbe2;
            }
            x02.v();
            arrayDeque2.add(x02);
        }
        return null;
    }

    public abstract boolean i();

    public void release() {
    }
}
