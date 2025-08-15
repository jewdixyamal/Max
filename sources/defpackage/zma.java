package defpackage;

import java.util.Comparator;

/* renamed from: zma  reason: default package */
public abstract class zma implements Comparator {
    public static zma a(Comparator comparator) {
        return comparator instanceof zma ? (zma) comparator : new w93(comparator);
    }

    public zma b() {
        return new ekc(this);
    }
}
