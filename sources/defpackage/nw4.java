package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.text.TextPaint;
import android.util.LogPrinter;
import android.util.Size;
import androidx.camera.core.ProcessingException;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.inject.Provider;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: nw4  reason: default package */
public final class nw4 implements px7, Provider, abe {
    public static final lh4 X = new Object();
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ nw4(int i) {
        this.a = i;
    }

    public static Object[] j(Object[] objArr, int[] iArr) {
        int length = objArr.length;
        Class<?> componentType = objArr.getClass().getComponentType();
        LogPrinter logPrinter = hg6.w0;
        int i = -1;
        for (int max : iArr) {
            i = Math.max(i, max);
        }
        Object[] objArr2 = (Object[]) Array.newInstance(componentType, i + 1);
        for (int i2 = 0; i2 < length; i2++) {
            objArr2[iArr[i2]] = objArr[i2];
        }
        return objArr2;
    }

    public void a(int i, String str) {
        e(String.valueOf(i), str);
    }

    public void b(String str, List list) {
        bc7[] bc7Arr = eya.F0;
        ((eya) this.b).r().i = null;
        boolean f = tpa.f(str, (String) this.c);
        ry1 ry1 = (ry1) this.o;
        if (f) {
            ry1.resumeWith(list);
            return;
        }
        CancellationException cancellationException = new CancellationException("Nothing found");
        cancellationException.initCause((Throwable) null);
        ry1.resumeWith(new njc(cancellationException));
    }

