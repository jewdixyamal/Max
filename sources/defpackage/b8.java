package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: b8  reason: default package */
public final class b8 extends znc {
    public wg7 j;
    public final fm5 k = new fm5(11);

    public b8() {
        this.e = 1;
    }

    public final void J(int i, String str) {
        this.j.B(i, str);
    }

    public final void M(String str, String[] strArr, int i) {
        this.j.E(str, strArr, i);
    }

    public final void N(Bundle bundle) {
        super.N(bundle);
        fm5 fm5 = this.k;
        fm5.getClass();
        fm5.b = bundle.getInt("TransactionIndexer.currentIndex");
    }

    public final void O(Bundle bundle) {
        super.O(bundle);
        bundle.putInt("TransactionIndexer.currentIndex", this.k.b);
    }

    public final void T(Intent intent) {
        this.j.startActivity(intent);
    }

    public final void U(String str, Intent intent, int i) {
        this.j.A(str, intent, i, (Bundle) null);
    }

    public final void V(String str, Intent intent, int i, Bundle bundle) {
        this.j.A(str, intent, i, bundle);
    }

    public final void W(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.j.l(str, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final void Y(String str) {
        this.j.g(str);
    }

    public final void Z(wg7 wg7, w12 w12) {
        if (this.j != wg7 || this.i != w12) {
            ViewGroup viewGroup = this.i;
            if (viewGroup != null && (viewGroup instanceof yu3)) {
                K((yu3) viewGroup);
            }
            a(w12);
            this.j = wg7;
            this.i = w12;
            w12.post(new q57(21, this));
        }
    }

    public final Activity d() {
        wg7 wg7 = this.j;
        if (wg7 != null) {
            return wg7.a();
        }
        return null;
    }

    public final znc i() {
        return this;
    }

    public final List j() {
        return this.j.U();
    }

    public final fm5 k() {
        return this.k;
    }

    public final void o() {
        if (this.j != null && d() != null) {
            d().invalidateOptionsMenu();
        }
    }

    public final void p(Activity activity, boolean z) {
        super.p(activity, z);
        if (!z) {
            this.j = null;
        }
    }
}
