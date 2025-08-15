package defpackage;

import java.util.LinkedHashMap;

/* renamed from: z3f  reason: default package */
public enum z3f {
    INTEGER(0),
    FLOAT(1),
    LONG(2),
    STRING(3),
    STRINGS_SET(4),
    BOOLEAN(5),
    BIG_STRING(16),
    BIG_STRINGS_SET(17);
    
    public static final ob6 b = null;
    public static final LinkedHashMap c = null;
    public final int a;

    /* JADX WARNING: type inference failed for: r0v2, types: [ob6, java.lang.Object] */
    static {
        int i;
        z3f[] z3fArr;
        v25 v25 = new v25(z3fArr);
        b = new Object();
        int Z = mz7.Z(z53.S(v25, 10));
        if (Z >= 16) {
            i = Z;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        u1 u1Var = new u1(0, v25);
        while (u1Var.hasNext()) {
            Object next = u1Var.next();
            linkedHashMap.put(Integer.valueOf(((z3f) next).a), next);
        }
        c = linkedHashMap;
    }

    /* access modifiers changed from: public */
    z3f(int i) {
        this.a = i;
    }

    public final int a() {
        return this == BIG_STRINGS_SET ? BIG_STRING.a() : this.a;
    }
}
