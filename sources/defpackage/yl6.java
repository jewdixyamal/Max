package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: yl6  reason: default package */
public final class yl6 extends a3d {
    public yl6(tb8 tb8, mw0 mw0, Executor executor) {
        super(tb8, new cn6(), mw0, executor);
    }

    public static void i(qm6 qm6, lm6 lm6, HashSet hashSet, ArrayList arrayList) {
        long j = qm6.h + lm6.X;
        String str = qm6.a;
        String str2 = lm6.Z;
        if (str2 != null) {
            Uri S = mr0.S(str, str2);
            if (hashSet.add(S)) {
                arrayList.add(new y2d(j, a3d.d(S)));
            }
        }
        arrayList.add(new y2d(j, new a34(mr0.S(str, lm6.a), lm6.t0, lm6.u0)));
    }

    public final ArrayList e(ow0 ow0, ok5 ok5, boolean z) {
        an6 an6 = (an6) ok5;
        ArrayList arrayList = new ArrayList();
        if (an6 instanceof ym6) {
            List list = ((ym6) an6).d;
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(a3d.d((Uri) list.get(i)));
            }
        } else {
            arrayList.add(a3d.d(Uri.parse(an6.a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a34 a34 = (a34) it.next();
            arrayList2.add(new y2d(0, a34));
            try {
                qm6 qm6 = (qm6) ((ok5) c(new w2d(this, ow0, a34), z));
                zw6 zw6 = qm6.r;
                lm6 lm6 = null;
                for (int i2 = 0; i2 < zw6.size(); i2++) {
                    lm6 lm62 = (lm6) zw6.get(i2);
                    lm6 lm63 = lm62.b;
                    if (!(lm63 == null || lm63 == lm6)) {
                        i(qm6, lm63, hashSet, arrayList2);
                        lm6 = lm63;
                    }
                    i(qm6, lm62, hashSet, arrayList2);
                }
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
            }
        }
        return arrayList2;
    }
}
