package ru.ok.messages.views.fragments.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import ru.ok.messages.views.dialogs.ProgressDialog;

public abstract class FrgBase extends a implements ase, hc7 {
    public final q0e A1 = r0e.a((Object) null);
    public final String l1 = getClass().getSimpleName();
    public bk4 m1;
    public boolean n1 = true;
    public boolean o1 = false;
    public y7g p1;
    public jyc q1;
    public sme r1;
    public final HashSet s1 = new HashSet();
    public c8 t1;
    public gua u1;
    public long v1 = 0;
    public ProgressDialog w1;
    public xpb x1;
    public hc3 y1;
    public ArrayList z1;

    public final void A0() {
        this.S0 = true;
        hm9.k(this.l1, "lifecycle: onDetach");
    }

    public final boolean B0(int i, KeyEvent keyEvent) {
        Iterator it = this.z1.iterator();
        while (it.hasNext()) {
            if (((hc7) it.next()).B0(i, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public final void D0(boolean z) {
        hm9.m(this.l1, "onHiddenChanged %b", Boolean.valueOf(z));
        this.A1.m((Object) null, Boolean.valueOf(z));
    }

    public void H0() {
        this.S0 = true;
        hm9.m(this.l1, "lifecycle: onPause", new Object[0]);
        this.o1 = false;
        if (!TextUtils.isEmpty(f1())) {
            ((y8a) ((ed3) this.p1.b)).b().l(SystemClock.elapsedRealtime() - this.v1, f1());
        }
    }

    public final void J0(int i, String[] strArr, int[] iArr) {
        wmd.z(d0(), strArr, iArr);
        if (k1()) {
            xpb xpb = this.x1;
            if (xpb != null) {
                xpb.e(new gua(i, strArr, iArr));
            }
            o1(i, strArr, iArr);
            return;
        }
        this.u1 = new gua(i, strArr, iArr);
    }

    public void K0() {
        this.S0 = true;
        String str = this.l1;
        hm9.m(str, "lifecycle: onResume", new Object[0]);
        StringBuilder sb = new StringBuilder("unhandled events: ");
        HashSet hashSet = this.s1;
        sb.append(hashSet.size());
        hm9.m(str, sb.toString(), new Object[0]);
        this.o1 = true;
        this.v1 = SystemClock.elapsedRealtime();
        ((y8a) ((ed3) this.p1.b)).p().getClass();
        if (((jyc) jke.b()).d().d()) {
            cy7 r = ((y8a) ((ed3) this.p1.b)).r();
            int i = tu0.m;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                r.c((pi0) it.next());
            }
            hashSet.clear();
        }
        gua gua = this.u1;
        if (gua != null) {
            xpb xpb = this.x1;
            if (xpb != null) {
                xpb.e(gua);
            }
            gua gua2 = this.u1;
            o1(gua2.a, gua2.b, gua2.c);
            this.u1 = null;
        }
        c8 c8Var = this.t1;
        if (c8Var != null) {
            l1(c8Var.a, c8Var.b, c8Var.c);
            this.t1 = null;
        }
    }

    public void L0(Bundle bundle) {
        HashSet hashSet = this.s1;
        int i = tu0.m;
        hm9.k("tu0", "onSaveInstanceState");
        bundle.putSerializable("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS", new ArrayList(hashSet));
    }

    public final void M0() {
        this.S0 = true;
        hm9.k(this.l1, "lifecycle: onStart");
    }

    public final void N0() {
        this.S0 = true;
        hm9.k(this.l1, "lifecycle: onStop");
    }

    public final void P0(Bundle bundle) {
        this.S0 = true;
    }

    public final void e1() {
        q5 g1 = g1();
        if (g1 != null) {
            g1.finish();
        }
    }

    public String f1() {
        return null;
    }

    public final q5 g1() {
        if (b0() == null || b0().isFinishing()) {
            return null;
        }
        return (q5) b0();
    }

    public final ai3 h1() {
        b b0 = b0();
        if (!(b0 instanceof nwe)) {
            return null;
        }
        nwe nwe = (nwe) b0;
        if (nwe.a() != null) {
            return nwe.a();
        }
        return null;
    }

    public void i1() {
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [androidx.fragment.app.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j1() {
        /*
            r4 = this;
            ru.ok.messages.views.dialogs.ProgressDialog r0 = r4.w1
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0015
            r0.f1(r2, r2)     // Catch:{ Exception -> 0x000a }
            goto L_0x0012
        L_0x000a:
            r0 = move-exception
            java.lang.String r2 = r4.l1
            java.lang.String r3 = "Can't hideProgressDialog"
            defpackage.hm9.p(r2, r3, r0)
        L_0x0012:
            r4.w1 = r1
            goto L_0x002f
        L_0x0015:
            androidx.fragment.app.c r4 = r4.F0
            if (r4 == 0) goto L_0x002f
            java.lang.String r0 = "ru.ok.messages.views.dialogs.ProgressDialog"
            androidx.fragment.app.a r4 = r4.E(r0)
            boolean r0 = r4 instanceof ru.ok.messages.views.dialogs.ProgressDialog
            if (r0 == 0) goto L_0x0026
            r1 = r4
            ru.ok.messages.views.dialogs.ProgressDialog r1 = (ru.ok.messages.views.dialogs.ProgressDialog) r1
        L_0x0026:
            if (r1 == 0) goto L_0x002f
            boolean r4 = r1.D1
            if (r4 == 0) goto L_0x002f
            r1.f1(r2, r2)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.fragments.base.FrgBase.j1():void");
    }

    public boolean k1() {
        return this.o1;
    }

    public void l1(int i, int i2, Intent intent) {
    }

    public void m1(q5 q5Var) {
        this.n1 = false;
    }

    public boolean n1() {
        return false;
    }

    public void o1(int i, String[] strArr, int[] iArr) {
    }

    public final ProgressDialog p1(int i, boolean z) {
        if (!k1()) {
            return null;
        }
        j1();
        String h0 = h0(i);
        c cVar = this.F0;
        ProgressDialog progressDialog = new ProgressDialog();
        Bundle bundle = new Bundle();
        bundle.putString("ru.ok.tamtam.extra.TITLE", h0);
        bundle.putBoolean("ru.ok.tamtam.extra.CANCELABLE", z);
        bundle.putString("ru.ok.tamtam.extra.NEGATIVE_TEXT", (String) null);
        bundle.putBoolean("ru.ok.tamtam.extra.INDETERMINATE", true);
        progressDialog.X0(bundle);
        progressDialog.k1(cVar, "ru.ok.messages.views.dialogs.ProgressDialog");
        this.w1 = progressDialog;
        return progressDialog;
    }

    public final ProgressDialog q1() {
        return p1(jpc.K, true);
    }

    public final void s0(int i, int i2, Intent intent) {
        super.s0(i, i2, intent);
        if (k1()) {
            l1(i, i2, intent);
        } else {
            this.t1 = new c8(i, i2, intent);
        }
    }

    public final void t0(Activity activity) {
        this.S0 = true;
        hm9.m(this.l1, "lifecycle: onAttach", new Object[0]);
        if (activity instanceof q5) {
            this.n1 = true;
            m1((q5) activity);
            return;
        }
        throw new IllegalStateException("Use FrgBase only in ActBase subclasses.");
    }

    public final sme u() {
        return this.r1;
    }

    public void v0(Bundle bundle) {
        q5 q5Var = (q5) b0();
        y7g y7g = q5Var.K0;
        this.p1 = y7g;
        ((y8a) ((ed3) y7g.b)).getClass();
        this.q1 = jyc.a;
        this.r1 = q5Var.u();
        this.m1 = (bk4) this.p1.c;
        super.v0(bundle);
        hm9.m(this.l1, "lifecycle: onCreate", new Object[0]);
        if (!this.n1) {
            if (bundle != null) {
                tu0.u(bundle, this.s1);
            }
            ((y8a) ((ed3) this.p1.b)).r().d(this);
            this.z1 = new ArrayList();
            return;
        }
        throw new IllegalStateException("super.onAttachBase() not called");
    }

    public void y0() {
        hm9.m(this.l1, "lifecycle: onDestroy", new Object[0]);
        ((y8a) ((ed3) this.p1.b)).r().f(this);
        this.S0 = true;
        this.z1.clear();
    }

    public void z0() {
        hm9.k(this.l1, "lifecycle: onDestroyView");
        hc3 hc3 = this.y1;
        if (hc3 != null) {
            hc3.d();
        }
        this.S0 = true;
    }
}
