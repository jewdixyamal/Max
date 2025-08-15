package defpackage;

/* renamed from: yo6  reason: default package */
public final class yo6 extends uo6 {
    public boolean o;

    public final long c(bt0 bt0, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount < 0: ").toString());
        } else if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.o) {
            return -1;
        } else {
            long c = super.c(bt0, j);
            if (c != -1) {
                return c;
            }
            this.o = true;
            m();
            return -1;
        }
    }

    public final void close() {
        if (!this.b) {
            if (!this.o) {
                m();
            }
            this.b = true;
        }
    }
}
