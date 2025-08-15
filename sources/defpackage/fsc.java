package defpackage;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandlesVM;
import java.util.Map;

/* renamed from: fsc  reason: default package */
public final class fsc implements hsc {
    public final mm a;
    public boolean b;
    public Bundle c;
    public final khe d;

    public fsc(mm mmVar, ynf ynf) {
        this.a = mmVar;
        this.d = new khe(new ie(4, (Object) ynf));
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((SavedStateHandlesVM) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a2 = ((csc) entry.getValue()).e.a();
            if (!tpa.f(a2, Bundle.EMPTY)) {
                bundle.putBundle(str, a2);
            }
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
        if (!this.b) {
            Bundle c2 = this.a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle = new Bundle();
            Bundle bundle2 = this.c;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            if (c2 != null) {
                bundle.putAll(c2);
            }
            this.c = bundle;
            this.b = true;
            SavedStateHandlesVM savedStateHandlesVM = (SavedStateHandlesVM) this.d.getValue();
        }
    }
}
