package defpackage;

/* renamed from: kje  reason: default package */
public final class kje implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String o;

    public kje(String str, int i, int i2, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.o = str2;
    }

    public final int compareTo(Object obj) {
        kje kje = (kje) obj;
        int i = this.a - kje.a;
        return i == 0 ? this.b - kje.b : i;
    }
}
