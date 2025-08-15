package defpackage;

import android.view.View;

/* renamed from: r6c  reason: default package */
public final class r6c extends dle implements l7c {
    public m56 X;
    public w5c Y;
    public boolean Z;
    public boolean o = true;

    public r6c() {
        super((m56) new ww9(28));
    }

    public final void f(ix8 ix8, boolean z) {
        ((b6c) Q()).setOnChipClickListener(this.X);
        w5c w5c = this.Y;
        if (w5c != null) {
            ((b6c) Q()).setChipObserver(w5c);
        }
        ((b6c) Q()).setStackFromEnd(this.Z);
        ((b6c) Q()).setIncoming(this.o);
        ((b6c) Q()).f(ix8, z);
        t();
    }

    public final void k(is0 is0, boolean z) {
        je7 je7 = (je7) this.c;
        if (je7.a()) {
            b6c b6c = (b6c) je7.getValue();
            b6c b6c2 = (b6c) Q();
            b6c2.getClass();
            int i = 0;
            while (i < b6c2.getChildCount()) {
                int i2 = i + 1;
                View childAt = b6c2.getChildAt(i);
                if (childAt != null) {
                    z5c z5c = (z5c) childAt;
                    ls0 ls0 = is0.d;
                    bs0 bs0 = is0.a;
                    if (z) {
                        gs0 gs0 = bs0.c;
                        z5c.s0 = gs0.a;
                        z5c.t0 = gs0.b;
                        ms0 ms0 = ls0.a;
                        z5c.u0 = ms0.a;
                        z5c.v0 = ms0.b;
                    } else {
                        gs0 gs02 = bs0.c;
                        z5c.s0 = gs02.c;
                        z5c.t0 = gs02.d;
                        ms0 ms02 = ls0.a;
                        z5c.u0 = ms02.c;
                        z5c.v0 = ms02.d;
                    }
                    z5c.invalidate();
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            }
        }
    }

    public final void q(boolean z) {
        je7 je7 = (je7) this.c;
        if (je7.a()) {
            b6c b6c = (b6c) je7.getValue();
            ((b6c) Q()).f((ix8) null, z);
        }
    }

    public final void setChipObserver(w5c w5c) {
        if (((je7) this.c).a()) {
            ((b6c) Q()).setChipObserver(w5c);
        } else {
            this.Y = w5c;
        }
    }

    public final void setIsIncoming(boolean z) {
        this.o = z;
    }

    public final void setOnClickListener(m56 m56) {
        this.X = m56;
    }

    public final void setStackFromEnd(boolean z) {
        this.Z = z;
    }
}
