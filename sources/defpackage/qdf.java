package defpackage;

/* renamed from: qdf  reason: default package */
public final class qdf implements py9 {
    public hw1 a;
    public boolean b;

    public final void a(Object obj) {
        c54.p("SourceStreamRequirementObserver can be updated from main thread only", kq0.t());
        boolean equals = Boolean.TRUE.equals((Boolean) obj);
        if (this.b != equals) {
            this.b = equals;
            hw1 hw1 = this.a;
            if (hw1 == null) {
                return;
            }
            if (equals) {
                hw1.o();
            } else {
                hw1.a();
            }
        }
    }

    public final void onError(Throwable th) {
    }
}
