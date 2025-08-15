package defpackage;

import android.graphics.Point;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: v31  reason: default package */
public final class v31 {
    public final Bundle a;
    public final List b;
    public final Map c;
    public final Point d;

    public v31(Bundle bundle, kl7 kl7, LinkedHashMap linkedHashMap, Point point) {
        this.a = bundle;
        this.b = kl7;
        this.c = linkedHashMap;
        this.d = point;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v31)) {
            return false;
        }
        v31 v31 = (v31) obj;
        return tpa.f(this.a, v31.a) && tpa.f(this.b, v31.b) && tpa.f(this.c, v31.c) && tpa.f(this.d, v31.d);
    }

    public final int hashCode() {
        int i = 0;
        Bundle bundle = this.a;
        int hashCode = (this.c.hashCode() + k7d.g(this.b, (bundle == null ? 0 : bundle.hashCode()) * 31, 31)) * 31;
        Point point = this.d;
        if (point != null) {
            i = point.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CallContextMenuInfo(bundle=" + this.a + ", actions=" + this.b + ", statParam=" + this.c + ", anchor=" + this.d + ")";
    }
}
