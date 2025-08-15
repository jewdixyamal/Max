package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: nb3  reason: default package */
public final class nb3 {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final cc3 f;
    public final Set g;

    public nb3(String str, Set set, Set set2, int i, int i2, cc3 cc3, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = cc3;
        this.g = Collections.unmodifiableSet(set3);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ob8, java.lang.Object] */
    public static ob8 a(lqb lqb) {
        lqb[] lqbArr = new lqb[0];
        ? obj = new Object();
        obj.b = null;
        HashSet hashSet = new HashSet();
        obj.a = hashSet;
        obj.c = new HashSet();
        obj.d = 0;
        obj.e = 0;
        obj.g = new HashSet();
        hashSet.add(lqb);
        for (lqb h : lqbArr) {
            a14.h(h, "Null interface");
        }
        Collections.addAll((HashSet) obj.a, lqbArr);
        return obj;
    }

    public static nb3 b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(lqb.a(cls));
        for (Class cls2 : clsArr) {
            a14.h(cls2, "Null interface");
            hashSet.add(lqb.a(cls2));
        }
        return new nb3((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new v02(15, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
