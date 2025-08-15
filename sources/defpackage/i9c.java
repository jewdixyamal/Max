package defpackage;

/* renamed from: i9c  reason: default package */
public final class i9c {
    public final int a;
    public final long b;
    public final long c;
    public final tva d;

    public i9c(s82 s82) {
        this.a = s82.a;
        this.b = s82.b;
        this.c = s82.c;
        this.d = (tva) s82.d;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, s82] */
    public static i9c a(gy8 gy8) {
        int i;
        String str;
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
                case 3355:
                    if (z0.equals("id")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 102340:
                    if (z0.equals("gif")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (z0.equals("type")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 238532408:
                    if (z0.equals("stickerId")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    obj.b = gy8.w0();
                    break;
                case 1:
                    obj.d = (tva) bz.b(gy8);
                    break;
                case 2:
                    String P = lz7.P(gy8);
                    int[] v = au1.v(3);
                    int length = v.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i = 1;
                        } else {
                            i = v[i3];
                            if (i == 1) {
                                str = "UNKNOWN";
                            } else if (i == 2) {
                                str = "STICKER";
                            } else if (i == 3) {
                                str = "GIF";
                            } else {
                                throw null;
                            }
                            if (!str.equals(P)) {
                                i3++;
                            }
                        }
                    }
                    obj.a = i;
                    break;
                case 3:
                    obj.c = lz7.M(gy8, 0);
                    break;
                default:
                    gy8.z();
                    break;
            }
        }
        return new i9c(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentItem{type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "GIF" : "STICKER" : "UNKNOWN");
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", stickerId=");
        sb.append(this.c);
        sb.append(", gif=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
