package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: nab  reason: default package */
public final class nab {
    public final wm3 a;
    public final Map b;
    public final List c;

    public nab(wm3 wm3, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        this.a = wm3;
        this.b = linkedHashMap;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nab)) {
            return false;
        }
        nab nab = (nab) obj;
        return tpa.f(this.a, nab.a) && tpa.f(this.b, nab.b) && tpa.f(this.c, nab.c);
    }

    public final int hashCode() {
        wm3 wm3 = this.a;
        int hashCode = wm3 == null ? 0 : wm3.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Profile(contactInfo=");
        sb.append(this.a);
        sb.append(", restrictions=");
        sb.append(this.b);
        sb.append(", profileOptions=");
        return au1.i(sb, this.c, ")");
    }
}
