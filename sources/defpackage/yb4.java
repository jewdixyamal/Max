package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yb4  reason: default package */
public class yb4 extends mdc {
    public static TimeInterpolator s;
    public boolean g = true;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();

    public yb4() {
        this.a = null;
        this.b = new ArrayList();
        this.c = 120;
        this.d = 120;
        this.e = 250;
        this.f = 250;
    }

    public static void h(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((dec) list.get(size)).a.animate().cancel();
        }
    }

    /* JADX WARNING: type inference failed for: r11v7, types: [wb4, java.lang.Object] */
    public final boolean a(dec dec, dec dec2, jt jtVar, jt jtVar2) {
        int i2;
        int i3;
        int i4 = jtVar.b;
        int i5 = jtVar.c;
        if (dec2.w()) {
            int i6 = jtVar.b;
            i2 = jtVar.c;
            i3 = i6;
        } else {
            i3 = jtVar2.b;
            i2 = jtVar2.c;
        }
        if (dec == dec2) {
            return g(dec, i4, i5, i3, i2);
        }
        View view = dec.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m(dec);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        m(dec2);
        View view2 = dec2.a;
        view2.setTranslationX((float) (-((int) (((float) (i3 - i4)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i2 - i5)) - translationY))));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        ? obj = new Object();
        obj.a = dec;
        obj.b = dec2;
        obj.c = i4;
        obj.d = i5;
        obj.e = i3;
        obj.f = i2;
        arrayList.add(obj);
        return true;
    }

    public final void d(dec dec) {
        View view = dec.a;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((xb4) arrayList.get(size)).a == dec) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(dec);
                arrayList.remove(size);
            }
        }
        j(this.k, dec);
        if (this.h.remove(dec)) {
            view.setAlpha(1.0f);
            l();
            c(dec);
        }
        if (this.i.remove(dec)) {
            view.setAlpha(1.0f);
            c(dec);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, dec);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((xb4) arrayList5.get(size4)).a == dec) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(dec);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(dec)) {
                view.setAlpha(1.0f);
                c(dec);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(dec);
        this.o.remove(dec);
        this.r.remove(dec);
        this.p.remove(dec);
        i();
    }

    public final void e() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            xb4 xb4 = (xb4) arrayList.get(size);
            View view = xb4.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(xb4.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            l();
            c((dec) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            dec dec = (dec) arrayList3.get(size3);
            dec.a.setAlpha(1.0f);
            c(dec);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            wb4 wb4 = (wb4) arrayList4.get(size4);
            dec dec2 = wb4.a;
            if (dec2 != null) {
                k(wb4, dec2);
            }
            dec dec3 = wb4.b;
            if (dec3 != null) {
                k(wb4, dec3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    xb4 xb42 = (xb4) arrayList6.get(size6);
                    View view2 = xb42.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(xb42.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    dec dec4 = (dec) arrayList8.get(size8);
                    dec4.a.setAlpha(1.0f);
                    c(dec4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    wb4 wb42 = (wb4) arrayList10.get(size10);
                    dec dec5 = wb42.a;
                    if (dec5 != null) {
                        k(wb42, dec5);
                    }
                    dec dec6 = wb42.b;
                    if (dec6 != null) {
                        k(wb42, dec6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                au1.r(arrayList11.get(0));
                throw null;
            }
        }
    }

    public final boolean f() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, xb4] */
    public final boolean g(dec dec, int i2, int i3, int i4, int i5) {
        View view = dec.a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) dec.a.getTranslationY());
        m(dec);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            c(dec);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        ArrayList arrayList = this.j;
        ? obj = new Object();
        obj.a = dec;
        obj.b = translationX;
        obj.c = translationY;
        obj.d = i4;
        obj.e = i5;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                au1.r(arrayList.get(0));
                throw null;
            }
        }
    }

    public final void j(ArrayList arrayList, dec dec) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            wb4 wb4 = (wb4) arrayList.get(size);
            if (k(wb4, dec) && wb4.a == null && wb4.b == null) {
                arrayList.remove(wb4);
            }
        }
    }

    public final boolean k(wb4 wb4, dec dec) {
        if (wb4.b == dec) {
            wb4.b = null;
        } else if (wb4.a != dec) {
            return false;
        } else {
            wb4.a = null;
        }
        dec.a.setAlpha(1.0f);
        View view = dec.a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(dec);
        return true;
    }

    public void l() {
    }

    public final void m(dec dec) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        dec.a.animate().setInterpolator(s);
        d(dec);
    }
}
