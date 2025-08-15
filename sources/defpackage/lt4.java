package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.text.Layout;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.http.util.LangUtils;

/* renamed from: lt4  reason: default package */
public final class lt4 extends fqd {
    public final /* synthetic */ int x0;
    public final Object y0;

    /* JADX WARNING: type inference failed for: r1v8, types: [fc3, java.lang.Object] */
    public lt4(List list) {
        this.x0 = 0;
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        byte b = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        byte b2 = (bArr[3] & 255) | ((bArr[2] & 255) << 8);
        ? obj = new Object();
        Paint paint = new Paint();
        obj.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        obj.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        obj.c = new Canvas();
        obj.o = new ot4(719, 575, 0, 719, 0, 575);
        obj.X = new mt4(0, new int[]{0, -1, -16777216, -8421505}, fc3.j(), fc3.k());
        obj.Y = new yt4(b, b2, 0);
        this.y0 = obj;
    }

    public final abe a(int i, byte[] bArr, boolean z) {
        rxd rxd;
        yt4 yt4;
        rxd rxd2;
        List list;
        char c;
        char c2;
        int i2;
        ot4 ot4;
        ArrayList arrayList;
        int i3;
        yt4 yt42;
        Paint paint;
        ut4 ut4;
        int i4;
        int i5;
        int i6;
        int i7;
        xz3 xz3;
        int i8 = i;
        byte[] bArr2 = bArr;
        int i9 = 0;
        Object obj = this.y0;
        int i10 = 8;
        switch (this.x0) {
            case 0:
                fc3 fc3 = (fc3) obj;
                if (z) {
                    yt4 yt43 = (yt4) fc3.Y;
                    yt43.c.clear();
                    yt43.d.clear();
                    yt43.e.clear();
                    yt43.f.clear();
                    yt43.g.clear();
                    yt43.h = null;
                    yt43.i = null;
                }
                fc3.getClass();
                s02 s02 = new s02(bArr2, i8, 1, (byte) 0);
                while (true) {
                    int b = s02.b();
                    yt4 = (yt4) fc3.Y;
                    if (b < 48 || s02.i(i10) != 15) {
                        rt4 rt4 = (rt4) yt4.i;
                    } else {
                        int i11 = s02.i(i10);
                        int i12 = 16;
                        int i13 = s02.i(16);
                        int i14 = s02.i(16);
                        int f = s02.f() + i14;
                        if (i14 * 8 > s02.b()) {
                            s02.t(s02.b());
                        } else {
                            switch (i11) {
                                case 16:
                                    if (i13 == yt4.a) {
                                        rt4 rt42 = (rt4) yt4.i;
                                        int i15 = 8;
                                        s02.i(8);
                                        int i16 = s02.i(4);
                                        int i17 = s02.i(2);
                                        s02.t(2);
                                        int i18 = i14 - 2;
                                        SparseArray sparseArray = new SparseArray();
                                        while (i18 > 0) {
                                            int i19 = s02.i(i15);
                                            s02.t(i15);
                                            i18 -= 6;
                                            sparseArray.put(i19, new st4(s02.i(16), s02.i(16)));
                                            i15 = 8;
                                        }
                                        rt4 rt43 = new rt4(i16, i17, sparseArray);
                                        if (i17 == 0) {
                                            if (!(rt42 == null || rt42.a == i16)) {
                                                yt4.i = rt43;
                                                break;
                                            }
                                        } else {
                                            yt4.i = rt43;
                                            yt4.c.clear();
                                            yt4.d.clear();
                                            yt4.e.clear();
                                            break;
                                        }
                                    }
                                    break;
                                case LangUtils.HASH_SEED /*17*/:
                                    rt4 rt44 = (rt4) yt4.i;
                                    if (i13 == yt4.a && rt44 != null) {
                                        int i20 = s02.i(i10);
                                        s02.t(4);
                                        boolean h = s02.h();
                                        s02.t(3);
                                        int i21 = s02.i(16);
                                        int i22 = s02.i(16);
                                        s02.i(3);
                                        int i23 = s02.i(3);
                                        s02.t(2);
                                        int i24 = s02.i(i10);
                                        int i25 = s02.i(i10);
                                        int i26 = s02.i(4);
                                        int i27 = s02.i(2);
                                        s02.t(2);
                                        int i28 = i14 - 10;
                                        SparseArray sparseArray2 = new SparseArray();
                                        while (i28 > 0) {
                                            int i29 = s02.i(i12);
                                            int i30 = s02.i(2);
                                            s02.i(2);
                                            int i31 = s02.i(12);
                                            s02.t(4);
                                            int i32 = s02.i(12);
                                            int i33 = i28 - 6;
                                            if (i30 == 1 || i30 == 2) {
                                                s02.i(8);
                                                s02.i(8);
                                                i28 -= 8;
                                            } else {
                                                i28 = i33;
                                            }
                                            sparseArray2.put(i29, new wt4(i31, i32));
                                            i12 = 16;
                                        }
                                        ut4 ut42 = new ut4(i20, h, i21, i22, i23, i24, i25, i26, i27, sparseArray2);
                                        SparseArray sparseArray3 = yt4.c;
                                        if (rt44.b == 0 && (ut4 = (ut4) sparseArray3.get(i20)) != null) {
                                            int i34 = 0;
                                            while (true) {
                                                SparseArray sparseArray4 = ut4.j;
                                                if (i34 < sparseArray4.size()) {
                                                    ut42.j.put(sparseArray4.keyAt(i34), (wt4) sparseArray4.valueAt(i34));
                                                    i34++;
                                                }
                                            }
                                        }
                                        sparseArray3.put(ut42.a, ut42);
                                        break;
                                    }
                                case 18:
                                    if (i13 != yt4.a) {
                                        if (i13 == yt4.b) {
                                            mt4 n = fc3.n(s02, i14);
                                            yt4.f.put(n.a, n);
                                            break;
                                        }
                                    } else {
                                        mt4 n2 = fc3.n(s02, i14);
                                        yt4.d.put(n2.a, n2);
                                        break;
                                    }
                                    break;
                                case 19:
                                    if (i13 != yt4.a) {
                                        if (i13 == yt4.b) {
                                            pt4 o = fc3.o(s02);
                                            yt4.g.put(o.a, o);
                                            break;
                                        }
                                    } else {
                                        pt4 o2 = fc3.o(s02);
                                        yt4.e.put(o2.a, o2);
                                        break;
                                    }
                                    break;
                                case 20:
                                    if (i13 == yt4.a) {
                                        s02.t(4);
                                        boolean h2 = s02.h();
                                        s02.t(3);
                                        int i35 = s02.i(16);
                                        int i36 = s02.i(16);
                                        if (h2) {
                                            int i37 = s02.i(16);
                                            int i38 = s02.i(16);
                                            int i39 = s02.i(16);
                                            i7 = i37;
                                            i4 = s02.i(16);
                                            i6 = i38;
                                            i5 = i39;
                                        } else {
                                            i7 = i9;
                                            i5 = i7;
                                            i6 = i35;
                                            i4 = i36;
                                        }
                                        yt4.h = new ot4(i35, i36, i7, i6, i5, i4);
                                        break;
                                    }
                                    break;
                            }
                            s02.u(f - s02.f());
                        }
                        i9 = 0;
                        i10 = 8;
                    }
                }
                rt4 rt45 = (rt4) yt4.i;
                if (rt45 == null) {
                    list = Collections.emptyList();
                    rxd2 = rxd;
                } else {
                    ot4 ot42 = (ot4) yt4.h;
                    if (ot42 == null) {
                        ot42 = (ot4) fc3.o;
                    }
                    Bitmap bitmap = (Bitmap) fc3.Z;
                    Canvas canvas = (Canvas) fc3.c;
                    if (!(bitmap != null && ot42.a + 1 == bitmap.getWidth() && ot42.b + 1 == ((Bitmap) fc3.Z).getHeight())) {
                        Bitmap createBitmap = Bitmap.createBitmap(ot42.a + 1, ot42.b + 1, Bitmap.Config.ARGB_8888);
                        fc3.Z = createBitmap;
                        canvas.setBitmap(createBitmap);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int i40 = 0;
                    while (true) {
                        SparseArray sparseArray5 = rt45.c;
                        if (i40 < sparseArray5.size()) {
                            canvas.save();
                            st4 st4 = (st4) sparseArray5.valueAt(i40);
                            ut4 ut43 = (ut4) yt4.c.get(sparseArray5.keyAt(i40));
                            int i41 = st4.a + ot42.c;
                            int i42 = st4.b + ot42.e;
                            int min = Math.min(ut43.c + i41, ot42.d);
                            int i43 = ut43.d;
                            int i44 = i42 + i43;
                            canvas.clipRect(i41, i42, min, Math.min(i44, ot42.f));
                            SparseArray sparseArray6 = yt4.d;
                            int i45 = ut43.f;
                            mt4 mt4 = (mt4) sparseArray6.get(i45);
                            if (mt4 == null && (mt4 = (mt4) yt4.f.get(i45)) == null) {
                                mt4 = (mt4) fc3.X;
                            }
                            int i46 = 0;
                            while (true) {
                                SparseArray sparseArray7 = ut43.j;
                                rt4 rt46 = rt45;
                                if (i46 < sparseArray7.size()) {
                                    int keyAt = sparseArray7.keyAt(i46);
                                    wt4 wt4 = (wt4) sparseArray7.valueAt(i46);
                                    rxd rxd3 = rxd;
                                    pt4 pt4 = (pt4) yt4.e.get(keyAt);
                                    if (pt4 == null) {
                                        pt4 = (pt4) yt4.g.get(keyAt);
                                    }
                                    if (pt4 != null) {
                                        if (pt4.b) {
                                            yt42 = yt4;
                                            paint = null;
                                        } else {
                                            paint = (Paint) fc3.a;
                                            yt42 = yt4;
                                        }
                                        int i47 = wt4.a + i41;
                                        int i48 = wt4.b + i42;
                                        i3 = i40;
                                        int i49 = ut43.e;
                                        arrayList = arrayList2;
                                        ot4 = ot42;
                                        int[] iArr = i49 == 3 ? mt4.d : i49 == 2 ? mt4.c : mt4.b;
                                        int i50 = i49;
                                        int i51 = i47;
                                        Paint paint2 = paint;
                                        Canvas canvas2 = canvas;
                                        fc3.m(pt4.c, iArr, i50, i51, i48, paint2, canvas2);
                                        fc3.m(pt4.d, iArr, i50, i51, i48 + 1, paint2, canvas2);
                                    } else {
                                        ot4 = ot42;
                                        arrayList = arrayList2;
                                        i3 = i40;
                                        yt42 = yt4;
                                    }
                                    i46++;
                                    rt45 = rt46;
                                    yt4 = yt42;
                                    rxd = rxd3;
                                    i40 = i3;
                                    arrayList2 = arrayList;
                                    ot42 = ot4;
                                } else {
                                    rxd rxd4 = rxd;
                                    ot4 ot43 = ot42;
                                    ArrayList arrayList3 = arrayList2;
                                    int i52 = i40;
                                    yt4 yt44 = yt4;
                                    boolean z2 = ut43.b;
                                    int i53 = ut43.c;
                                    if (z2) {
                                        int i54 = ut43.e;
                                        c2 = 3;
                                        if (i54 == 3) {
                                            i2 = mt4.d[ut43.g];
                                            c = 2;
                                        } else {
                                            c = 2;
                                            i2 = i54 == 2 ? mt4.c[ut43.h] : mt4.b[ut43.i];
                                        }
                                        Paint paint3 = (Paint) fc3.b;
                                        paint3.setColor(i2);
                                        canvas.drawRect((float) i41, (float) i42, (float) (i41 + i53), (float) i44, paint3);
                                    } else {
                                        c2 = 3;
                                        c = 2;
                                    }
                                    Bitmap createBitmap2 = Bitmap.createBitmap((Bitmap) fc3.Z, i41, i42, i53, i43);
                                    ot4 ot44 = ot43;
                                    float f2 = (float) ot44.a;
                                    float f3 = (float) ot44.b;
                                    ArrayList arrayList4 = arrayList3;
                                    arrayList4.add(new xz3((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, createBitmap2, ((float) i42) / f3, 0, 0, ((float) i41) / f2, 0, Integer.MIN_VALUE, -3.4028235E38f, ((float) i53) / f2, ((float) i43) / f3, false, -16777216, Integer.MIN_VALUE, 0.0f));
                                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                                    canvas.restore();
                                    i40 = i52 + 1;
                                    yt4 = yt44;
                                    char c3 = c2;
                                    ot42 = ot44;
                                    char c4 = c;
                                    rxd = rxd4;
                                    arrayList2 = arrayList4;
                                    rt45 = rt46;
                                }
                            }
                        } else {
                            rxd2 = rxd;
                            list = Collections.unmodifiableList(arrayList2);
                        }
                    }
                }
                return new rxd(14, list);
            default:
                yaf yaf = (yaf) obj;
                yaf.F(i8, bArr2);
                ArrayList arrayList5 = new ArrayList();
                while (yaf.c() > 0) {
                    if (yaf.c() >= 8) {
                        int h3 = yaf.h();
                        if (yaf.h() == 1987343459) {
                            int i55 = h3 - 8;
                            CharSequence charSequence = null;
                            vz3 vz3 = null;
                            while (i55 > 0) {
                                if (i55 >= 8) {
                                    int h4 = yaf.h();
                                    int h5 = yaf.h();
                                    int i56 = h4 - 8;
                                    byte[] bArr3 = yaf.a;
                                    int i57 = yaf.b;
                                    int i58 = maf.a;
                                    String str = new String(bArr3, i57, i56, b52.c);
                                    yaf.I(i56);
                                    i55 = (i55 - 8) - i56;
                                    if (h5 == 1937011815) {
                                        o4g o4g = new o4g();
                                        p4g.e(str, o4g);
                                        vz3 = o4g.a();
                                    } else if (h5 == 1885436268) {
                                        charSequence = p4g.f((String) null, str.trim(), Collections.emptyList());
                                    }
                                } else {
                                    throw new Exception("Incomplete vtt cue box header found.");
                                }
                            }
                            if (charSequence == null) {
                                charSequence = "";
                            }
                            if (vz3 != null) {
                                vz3.a = charSequence;
                                xz3 = vz3.a();
                            } else {
                                Pattern pattern = p4g.a;
                                o4g o4g2 = new o4g();
                                o4g2.c = charSequence;
                                xz3 = o4g2.a().a();
                            }
                            arrayList5.add(xz3);
                        } else {
                            yaf.I(h3 - 8);
                        }
                    } else {
                        throw new Exception("Incomplete Mp4Webvtt Top Level box header found.");
                    }
                }
                return new c12(arrayList5);
        }
    }

    public lt4() {
        this.x0 = 1;
        this.y0 = new yaf(3, false);
    }
}
