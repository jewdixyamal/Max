package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: t45  reason: default package */
public final class t45 implements yud {
    public boolean X;
    public final long Y;
    public final /* synthetic */ od Z;
    public final yud a;
    public long b;
    public boolean c = true;
    public boolean o;

    public t45(od odVar, yud yud, long j) {
        this.Z = odVar;
        this.a = yud;
        this.Y = j;
        if (j == 0) {
            n((IOException) null);
        }
    }

    public final long c(bt0 bt0, long j) {
        if (!this.X) {
            try {
                long c2 = this.a.c(bt0, j);
                if (this.c) {
                    this.c = false;
                    ((dp3) this.Z.o).getClass();
                }
                if (c2 == -1) {
                    n((IOException) null);
                    return -1;
                }
                long j2 = this.b + c2;
                long j3 = this.Y;
                if (j3 == -1 || j2 <= j3) {
                    this.b = j2;
                    if (j2 == j3) {
                        n((IOException) null);
                    }
                    return c2;
                }
                throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
            } catch (IOException e) {
                throw n(e);
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final void close() {
        if (!this.X) {
            this.X = true;
            try {
                m();
                n((IOException) null);
            } catch (IOException e) {
                throw n(e);
            }
        }
    }

    public final void m() {
        this.a.close();
    }

    public final IOException n(IOException iOException) {
        if (this.o) {
            return iOException;
        }
        this.o = true;
        od odVar = this.Z;
        if (iOException == null && this.c) {
            this.c = false;
            ((dp3) odVar.o).getClass();
        }
        return odVar.a(true, false, iOException);
    }

    public final oue p() {
        return this.a.p();
    }

    public final String toString() {
        return t45.class.getSimpleName() + '(' + this.a + ')';
    }
}
