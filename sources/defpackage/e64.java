package defpackage;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: e64  reason: default package */
public final class e64 {
    public final Uri a;
    public final int b;
    public final Set c;
    public final boolean d;
    public final Set e;

    public e64(Uri uri, int i, LinkedHashSet linkedHashSet, boolean z, Set set) {
        this.a = uri;
        this.b = i;
        this.c = linkedHashSet;
        this.d = z;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e64)) {
            return false;
        }
        e64 e64 = (e64) obj;
        return tpa.f(this.a, e64.a) && this.b == e64.b && tpa.f(this.c, e64.c) && this.d == e64.d && tpa.f(this.e, e64.e);
    }

    public final int hashCode() {
        int d2 = ms2.d((this.c.hashCode() + ey8.g(this.b, this.a.hashCode() * 31, 31)) * 31, 31, this.d);
        Set set = this.e;
        return d2 + (set == null ? 0 : set.hashCode());
    }

    public final String toString() {
        StringBuilder m = au1.m("DeepLinkRoute(deepLinkUri=", this.a.toString(), ", constraint=");
        int i = this.b;
        m.append(i != 1 ? i != 2 ? "null" : "LOGGED_IN" : "NOT_LOGGED_IN");
        m.append(", requiredParams=");
        m.append(this.c);
        m.append(", supportRoot=");
        m.append(this.d);
        m.append(", bundleRequiredParams=");
        m.append(this.e);
        m.append(")");
        return m.toString();
    }
}
