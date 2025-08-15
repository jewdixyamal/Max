package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: ead  reason: default package */
public final class ead extends aad {
    public final ae3 j = new ae3(6);
    public boolean k = true;
    public boolean l = false;
    public final ArrayList m = new ArrayList();

    public final void a(fad fad) {
        Map map;
        Object obj;
        kz1 kz1 = fad.g;
        int i = kz1.c;
        u40 u40 = this.b;
        if (i != -1) {
            this.l = true;
            int i2 = u40.c;
            Integer valueOf = Integer.valueOf(i);
            List list = fad.j;
            if (list.indexOf(valueOf) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            u40.c = i;
        }
        aa0 aa0 = kz1.k;
        Range range = vb0.f;
        ce3 ce3 = kz1.b;
        Range range2 = (Range) ce3.f(aa0, range);
        Objects.requireNonNull(range2);
        if (!range2.equals(range)) {
            mi9 mi9 = (mi9) u40.f;
            mi9.getClass();
            try {
                obj = mi9.h(aa0);
            } catch (IllegalArgumentException unused) {
                obj = range;
            }
            if (((Range) obj).equals(range)) {
                ((mi9) u40.f).j(kz1.k, range2);
            } else {
                mi9 mi92 = (mi9) u40.f;
                aa0 aa02 = kz1.k;
                Object obj2 = vb0.f;
                mi92.getClass();
                try {
                    obj2 = mi92.h(aa02);
                } catch (IllegalArgumentException unused2) {
                }
                if (!((Range) obj2).equals(range2)) {
                    this.k = false;
                }
            }
        }
        int b = kz1.b();
        if (b != 0) {
            u40.getClass();
            if (b != 0) {
                ((mi9) u40.f).j(o9f.p0, Integer.valueOf(b));
            }
        }
        int c = kz1.c();
        if (c != 0) {
            u40.getClass();
            if (c != 0) {
                ((mi9) u40.f).j(o9f.q0, Integer.valueOf(c));
            }
        }
        kz1 kz12 = fad.g;
        nje nje = kz12.g;
        Map map2 = ((ui9) u40.g).a;
        if (!(map2 == null || (map = nje.a) == null)) {
            map2.putAll(map);
        }
        this.c.addAll(fad.c);
        this.d.addAll(fad.d);
        u40.a(kz12.e);
        this.e.addAll(fad.e);
        dad dad = fad.f;
        if (dad != null) {
            this.m.add(dad);
        }
        InputConfiguration inputConfiguration = fad.i;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        LinkedHashSet<rb0> linkedHashSet = this.a;
        linkedHashSet.addAll(fad.a);
        HashSet hashSet = (HashSet) u40.e;
        hashSet.addAll(Collections.unmodifiableList(kz1.a));
        ArrayList arrayList = new ArrayList();
        for (rb0 rb0 : linkedHashSet) {
            arrayList.add(rb0.a);
            for (xf4 add : rb0.b) {
                arrayList.add(add);
            }
        }
        if (!arrayList.containsAll(hashSet)) {
            this.k = false;
        }
        int i3 = this.h;
        int i4 = fad.h;
        if (i4 != i3 && i4 != 0 && i3 != 0) {
            this.k = false;
        } else if (i4 != 0) {
            this.h = i4;
        }
        rb0 rb02 = fad.b;
        if (rb02 != null) {
            rb0 rb03 = this.i;
            if (rb03 == rb02 || rb03 == null) {
                this.i = rb02;
            } else {
                this.k = false;
            }
        }
        u40.c(ce3);
    }

    public final fad b() {
        if (this.k) {
            ArrayList arrayList = new ArrayList(this.a);
            ae3 ae3 = this.j;
            if (ae3.b) {
                Collections.sort(arrayList, new ca3(6, ae3));
            }
            return new fad(arrayList, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.d(), !this.m.isEmpty() ? new kt6(4, this) : null, this.g, this.h, this.i);
        }
        throw new IllegalArgumentException("Unsupported session configuration combination");
    }
}
