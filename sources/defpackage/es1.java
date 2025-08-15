package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: es1  reason: default package */
public final class es1 {
    public final e52 a;
    public final uj3 b;
    public final es8 c;
    public final dc1 d;
    public List e;

    public es1(es8 es8, uj3 uj3) {
        this.b = uj3;
        this.c = es8;
        this.a = null;
        this.d = null;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(this.c.a.b));
        List list = this.e;
        if ((list == null ? 0 : list.size()) > 0) {
            for (es1 es1 : this.e) {
                arrayList.add(Long.valueOf(es1.c.a.b));
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || es1.class != obj.getClass()) {
            return false;
        }
        es1 es1 = (es1) obj;
        e52 e52 = es1.a;
        e52 e522 = this.a;
        if (e522 == null ? e52 != null : !e522.equals(e52)) {
            return false;
        }
        uj3 uj3 = es1.b;
        uj3 uj32 = this.b;
        if (uj32 == null ? uj3 != null : !uj32.equals(uj3)) {
            return false;
        }
        es8 es8 = es1.c;
        es8 es82 = this.c;
        if (es82 == null ? es8 != null : !es82.equals(es8)) {
            return false;
        }
        dc1 dc1 = es1.d;
        dc1 dc12 = this.d;
        if (dc12 == null ? dc1 != null : !dc12.equals(dc1)) {
            return false;
        }
        List list = this.e;
        return list != null ? list.equals(es1.e) : es1.e == null;
    }

    public final int hashCode() {
        int i = 0;
        e52 e52 = this.a;
        int hashCode = (e52 != null ? e52.hashCode() : 0) * 31;
        uj3 uj3 = this.b;
        int hashCode2 = (hashCode + (uj3 != null ? uj3.hashCode() : 0)) * 31;
        es8 es8 = this.c;
        int hashCode3 = (hashCode2 + (es8 != null ? es8.hashCode() : 0)) * 31;
        dc1 dc1 = this.d;
        int hashCode4 = (hashCode3 + (dc1 != null ? dc1.hashCode() : 0)) * 31;
        List list = this.e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public es1(e52 e52, es8 es8) {
        this.a = e52;
        this.c = es8;
        this.b = null;
        this.d = null;
    }

    public es1(dc1 dc1) {
        this.d = dc1;
        this.a = null;
        this.c = null;
        this.b = null;
    }
}
