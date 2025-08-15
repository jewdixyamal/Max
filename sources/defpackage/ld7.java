package defpackage;

import java.util.Random;

/* renamed from: ld7  reason: default package */
public final class ld7 extends Random {
    public final n4c a;
    public boolean b;

    public ld7(n4c n4c) {
        this.a = n4c;
    }

    public final int next(int i) {
        return this.a.a(i);
    }

    public final boolean nextBoolean() {
        return this.a.b();
    }

    public final void nextBytes(byte[] bArr) {
        this.a.c(bArr);
    }

    public final double nextDouble() {
        return this.a.d();
    }

    public final float nextFloat() {
        return this.a.e();
    }

    public final int nextInt() {
        return this.a.f();
    }

    public final long nextLong() {
        return this.a.h();
    }

    public final void setSeed(long j) {
        if (!this.b) {
            this.b = true;
            return;
        }
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }

    public final int nextInt(int i) {
        return this.a.g(i);
    }
}
