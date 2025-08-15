package defpackage;

import java.util.Objects;

/* renamed from: or5  reason: default package */
public final class or5 extends zk0 {
    public final Object[] a;
    public int b;
    public volatile boolean c;
    public final vae o;

    public or5(vae vae, Object[] objArr) {
        this.a = objArr;
        this.o = vae;
    }

    public final void cancel() {
        this.c = true;
    }

    public final void clear() {
        this.b = this.a.length;
    }

    public final boolean isEmpty() {
        return this.b == this.a.length;
    }

    public final void j(long j) {
        if (zae.d(j) && ngg.b(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                Object[] objArr = this.a;
                int length = objArr.length;
                vae vae = this.o;
                int i = this.b;
                while (i != length) {
                    if (!this.c) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            vae.onError(new NullPointerException(wg0.g(i, "The element at index ", " is null")));
                            return;
                        } else {
                            vae.e(obj);
                            i++;
                        }
                    } else {
                        return;
                    }
                }
                if (!this.c) {
                    vae.b();
                    return;
                }
                return;
            }
            Object[] objArr2 = this.a;
            int length2 = objArr2.length;
            int i2 = this.b;
            vae vae2 = this.o;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == length2) {
                        if (i2 != length2) {
                            j = get();
                            if (j2 == j) {
                                this.b = i2;
                                j = addAndGet(-j2);
                            }
                        } else if (!this.c) {
                            vae2.b();
                            return;
                        } else {
                            return;
                        }
                    } else if (!this.c) {
                        Object obj2 = objArr2[i2];
                        if (obj2 == null) {
                            vae2.onError(new NullPointerException(wg0.g(i2, "The element at index ", " is null")));
                            return;
                        }
                        vae2.e(obj2);
                        j2++;
                        i2++;
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    public final int n(int i) {
        return 1;
    }

    public final Object poll() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i == objArr.length) {
            return null;
        }
        this.b = i + 1;
        Object obj = objArr[i];
        Objects.requireNonNull(obj, "array element is null");
        return obj;
    }
}
