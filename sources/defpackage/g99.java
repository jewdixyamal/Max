package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* renamed from: g99  reason: default package */
public final class g99 {
    public final va8 a;
    public final iz3 b;
    public final HashMap c = new HashMap();

    public g99(Context context, iz3 iz3) {
        va8 va8 = new va8(context, 25);
        this.a = va8;
        this.b = iz3;
    }

    public final synchronized k2f a(String str) {
        if (this.c.containsKey(str)) {
            return (k2f) this.c.get(str);
        }
        CctBackendFactory v = this.a.v(str);
        if (v == null) {
            return null;
        }
        iz3 iz3 = this.b;
        k2f create = v.create(new ba0(iz3.a, iz3.b, iz3.c, str));
        this.c.put(str, create);
        return create;
    }
}
