package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;

/* renamed from: z06  reason: default package */
public final class z06 extends br7 implements m3a, a4a, r3a, s3a, ynf, j3a, i8, isc, p16, yq8 {
    public final Activity t0;
    public final Context u0;
    public final Handler v0;
    public final n16 w0 = new c();
    public final /* synthetic */ b x0;

    /* JADX WARNING: type inference failed for: r2v1, types: [n16, androidx.fragment.app.c] */
    public z06(b bVar) {
        this.x0 = bVar;
        Handler handler = new Handler();
        this.t0 = bVar;
        this.u0 = bVar;
        this.v0 = handler;
    }

    public final View J(int i) {
        return this.x0.findViewById(i);
    }

    public final boolean K() {
        Window window = this.x0.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    public final gh7 Q() {
        return this.x0.F0;
    }

    public final void a(a aVar) {
        this.x0.getClass();
    }

    public final void i0(e16 e16) {
        this.x0.s(e16);
    }

    public final void j0(tj3 tj3) {
        this.x0.t(tj3);
    }

    public final void k0(d16 d16) {
        this.x0.A(d16);
    }

    public final void l0(d16 d16) {
        this.x0.B(d16);
    }

    public final void m0(d16 d16) {
        this.x0.C(d16);
    }

    public final void n0(e16 e16) {
        this.x0.J(e16);
    }

    public final void o0(d16 d16) {
        this.x0.K(d16);
    }

    public final void p0(d16 d16) {
        this.x0.L(d16);
    }

    public final void q0(d16 d16) {
        this.x0.N(d16);
    }

    public final void r0(d16 d16) {
        this.x0.P(d16);
    }

    public final xnf w() {
        return this.x0.w();
    }

    public final mm y() {
        return (mm) this.x0.o.o;
    }
}
