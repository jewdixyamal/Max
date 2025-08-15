package defpackage;

/* renamed from: y77  reason: default package */
public class y77 extends z87 implements xa3 {
    public final boolean a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y77(x77 x77) {
        super(true);
        boolean z = true;
        initParentJob(x77);
        e03 parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        f03 f03 = parentHandle$kotlinx_coroutines_core instanceof f03 ? (f03) parentHandle$kotlinx_coroutines_core : null;
        if (f03 != null) {
            z87 z87 = f03.a;
            z87 z872 = z87 == null ? null : z87;
            if (z872 != null) {
                while (true) {
                    if (!z872.getHandlesException$kotlinx_coroutines_core()) {
                        e03 parentHandle$kotlinx_coroutines_core2 = z872.getParentHandle$kotlinx_coroutines_core();
                        f03 f032 = parentHandle$kotlinx_coroutines_core2 instanceof f03 ? (f03) parentHandle$kotlinx_coroutines_core2 : null;
                        if (f032 != null) {
                            z872 = f032.a;
                            if (z872 == null) {
                                z872 = null;
                                continue;
                            }
                            if (z872 == null) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        z = false;
        this.a = z;
    }

    public final boolean H() {
        return makeCompleting$kotlinx_coroutines_core(e5f.a);
    }

    public final boolean getHandlesException$kotlinx_coroutines_core() {
        return this.a;
    }

    public final boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return true;
    }
}
