package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ym3  reason: default package */
public final class ym3 extends gle implements dt7 {
    public final List c;

    public ym3(List list) {
        this.c = list;
    }

    public final String a(boolean z, boolean z2) {
        return "CONTACT_INFO.Response(contacts=" + wmd.x(this.c, z, z2) + ')';
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.c) {
            if (((wm3) next) != um3.A0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ym3) && tpa.f(this.c, ((ym3) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return a(false, false);
    }
}
