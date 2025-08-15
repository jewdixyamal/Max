package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: xo6  reason: default package */
public final class xo6 extends uo6 {
    public final /* synthetic */ x8 X;
    public long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xo6(x8 x8Var, long j) {
        super(x8Var);
        this.X = x8Var;
        this.o = j;
        if (j == 0) {
            m();
        }
    }

    public final long c(bt0 bt0, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount < 0: ").toString());
        } else if (!this.b) {
            long j2 = this.o;
            if (j2 == 0) {
                return -1;
            }
            long c = super.c(bt0, Math.min(j2, j));
            if (c != -1) {
                long j3 = this.o - c;
                this.o = j3;
                if (j3 == 0) {
                    m();
                }
                return c;
            }
            ((f8c) this.X.o).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m();
            throw protocolException;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final void close() {
        boolean z;
        if (!this.b) {
            if (this.o != 0) {
                try {
                    z = naf.t(this, 100, TimeUnit.MILLISECONDS);
                } catch (IOException unused) {
                    z = false;
                }
                if (!z) {
                    ((f8c) this.X.o).k();
                    m();
                }
            }
            this.b = true;
        }
    }
}
