package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: df4  reason: default package */
public final class df4 {
    public final /* synthetic */ int a;
    public int b;
    public final List c;

    public /* synthetic */ df4(List list, int i, int i2) {
        this.a = i2;
        this.b = i;
        this.c = list;
    }

    public m3f a(int i, nw4 nw4) {
        if (i != 2) {
            String str = (String) nw4.b;
            if (i == 3 || i == 4) {
                return new lua(new ge9(str));
            }
            if (i == 21) {
                return new lua(new zt4(2));
            }
            if (i != 27) {
                if (i == 36) {
                    return new lua(new th6(new wva(c(nw4))));
                }
                if (i == 89) {
                    return new lua(new zt4(0, (List) nw4.c));
                }
                if (i != 138) {
                    if (i == 172) {
                        return new lua(new s3(str, 1));
                    }
                    if (i == 257) {
                        return new g1d(new cjg("application/vnd.dvb.ait"));
                    }
                    if (i != 134) {
                        if (i != 135) {
                            switch (i) {
                                case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                                    if (f(2)) {
                                        return null;
                                    }
                                    return new lua(new fc(str, false));
                                case 16:
                                    return new lua(new nh6(new djb(c(nw4))));
                                case LangUtils.HASH_SEED /*17*/:
                                    if (f(2)) {
                                        return null;
                                    }
                                    return new lua(new be7(str));
                                default:
                                    switch (i) {
                                        case 128:
                                            break;
                                        case 129:
                                            break;
                                        case 130:
                                            if (!f(64)) {
                                                return null;
                                            }
                                            break;
                                        default:
                                            return null;
                                    }
                            }
                        }
                        return new lua(new s3(str, 0));
                    } else if (f(16)) {
                        return null;
                    } else {
                        return new g1d(new cjg("application/x-scte35"));
                    }
                }
                return new lua(new rs4(str));
            } else if (f(4)) {
                return null;
            } else {
                return new lua(new rh6(new wva(c(nw4)), f(1), f(8)));
            }
        }
        return new lua(new jh6(new djb(c(nw4))));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006c, code lost:
        return new defpackage.mua(new defpackage.t3(r2, r7.j(), 0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.n3f b(int r6, defpackage.ho9 r7) {
        /*
            r5 = this;
            r0 = 2
            if (r6 == r0) goto L_0x015f
            r1 = 3
            java.lang.Object r2 = r7.b
            java.lang.String r2 = (java.lang.String) r2
            if (r6 == r1) goto L_0x0150
            r1 = 4
            if (r6 == r1) goto L_0x0150
            r3 = 21
            if (r6 == r3) goto L_0x0144
            r3 = 27
            r4 = 0
            if (r6 == r3) goto L_0x011e
            r1 = 36
            if (r6 == r1) goto L_0x010a
            r1 = 45
            if (r6 == r1) goto L_0x00ff
            r1 = 89
            if (r6 == r1) goto L_0x00ef
            r1 = 172(0xac, float:2.41E-43)
            if (r6 == r1) goto L_0x00df
            r1 = 257(0x101, float:3.6E-43)
            if (r6 == r1) goto L_0x00d0
            r1 = 138(0x8a, float:1.93E-43)
            if (r6 == r1) goto L_0x00bf
            r1 = 139(0x8b, float:1.95E-43)
            if (r6 == r1) goto L_0x00ae
            switch(r6) {
                case 15: goto L_0x0097;
                case 16: goto L_0x0083;
                case 17: goto L_0x006d;
                default: goto L_0x0035;
            }
        L_0x0035:
            switch(r6) {
                case 128: goto L_0x015f;
                case 129: goto L_0x005d;
                case 130: goto L_0x0054;
                default: goto L_0x0038;
            }
        L_0x0038:
            switch(r6) {
                case 134: goto L_0x003c;
                case 135: goto L_0x005d;
                case 136: goto L_0x00bf;
                default: goto L_0x003b;
            }
        L_0x003b:
            return r4
        L_0x003c:
            r6 = 16
            boolean r5 = r5.f(r6)
            if (r5 == 0) goto L_0x0045
            goto L_0x0053
        L_0x0045:
            h1d r4 = new h1d
            jo7 r5 = new jo7
            java.lang.String r6 = "application/x-scte35"
            r7 = 10
            r5.<init>((java.lang.String) r6, (int) r7)
            r4.<init>(r5)
        L_0x0053:
            return r4
        L_0x0054:
            r6 = 64
            boolean r5 = r5.f(r6)
            if (r5 != 0) goto L_0x00bf
            return r4
        L_0x005d:
            mua r5 = new mua
            t3 r6 = new t3
            int r7 = r7.j()
            r0 = 0
            r6.<init>(r2, r7, r0)
            r5.<init>(r6)
            return r5
        L_0x006d:
            boolean r5 = r5.f(r0)
            if (r5 == 0) goto L_0x0074
            goto L_0x0082
        L_0x0074:
            mua r4 = new mua
            ce7 r5 = new ce7
            int r6 = r7.j()
            r5.<init>(r2, r6)
            r4.<init>(r5)
        L_0x0082:
            return r4
        L_0x0083:
            mua r6 = new mua
            nh6 r0 = new nh6
            b9b r1 = new b9b
            java.util.List r5 = r5.d(r7)
            r1.<init>((java.util.List) r5)
            r0.<init>((defpackage.b9b) r1)
            r6.<init>(r0)
            return r6
        L_0x0097:
            boolean r5 = r5.f(r0)
            if (r5 == 0) goto L_0x009e
            goto L_0x00ad
        L_0x009e:
            mua r4 = new mua
            gc r5 = new gc
            int r6 = r7.j()
            r7 = 0
            r5.<init>(r7, r2, r6)
            r4.<init>(r5)
        L_0x00ad:
            return r4
        L_0x00ae:
            mua r5 = new mua
            ss4 r6 = new ss4
            int r7 = r7.j()
            r0 = 5408(0x1520, float:7.578E-42)
            r6.<init>(r2, r7, r0)
            r5.<init>(r6)
            return r5
        L_0x00bf:
            mua r5 = new mua
            ss4 r6 = new ss4
            int r7 = r7.j()
            r0 = 4096(0x1000, float:5.74E-42)
            r6.<init>(r2, r7, r0)
            r5.<init>(r6)
            return r5
        L_0x00d0:
            h1d r5 = new h1d
            jo7 r6 = new jo7
            java.lang.String r7 = "application/vnd.dvb.ait"
            r0 = 10
            r6.<init>((java.lang.String) r7, (int) r0)
            r5.<init>(r6)
            return r5
        L_0x00df:
            mua r5 = new mua
            t3 r6 = new t3
            int r7 = r7.j()
            r0 = 1
            r6.<init>(r2, r7, r0)
            r5.<init>(r6)
            return r5
        L_0x00ef:
            mua r5 = new mua
            zt4 r6 = new zt4
            java.lang.Object r7 = r7.c
            java.util.List r7 = (java.util.List) r7
            r0 = 1
            r6.<init>(r0, r7)
            r5.<init>(r6)
            return r5
        L_0x00ff:
            mua r5 = new mua
            je9 r6 = new je9
            r6.<init>()
            r5.<init>(r6)
            return r5
        L_0x010a:
            mua r6 = new mua
            th6 r0 = new th6
            aab r1 = new aab
            java.util.List r5 = r5.d(r7)
            r1.<init>((java.util.List) r5)
            r0.<init>((defpackage.aab) r1)
            r6.<init>(r0)
            return r6
        L_0x011e:
            boolean r6 = r5.f(r1)
            if (r6 == 0) goto L_0x0125
            goto L_0x0143
        L_0x0125:
            mua r4 = new mua
            rh6 r6 = new rh6
            aab r0 = new aab
            java.util.List r7 = r5.d(r7)
            r0.<init>((java.util.List) r7)
            r7 = 1
            boolean r7 = r5.f(r7)
            r1 = 8
            boolean r5 = r5.f(r1)
            r6.<init>((defpackage.aab) r0, (boolean) r7, (boolean) r5)
            r4.<init>(r6)
        L_0x0143:
            return r4
        L_0x0144:
            mua r5 = new mua
            zt4 r6 = new zt4
            r7 = 3
            r6.<init>(r7)
            r5.<init>(r6)
            return r5
        L_0x0150:
            mua r5 = new mua
            he9 r6 = new he9
            int r7 = r7.j()
            r6.<init>(r2, r7)
            r5.<init>(r6)
            return r5
        L_0x015f:
            mua r6 = new mua
            kh6 r0 = new kh6
            b9b r1 = new b9b
            java.util.List r5 = r5.d(r7)
            r1.<init>((java.util.List) r5)
            r0.<init>(r1)
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df4.b(int, ho9):n3f");
    }

    public List c(nw4 nw4) {
        ArrayList arrayList;
        String str;
        int i;
        List list;
        boolean f = f(32);
        List list2 = this.c;
        if (f) {
            return list2;
        }
        yaf yaf = new yaf((byte[]) nw4.o);
        List list3 = list2;
        while (yaf.c() > 0) {
            int v = yaf.v();
            int v2 = yaf.b + yaf.v();
            if (v == 134) {
                ArrayList arrayList2 = new ArrayList();
                int v3 = yaf.v() & 31;
                for (int i2 = 0; i2 < v3; i2++) {
                    String t = yaf.t(3, b52.c);
                    int v4 = yaf.v();
                    boolean z = (v4 & 128) != 0;
                    if (z) {
                        i = v4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte v5 = (byte) yaf.v();
                    yaf.I(1);
                    if (z) {
                        list = Collections.singletonList((v5 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    my5 my5 = new my5();
                    my5.k = str;
                    my5.c = t;
                    my5.C = i;
                    my5.m = list;
                    arrayList2.add(new oy5(my5));
                }
                arrayList = arrayList2;
            } else {
                arrayList = list3;
            }
            yaf.H(v2);
            list3 = arrayList;
        }
        return list3;
    }

    public List d(ho9 ho9) {
        ArrayList arrayList;
        String str;
        int i;
        List list;
        boolean f = f(32);
        List list2 = this.c;
        if (f) {
            return list2;
        }
        wpa wpa = new wpa((byte[]) ho9.d);
        List list3 = list2;
        while (wpa.a() > 0) {
            int u = wpa.u();
            int u2 = wpa.b + wpa.u();
            if (u == 134) {
                ArrayList arrayList2 = new ArrayList();
                int u3 = wpa.u() & 31;
                for (int i2 = 0; i2 < u3; i2++) {
                    String s = wpa.s(3, b52.c);
                    int u4 = wpa.u();
                    boolean z = (u4 & 128) != 0;
                    if (z) {
                        i = u4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte u5 = (byte) wpa.u();
                    wpa.H(1);
                    if (z) {
                        list = Collections.singletonList((u5 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    ny5 ny5 = new ny5();
                    ny5.m = ia9.l(str);
                    ny5.d = s;
                    ny5.F = i;
                    ny5.p = list;
                    arrayList2.add(new qy5(ny5));
                }
                arrayList = arrayList2;
            } else {
                arrayList = list3;
            }
            wpa.G(u2);
            list3 = arrayList;
        }
        return list3;
    }

    public boolean e() {
        return this.b < this.c.size();
    }

    public boolean f(int i) {
        switch (this.a) {
            case 0:
                return (this.b & i) != 0;
            default:
                return (this.b & i) != 0;
        }
    }

    public df4(ArrayList arrayList) {
        this.a = 2;
        this.c = arrayList;
    }
}
