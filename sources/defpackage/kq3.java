package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kq3  reason: default package */
public final class kq3 implements Serializable {
    public final List X;
    public final int Y;
    public final boolean Z;
    public final wm3 a;
    public final String b;
    public final String c;
    public final s7b o;

    public kq3(wm3 wm3, String str, String str2, s7b s7b, ArrayList arrayList, int i, boolean z) {
        this.a = wm3;
        this.b = str;
        this.c = str2;
        this.o = s7b;
        this.X = arrayList;
        this.Y = i;
        this.Z = z;
    }

    public static kq3 a(gy8 gy8) {
        int N = lz7.N(gy8);
        ArrayList arrayList = null;
        int i = 0;
        boolean z = false;
        wm3 wm3 = null;
        String str = null;
        String str2 = null;
        s7b s7b = null;
        for (int i2 = 0; i2 < N; i2++) {
            String z0 = gy8.z0();
            z0.getClass();
            char c2 = 65535;
            switch (z0.hashCode()) {
                case -1857640538:
                    if (z0.equals("summary")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1297282981:
                    if (z0.equals("restricted")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1276666629:
                    if (z0.equals("presence")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -600094315:
                    if (z0.equals("friends")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -191501435:
                    if (z0.equals("feedback")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 613469306:
                    if (z0.equals("friendsCount")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 951526432:
                    if (z0.equals("contact")) {
                        c2 = 6;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    str = gy8.z0();
                    break;
                case 1:
                    z = gy8.u0();
                    break;
                case 2:
                    s7b = s7b.a(gy8);
                    break;
                case 3:
                    int G = lz7.G(gy8);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < G; i3++) {
                        arrayList2.add(Long.valueOf(gy8.w0()));
                    }
                    arrayList = arrayList2;
                    break;
                case 4:
                    str2 = gy8.z0();
                    break;
                case 5:
                    i = gy8.v0();
                    break;
                case 6:
                    wm3 = wm3.e(gy8);
                    break;
                default:
                    gy8.z();
                    break;
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return new kq3(wm3, str, str2, s7b, arrayList, i, z);
    }

    public final String toString() {
        String x = oag.x(this.b);
        String x2 = oag.x(this.c);
        int o2 = s5c.o(this.X);
        return "{contact=" + this.a + ", summary='" + x + "', feedback='" + x2 + "', friends=" + o2 + ", friendsCount=" + this.Y + ", restricted=" + this.Z + "}";
    }
}
