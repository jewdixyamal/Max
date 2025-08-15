package defpackage;

import java.util.Iterator;
import java.util.Objects;

/* renamed from: pr5  reason: default package */
public final class pr5 extends zk0 {
    public Iterator a;
    public volatile boolean b;
    public boolean c;
    public final vae o;

    public pr5(vae vae, Iterator it) {
        this.a = it;
        this.o = vae;
    }

    public final void a() {
        Iterator it = this.a;
        vae vae = this.o;
        while (!this.b) {
            try {
                Object next = it.next();
                if (!this.b) {
                    if (next == null) {
                        vae.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    vae.e(next);
                    if (!this.b) {
                        try {
                            if (!it.hasNext()) {
                                if (!this.b) {
                                    vae.b();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            c37.B(th);
                            vae.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th2) {
                c37.B(th2);
                vae.onError(th2);
                return;
            }
        }
    }

    public final void b(long j) {
        Iterator it = this.a;
        vae vae = this.o;
        do {
            long j2 = 0;
            while (true) {
                if (j2 == j) {
                    j = get();
                    if (j2 == j) {
                        j = addAndGet(-j2);
                    }
                } else if (!this.b) {
                    try {
                        Object next = it.next();
                        if (!this.b) {
                            if (next == null) {
                                vae.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            vae.e(next);
                            if (!this.b) {
                                try {
                                    if (it.hasNext()) {
                                        j2++;
                                    } else if (!this.b) {
                                        vae.b();
                                        return;
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th) {
                                    c37.B(th);
                                    vae.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        c37.B(th2);
                        vae.onError(th2);
                        return;
                    }
                } else {
                    return;
                }
            }
        } while (j != 0);
    }

    public final void cancel() {
        this.b = true;
    }

    public final void clear() {
        this.a = null;
    }

    public final boolean isEmpty() {
        Iterator it = this.a;
        if (it == null) {
            return true;
        }
        if (!this.c || it.hasNext()) {
            return false;
        }
        this.a = null;
        return true;
    }

    public final void j(long j) {
        if (zae.d(j) && ngg.b(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                a();
            } else {
                b(j);
            }
        }
    }

    public final int n(int i) {
        return 1;
    }

    public final Object poll() {
        Iterator it = this.a;
        if (it == null) {
            return null;
        }
        if (!this.c) {
            this.c = true;
        } else if (!it.hasNext()) {
            return null;
        }
        Object next = this.a.next();
        Objects.requireNonNull(next, "Iterator.next() returned a null value");
        return next;
    }
}
