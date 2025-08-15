package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: mdg  reason: default package */
public final class mdg {
    public static final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final de6 a;

    public mdg(de6 de6) {
        this.a = de6;
    }

    public final qjg a(qjg qjg) {
        de6 de6 = this.a;
        de6.getClass();
        boolean z = true;
        if (!qjg.m && !((Boolean) BasePendingResult.n.get()).booleanValue()) {
            z = false;
        }
        qjg.m = z;
        ie6 ie6 = de6.u0;
        ie6.getClass();
        udg udg = new udg(new deg(qjg), ie6.t0.get(), de6);
        fc9 fc9 = ie6.x0;
        fc9.sendMessage(fc9.obtainMessage(4, udg));
        return qjg;
    }
}
