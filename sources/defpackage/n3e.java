package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: n3e  reason: default package */
public final class n3e {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final List h;
    public final boolean i;
    public final int j;

    public n3e(l3e l3e) {
        this.a = l3e.a;
        this.b = l3e.b;
        this.c = l3e.c;
        this.d = l3e.d;
        this.e = l3e.e;
        this.f = l3e.f;
        this.g = l3e.h;
        this.h = l3e.g;
        this.i = l3e.i;
        this.j = l3e.j;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, l3e] */
    public static n3e a(gy8 gy8) {
        int N = lz7.N(gy8);
        if (N == 0) {
            return null;
        }
        ? obj = new Object();
        for (int i2 = 0; i2 < N; i2++) {
            String z0 = gy8.z0();
            z0.getClass();
            char c2 = 65535;
            switch (z0.hashCode()) {
                case -295931082:
                    if (z0.equals("updateTime")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3355:
                    if (z0.equals("id")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3321850:
                    if (z0.equals("link")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 3373707:
                    if (z0.equals("name")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 95844769:
                    if (z0.equals("draft")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 1369213417:
                    if (z0.equals("createTime")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1433072646:
                    if (z0.equals("authorId")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1531715286:
                    if (z0.equals("stickers")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 1638765110:
                    if (z0.equals("iconUrl")) {
                        c2 = 8;
                        break;
                    }
                    break;
                case 2009367604:
                    if (z0.equals("installCount")) {
                        c2 = 9;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    obj.f = lz7.M(gy8, 0);
                    break;
                case 1:
                    obj.a = gy8.w0();
                    break;
                case 2:
                    obj.h = lz7.P(gy8);
                    break;
                case 3:
                    obj.b = lz7.P(gy8);
                    break;
                case 4:
                    obj.i = lz7.H(gy8);
                    break;
                case 5:
                    obj.e = lz7.M(gy8, 0);
                    break;
                case 6:
                    obj.d = lz7.M(gy8, 0);
                    break;
                case 7:
                    int G = lz7.G(gy8);
                    ArrayList arrayList = new ArrayList(G);
                    for (int i3 = 0; i3 < G; i3++) {
                        arrayList.add(Long.valueOf(gy8.w0()));
                    }
                    obj.g = arrayList;
                    break;
                case 8:
                    obj.c = lz7.P(gy8);
                    break;
                case 9:
                    obj.j = lz7.L(gy8);
                    break;
                default:
                    gy8.z();
                    break;
            }
        }
        return new n3e(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerSet{id=");
        sb.append(this.a);
        sb.append(", name='");
        sb.append(this.b);
        sb.append("', iconUrl='");
        sb.append(this.c);
        sb.append("', authorId=");
        sb.append(this.d);
        sb.append(", createTime=");
        sb.append(this.e);
        sb.append(", updateTime=");
        sb.append(this.f);
        sb.append(", link='");
        sb.append(this.g);
        sb.append("', stickers=");
        sb.append(this.h);
        sb.append(", draft=");
        sb.append(this.i);
        sb.append(", installCount=");
        return zr6.j(sb, this.j, "}");
    }
}
