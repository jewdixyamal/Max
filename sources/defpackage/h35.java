package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: h35  reason: default package */
public final class h35 implements abe {
    public final List a;

    public /* synthetic */ h35(List list) {
        this.a = list;
    }

    public a73 a(int i, String str) {
        ArrayList arrayList = new ArrayList();
        for (taf a2 : this.a) {
            eqe a3 = a2.a(i, str);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            return new a73(arrayList);
        }
        return null;
    }

    public int g(long j) {
        return -1;
    }

    public long i(int i) {
        return 0;
    }

    public List p(long j) {
        return this.a;
    }

    public int u() {
        return 1;
    }
}
