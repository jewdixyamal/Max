package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: vgc  reason: default package */
public final class vgc extends ArrayList {
    public final Collection a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public vgc() {
        /*
            r1 = this;
            nz4 r0 = defpackage.nz4.a
            r1.<init>(r0)
            r1.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vgc.<init>():void");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof tgc)) {
            return false;
        }
        return super.contains((tgc) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vgc) && tpa.f(this.a, ((vgc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof tgc)) {
            return -1;
        }
        return super.indexOf((tgc) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof tgc)) {
            return -1;
        }
        return super.lastIndexOf((tgc) obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof tgc)) {
            return false;
        }
        return super.remove((tgc) obj);
    }

    public final String toString() {
        return "ReplyButtonRow(buttons=" + this.a + ")";
    }
}
