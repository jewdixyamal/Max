package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: s93  reason: default package */
public final class s93 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ v93 b;

    public /* synthetic */ s93(v93 v93, int i) {
        this.a = i;
        this.b = v93;
    }

    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                return;
            default:
                this.b.clear();
                return;
        }
    }

    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                v93 v93 = this.b;
                Map b2 = v93.b();
                if (b2 != null) {
                    return b2.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int d = v93.d(entry.getKey());
                    if (d != -1 && f46.B(v93.j()[d], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.b.containsKey(obj);
        }
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                v93 v93 = this.b;
                Map b2 = v93.b();
                return b2 != null ? b2.entrySet().iterator() : new r93(v93, 1);
            default:
                v93 v932 = this.b;
                Map b3 = v932.b();
                return b3 != null ? b3.keySet().iterator() : new r93(v932, 0);
        }
    }

    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                v93 v93 = this.b;
                Map b2 = v93.b();
                if (b2 != null) {
                    return b2.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!v93.f()) {
                        int c = v93.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = v93.a;
                        Objects.requireNonNull(obj2);
                        int H = pag.H(key, value, c, obj2, v93.h(), v93.i(), v93.j());
                        if (H != -1) {
                            v93.e(H, c);
                            v93.Y--;
                            v93.X += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                v93 v932 = this.b;
                Map b3 = v932.b();
                return b3 != null ? b3.keySet().remove(obj) : v932.g(obj) != v93.u0;
        }
    }

    public final int size() {
        switch (this.a) {
            case 0:
                return this.b.size();
            default:
                return this.b.size();
        }
    }
}
