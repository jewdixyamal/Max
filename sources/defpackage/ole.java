package defpackage;

/* renamed from: ole  reason: default package */
public final /* synthetic */ class ole implements Runnable {
    public final /* synthetic */ tle a;
    public final /* synthetic */ ol b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int o;

    public /* synthetic */ ole(tle tle, ol olVar, long j, int i) {
        this.a = tle;
        this.b = olVar;
        this.c = j;
        this.o = i;
    }

    public final void run() {
        tle tle = this.a;
        tle.getClass();
        hm9.k(tle.B0, "persistable task execution started, force connection");
        ((p7b) ((m7b) tle.Y.getValue())).a.y(true);
        ((eoe) tle.X.getValue()).g((hua) this.b, this.c, this.o);
        r9d.y((s8g) tle.v0.getValue());
        ((boe) tle.w0.getValue()).a();
    }
}
