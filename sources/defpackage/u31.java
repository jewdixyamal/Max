package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: u31  reason: default package */
public final class u31 {
    public cu3 a;

    public final cu3 a(Context context, List list, t31 t31) {
        cu3 cu3 = this.a;
        if (cu3 != null) {
            cu3.dismiss();
        }
        cu3 cu32 = new cu3(context);
        cu32.setWidth(tu0.G(((float) 250) * fk4.d().getDisplayMetrics().density));
        cu32.d = false;
        hq9 hq9 = hq9.e0;
        cu32.f.o1(cu32, cu3.g[0], hq9);
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m7 m7Var = (m7) it.next();
            arrayList.add(new st3(m7Var.getName(), Integer.valueOf(m7Var.getIcon()), rme.u0, rme.D0, new x2((Object) t31, 6, (Object) m7Var)));
        }
        cu32.a.a(arrayList, new bk(7, cu32));
        this.a = cu32;
        return cu32;
    }
}