    public void d(String str, boolean z) {
        e(String.valueOf(z), str);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [jo7, java.lang.Object] */
    public void e(Object obj, String str) {
        ? obj2 = new Object();
        ((jo7) this.o).c = obj2;
        this.o = obj2;
        obj2.b = obj;
        obj2.a = str;
    }

    public ab0 f() {
        String str = ((mc0) this.b) == null ? " videoSpec" : "";
        if (((o90) this.c) == null) {
            str = str.concat(" audioSpec");
        }
        if (((Integer) this.o) == null) {
            str = au1.g(str, " outputFormat");
        }
        if (str.isEmpty()) {
            return new ab0((mc0) this.b, (o90) this.c, ((Integer) this.o).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public int g(long j) {
        long[] jArr = (long[]) this.o;
        int b2 = maf.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    public Object get() {
        return new puc(((Integer) ((Provider) this.o).get()).intValue(), (Context) ((Provider) this.b).get(), (String) ((Provider) this.c).get());
    }

    public void h(Collection collection) {
        gx0 gx0;
        Iterator it;
        HashMap hashMap = new HashMap(collection.size());
        Iterator it2 = collection.iterator();
        long j = 0;
        while (true) {
            boolean hasNext = it2.hasNext();
            gx0 = gx0.a;
            if (!hasNext) {
                break;
            }
            gx0 gx02 = (gx0) it2.next();
            Iterator it3 = ((List) this.b).iterator();
            long j2 = 0;
            long j3 = 0;
            while (it3.hasNext()) {
                pw0 pw0 = (pw0) it3.next();
                if (gx02 != gx0) {
                    try {
                        if (pw0.d != gx02) {
                        }
                    } catch (Throwable unused) {
                    }
                }
                it3.remove();
                if (pw0.a.delete()) {
                    j2++;
                    j3 += pw0.b;
                    hm9.m("nw4", "deleteEntries: delete=%s", pw0);
                } else {
                    hm9.q("nw4", "deleteEntries: failed to delete=%s", pw0);
                }
            }
            hm9.m("nw4", "deleteEntries: cacheType=%s removed: files=%d, bytes=%d", gx02, Long.valueOf(j2), Long.valueOf(j3));
            j += j3;
            hashMap.put(gx02, Long.valueOf(j3));
        }
        je7 je7 = ((og5) this.c).a;
        ((ad) je7.getValue()).f("ACTION_CACHE_CLEARED");
        Set entrySet = hashMap.entrySet();
        Iterator it4 = entrySet.iterator();
        long j4 = 0;
        while (it4.hasNext()) {
            Map.Entry entry = (Map.Entry) it4.next();
            gx0 gx03 = (gx0) entry.getKey();
            if (gx03 == gx0.b || gx03 == gx0) {
                iv6 o2 = s36.o();
                it = it4;
                ig5 ig5 = new ig5(24);
                o2.f.n(ig5);
                o2.g.n(ig5);
                bl4 bl4 = (bl4) o2.c.get();
                bl4.a().a();
                ((du0) bl4.d.getValue()).a();
                for (Map.Entry value : ((dx6) bl4.f.getValue()).entrySet()) {
                    ((du0) value.getValue()).a();
                }
            } else {
                it = it4;
            }
            long longValue = ((Long) entry.getValue()).longValue();
            j4 += longValue;
            File a2 = ((pg5) this.o).a(gx03);
            ((ad) je7.getValue()).e(longValue, "ACTION_CACHE_CLEARED_SIZE", a2 != null ? a2.getName() : gx03.name());
            it4 = it;
        }
        if (cx0.l.equals(hashMap.keySet()) || (entrySet.size() == 1 && ((Map.Entry) entrySet.iterator().next()).getKey() == gx0)) {
            ((ad) je7.getValue()).e(j4, "ACTION_CACHE_CLEARED_SIZE", "ALL");
        }
        hm9.m("nw4", "clearCacheTypes: removed %d bytes", Long.valueOf(j));
    }

    public long i(int i) {
        boolean z = false;
        np8.d(i >= 0);
        long[] jArr = (long[]) this.o;
        if (i < jArr.length) {
            z = true;
        }
        np8.d(z);
        return jArr[i];
    }

    public void k(iee iee, Map.Entry entry) {
        iee iee2 = (iee) entry.getValue();
        yb0 yb0 = new yb0(iee.g.a, ((cb0) entry.getKey()).d, iee.c ? (ax1) this.c : null, ((cb0) entry.getKey()).f, ((cb0) entry.getKey()).g);
        int i = ((cb0) entry.getKey()).c;
        iee2.getClass();
        kq0.e();
        iee2.b();
        c54.p("Consumer can only be linked once.", !iee2.j);
        iee2.j = true;
        hee hee = iee2.l;
        kq0.a(kq0.K(hee.c(), new gee(iee2, hee, i, yb0, (yb0) null), ju0.D()), new l7b(this, 9, iee2), ju0.D());
    }

    public long l(gx0 gx0) {
        long j = 0;
        for (pw0 pw0 : (List) this.b) {
            boolean z = false;
            try {
                if (gx0 == gx0.a || pw0.d == gx0) {
                    z = true;
                }
            } catch (Throwable unused) {
            }
            if (z) {
                j += pw0.b;
            }
        }
        return j;
    }

    public boolean m(int i) {
        ChatsListWidget chatsListWidget = (ChatsListWidget) this.b;
        return i == chatsListWidget.A0.j() + chatsListWidget.B0.j() && chatsListWidget.C0.j() > 0;
    }

    public void n() {
        ((lee) this.b).release();
        kq0.H(new u3c(23, this));
    }

    public Bitmap o(nx4 nx4) {
        Bitmap bitmap = (Bitmap) ((bo0) ((adb) this.b).b).c(nx4);
        if (bitmap != null) {
            return bitmap;
        }
        int i = nx4.a;
        Bitmap bitmap2 = ((Bitmap[]) ((adb) this.b).a)[i];
        boolean z = true;
        if (bitmap2 != null) {
            iy4 iy4 = (iy4) this.c;
            int G = i == 24 ? tu0.G(iy4.a() * ((float) 1)) : tu0.G(iy4.a() * ((float) 13));
            boolean z2 = bitmap2.getWidth() == G;
            if (!z2) {
                String name = iy4.class.getName();
                StringBuilder j = wg0.j("Sprite is not width enough - index: ", i, "; width: ", bitmap2.getWidth(), "; requiredWidth: ");
                j.append(G);
                hm9.p(name, "Sprite is not width enough, may be a problem of extracting emoji", new RuntimeException(j.toString()));
            }
            if (z2) {
                iy4 iy42 = (iy4) this.c;
                int G2 = tu0.G(((Number) iy42.b.getValue()).floatValue() * ((float) nx4.b));
                int G3 = tu0.G(((Number) iy42.b.getValue()).floatValue() * ((float) nx4.c));
                int G4 = tu0.G(iy42.a());
                Rect rect = iy4.c;
                rect.left = 0;
                rect.top = 0;
                rect.right = G4;
                rect.bottom = G4;
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, ote.e(G2, 0, bitmap2.getWidth() - G4), ote.e(G3, 0, bitmap2.getHeight() - G4), G4, G4);
                ((bo0) ((adb) this.b).b).d(new nx4(nx4.a, nx4.b, nx4.c), createBitmap);
                return createBitmap;
            }
        }
        String name2 = nw4.class.getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            if (bitmap2 != null) {
                z = false;
            }
            ir6.d(us7, name2, ey8.j("Cannot resolve SpriteBitmap. It's null - ", z), (Throwable) null);
        }
        gy4 gy4 = (gy4) this.o;
        gy4.g.computeIfAbsent(Integer.valueOf(i), new di(9, new m8(i, 2, gy4)));
        return null;
    }

    public List p(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.b;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = (long[]) this.c;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                g4g g4g = (g4g) list.get(i);
                xz3 xz3 = g4g.a;
                if (xz3.X == -3.4028235E38f) {
                    arrayList2.add(g4g);
                } else {
                    arrayList.add(xz3);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new ye4(28));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            vz3 a2 = ((g4g) arrayList2.get(i3)).a.a();
            a2.e = (float) (-1 - i3);
            a2.f = 1;
            arrayList.add(a2.a());
        }
        return arrayList;
    }

    public void q(TextPaint textPaint) {
        kqe kqe = i4f.r;
        EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.o;
        kqe.a(textPaint, endlessRecyclerView2.getResources().getDisplayMetrics(), du4.b);
        textPaint.setColor(qp4.u0.j(endlessRecyclerView2).getText().i);
    }

    public xs4 r(ac0 ac0) {
        iee iee;
        Rect rect;
        ac0 ac02 = ac0;
        kq0.e();
        this.o = new HashMap();
        Iterator it = ac02.b.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            iee = ac02.a;
            if (hasNext) {
                cb0 cb0 = (cb0) it.next();
                xs4 xs4 = (xs4) this.o;
                Rect rect2 = cb0.d;
                Matrix matrix = new Matrix(iee.b);
                RectF rectF = new RectF(rect2);
                RectF rectF2 = e1f.a;
                float f = (float) 0;
                Size size = cb0.e;
                RectF rectF3 = new RectF(f, f, (float) size.getWidth(), (float) size.getHeight());
                int i = cb0.f;
                boolean z = cb0.g;
                Matrix a2 = e1f.a(rectF, rectF3, i, z);
                matrix.postConcat(a2);
                c54.k(e1f.d(e1f.g(e1f.e(rect2), i), false, size));
                if (cb0.h) {
                    Rect rect3 = cb0.d;
                    Rect rect4 = iee.d;
                    boolean contains = rect3.contains(rect4);
                    c54.j("Output crop rect " + rect3 + " must contain input crop rect " + rect4, contains);
                    rect = new Rect();
                    RectF rectF4 = new RectF(rect4);
                    a2.mapRect(rectF4);
                    rectF4.round(rect);
                } else {
                    rect = e1f.h(size);
                }
                x3c a3 = iee.g.a();
                a3.b = size;
                vb0 c2 = a3.c();
                int i2 = iee.i - i;
                boolean z2 = iee.e != z;
                iee iee2 = r8;
                iee iee3 = new iee(cb0.b, cb0.c, c2, matrix, false, rect, i2, -1, z2);
                xs4.put(cb0, iee2);
            } else {
                try {
                    break;
                } catch (ProcessingException unused) {
                }
            }
        }
        ((lee) this.b).a(iee.d((ax1) this.c, true));
        for (Map.Entry entry : ((xs4) this.o).entrySet()) {
            k(iee, entry);
            ((iee) entry.getValue()).a(new ewc(this, iee, entry, 6));
        }
        cy1 cy1 = new cy1(7, (xs4) this.o);
        iee.getClass();
        iee.o.add(cy1);
        return (xs4) this.o;
    }

    public String toString() {
        switch (this.a) {
            case 9:
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.b);
                sb.append('{');
                jo7 jo7 = (jo7) ((jo7) this.c).c;
                String str = "";
                while (jo7 != null) {
                    Object obj = jo7.b;
                    sb.append(str);
                    String str2 = (String) jo7.a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    jo7 = (jo7) jo7.c;
                    str = ", ";
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public int u() {
        return ((long[]) this.o).length;
    }

    public /* synthetic */ nw4(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public nw4(sy4 sy4) {
        this.a = 11;
        oq9 oq9 = s5c.a;
        pq9 pq9 = wmd.c;
        this.b = sy4;
        this.c = oq9;
        this.o = pq9;
    }

    public nw4(List list, og5 og5, pg5 pg5) {
        this.a = 3;
        this.b = list;
        this.c = og5;
        this.o = pg5;
        System.currentTimeMillis();
    }

    public nw4(ArrayList arrayList) {
        this.a = 14;
        this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        this.c = new long[(arrayList.size() * 2)];
        for (int i = 0; i < arrayList.size(); i++) {
            g4g g4g = (g4g) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = (long[]) this.c;
            jArr[i2] = g4g.b;
            jArr[i2 + 1] = g4g.c;
        }
        long[] jArr2 = (long[]) this.c;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.o = copyOf;
        Arrays.sort(copyOf);
    }

    public nw4(int i, String str, ArrayList arrayList, byte[] bArr) {
        List list;
        this.a = 13;
        this.b = str;
        if (arrayList == null) {
            list = Collections.emptyList();
        } else {
            list = Collections.unmodifiableList(arrayList);
        }
        this.c = list;
        this.o = bArr;
    }

    public nw4(ax1 ax1, lee lee) {
        this.a = 12;
        this.c = ax1;
        this.b = lee;
    }

    public nw4(String str) {
        this.a = 9;
        Object obj = new Object();
        this.c = obj;
        this.o = obj;
        this.b = str;
    }

    public nw4(d84 d84) {
        this.a = 5;
        this.o = d84;
        this.b = new Handler();
        this.c = new b84(0, this);
    }

    public nw4(Object[] objArr, Object[] objArr2) {
        this.a = 7;
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap hashMap = new HashMap();
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Integer num = (Integer) hashMap.get(obj);
            if (num == null) {
                num = Integer.valueOf(hashMap.size());
                hashMap.put(obj, num);
            }
            iArr[i] = num.intValue();
        }
        this.b = iArr;
        this.c = j(objArr, iArr);
        this.o = j(objArr2, iArr);
    }
}
