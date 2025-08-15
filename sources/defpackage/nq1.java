package defpackage;

/* renamed from: nq1  reason: default package */
public final class nq1 extends m3 {
    public final /* synthetic */ oq1 s0;

    public nq1(oq1 oq1) {
        this.s0 = oq1;
    }

    public final String g() {
        lq1 lq1 = (lq1) this.s0.a.get();
        if (lq1 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + lq1.a + "]";
    }
}
