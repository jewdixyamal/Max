package defpackage;

import android.os.Bundle;
import java.util.List;

/* renamed from: bg8  reason: default package */
public final class bg8 {
    public final Bundle a;
    public wg8 b;

    public bg8(wg8 wg8, boolean z) {
        if (wg8 != null) {
            Bundle bundle = new Bundle();
            this.a = bundle;
            this.b = wg8;
            bundle.putBundle("selector", wg8.a);
            bundle.putBoolean("activeScan", z);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void a() {
        if (this.b == null) {
            Bundle bundle = this.a.getBundle("selector");
            wg8 wg8 = null;
            if (bundle != null) {
                wg8 = new wg8((List) null, bundle);
            } else {
                wg8 wg82 = wg8.c;
            }
            this.b = wg8;
            if (wg8 == null) {
                this.b = wg8.c;
            }
        }
    }

    public final boolean b() {
        return this.a.getBoolean("activeScan");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bg8)) {
            return false;
        }
        bg8 bg8 = (bg8) obj;
        a();
        wg8 wg8 = this.b;
        bg8.a();
        return wg8.equals(bg8.b) && b() == bg8.b();
    }

    public final int hashCode() {
        a();
        return b() ^ this.b.hashCode() ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoveryRequest{ selector=");
        a();
        sb.append(this.b);
        sb.append(", activeScan=");
        sb.append(b());
        sb.append(", isValid=");
        a();
        wg8 wg8 = this.b;
        wg8.a();
        return au1.j(sb, !wg8.b.contains((Object) null), " }");
    }
}
