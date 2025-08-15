package defpackage;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: pm7  reason: default package */
public final class pm7 {
    public final she a;
    public final bie b;
    public final mm7 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public pm7(Looper looper, she she, mm7 mm7) {
        this(new CopyOnWriteArraySet(), looper, she, mm7, true);
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (!this.h) {
                    this.d.add(new om7(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque arrayDeque = this.f;
        if (!arrayDeque.isEmpty()) {
            bie bie = this.b;
            if (!bie.a.hasMessages(1)) {
                bie.getClass();
                zhe c2 = bie.c();
                c2.a = bie.a.obtainMessage(1);
                bie.getClass();
                Message message = c2.a;
                message.getClass();
                bie.a.sendMessageAtFrontOfQueue(message);
                c2.a();
            }
            ArrayDeque arrayDeque2 = this.e;
            boolean z = !arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (!z) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public final void c(int i2, km7 km7) {
        g();
        this.f.add(new si1((Object) new CopyOnWriteArraySet(this.d), i2, (Object) km7, 12));
    }

    public final void d() {
        g();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            om7 om7 = (om7) it.next();
            mm7 mm7 = this.c;
            om7.d = true;
            if (om7.c) {
                om7.c = false;
                mm7.d(om7.a, om7.b.e());
            }
        }
        this.d.clear();
    }

    public final void e(Object obj) {
        g();
        CopyOnWriteArraySet copyOnWriteArraySet = this.d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            om7 om7 = (om7) it.next();
            if (om7.a.equals(obj)) {
                om7.d = true;
                if (om7.c) {
                    om7.c = false;
                    tm5 e2 = om7.b.e();
                    this.c.d(om7.a, e2);
                }
                copyOnWriteArraySet.remove(om7);
            }
        }
    }

    public final void f(int i2, km7 km7) {
        c(i2, km7);
        b();
    }

    public final void g() {
        if (this.i) {
            fm9.k(Thread.currentThread() == this.b.a.getLooper().getThread());
        }
    }

    public pm7(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, she she, mm7 mm7, boolean z) {
        this.a = she;
        this.d = copyOnWriteArraySet;
        this.c = mm7;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = she.a(looper, new hl4(2, this));
        this.i = z;
    }
}
