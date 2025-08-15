package defpackage;

import android.view.View;

/* renamed from: b85  reason: default package */
public final class b85 {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public Object f;

    public b85(a3b a3b) {
        this.f = a3b;
    }

    public void a() {
        this.c = this.d ? ((ga7) this.f).h() : ((ga7) this.f).m();
    }

    public void b(View view, int i) {
        if (this.d) {
            this.c = ((ga7) this.f).o() + ((ga7) this.f).c(view);
        } else {
            this.c = ((ga7) this.f).f(view);
        }
        this.b = i;
    }

    public void c(View view, int i) {
        int o = ((ga7) this.f).o();
        if (o >= 0) {
            b(view, i);
            return;
        }
        this.b = i;
        if (this.d) {
            int h = (((ga7) this.f).h() - o) - ((ga7) this.f).c(view);
            this.c = ((ga7) this.f).h() - h;
            if (h > 0) {
                int d2 = this.c - ((ga7) this.f).d(view);
                int m = ((ga7) this.f).m();
                int min = d2 - (Math.min(((ga7) this.f).f(view) - m, 0) + m);
                if (min < 0) {
                    this.c = Math.min(h, -min) + this.c;
                    return;
                }
                return;
            }
            return;
        }
        int f2 = ((ga7) this.f).f(view);
        int m2 = f2 - ((ga7) this.f).m();
        this.c = f2;
        if (m2 > 0) {
            int h2 = (((ga7) this.f).h() - Math.min(0, (((ga7) this.f).h() - o) - ((ga7) this.f).c(view))) - (((ga7) this.f).d(view) + f2);
            if (h2 < 0) {
                this.c -= Math.min(m2, -h2);
            }
        }
    }

    public void d(int i) {
        this.d |= i > 0;
        this.b += i;
    }

    public void e() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
            default:
                return super.toString();
        }
    }

    public b85() {
        e();
    }
}
