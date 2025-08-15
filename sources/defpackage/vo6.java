package defpackage;

import org.json.HTTP;

/* renamed from: vo6  reason: default package */
public final class vo6 implements ksd {
    public final t06 a;
    public boolean b;
    public final /* synthetic */ x8 c;

    public vo6(x8 x8Var) {
        this.c = x8Var;
        this.a = new t06(((eu0) x8Var.Y).p());
    }

    public final void N(bt0 bt0, long j) {
        if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        } else if (j != 0) {
            x8 x8Var = this.c;
            ((eu0) x8Var.Y).P(j);
            eu0 eu0 = (eu0) x8Var.Y;
            eu0.L(HTTP.CRLF);
            eu0.N(bt0, j);
            eu0.L(HTTP.CRLF);
        }
    }

    public final synchronized void close() {
        if (!this.b) {
            this.b = true;
            ((eu0) this.c.Y).L("0\r\n\r\n");
            x8 x8Var = this.c;
            t06 t06 = this.a;
            x8Var.getClass();
            oue oue = t06.e;
            t06.e = oue.d;
            oue.a();
            oue.b();
            this.c.a = 3;
        }
    }

    public final synchronized void flush() {
        if (!this.b) {
            ((eu0) this.c.Y).flush();
        }
    }

    public final oue p() {
        return this.a;
    }
}
