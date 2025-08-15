package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: eu  reason: default package */
public final class eu extends gle {
    public List X;
    public List Y;
    public List c;
    public List o;

    public eu(gy8 gy8) {
        super(gy8);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
        if (this.o == null) {
            this.o = Collections.emptyList();
        }
        if (this.X == null) {
            this.X = Collections.emptyList();
        }
        if (this.Y == null) {
            this.Y = Collections.emptyList();
        }
    }

    public final void b(gy8 gy8, String str) {
        int i;
        String str2;
        long j;
        long j2;
        long j3;
        int i2;
        mj mjVar;
        String str3;
        gy8 gy82 = gy8;
        String str4 = str;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -794795562:
                if (str4.equals("animojis")) {
                    c2 = 0;
                    break;
                }
                break;
            case 399262766:
                if (str4.equals("animojiSets")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1531715286:
                if (str4.equals("stickers")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1596679982:
                if (str4.equals("stickerSets")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                int G = lz7.G(gy8);
                this.X = new ArrayList(G);
                for (int i3 = 0; i3 < G; i3++) {
                    List list = this.X;
                    try {
                        i = lz7.N(gy8);
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                        Iterator it = u7d.a.iterator();
                        while (it.hasNext()) {
                            ((r4a) it.next()).getClass();
                            r4a.a(th2);
                        }
                        int s = au1.s(k7d.a);
                        if (s == 0) {
                            i = 0;
                        } else if (s != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th2;
                        }
                    }
                    long j4 = 0;
                    long j5 = 0;
                    String str5 = null;
                    long j6 = 0;
                    String str6 = null;
                    String str7 = null;
                    String str8 = null;
                    for (int i4 = 0; i4 < i; i4++) {
                        try {
                            str2 = lz7.P(gy8);
                        } catch (Throwable th3) {
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                            Iterator it2 = u7d.a.iterator();
                            while (it2.hasNext()) {
                                ((r4a) it2.next()).getClass();
                                r4a.a(th3);
                            }
                            int s2 = au1.s(k7d.a);
                            if (s2 != 0) {
                                if (s2 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th3;
                            }
                        }
                        if (str2 != null) {
                            try {
                                switch (str2.hashCode()) {
                                    case -295931082:
                                        if (str2.equals("updateTime")) {
                                            j = lz7.M(gy82, 0);
                                            j5 = j;
                                            break;
                                        }
                                        break;
                                    case 3355:
                                        if (str2.equals("id")) {
                                            j2 = lz7.M(gy82, 0);
                                            j4 = j2;
                                            break;
                                        }
                                        break;
                                    case 96632902:
                                        if (str2.equals("emoji")) {
                                            str5 = lz7.P(gy8);
                                            break;
                                        }
                                        break;
                                    case 109327645:
                                        if (str2.equals("setId")) {
                                            j3 = lz7.M(gy82, 0);
                                            j6 = j3;
                                            break;
                                        }
                                        break;
                                    case 803933436:
                                        if (str2.equals("lottiePlayUrl")) {
                                            str7 = lz7.P(gy8);
                                            break;
                                        }
                                        break;
                                    case 1539122512:
                                        if (str2.equals("lottieUrl")) {
                                            str6 = lz7.P(gy8);
                                            break;
                                        }
                                        break;
                                    case 1638765110:
                                        if (str2.equals("iconUrl")) {
                                            str8 = lz7.P(gy8);
                                            break;
                                        }
                                        break;
                                }
                                gy8.z();
                            } catch (Throwable th4) {
                                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                                Iterator it3 = u7d.a.iterator();
                                while (it3.hasNext()) {
                                    ((r4a) it3.next()).getClass();
                                    r4a.a(th4);
                                }
                                int s3 = au1.s(k7d.a);
                                if (s3 != 0) {
                                    if (s3 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th4;
                                }
                            }
                        }
                    }
                    list.add((str5 == null || str5.length() == 0) ? null : new oh(j4, j5, str5, j6, str6, str7, str8));
                }
                return;
            case 1:
                int G2 = lz7.G(gy8);
                this.Y = new ArrayList(G2);
                for (int i5 = 0; i5 < G2; i5++) {
                    List list2 = this.Y;
                    List list3 = nz4.a;
                    try {
                        i2 = lz7.N(gy8);
                    } catch (Throwable th5) {
                        Throwable th6 = th5;
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                        Iterator it4 = u7d.a.iterator();
                        while (it4.hasNext()) {
                            ((r4a) it4.next()).getClass();
                            r4a.a(th6);
                        }
                        int s4 = au1.s(k7d.a);
                        if (s4 == 0) {
                            i2 = 0;
                        } else if (s4 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th6;
                        }
                    }
                    List list4 = list3;
                    String str9 = null;
                    long j7 = 0;
                    String str10 = null;
                    String str11 = null;
                    long j8 = 0;
                    for (int i6 = 0; i6 < i2; i6++) {
                        try {
                            str3 = lz7.P(gy8);
                        } catch (Throwable th7) {
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                            Iterator it5 = u7d.a.iterator();
                            while (it5.hasNext()) {
                                ((r4a) it5.next()).getClass();
                                r4a.a(th7);
                            }
                            int s5 = au1.s(k7d.a);
                            if (s5 != 0) {
                                if (s5 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th7;
                            }
                        }
                        if (str3 != null) {
                            try {
                                switch (str3.hashCode()) {
                                    case -295931082:
                                        if (str3.equals("updateTime")) {
                                            j8 = lz7.M(gy82, 0);
                                            break;
                                        }
                                        break;
                                    case 3355:
                                        if (str3.equals("id")) {
                                            j7 = lz7.M(gy82, 0);
                                            break;
                                        }
                                        break;
                                    case 3373707:
                                        if (str3.equals("name")) {
                                            str10 = lz7.P(gy8);
                                            break;
                                        }
                                        break;
                                    case 660078807:
                                        if (str3.equals("iconLottieUrl")) {
                                            str11 = lz7.P(gy8);
                                            break;
                                        }
                                        break;
                                    case 705606459:
                                        if (str3.equals("animojiIds")) {
                                            List W = lz7.W(gy82, new mq9(6));
                                            if (W == null) {
                                                W = list3;
                                            }
                                            list4 = W;
                                            break;
                                        }
                                        break;
                                    case 1638765110:
                                        if (str3.equals("iconUrl")) {
                                            str9 = lz7.P(gy8);
                                            break;
                                        }
                                        break;
                                }
                                gy8.z();
                            } catch (Throwable th8) {
                                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                                Iterator it6 = u7d.a.iterator();
                                while (it6.hasNext()) {
                                    ((r4a) it6.next()).getClass();
                                    r4a.a(th8);
                                }
                                int s6 = au1.s(k7d.a);
                                if (s6 != 0) {
                                    if (s6 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th8;
                                }
                            }
                        }
                    }
                    if (str10 == null || str10.length() == 0) {
                        mjVar = null;
                    } else {
                        mjVar = new mj(j7, str10, str9 == null ? "" : str9, str11, j8, list4);
                    }
                    list2.add(mjVar);
                }
                return;
            case 2:
                int G3 = lz7.G(gy8);
                this.c = new ArrayList(G3);
                for (int i7 = 0; i7 < G3; i7++) {
                    this.c.add(e2e.a(gy8));
                }
                return;
            case 3:
                int G4 = lz7.G(gy8);
                this.o = new ArrayList(G4);
                for (int i8 = 0; i8 < G4; i8++) {
                    this.o.add(n3e.a(gy8));
                }
                return;
            default:
                gy8.z();
                return;
        }
    }

    public final String toString() {
        int o2 = s5c.o(this.c);
        int o3 = s5c.o(this.o);
        int o4 = s5c.o(this.X);
        int o5 = s5c.o(this.Y);
        StringBuilder j = wg0.j("{stickers=", o2, "stickerSets=", o3, "animojis=");
        j.append(o4);
        j.append("animojiSets=");
        j.append(o5);
        j.append("}");
        return j.toString();
    }
}
