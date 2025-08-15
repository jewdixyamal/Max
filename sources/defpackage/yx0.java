package defpackage;

import android.os.SystemClock;

/* renamed from: yx0  reason: default package */
public final /* synthetic */ class yx0 implements ii9 {
    public final /* synthetic */ py0 a;

    public /* synthetic */ yx0(py0 py0) {
        this.a = py0;
    }

    public final void i(ji9 ji9) {
        q7 q7Var = this.a.S1.m;
        boolean z = ji9.f;
        s7 s7Var = q7Var.b;
        if (!z) {
            s7Var.a();
        } else if (!s7Var.b) {
            s7Var.b = true;
            ((wte) ((vte) s7Var.c)).getClass();
            s7Var.a = SystemClock.elapsedRealtime();
        }
    }
}
