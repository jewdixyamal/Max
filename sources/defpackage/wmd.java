package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioRecord;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Range;
import android.util.Rational;
import android.view.View;
import androidx.fragment.app.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;
import kotlinx.coroutines.internal.CoroutineExceptionHandlerImpl_commonKt;
import ru.ok.messages.views.dialogs.FrgDlgPermissions;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: wmd  reason: default package */
public abstract class wmd {
    public static volatile vmd a;
    public static volatile ArrayList b;
    public static final pq9 c = new Object();
    public static final String[] d = {"android.permission.READ_CONTACTS", "android.permission.GET_ACCOUNTS"};
    public static final String[] e = {"android.permission.READ_CONTACTS"};
    public static final String[] f = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    public static final String[] g = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"};
    public static final String[] h = {"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
    public static SharedPreferences i;

    public static tpb A(byte[] bArr) {
        int s;
        yaf yaf = new yaf(bArr);
        if (yaf.c < 32) {
            return null;
        }
        yaf.H(0);
        if (yaf.h() != yaf.c() + 4 || yaf.h() != 1886614376 || (s = oy.s(yaf.h())) > 1) {
            return null;
        }
        UUID uuid = new UUID(yaf.p(), yaf.p());
        if (s == 1) {
            yaf.I(yaf.y() * 16);
        }
        int y = yaf.y();
        if (y != yaf.c()) {
            return null;
        }
        byte[] bArr2 = new byte[y];
        yaf.g(0, bArr2, y);
        return new tpb(uuid, s, bArr2);
    }

    public static byte[] B(UUID uuid, byte[] bArr) {
        tpb A = A(bArr);
        if (A == null) {
            return null;
        }
        UUID uuid2 = A.a;
        if (uuid.equals(uuid2)) {
            return A.c;
        }
        String valueOf = String.valueOf(uuid);
        new StringBuilder(String.valueOf(uuid2).length() + valueOf.length() + 33);
        return null;
    }

    public static long C(wpa wpa, int i2, int i3) {
        wpa.G(i2);
        if (wpa.a() < 5) {
            return -9223372036854775807L;
        }
        int g2 = wpa.g();
        if ((8388608 & g2) != 0 || ((2096896 & g2) >> 8) != i3 || (g2 & 32) == 0 || wpa.u() < 7 || wpa.a() < 7 || (wpa.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        wpa.e(0, bArr, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static void D(a aVar, String[] strArr, int i2) {
        try {
            aVar.requestPermissions(strArr, i2);
            H(r(aVar.d0()), strArr);
        } catch (Exception e2) {
            x6a x6a = nd7.h;
            if (x6a == null) {
                x6a = null;
            }
            x6a.getClass();
            hm9.p("wmd", "Can't request permission", e2);
        }
    }

    public static int E(int i2, int i3, int i4, int i5, int i6, Range range) {
        Rational rational = new Rational(i3, i4);
        Rational rational2 = new Rational(i5, i6);
        double doubleValue = rational.doubleValue();
        int doubleValue2 = (int) (rational2.doubleValue() * doubleValue * ((double) i2));
        if (mqd.u(3, "AudioConfigUtil")) {
            String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(doubleValue2)});
        }
        if (!o90.f.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(doubleValue2));
            doubleValue2 = num.intValue();
            if (mqd.u(3, "AudioConfigUtil")) {
                String.format("\nClamped to range %s -> %dbps", new Object[]{range, num});
            }
        }
        return doubleValue2;
    }

    public static int F(Range range, int i2, int i3, int i4) {
        ArrayList arrayList = null;
        int i5 = i4;
        int i6 = 0;
        while (true) {
            if (range.contains(Integer.valueOf(i5))) {
                int i7 = h70.n;
                if (i5 > 0 && i2 > 0) {
                    if (AudioRecord.getMinBufferSize(i5, i2 == 1 ? 16 : 12, i3) > 0) {
                        return i5;
                    }
                }
            } else {
                range.toString();
            }
            if (arrayList == null) {
                arrayList = new ArrayList(n90.e);
                Collections.sort(arrayList, new y30(i4, 0));
            }
            if (i6 >= arrayList.size()) {
                return 44100;
            }
            int intValue = ((Integer) arrayList.get(i6)).intValue();
            i6++;
            i5 = intValue;
        }
    }

    public static final void G(View view, isc isc) {
        view.setTag(fvb.view_tree_saved_state_registry_owner, isc);
    }

    public static void H(SharedPreferences sharedPreferences, String[] strArr) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String str : strArr) {
            edit.putBoolean(str + "_req", true);
        }
        edit.apply();
    }

