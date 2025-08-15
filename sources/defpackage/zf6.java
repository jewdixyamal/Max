package defpackage;

/* renamed from: zf6  reason: default package */
public final class zf6 {
    public final dg6 a;
    public final fg6 b;
    public boolean c = true;

    public zf6(dg6 dg6, fg6 fg6) {
        this.a = dg6;
        this.b = fg6;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" ");
        sb.append(!this.c ? "+>" : "->");
        sb.append(" ");
        sb.append(this.b);
        return sb.toString();
    }
}
