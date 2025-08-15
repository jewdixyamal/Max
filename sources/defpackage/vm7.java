package defpackage;

/* renamed from: vm7  reason: default package */
public final class vm7 extends wm7 implements ug7 {
    public final eh7 X;
    public final /* synthetic */ xm7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vm7(xm7 xm7, eh7 eh7, g2a g2a) {
        super(xm7, g2a);
        this.Y = xm7;
        this.X = eh7;
    }

    public final void b() {
        this.X.Q().f(this);
    }

    public final boolean c(eh7 eh7) {
        return this.X == eh7;
    }

    public final boolean d() {
        return this.X.Q().d.a(fg7.o);
    }

    public final void m(eh7 eh7, eg7 eg7) {
        eh7 eh72 = this.X;
        fg7 fg7 = eh72.Q().d;
        if (fg7 == fg7.a) {
            this.Y.j(this.a);
            return;
        }
        fg7 fg72 = null;
        while (fg72 != fg7) {
            a(d());
            fg72 = fg7;
            fg7 = eh72.Q().d;
        }
    }
}
