package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: na9  reason: default package */
public final class na9 extends t68 {
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final khe i;

    public na9(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76) {
        super(je76, je73);
        this.e = je7;
        this.f = je72;
        this.g = je74;
        this.h = je75;
        this.i = new khe(new z30(18, je7));
    }

    public final qw8 a() {
        List list = (List) ((AtomicReference) this.c).get();
        n07 n07 = new n07();
        int size = list.size();
        m07[] m07Arr = new m07[size];
        for (int i2 = 0; i2 < size; i2++) {
            ma9 ma9 = (ma9) list.get(i2);
            m07 m07 = new m07();
            try {
                m07.a = ma9.a;
                m07.b = ma9.b.toString();
                CharSequence charSequence = ma9.c;
                String str = null;
                String obj = charSequence != null ? charSequence.toString() : null;
                String str2 = "";
                if (obj == null) {
                    obj = str2;
                }
                m07.c = obj;
                m07.d = ma9.d;
                Object[] objArr = ma9.e;
                if (objArr != null) {
                    m07.q = (q07[]) objArr;
                }
                String str3 = ma9.g;
                if (str3 == null) {
                    str3 = str2;
                }
                m07.e = str3;
                m07.f = ma9.h;
                m07.g = ma9.i;
                m07.h = ma9.j;
                m07.i = ma9.k;
                m07.j = ma9.l;
                m07.k = ma9.m;
                m07.l = ma9.n;
                Long l = ma9.o;
                m07.m = l != null ? l.longValue() : -1;
                String str4 = ma9.r;
                if (str4 == null) {
                    str4 = str2;
                }
                m07.n = str4;
                byte[] bArr = ma9.s;
                if (bArr == null) {
                    bArr = nd7.g;
                }
                m07.o = bArr;
                CharSequence charSequence2 = ma9.f;
                if (charSequence2 != null) {
                    str = charSequence2.toString();
                }
                if (str != null) {
                    str2 = str;
                }
                m07.p = str2;
                m07.r = ma9.p;
                m07.s = ma9.q.toString();
                m07.t = ma9.u;
            } catch (Throwable th) {
                hm9.p(ma9.class.getName(), "toProto error", th);
            }
            m07Arr[i2] = m07;
        }
        n07.a = m07Arr;
        return n07;
    }

    public final zy b() {
        return (zy) this.i.getValue();
    }

    public final Boolean e(byte[] bArr) {
        Object obj;
        o43 h2;
        File file = new File(((kk5) ((zi5) this.e.getValue())).c(), "chats_v1");
        try {
            obj = Boolean.valueOf(file.exists() ? file.delete() : false);
        } catch (Throwable th) {
            obj = new njc(th);
        }
        Object obj2 = Boolean.FALSE;
        if (obj instanceof njc) {
            obj = obj2;
        }
        if (((Boolean) obj).booleanValue()) {
            String c = c();
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.Y, c, "prev file " + file + " deleted!", (Throwable) null);
            }
        }
        long nanoTime = System.nanoTime();
        String c2 = c();
        ir6 ir62 = hm9.m;
        if (ir62 != null && ir62.c()) {
            ir62.d(us7.Y, c2, "loadData start", (Throwable) null);
        }
        lq8 lq8 = ((iv6) this.f.getValue()).f;
        try {
            n07 n07 = (n07) qw8.mergeFrom(new n07(), bArr);
            int length = n07.a.length;
            ArrayList arrayList = new ArrayList(length);
            Object[] objArr = length == 0 ? ema.b : new Object[length];
            m07[] m07Arr = n07.a;
            int i2 = 0;
            int i3 = 0;
            while (i3 < m07Arr.length) {
                int i4 = i3 + 1;
                ma9 a = np8.a(m07Arr[i3], new wz7(10, this));
                arrayList.add(a);
                String str = a.r;
                if (str == null) {
                    i3 = i4;
                } else {
                    vc0 vc0 = h5a.a;
                    wv6 b = h5a.b(str, j5a.a, 4);
                    int i5 = i2 + 1;
                    if (objArr.length < i5) {
                        objArr = Arrays.copyOf(objArr, Math.max(i5, (objArr.length * 3) / 2));
                    }
                    objArr[i2] = b;
                    do0 d = ((iv6) this.f.getValue()).d(b, this);
                    byte[] bArr2 = a.s;
                    if (bArr2 != null) {
                        ((io0) this.h.getValue()).getClass();
                        Bitmap a2 = io0.a(bArr2);
                        if (a2 != null) {
                            if (!(qo0.d(a2) == 0 || (h2 = lq8.h(d, o43.o0(CloseableStaticBitmap.of(a2, (pic) ((m5b) ((je7) this.b).getValue()).a(), (pqb) hx6.d, 0)))) == null)) {
                                h2.close();
                            }
                        }
                    }
                    i3 = i4;
                    i2 = i5;
                }
            }
            ((AtomicReference) this.c).set(arrayList);
            for (int i6 = 0; i6 < i2; i6++) {
                ((iv6) this.f.getValue()).f((wv6) objArr[i6], this);
            }
            String c3 = c();
            ir6 ir63 = hm9.m;
            if (ir63 != null && ir63.c()) {
                us7 us7 = us7.Y;
                int i7 = ft4.o;
                ir63.d(us7, c3, "loadData finish ".concat(ft4.j(z7.S(System.nanoTime() - nanoTime, kt4.NANOSECONDS))), (Throwable) null);
            }
            return Boolean.TRUE;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new NoSuchElementException(e2.getMessage());
        } catch (InterruptedException e3) {
            throw e3;
        } catch (Throwable th2) {
            String c4 = c();
            ir6 ir64 = hm9.m;
            if (ir64 != null && ir64.c()) {
                us7 us72 = us7.Y;
                int i8 = ft4.o;
                ir64.d(us72, c4, "loadData finish ".concat(ft4.j(z7.S(System.nanoTime() - nanoTime, kt4.NANOSECONDS))), (Throwable) null);
            }
            throw th2;
        }
    }
}
