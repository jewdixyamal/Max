package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: c12  reason: default package */
public final class c12 implements bbe, abe {
    public final /* synthetic */ int a = 1;
    public final List b;

    public c12(ArrayList arrayList) {
        this.b = Collections.unmodifiableList(arrayList);
    }

    public final int g(long j) {
        switch (this.a) {
            case 0:
                return j < 0 ? 0 : -1;
            default:
                return j < 0 ? 0 : -1;
        }
    }

    public final long i(int i) {
        switch (this.a) {
            case 0:
                fm9.f(i == 0);
                return 0;
            default:
                np8.d(i == 0);
                return 0;
        }
    }

    public final List p(long j) {
        switch (this.a) {
            case 0:
                return j >= 0 ? this.b : Collections.emptyList();
            default:
                return j >= 0 ? this.b : Collections.emptyList();
        }
    }

    public final int u() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }

    public c12(List list) {
        this.b = list;
    }
}
