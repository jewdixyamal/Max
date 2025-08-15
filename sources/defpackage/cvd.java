package defpackage;

/* renamed from: cvd  reason: default package */
public final class cvd implements Comparable {
    public final int a;
    public final int b;

    public cvd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int compareTo(Object obj) {
        return this.a - ((cvd) obj).a;
    }
}
