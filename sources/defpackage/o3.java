package defpackage;

import java.util.Arrays;
import kotlin.coroutines.Continuation;

/* renamed from: o3  reason: default package */
public abstract class o3 {
    public p3[] a;
    public int b;
    public int c;
    public yae o;

    public final p3 h() {
        p3 p3Var;
        yae yae;
        synchronized (this) {
            try {
                p3[] p3VarArr = this.a;
                if (p3VarArr == null) {
                    p3VarArr = k();
                    this.a = p3VarArr;
                } else if (this.b >= p3VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(p3VarArr, p3VarArr.length * 2);
                    this.a = (p3[]) copyOf;
                    p3VarArr = (p3[]) copyOf;
                }
                int i = this.c;
                do {
                    p3Var = p3VarArr[i];
                    if (p3Var == null) {
                        p3Var = j();
                        p3VarArr[i] = p3Var;
                    }
                    i++;
                    if (i >= p3VarArr.length) {
                        i = 0;
                    }
                } while (!p3Var.a(this));
                this.c = i;
                this.b++;
                yae = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (yae != null) {
            yae.z(1);
        }
        return p3Var;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [kld, yae] */
    public final j0e i() {
        yae yae;
        synchronized (this) {
            yae yae2 = this.o;
            yae = yae2;
            if (yae2 == null) {
                int i = this.b;
                ? kld = new kld(1, Integer.MAX_VALUE, 2);
                kld.g(Integer.valueOf(i));
                this.o = kld;
                yae = kld;
            }
        }
        return yae;
    }

    public abstract p3 j();

    public abstract p3[] k();

    public final void l(p3 p3Var) {
        yae yae;
        int i;
        Continuation[] b2;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                yae = this.o;
                if (i2 == 0) {
                    this.c = 0;
                }
                b2 = p3Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : b2) {
            if (continuation != null) {
                continuation.resumeWith(e5f.a);
            }
        }
        if (yae != null) {
            yae.z(-1);
        }
    }
}
