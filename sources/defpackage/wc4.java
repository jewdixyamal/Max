package defpackage;

import javax.inject.Provider;

/* renamed from: wc4  reason: default package */
public final class wc4 extends q2a {
    public final /* synthetic */ int b = 0;
    public final qpc c;
    public final uk d;
    public final r2a e;

    public wc4(m6b m6b) {
        super(m6b);
        this.e = new yxc(15);
        uk ukVar = m6b.w0;
        if (ukVar != null) {
            this.d = ukVar;
            this.c = new qpc(ukVar);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final uk a() {
        switch (this.b) {
            case 0:
                return (th4) this.d;
            case 1:
                return (th4) this.d;
            default:
                return this.d;
        }
    }

    public final r2a b() {
        switch (this.b) {
            case 0:
                return (vq7) this.e;
            case 1:
                return (glc) this.e;
            default:
                return (yxc) this.e;
        }
    }

    public final qpc c() {
        switch (this.b) {
            case 0:
                return this.c;
            case 1:
                return this.c;
            default:
                return this.c;
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [xxc, java.lang.Object] */
    public wc4(fc3 fc3, nl nlVar, rl rlVar, p31 p31) {
        super(fc3);
        ax axVar = new ax(nlVar, 2, p31);
        up6 up6 = new up6(new Object());
        up6.e = (hl) fc3.o;
        up6.b.b = new ev(new y8((Object) axVar));
        th4 th4 = new th4(up6, axVar, rlVar, (Provider) fc3.c);
        this.e = new vq7(axVar, th4, up6, 9);
        this.d = th4;
        this.c = new qpc(th4);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [xxc, java.lang.Object] */
    public wc4(fc3 fc3, se3 se3, dwe dwe) {
        super(fc3);
        jt3 jt3 = new jt3((Object) se3);
        up6 up6 = new up6(new Object());
        up6.e = (hl) fc3.o;
        up6.b.b = new ev(new y8((Object) jt3));
        th4 th4 = new th4(up6, jt3, dwe, (Provider) fc3.c);
        this.e = new glc(jt3, th4, up6, 5);
        this.d = th4;
        this.c = new qpc(th4);
    }
}
