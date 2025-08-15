package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: mr9  reason: default package */
public final class mr9 extends gle {
    public int X;
    public yt Y;
    public int Z;
    public long c;
    public ArrayList o;
    public long s0;
    public ArrayList t0;
    public List u0;

    public mr9(gy8 gy8) {
        super(gy8);
    }

    public final void b(gy8 gy8, String str) {
        ArrayList arrayList;
        yt ytVar;
        int i = 1;
        str.getClass();
        ArrayList arrayList2 = null;
        int i2 = 0;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2005455306:
                if (str.equals("recentsList")) {
                    c2 = 0;
                    break;
                }
                break;
            case -310976023:
                if (str.equals("recentEmojiList")) {
                    c2 = 1;
                    break;
                }
                break;
            case -295915613:
                if (str.equals("updateType")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    c2 = 3;
                    break;
                }
                break;
            case 104120:
                if (str.equals("ids")) {
                    c2 = 4;
                    break;
                }
                break;
            case 3545755:
                if (str.equals("sync")) {
                    c2 = 5;
                    break;
                }
                break;
            case 3575610:
                if (str.equals("type")) {
                    c2 = 6;
                    break;
                }
                break;
            case 109327645:
                if (str.equals("setId")) {
                    c2 = 7;
                    break;
                }
                break;
            case 747804969:
                if (str.equals("position")) {
                    c2 = 8;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                if (gy8.n().a() == 7) {
                    arrayList2 = new ArrayList();
                    int s02 = gy8.s0();
                    while (i2 < s02) {
                        arrayList2.add(i9c.a(gy8));
                        i2++;
                    }
                } else {
                    gy8.z();
                }
                this.t0 = arrayList2;
                return;
            case 1:
                if (gy8.n().a() == 7) {
                    ArrayList arrayList3 = new ArrayList();
                    int s03 = gy8.s0();
                    while (i2 < s03) {
                        g9c a = g9c.a(gy8);
                        if (a != null) {
                            arrayList3.add(a);
                        }
                        i2++;
                    }
                    arrayList = arrayList3;
                } else {
                    gy8.z();
                    arrayList = Collections.emptyList();
                }
                this.u0 = arrayList;
                return;
            case 2:
                String P = lz7.P(gy8);
                yt[] ytVarArr = yt.o;
                int length = ytVarArr.length;
                while (true) {
                    if (i2 < length) {
                        ytVar = ytVarArr[i2];
                        if (!ytVar.a.equalsIgnoreCase(P)) {
                            i2++;
                        }
                    } else {
                        ytVar = yt.UNKNOWN;
                    }
                }
                this.Y = ytVar;
                return;
            case 3:
                this.c = lz7.M(gy8, 0);
                return;
            case 4:
                if (gy8.n().a() == 7) {
                    arrayList2 = new ArrayList();
                    int s04 = gy8.s0();
                    while (i2 < s04) {
                        arrayList2.add(Long.valueOf(lz7.M(gy8, 0)));
                        i2++;
                    }
                } else {
                    gy8.z();
                }
                this.o = arrayList2;
                return;
            case 5:
                this.s0 = lz7.M(gy8, 0);
                return;
            case 6:
                String P2 = lz7.P(gy8);
                int[] v = au1.v(10);
                int length2 = v.length;
                while (true) {
                    if (i2 < length2) {
                        int i3 = v[i2];
                        if (au1.d(i3).equals(P2)) {
                            i = i3;
                        } else {
                            i2++;
                        }
                    }
                }
                this.X = i;
                return;
            case 7:
                lz7.M(gy8, 0);
                return;
            case 8:
                this.Z = lz7.L(gy8);
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        long j = this.c;
        int i = this.X;
        yt ytVar = this.Y;
        int i2 = this.Z;
        int o2 = s5c.o(this.u0);
        int o3 = s5c.o(this.t0);
        StringBuilder k = au1.k(j, "Response{id=", ", assetType=");
        k.append(au1.t(i));
        k.append(", updateType=");
        k.append(ytVar);
        k.append(", position=");
        ms2.k(k, i2, ", recentEmojiList=", o2, ", recentsList=");
        return zr6.j(k, o3, "}");
    }
}
