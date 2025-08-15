package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* renamed from: mic  reason: default package */
public final class mic {
    public static final double h = Math.sqrt(2.3703703703703702d);
    public final Size a;
    public final Rational b;
    public final Rational c;
    public final Set d;
    public final jo7 e;
    public final yw1 f;
    public final HashMap g = new HashMap();

    public mic(ax1 ax1, HashSet hashSet) {
        Size e2 = e1f.e(ax1.g().e());
        yw1 p = ax1.p();
        jo7 jo7 = new jo7(p, e2);
        this.a = e2;
        Rational rational = ((double) e2.getWidth()) / ((double) e2.getHeight()) > h ? lt.c : lt.a;
        e2.toString();
        Objects.toString(rational);
        this.b = rational;
        Rational rational2 = lt.a;
        if (rational.equals(rational2)) {
            rational2 = lt.c;
        } else if (!rational.equals(lt.c)) {
            throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
        }
        this.c = rational2;
        this.f = p;
        this.d = hashSet;
        this.e = jo7;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational g2 = g(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational g3 = g(size);
        if (g2.floatValue() == g3.floatValue()) {
            rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
        } else {
            if (g2.floatValue() > g3.floatValue()) {
                float f2 = (float) width;
                float floatValue = f2 / g2.floatValue();
                float f3 = (((float) height) - floatValue) / 2.0f;
                rectF2 = new RectF(0.0f, f3, f2, floatValue + f3);
            } else {
                float f4 = (float) height;
                float floatValue2 = g2.floatValue() * f4;
                float f5 = (((float) width) - floatValue2) / 2.0f;
                rectF2 = new RectF(f5, 0.0f, floatValue2 + f5, f4);
            }
            rectF = rectF2;
        }
        Rect rect = new Rect();
        rectF.round(rect);
        return rect;
    }

    public static boolean c(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static Rational g(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final List b(o9f o9f) {
        Rational rational;
        if (this.d.contains(o9f)) {
            HashMap hashMap = this.g;
            if (hashMap.containsKey(o9f)) {
                List list = (List) hashMap.get(o9f);
                Objects.requireNonNull(list);
                return list;
            }
            ArrayList<Size> k = this.e.k(o9f);
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (Size size : k) {
                Iterator it = hashMap2.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        rational = null;
                        break;
                    }
                    rational = (Rational) it.next();
                    Rational rational2 = lt.a;
                    if (lt.a(size, rational, msd.c)) {
                        break;
                    }
                }
                if (rational != null) {
                    Size size2 = (Size) hashMap2.get(rational);
                    Objects.requireNonNull(size2);
                    if (size.getHeight() <= size2.getHeight() && size.getWidth() <= size2.getWidth()) {
                        if (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight()) {
                        }
                    }
                } else {
                    rational = g(size);
                }
                arrayList.add(size);
                hashMap2.put(rational, size);
            }
            hashMap.put(o9f, arrayList);
            return arrayList;
        }
        throw new IllegalArgumentException("Invalid child config: " + o9f);
    }

    public final boolean d(Rational rational, Size size) {
        int i;
        Rational rational2 = this.b;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = lt.a;
        Size size2 = msd.c;
        if (lt.a(size, rational, size2)) {
            return false;
        }
        float floatValue = rational2.floatValue();
        float floatValue2 = rational.floatValue();
        Rational rational4 = lt.a;
        if (!lt.a(size, rational4, size2)) {
            rational4 = lt.c;
            if (!lt.a(size, rational4, size2)) {
                rational4 = g(size);
            }
        }
        float floatValue3 = rational4.floatValue();
        int i2 = (floatValue > floatValue2 ? 1 : (floatValue == floatValue2 ? 0 : -1));
        if (i2 == 0 || floatValue2 == floatValue3) {
            return false;
        }
        if (i2 > 0) {
            if (floatValue2 >= floatValue3) {
                return false;
            }
        } else if (i <= 0) {
            return false;
        }
        return true;
    }

    public final ArrayList e(List list, boolean z) {
        List list2;
        HashMap hashMap = new HashMap();
        Rational rational = lt.a;
        hashMap.put(rational, new ArrayList());
        Rational rational2 = lt.c;
        hashMap.put(rational2, new ArrayList());
        ArrayList arrayList = new ArrayList();
        arrayList.add(rational);
        arrayList.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        list2 = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (lt.a(size, rational3, msd.c)) {
                        list2 = (List) hashMap.get(rational3);
                        break;
                    }
                }
                if (list2 == null) {
                    list2 = new ArrayList();
                    Rational g2 = g(size);
                    arrayList.add(g2);
                    hashMap.put(g2, list2);
                }
                list2.add(size);
            }
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2, new l45(4, g(this.a)));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Rational rational4 = (Rational) it3.next();
            if (!rational4.equals(lt.c) && !rational4.equals(lt.a)) {
                List list3 = (List) hashMap.get(rational4);
                Objects.requireNonNull(list3);
                arrayList3.addAll(f(rational4, list3, z));
            }
        }
        return arrayList3;
    }

    public final ArrayList f(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational2 = lt.a;
            if (lt.a(size, rational, msd.c)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new x93(true));
        HashSet hashSet = new HashSet(arrayList2);
        for (o9f b2 : this.d) {
            List<Size> b3 = b(b2);
            if (!z) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : b3) {
                    if (!d(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                b3 = arrayList3;
            }
            if (b3.isEmpty()) {
                return new ArrayList();
            }
            if (b3.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList<>();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it2 = b3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!c((Size) it2.next(), size3)) {
                                arrayList4.add(size3);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (b3.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList<>(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it3 = b3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (c((Size) it3.next(), size4)) {
                                break;
                            }
                        } else {
                            arrayList.add(size4);
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
