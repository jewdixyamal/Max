package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: e2f  reason: default package */
public class e2f extends w1f {
    public ArrayList R0 = new ArrayList();
    public boolean S0 = true;
    public int T0;
    public boolean U0 = false;
    public int V0 = 0;

    public final void B(View view) {
        super.B(view);
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            ((w1f) this.R0.get(i)).B(view);
        }
    }

    public final void C() {
        this.L0 = 0;
        d2f d2f = new d2f(this);
        for (int i = 0; i < this.R0.size(); i++) {
            w1f w1f = (w1f) this.R0.get(i);
            w1f.a(d2f);
            w1f.C();
            long j = w1f.L0;
            if (this.S0) {
                this.L0 = Math.max(this.L0, j);
            } else {
                long j2 = this.L0;
                w1f.M0 = j2;
                this.L0 = j2 + j;
            }
        }
    }

    public final w1f D(v1f v1f) {
        super.D(v1f);
        return this;
    }

    public final void E(View view) {
        for (int i = 0; i < this.R0.size(); i++) {
            ((w1f) this.R0.get(i)).E(view);
        }
        this.Y.remove(view);
    }

    public final void F(View view) {
        super.F(view);
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            ((w1f) this.R0.get(i)).F(view);
        }
    }

    public final void G() {
        if (this.R0.isEmpty()) {
            O();
            n();
            return;
        }
        d2f d2f = new d2f();
        d2f.b = this;
        Iterator it = this.R0.iterator();
        while (it.hasNext()) {
            ((w1f) it.next()).a(d2f);
        }
        this.T0 = this.R0.size();
        if (!this.S0) {
            for (int i = 1; i < this.R0.size(); i++) {
                ((w1f) this.R0.get(i - 1)).a(new jj0(1, (w1f) this.R0.get(i)));
            }
            w1f w1f = (w1f) this.R0.get(0);
            if (w1f != null) {
                w1f.G();
                return;
            }
            return;
        }
        Iterator it2 = this.R0.iterator();
        while (it2.hasNext()) {
            ((w1f) it2.next()).G();
        }
    }

    public final void H(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        long j5 = this.L0;
        if (this.v0 != null) {
            if (j3 < 0 && j4 < 0) {
                return;
            }
            if (j3 > j5 && j4 > j5) {
                return;
            }
        }
        int i = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
        boolean z = i < 0;
        int i2 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if ((i2 >= 0 && j4 < 0) || (j3 <= j5 && j4 > j5)) {
            this.E0 = false;
            A(this, hme.b, z);
        }
        if (this.S0) {
            for (int i3 = 0; i3 < this.R0.size(); i3++) {
                ((w1f) this.R0.get(i3)).H(j3, j4);
            }
        } else {
            int i4 = 1;
            while (true) {
                if (i4 >= this.R0.size()) {
                    i4 = this.R0.size();
                    break;
                } else if (((w1f) this.R0.get(i4)).M0 > j4) {
                    break;
                } else {
                    i4++;
                }
            }
            int i5 = i4 - 1;
            if (i >= 0) {
                while (i5 < this.R0.size()) {
                    w1f w1f = (w1f) this.R0.get(i5);
                    long j6 = w1f.M0;
                    int i6 = i5;
                    long j7 = j3 - j6;
                    if (j7 < 0) {
                        break;
                    }
                    w1f.H(j7, j4 - j6);
                    i5 = i6 + 1;
                }
            } else {
                while (i5 >= 0) {
                    w1f w1f2 = (w1f) this.R0.get(i5);
                    long j8 = w1f2.M0;
                    long j9 = j3 - j8;
                    w1f2.H(j9, j4 - j8);
                    if (j9 >= 0) {
                        break;
                    }
                    i5--;
                }
            }
        }
        if (this.v0 != null) {
            int i7 = (j3 > j5 ? 1 : (j3 == j5 ? 0 : -1));
            if ((i7 > 0 && j4 <= j5) || (i2 < 0 && j4 >= 0)) {
                if (i7 > 0) {
                    this.E0 = true;
                }
                A(this, hme.c, z);
            }
        }
    }

    public final void J(fm9 fm9) {
        this.J0 = fm9;
        this.V0 |= 8;
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            ((w1f) this.R0.get(i)).J(fm9);
        }
    }

    public final void K(TimeInterpolator timeInterpolator) {
        this.V0 |= 1;
        ArrayList arrayList = this.R0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((w1f) this.R0.get(i)).K(timeInterpolator);
            }
        }
        this.o = timeInterpolator;
    }

    public final void L(vu4 vu4) {
        super.L(vu4);
        this.V0 |= 4;
        if (this.R0 != null) {
            for (int i = 0; i < this.R0.size(); i++) {
                ((w1f) this.R0.get(i)).L(vu4);
            }
        }
    }

    public final void M(eod eod) {
        this.I0 = eod;
        this.V0 |= 2;
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            ((w1f) this.R0.get(i)).M(eod);
        }
    }

    public final void N(long j) {
        this.b = j;
    }

    public final String P(String str) {
        String P = super.P(str);
        for (int i = 0; i < this.R0.size(); i++) {
            StringBuilder o = rh4.o(P, "\n");
            o.append(((w1f) this.R0.get(i)).P(str + "  "));
            P = o.toString();
        }
        return P;
    }

    public final void Q(v1f v1f) {
        super.a(v1f);
    }

    public final void R(w1f w1f) {
        this.R0.add(w1f);
        w1f.v0 = this;
        long j = this.c;
        if (j >= 0) {
            w1f.I(j);
        }
        if ((this.V0 & 1) != 0) {
            w1f.K(this.o);
        }
        if ((this.V0 & 2) != 0) {
            w1f.M(this.I0);
        }
        if ((this.V0 & 4) != 0) {
            w1f.L(this.K0);
        }
        if ((this.V0 & 8) != 0) {
            w1f.J(this.J0);
        }
    }

    public final w1f S(int i) {
        if (i < 0 || i >= this.R0.size()) {
            return null;
        }
        return (w1f) this.R0.get(i);
    }

    /* renamed from: T */
    public final void I(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j >= 0 && (arrayList = this.R0) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((w1f) this.R0.get(i)).I(j);
            }
        }
    }

    public final void U(int i) {
        if (i == 0) {
            this.S0 = true;
        } else if (i == 1) {
            this.S0 = false;
        } else {
            throw new AndroidRuntimeException(zr6.h(i, "Invalid parameter for TransitionSet ordering: "));
        }
    }

    public final void b(View view) {
        for (int i = 0; i < this.R0.size(); i++) {
            ((w1f) this.R0.get(i)).b(view);
        }
        this.Y.add(view);
    }

    public final void d() {
        super.d();
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            ((w1f) this.R0.get(i)).d();
        }
    }

    public final void e(g2f g2f) {
        if (y(g2f.b)) {
            Iterator it = this.R0.iterator();
            while (it.hasNext()) {
                w1f w1f = (w1f) it.next();
                if (w1f.y(g2f.b)) {
                    w1f.e(g2f);
                    g2f.c.add(w1f);
                }
            }
        }
    }

    public final void g(g2f g2f) {
        super.g(g2f);
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            ((w1f) this.R0.get(i)).g(g2f);
        }
    }

    public final void h(g2f g2f) {
        if (y(g2f.b)) {
            Iterator it = this.R0.iterator();
            while (it.hasNext()) {
                w1f w1f = (w1f) it.next();
                if (w1f.y(g2f.b)) {
                    w1f.h(g2f);
                    g2f.c.add(w1f);
                }
            }
        }
    }

    /* renamed from: k */
    public final w1f clone() {
        e2f e2f = (e2f) super.clone();
        e2f.R0 = new ArrayList();
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            w1f k = ((w1f) this.R0.get(i)).clone();
            e2f.R0.add(k);
            k.v0 = e2f;
        }
        return e2f;
    }

    public final void m(ViewGroup viewGroup, a8g a8g, a8g a8g2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            w1f w1f = (w1f) this.R0.get(i);
            if (j > 0 && (this.S0 || i == 0)) {
                long j2 = w1f.b;
                if (j2 > 0) {
                    w1f.N(j2 + j);
                } else {
                    w1f.N(j);
                }
            }
            w1f.m(viewGroup, a8g, a8g2, arrayList, arrayList2);
        }
    }

    public final void p(int i) {
        for (int i2 = 0; i2 < this.R0.size(); i2++) {
            ((w1f) this.R0.get(i2)).p(i);
        }
        super.p(i);
    }

    public final void q(ViewGroup viewGroup) {
        super.q(viewGroup);
        int size = this.R0.size();
        for (int i = 0; i < size; i++) {
            ((w1f) this.R0.get(i)).q(viewGroup);
        }
    }

    public final boolean w() {
        for (int i = 0; i < this.R0.size(); i++) {
            if (((w1f) this.R0.get(i)).w()) {
                return true;
            }
        }
        return false;
    }
}
