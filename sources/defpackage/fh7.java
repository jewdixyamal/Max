package defpackage;

/* renamed from: fh7  reason: default package */
public final class fh7 {
    public fg7 a;
    public ug7 b;

    public final void a(eh7 eh7, eg7 eg7) {
        fg7 a2 = eg7.a();
        fg7 fg7 = this.a;
        if (a2.compareTo(fg7) < 0) {
            fg7 = a2;
        }
        this.a = fg7;
        this.b.m(eh7, eg7);
        this.a = a2;
    }
}
