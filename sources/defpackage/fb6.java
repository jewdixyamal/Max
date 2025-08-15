package defpackage;

/* renamed from: fb6  reason: default package */
public final class fb6 {
    public volatile long a;
    public volatile long b;
    public final /* synthetic */ gb6 c;

    public fb6(gb6 gb6) {
        this.c = gb6;
    }

    @uae
    public final void onEvent(mc2 mc2) {
        if (mc2.a == this.b) {
            hm9.m("gb6", "onEvent " + mc2, new Object[0]);
            this.c.d.makeCompleting$kotlinx_coroutines_core(this.c.c.z(this.a));
        }
    }
}
