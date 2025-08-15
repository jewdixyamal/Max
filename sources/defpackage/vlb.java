package defpackage;

import android.os.Bundle;
import java.util.List;

/* renamed from: vlb  reason: default package */
public final class vlb extends amb {
    public final jqe a;
    public final jqe b;
    public final List c;
    public final Bundle d;

    public vlb(jqe jqe, jqe jqe2, List list, Bundle bundle) {
        this.a = jqe;
        this.b = jqe2;
        this.c = list;
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlb)) {
            return false;
        }
        vlb vlb = (vlb) obj;
        return tpa.f(this.a, vlb.a) && tpa.f(this.b, vlb.b) && tpa.f(this.c, vlb.c) && tpa.f(this.d, vlb.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        jqe jqe = this.b;
        int g = k7d.g(this.c, (hashCode + (jqe == null ? 0 : jqe.hashCode())) * 31, 31);
        Bundle bundle = this.d;
        if (bundle != null) {
            i = bundle.hashCode();
        }
        return g + i;
    }

    public final String toString() {
        return "ShowConfirmationBottomSheet(title=" + this.a + ", description=" + this.b + ", buttons=" + this.c + ", payload=" + this.d + ")";
    }
}
