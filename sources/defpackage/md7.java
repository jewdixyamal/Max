package defpackage;

/* renamed from: md7  reason: default package */
public final class md7 implements Comparable {
    public static final md7 b = new md7();
    public final int a = 131092;

    public final int compareTo(Object obj) {
        return this.a - ((md7) obj).a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        md7 md7 = obj instanceof md7 ? (md7) obj : null;
        if (md7 == null) {
            return false;
        }
        return this.a == md7.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.0.20";
    }
}
