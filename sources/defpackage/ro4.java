package defpackage;

import java.io.IOException;

/* renamed from: ro4  reason: default package */
public final class ro4 extends Thread implements yo4 {
    public final int X;
    public volatile po4 Y;
    public volatile boolean Z;
    public final vo4 a;
    public final zo4 b;
    public final uo4 c;
    public final boolean o;
    public Exception s0;
    public long t0 = -1;

    public ro4(vo4 vo4, zo4 zo4, uo4 uo4, boolean z, int i, po4 po4) {
        this.a = vo4;
        this.b = zo4;
        this.c = uo4;
        this.o = z;
        this.X = i;
        this.Y = po4;
    }

    public final void a(boolean z) {
        if (z) {
            this.Y = null;
        }
        if (!this.Z) {
            this.Z = true;
            this.b.cancel();
            interrupt();
        }
    }

    public final void b(float f, long j, long j2) {
        this.c.a = j2;
        this.c.b = f;
        if (j != this.t0) {
            this.t0 = j;
            po4 po4 = this.Y;
            if (po4 != null) {
                po4.obtainMessage(11, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }

    public final void run() {
        long j;
        int i;
        try {
            if (this.o) {
                this.b.remove();
            } else {
                j = -1;
                i = 0;
                while (!this.Z) {
                    this.b.a(this);
                }
            }
        } catch (IOException e) {
            if (!this.Z) {
                long j2 = this.c.a;
                if (j2 != j) {
                    i = 0;
                    j = j2;
                }
                int i2 = i + 1;
                if (i2 <= this.X) {
                    Thread.sleep((long) Math.min(i * 1000, 5000));
                    i = i2;
                } else {
                    throw e;
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
            this.s0 = e2;
        }
        po4 po4 = this.Y;
        if (po4 != null) {
            po4.obtainMessage(10, this).sendToTarget();
        }
    }
}
