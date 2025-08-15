package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: pd9  reason: default package */
public final class pd9 {
    public final List a;

    public pd9(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd9) && tpa.f(this.a, ((pd9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MovieThumbnail(qualities=" + this.a + ")";
    }
}
