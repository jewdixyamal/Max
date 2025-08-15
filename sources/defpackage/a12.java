package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: a12  reason: default package */
public abstract class a12 implements cbe {
    public long X;
    public long Y;
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public w02 o;

    public a12() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new o54(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            v02 v02 = new v02(0, this);
            y02 y02 = new y02();
            y02.Z = v02;
            arrayDeque.add(y02);
        }
        this.c = new PriorityQueue();
    }

    public abstract w4d a();

    public final void b(long j) {
        this.X = j;
    }

    public abstract void d(w02 w02);

    /* renamed from: e */
    public jbe c() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.c;
            if (priorityQueue.isEmpty()) {
                break;
            }
            int i = maf.a;
            if (((w02) priorityQueue.peek()).Y > this.X) {
                break;
            }
            w02 w02 = (w02) priorityQueue.poll();
            boolean f = w02.f(4);
            ArrayDeque arrayDeque2 = this.a;
            if (f) {
                jbe jbe = (jbe) arrayDeque.pollFirst();
                jbe.a(4);
                w02.v();
                arrayDeque2.add(w02);
                return jbe;
            }
            d(w02);
            if (g()) {
                w4d a2 = a();
                jbe jbe2 = (jbe) arrayDeque.pollFirst();
                jbe2.w(w02.Y, a2, Long.MAX_VALUE);
                w02.v();
                arrayDeque2.add(w02);
                return jbe2;
            }
            w02.v();
            arrayDeque2.add(w02);
        }
        return null;
    }

    public final Object f() {
        np8.f(this.o == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        w02 w02 = (w02) arrayDeque.pollFirst();
        this.o = w02;
        return w02;
    }

    public void flush() {
        ArrayDeque arrayDeque;
        this.Y = 0;
        this.X = 0;
        while (true) {
            PriorityQueue priorityQueue = this.c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            w02 w02 = (w02) priorityQueue.poll();
            int i = maf.a;
            w02.v();
            arrayDeque.add(w02);
        }
        w02 w022 = this.o;
        if (w022 != null) {
            w022.v();
            arrayDeque.add(w022);
            this.o = null;
        }
    }

    public abstract boolean g();

    public final void l(hbe hbe) {
        np8.d(hbe == this.o);
        w02 w02 = (w02) hbe;
        if (w02.f(Integer.MIN_VALUE)) {
            w02.v();
            this.a.add(w02);
        } else {
            long j = this.Y;
            this.Y = 1 + j;
            w02.v0 = j;
            this.c.add(w02);
        }
        this.o = null;
    }

    public void release() {
    }
}
