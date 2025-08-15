package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: wo6  reason: default package */
public final class wo6 extends uo6 {
    public boolean X = true;
    public final vq6 Y;
    public final /* synthetic */ x8 Z;
    public long o = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wo6(x8 x8Var, vq6 vq6) {
        super(x8Var);
        this.Z = x8Var;
        this.Y = vq6;
    }

    public final long c(bt0 bt0, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount < 0: ").toString());
        } else if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        } else if (!this.X) {
            return -1;
        } else {
            long j2 = this.o;
            int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            x8 x8Var = this.Z;
            if (i == 0 || j2 == -1) {
                if (j2 != -1) {
                    ((fu0) x8Var.X).X();
                }
                try {
                    this.o = ((fu0) x8Var.X).j0();
                    String obj = w9e.b1(((fu0) x8Var.X).X()).toString();
                    if (this.o < 0 || (obj.length() > 0 && !eae.o0(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.o + obj + '\"');
                    }
                    if (this.o == 0) {
                        this.X = false;
                        mq6.b(((u2a) x8Var.c).u0, this.Y, ((g03) x8Var.b).Y());
                        m();
                    }
                    if (!this.X) {
                        return -1;
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long c = super.c(bt0, Math.min(j, this.o));
            if (c != -1) {
                this.o -= c;
                return c;
            }
            ((f8c) x8Var.o).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m();
            throw protocolException;
        }
    }

    public final void close() {
        boolean z;
        if (!this.b) {
            if (this.X) {
                try {
                    z = naf.t(this, 100, TimeUnit.MILLISECONDS);
                } catch (IOException unused) {
                    z = false;
                }
                if (!z) {
                    ((f8c) this.Z.o).k();
                    m();
                }
            }
            this.b = true;
        }
    }
}
