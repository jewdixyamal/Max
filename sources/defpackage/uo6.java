package defpackage;

import java.io.IOException;

/* renamed from: uo6  reason: default package */
public abstract class uo6 implements yud {
    public final t06 a;
    public boolean b;
    public final /* synthetic */ x8 c;

    public uo6(x8 x8Var) {
        this.c = x8Var;
        this.a = new t06(((fu0) x8Var.X).p());
    }

    public long c(bt0 bt0, long j) {
        x8 x8Var = this.c;
        try {
            return ((fu0) x8Var.X).c(bt0, j);
        } catch (IOException e) {
            ((f8c) x8Var.o).k();
            m();
            throw e;
        }
    }

    public final void m() {
        x8 x8Var = this.c;
        int i = x8Var.a;
        if (i != 6) {
            if (i == 5) {
                t06 t06 = this.a;
                oue oue = t06.e;
                t06.e = oue.d;
                oue.a();
                oue.b();
                x8Var.a = 6;
                return;
            }
            throw new IllegalStateException("state: " + x8Var.a);
        }
    }

    public final oue p() {
        return this.a;
    }
}
