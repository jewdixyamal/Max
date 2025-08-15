package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: gbf  reason: default package */
public final class gbf {
    public final fbf a;
    public final dbf b;
    public final List c;
    public final List d;
    public final Integer e;

    public gbf(fbf fbf, dbf dbf, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        this.a = fbf;
        this.b = dbf;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbf)) {
            return false;
        }
        gbf gbf = (gbf) obj;
        return tpa.f(this.a, gbf.a) && tpa.f(this.b, gbf.b) && tpa.f(this.c, gbf.c) && tpa.f(this.d, gbf.d) && tpa.f(this.e, gbf.e);
    }

    public final int hashCode() {
        int i = 0;
        fbf fbf = this.a;
        int hashCode = (fbf == null ? 0 : fbf.hashCode()) * 31;
        dbf dbf = this.b;
        int hashCode2 = (hashCode + (dbf == null ? 0 : dbf.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.e;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "VectorBackgroundModel(pattern=" + this.a + ", gradient=" + this.b + ", gradientEllipse=" + this.c + ", patternGradientEllipse=" + this.d + ", fillColor=" + this.e + ")";
    }
}
