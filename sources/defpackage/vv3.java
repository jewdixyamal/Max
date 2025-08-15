package defpackage;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: vv3  reason: default package */
public abstract class vv3 {
    public static final Set a = Collections.unmodifiableSet(EnumSet.of(mv1.o, mv1.X, mv1.Y, mv1.Z));
    public static final Set b = Collections.unmodifiableSet(EnumSet.of(nv1.o, nv1.a));
    public static final Set c;
    public static final Set d;

    static {
        lv1 lv1 = lv1.X;
        lv1 lv12 = lv1.o;
        lv1 lv13 = lv1.a;
        Set unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(lv1, lv12, lv13));
        c = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf(unmodifiableSet);
        copyOf.remove(lv12);
        copyOf.remove(lv13);
        d = Collections.unmodifiableSet(copyOf);
    }
}
