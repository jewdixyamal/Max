package defpackage;

/* renamed from: u87  reason: default package */
public final class u87 extends k87 {
    public final /* synthetic */ int b;
    public final z3d c;
    public final /* synthetic */ z87 o;

    public /* synthetic */ u87(z87 z87, z3d z3d, int i) {
        this.b = i;
        this.o = z87;
        this.c = z3d;
    }

    public final boolean c() {
        switch (this.b) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    public final void d(Throwable th) {
        switch (this.b) {
            case 0:
                z87 z87 = this.o;
                Object state$kotlinx_coroutines_core = z87.getState$kotlinx_coroutines_core();
                if (!(state$kotlinx_coroutines_core instanceof lb3)) {
                    state$kotlinx_coroutines_core = a97.a(state$kotlinx_coroutines_core);
                }
                ((y3d) this.c).g(z87, state$kotlinx_coroutines_core);
                return;
            default:
                ((y3d) this.c).g(this.o, e5f.a);
                return;
        }
    }
}
