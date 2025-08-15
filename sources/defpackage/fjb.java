package defpackage;

import android.os.Bundle;
import java.util.List;

/* renamed from: fjb  reason: default package */
public final class fjb implements ijb {
    public final jqe a;
    public final jqe b;
    public final List c;
    public final Bundle d;

    public fjb(jqe jqe, jqe jqe2, List list, Bundle bundle) {
        this.a = jqe;
        this.b = jqe2;
        this.c = list;
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjb)) {
            return false;
        }
        fjb fjb = (fjb) obj;
        return tpa.f(this.a, fjb.a) && tpa.f(this.b, fjb.b) && tpa.f(this.c, fjb.c) && tpa.f(this.d, fjb.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jqe jqe = this.b;
        return this.d.hashCode() + k7d.g(this.c, (hashCode + (jqe == null ? 0 : jqe.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ShowConfirmationDialog(title=" + this.a + ", subtitle=" + this.b + ", buttons=" + this.c + ", payload=" + this.d + ")";
    }
}