    public static final mh1 I(gpd gpd) {
        return new mh1(gpd.a, gpd.b, gpd.c, gpd.d, gpd.e, gpd.f);
    }

    public static final String J(Object obj, boolean z, boolean z2) {
        return obj == null ? "null" : obj instanceof ct7 ? ((ct7) obj).getClass().getName().concat(".NULL") : obj instanceof dt7 ? ((dt7) obj).a(z, z2) : obj.toString();
    }

    public static final void L(y5f y5f) {
        lz7.Z(y5f);
        y5f.e(cu7.class, new uza(21));
        y5f.e(t23.class, new uza(23));
        y5f.e(pk.class, new qxc(2));
        y5f.e(qj6.class, new rxc(11));
        y5f.e(v7g.class, new rxc(22));
        y5f.e(eoe.class, new sxc(3));
        y5f.e(boe.class, new sxc(14));
        y5f.e(zwd.class, new sxc(25));
        y5f.e(k33.class, new txc(6));
        y5f.e(bd4.class, new txc(17));
        y5f.e(s84.class, new txc(28));
        Class<qu7> cls = qu7.class;
        y5f.c(cls, new dcb(17));
        y5f.e(jbd.class, new n7b(22));
        y5f.e(mh3.class, new nxc(3));
        y5f.e(hbd.class, new nxc(14));
        y5f.e(ch3.class, new nxc(25));
        y5f.e(yle.class, new oxc(6));
        y5f.e(mle.class, new oxc(17));
        y5f.e(oad.class, new oxc(28));
        y5f.e(ome.class, new pxc(9));
        y5f.e(cy7.class, new pxc(20));
        y5f.e(av0.class, new qxc(1));
        y5f.e(s8g.class, new qxc(13));
        y5f.e(yme.class, new qxc(24));
        y5f.e(k24.class, new rxc(3));
        y5f.e(c34.class, new rxc(4));
        y5f.e(vxc.class, new rxc(5));
        y5f.e(xxc.class, new rxc(6));
        y5f.e(yxc.class, new rxc(7));
        y5f.e(pfa.class, new rxc(8));
        y5f.e(jlc.class, new uza(24));
        y5f.e(OneMeRoomDatabase.class, new uza(25));
        y5f.e(mtf.class, new dcb(27));
        y5f.e(js7.class, new rxc(9));
        y5f.c(cls, new dcb(19));
        y5f.e(ad.class, new rxc(10));
        y5f.e(sj6.class, new dcb(28));
        y5f.e(cw9.class, new dcb(29));
        y5f.e(u0b.class, new rxc(12));
        y5f.e(mqf.class, new rxc(13));
        y5f.e(tg.class, new rxc(14));
        y5f.e(ds3.class, new rxc(15));
        y5f.e(xc4.class, new rxc(16));
        y5f.e(u7b.class, new rxc(17));
        y5f.c(cls, new dcb(20));
        y5f.e(w7b.class, new rxc(18));
        y5f.e(y7b.class, new rxc(19));
        y5f.e(el3.class, new rxc(20));
        y5f.e(v6b.class, new rxc(21));
        y5f.e(t6b.class, new rxc(23));
        y5f.e(zx8.class, new rxc(24));
        y5f.e(sw8.class, new rxc(25));
        y5f.e(ns8.class, new uza(26));
        y5f.e(kr2.class, new rxc(26));
        y5f.e(zu8.class, new rxc(27));
        y5f.e(r79.class, new rxc(28));
        y5f.e(sna.class, new rxc(29));
        y5f.e(au8.class, new sxc(0));
        y5f.e(ma2.class, new sxc(1));
        y5f.e(rhc.class, new sxc(2));
        y5f.e(hc2.class, new sxc(4));
        y5f.e(p82.class, new sxc(5));
        y5f.e(jz2.class, new sxc(6));
        y5f.e(iy2.class, new sxc(7));
        y5f.e(zrc.class, new sxc(8));
        y5f.c(cls, new dcb(21));
        y5f.e(mm2.class, new uza(27));
        y5f.e(ps2.class, new uza(28));
        y5f.e(yu2.class, new sxc(9));
        y5f.e(t12.class, new sxc(10));
        y5f.e(r12.class, new sxc(11));
        y5f.e(yfc.class, new sxc(12));
        y5f.e(xb9.class, new sxc(13));
        y5f.c(cls, new dcb(22));
        y5f.e(dr9.class, new sxc(15));
        y5f.c(cls, new dcb(23));
        y5f.e(mq3.class, new sxc(16));
        y5f.e(zi5.class, new sxc(17));
        y5f.e(o2e.class, new sxc(18));
        y5f.e(y4e.class, new sxc(19));
        y5f.e(e4e.class, new sxc(20));
        y5f.e(e8d.class, new sxc(21));
        y5f.e(pl.class, new sxc(22));
        y5f.e(x9c.class, new sxc(23));
        y5f.e(dg5.class, new sxc(24));
        y5f.e(xt7.class, new sxc(26));
        y5f.e(a4e.class, new sxc(27));
        y5f.c(cls, new dcb(24));
        y5f.e(md5.class, new sxc(28));
        y5f.e(sc5.class, new sxc(29));
        y5f.c(cls, new dcb(25));
        y5f.e(tu.class, new txc(0));
        y5f.e(ta2.class, new txc(1));
        y5f.c(cls, new dcb(26));
        y5f.e(of9.class, new txc(2));
        y5f.e(t20.class, new txc(3));
        y5f.e(rf5.class, new txc(4));
        y5f.e(jrc.class, new txc(5));
        y5f.e(bv4.class, new txc(7));
        y5f.e(cyd.class, new txc(8));
        y5f.e(u2a.class, new txc(9));
        y5f.e(tke.class, new txc(10));
        y5f.e(cz.class, new txc(11));
        y5f.e(lx8.class, new txc(12));
        y5f.e(p7c.class, new txc(13));
        y5f.e(u23.class, new txc(14));
        y5f.e(zfc.class, new txc(15));
        y5f.e(j52.class, new txc(16));
        y5f.e(bn3.class, new txc(18));
        y5f.e(jc2.class, new txc(19));
        y5f.e(fd1.class, new txc(20));
        y5f.e(jy8.class, new txc(21));
        y5f.e(s9b.class, new txc(22));
        y5f.e(ku7.class, new txc(23));
        y5f.e(cn7.class, new txc(24));
        y5f.e(ioe.class, new txc(25));
        y5f.e(glc.class, new txc(26));
        y5f.e(wlc.class, new txc(27));
        y5f.e(vlc.class, new n7b(12));
        y5f.e(elc.class, new n7b(13));
        y5f.e(imc.class, new n7b(14));
        y5f.e(hmc.class, new n7b(15));
        y5f.e(y8f.class, new n7b(16));
        y5f.e(py8.class, new n7b(17));
        y5f.e(up4.class, new n7b(18));
        y5f.e(yef.class, new n7b(19));
        y5f.e(dp3.class, new n7b(20));
        y5f.e(nd2.class, new n7b(21));
        y5f.e(c4e.class, new n7b(23));
        y5f.e(wc5.class, new n7b(24));
        y5f.e(hc5.class, new n7b(25));
        y5f.e(p9c.class, new n7b(26));
        y5f.e(ka4.class, new n7b(27));
        y5f.e(hd1.class, new n7b(28));
        y5f.e(gj.class, new n7b(29));
        y5f.e(rj.class, new nxc(0));
        y5f.e(r47.class, new nxc(1));
        y5f.e(fme.class, new nxc(2));
        y5f.e(hd5.class, new nxc(4));
        y5f.e(dd5.class, new nxc(5));
        y5f.e(zle.class, new nxc(6));
        y5f.e(ge2.class, new nxc(7));
        y5f.e(wle.class, new nxc(8));
        y5f.e(bs9.class, new nxc(9));
        y5f.e(rw9.class, new nxc(10));
        y5f.c(cls, new dcb(7));
        y5f.e(rs9.class, new nxc(11));
        y5f.e(lt9.class, new nxc(12));
        y5f.e(s7d.class, new nxc(13));
        y5f.e(mz6.class, new nxc(15));
        y5f.e(ime.class, new nxc(16));
        y5f.e(xr9.class, new nxc(17));
        y5f.e(fs9.class, new nxc(18));
        y5f.e(js9.class, new nxc(19));
        y5f.e(ur9.class, new nxc(20));
        y5f.e(sr9.class, new nxc(21));
        y5f.e(ts9.class, new nxc(22));
        y5f.e(qr9.class, new nxc(23));
        y5f.e(ds9.class, new nxc(24));
        y5f.e(lr9.class, new nxc(26));
        y5f.e(as9.class, new nxc(27));
        y5f.e(vs9.class, new nxc(28));
        y5f.e(ps9.class, new nxc(29));
        y5f.e(pd0.class, new oxc(0));
        y5f.e(o44.class, new oxc(1));
        y5f.e(dq0.class, new oxc(2));
        y5f.e(mp4.class, new oxc(3));
        y5f.e(wef.class, new oxc(4));
        y5f.e(cde.class, new oxc(5));
        y5f.e(dz.class, new oxc(7));
        y5f.e(b0d.class, new oxc(8));
        y5f.e(jva.class, new oxc(9));
        y5f.e(bva.class, new oxc(10));
        y5f.c(cls, new dcb(8));
        y5f.e(rk4.class, new oxc(11));
        y5f.e(gn4.class, new oxc(12));
        y5f.e(eqb.class, new oxc(13));
        y5f.c(cls, new dcb(9));
        y5f.e(kw9.class, new oxc(14));
        y5f.c(cls, new dcb(10));
        y5f.e(qx9.class, new oxc(15));
        y5f.e(n79.class, new oxc(16));
        y5f.c(cls, new dcb(11));
        y5f.e(b79.class, new oxc(18));
        y5f.e(ng5.class, new oxc(19));
        y5f.e(wa4.class, new oxc(20));
        y5f.e(pg5.class, new oxc(21));
        y5f.e(y4d.class, new oxc(22));
        y5f.e(oq3.class, new oxc(23));
        y5f.e(xj3.class, new oxc(24));
        y5f.e(ck3.class, new oxc(25));
        y5f.e(gq3.class, new oxc(26));
        y5f.e(qq3.class, new oxc(27));
        y5f.e(yj3.class, new oxc(29));
        y5f.e(hq3.class, new pxc(0));
        y5f.e(ew9.class, new pxc(1));
        y5f.c(cls, new dcb(12));
        y5f.e(ud5.class, new pxc(2));
        y5f.c(cls, new dcb(13));
        y5f.e(le5.class, new pxc(3));
        y5f.c(cls, new dcb(14));
        y5f.e(fqb.class, new pxc(4));
        y5f.e(rx9.class, new pxc(5));
        y5f.e(yx9.class, new pxc(6));
        y5f.c(cls, new dcb(15));
        y5f.e(cm2.class, new pxc(7));
        y5f.e(yo7.class, new pxc(8));
        y5f.e(he5.class, new pxc(10));
        y5f.e(aw9.class, new pxc(11));
        y5f.e(xv9.class, new pxc(12));
        y5f.d(rke.class, new pxc(13));
        y5f.d(ak3.class, new pxc(14));
        y5f.d(are.class, new pxc(15));
        y5f.d(av6.class, new pxc(16));
        y5f.d(oz7.class, new pxc(17));
        y5f.d(cc6.class, new pxc(18));
        y5f.d(q50.class, new pxc(19));
        y5f.d(crd.class, new pxc(21));
        y5f.d(gn7.class, new pxc(22));
        y5f.d(yx7.class, new pxc(23));
        y5f.d(qx7.class, new pxc(24));
        y5f.d(yb9.class, new pxc(25));
        y5f.d(qh5.class, new pxc(26));
        y5f.d(ga4.class, new pxc(27));
        y5f.b(cls, new dcb(16));
        y5f.d(hx9.class, new pxc(28));
        y5f.d(agc.class, new pxc(29));
        y5f.d(mh5.class, new qxc(0));
        y5f.d(g8f.class, new qxc(3));
        y5f.d(oz.class, new qxc(4));
        y5f.d(mc6.class, new qxc(5));
        y5f.d(nkd.class, new qxc(6));
        y5f.d(k9c.class, new qxc(7));
        y5f.d(ec6.class, new qxc(8));
        y5f.d(r5d.class, new qxc(9));
        y5f.d(ky1.class, new qxc(10));
        y5f.d(rr3.class, new qxc(11));
        y5f.d(ks1.class, new qxc(12));
        y5f.b(cls, new dcb(18));
        y5f.d(c32.class, new qxc(14));
        y5f.d(xf2.class, new qxc(15));
        y5f.d(zm8.class, new qxc(16));
        y5f.d(sp3.class, new qxc(17));
        y5f.d(q2e.class, new qxc(18));
        y5f.d(kw3.class, new qxc(19));
        y5f.d(tp7.class, new qxc(20));
        y5f.d(m9b.class, new qxc(21));
        y5f.d(gc2.class, new qxc(22));
        y5f.d(ki7.class, new qxc(23));
        y5f.d(sc2.class, new qxc(25));
        y5f.d(fe7.class, new qxc(26));
        y5f.d(mw8.class, new uza(29));
        y5f.d(hu8.class, new mxc(0));
        y5f.d(kt8.class, new uza(11));
        y5f.d(u79.class, new uza(12));
        y5f.d(k6f.class, new uza(13));
        y5f.d(pf5.class, new uza(14));
        y5f.d(vt7.class, new qxc(27));
        y5f.d(ru.ok.tamtam.logout.a.class, new qxc(28));
        y5f.d(ci0.class, new qxc(29));
        y5f.d(tm3.class, new uza(15));
        y5f.d(gb6.class, new lxc(0));
        y5f.d(ab6.class, new rxc(0));
        y5f.d(eyd.class, new uza(16));
        y5f.d(afe.class, new uza(17));
        y5f.d(no4.class, new uza(18));
        y5f.d(d00.class, new rxc(1));
        y5f.d(ie3.class, new uza(19));
        y5f.d(q6f.class, new lxc(1));
        y5f.d(i6f.class, new lxc(2));
        y5f.d(t6f.class, new lxc(3));
        y5f.d(blb.class, new rxc(2));
        y5f.d(zs9.class, new uza(20));
        y5f.d(wxc.class, new uza(22));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r7[r3] != 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean M(java.lang.String[] r6, int[] r7, java.lang.String[] r8) {
        /*
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L_0x0003:
            r3 = 1
            if (r2 >= r0) goto L_0x0026
            r4 = r8[r2]
            int r5 = r6.length
            if (r5 < r3) goto L_0x0025
            int r5 = r7.length
            if (r5 >= r3) goto L_0x000f
            goto L_0x0025
        L_0x000f:
            r3 = r1
        L_0x0010:
            int r5 = r6.length
            if (r3 >= r5) goto L_0x0025
            r5 = r6[r3]
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x0022
            r3 = r7[r3]
            if (r3 != 0) goto L_0x0025
            int r2 = r2 + 1
            goto L_0x0003
        L_0x0022:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0025:
            return r1
        L_0x0026:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wmd.M(java.lang.String[], int[], java.lang.String[]):boolean");
    }

    public static boolean N(q5 q5Var, a aVar, String[] strArr, int[] iArr, String[] strArr2, int i2, int i3) {
        boolean z;
        if (M(strArr, iArr, strArr2)) {
            hm9.m("wmd", "all permissions granted", new Object[0]);
            return true;
        }
        int length = strArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                z = false;
                break;
            }
            String str = strArr2[i4];
            int i5 = Build.VERSION.SDK_INT;
            if ((i5 >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? i5 >= 32 ? x7.a(q5Var, str) : i5 == 31 ? w7.b(q5Var, str) : v7.c(q5Var, str) : false) {
                z = true;
                break;
            }
            i4++;
        }
        if (z) {
            hm9.m("wmd", "some permissions denied", new Object[0]);
            a14.N(0, q5Var, q5Var.getString(i3));
        } else {
            FrgDlgPermissions n1 = FrgDlgPermissions.n1((String[]) null, FrgDlgPermissions.G1, i2, FrgDlgPermissions.H1, true);
            if (aVar != null) {
                n1.k1(aVar.c0(), "ru.ok.messages.views.dialogs.FrgDlgPermissions");
            } else {
                n1.k1(q5Var.S(), "ru.ok.messages.views.dialogs.FrgDlgPermissions");
            }
            hm9.m("wmd", "some permissions denied forever", new Object[0]);
        }
        return false;
    }

    public static boolean O(a aVar, String[] strArr, int[] iArr, String[] strArr2, int i2, int i3) {
        q5 q5Var = (q5) aVar.b0();
        return q5Var != null && N(q5Var, aVar, strArr, iArr, strArr2, i2, i3);
    }

    public static void a(int i2, int i3, String str) {
        int glCreateShader = GLES20.glCreateShader(i3);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            new StringBuilder(str.length() + String.valueOf(GLES20.glGetShaderInfoLog(glCreateShader)).length() + 10);
        }
        GLES20.glAttachShader(i2, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        h();
    }

    public static final float b(float f2, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return ((Float.intBitsToFloat((int) (j & 4294967295L)) - intBitsToFloat) * f2) + intBitsToFloat;
    }

    public static final void c(mne mne, coe coe, String str) {
        Logger logger = foe.i;
        logger.fine(coe.f + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + mne.c);
    }

    public static ArrayList d(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000).array());
        return arrayList;
    }

    public static byte[] e(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static final int f(Spanned spanned) {
        Object[] objArr;
        int hashCode = spanned.toString().hashCode();
        try {
            objArr = spanned.getSpans(0, spanned.length(), Object.class);
        } catch (Throwable unused) {
            objArr = null;
        }
        if (objArr == null) {
            return hashCode;
        }
        int length = (hashCode * 31) + objArr.length;
        for (Object obj : objArr) {
            if (obj != null) {
                if (obj != spanned) {
                    length = (length * 31) + obj.hashCode();
                }
                int spanStart = spanned.getSpanStart(obj);
                length = spanned.getSpanFlags(obj) + ((spanned.getSpanEnd(obj) + ((spanStart + (length * 31)) * 31)) * 31);
            }
        }
        return length;
    }

    public static void g(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        } else if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    public static void h() {
        int i2 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
            if (valueOf.length() != 0) {
                "glError: ".concat(valueOf);
            }
            i2 = glGetError;
        }
        if (i2 != 0) {
            String valueOf2 = String.valueOf(GLU.gluErrorString(i2));
            if (valueOf2.length() != 0) {
                "glError: ".concat(valueOf2);
            }
        }
    }

    public static void i(int i2, String str) {
        if (i2 < 0) {
            throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
        }
    }

    public static boolean j(Context context, String[] strArr) {
        for (String c2 : strArr) {
            if (z7.c(context, c2) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void k(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            StringBuilder j = wg0.j("fromIndex: ", i2, ", toIndex: ", i3, ", size: ");
            j.append(i4);
            throw new IndexOutOfBoundsException(j.toString());
        } else if (i2 > i3) {
            throw new IllegalArgumentException(rh4.h("fromIndex: ", i2, i3, " > toIndex: "));
        }
    }

    public static boolean l(Context context) {
        if (j(context, s())) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return j(context, new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        }
        return false;
    }

    public static long m(long j, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.intBitsToFloat((int) (j >> 32));
        }
        if ((i2 & 2) != 0) {
            f3 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return mr0.k(f2, f3);
    }

    public static final List n() {
        return y53.M(new y47(x47.c, new eqe(hca.e), Integer.valueOf(woc.f1)), new y47(x47.a, new eqe(hca.f), Integer.valueOf(woc.c0)), new y47(x47.b, new eqe(hca.k), Integer.valueOf(woc.N1)));
    }

    public static final boolean o(float f2, float f3, float f4) {
        return Math.abs(f2 - f3) < f4;
    }

    public static final String p(long j) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j <= ((long) -999500000) ? zr6.k(new StringBuilder(), (j - ((long) 500000000)) / ((long) 1000000000), " s ") : j <= ((long) -999500) ? zr6.k(new StringBuilder(), (j - ((long) 500000)) / ((long) 1000000), " ms") : j <= 0 ? zr6.k(new StringBuilder(), (j - ((long) 500)) / ((long) 1000), " µs") : j < ((long) 999500) ? zr6.k(new StringBuilder(), (j + ((long) 500)) / ((long) 1000), " µs") : j < ((long) 999500000) ? zr6.k(new StringBuilder(), (j + ((long) 500000)) / ((long) 1000000), " ms") : zr6.k(new StringBuilder(), (j + ((long) 500000000)) / ((long) 1000000000), " s ")}, 1));
    }

    public static long q(byte b2, byte b3) {
        byte b4;
        byte b5 = b2 & 255;
        byte b6 = b2 & 3;
        if (b6 != 0) {
            b4 = 2;
            if (!(b6 == 1 || b6 == 2)) {
                b4 = b3 & 63;
            }
        } else {
            b4 = 1;
        }
        int i2 = b5 >> 3;
        int i3 = i2 & 3;
        return ((long) b4) * ((long) (i2 >= 16 ? 2500 << i3 : i2 >= 12 ? 10000 << (i2 & 1) : i3 == 3 ? 60000 : 10000 << i3));
    }

    public static SharedPreferences r(Context context) {
        if (i == null) {
            i = context.getSharedPreferences("permissions_prefs", 0);
        }
        return i;
    }

    public static String[] s() {
        if (Build.VERSION.SDK_INT >= 33) {
            return h;
        }
        uuc.a.getClass();
        return tuc.c;
    }

    public static List t(Context context) {
        Bundle bundle;
        String string;
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!(activityInfo == null || (bundle = activityInfo.metaData) == null || (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) == null)) {
                    try {
                        au1.r(Class.forName(string, false, wmd.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
                        arrayList.add((Object) null);
                    } catch (Exception unused) {
                    }
                }
            }
            if (b == null) {
                b = arrayList;
            }
        }
        return b;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, vmd] */
    public static vmd u(Context context) {
        if (a == null) {
            try {
                a = (vmd) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, wmd.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            } catch (Exception unused) {
            }
            if (a == null) {
                a = new Object();
            }
        }
        return a;
    }

    public static final void v(lx3 lx3, Throwable th) {
        try {
            ox3 ox3 = (ox3) lx3.get(qx7.c);
            if (ox3 != null) {
                ox3.g(lx3, th);
            } else {
                CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(lx3, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                j47.e(runtimeException, th);
                th = runtimeException;
            }
            CoroutineExceptionHandlerImpl_commonKt.handleUncaughtCoroutineException(lx3, th);
        }
    }

    public static final boolean w(byte b2) {
        byte b3 = b2 & 255;
        return b3 <= Byte.MAX_VALUE || b3 >= 224;
    }

    public static final String x(List list, boolean z, boolean z2) {
        if (!z) {
            return String.valueOf(list.size());
        }
        return x53.n0(list, ",", "[", "]", new at7(z, z2), 24);
    }

    public static final String y(Map map, boolean z, boolean z2) {
        if (!z) {
            return String.valueOf(map.size());
        }
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            sb.append(String.valueOf(key));
            sb.append('=');
            sb.append(J(value, z, z2));
            sb.append(',');
        }
        sb.append('}');
        return sb.toString();
    }

    public static void z(Context context, String[] strArr, int[] iArr) {
        if (Arrays.equals(strArr, d)) {
            SharedPreferences.Editor edit = r(context).edit();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                edit.putBoolean(strArr[i2], iArr[i2] == 0);
            }
            edit.commit();
        }
    }

    public abstract void K();
}
