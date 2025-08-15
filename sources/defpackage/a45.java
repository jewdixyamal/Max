package defpackage;

import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* renamed from: a45  reason: default package */
public abstract class a45 extends nx3 {
    public static final /* synthetic */ int o = 0;
    public long a;
    public boolean b;
    public hs c;

    public final void S(boolean z) {
        this.a = (z ? 4294967296L : 1) + this.a;
        if (!z) {
            this.b = true;
        }
    }

    public final boolean U() {
        return this.a >= 4294967296L;
    }

    public final void d(boolean z) {
        long j = this.a - (z ? 4294967296L : 1);
        this.a = j;
        if (j <= 0 && this.b) {
            shutdown();
        }
    }

    public abstract long e0();

    public final nx3 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return LimitedDispatcherKt.namedOrThis(this, str);
    }

    public final boolean m0() {
        hs hsVar = this.c;
        if (hsVar == null) {
            return false;
        }
        ol4 ol4 = (ol4) (hsVar.isEmpty() ? null : hsVar.j());
        if (ol4 == null) {
            return false;
        }
        ol4.run();
        return true;
    }

    public final void n(ol4 ol4) {
        hs hsVar = this.c;
        if (hsVar == null) {
            hsVar = new hs();
            this.c = hsVar;
        }
        hsVar.b(ol4);
    }

    public void n0(long j, x35 x35) {
        pa4.s0.s0(j, x35);
    }

    public abstract Thread o();

    public abstract void shutdown();
}
