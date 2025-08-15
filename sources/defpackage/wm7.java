package defpackage;

/* renamed from: wm7  reason: default package */
public abstract class wm7 {
    public final g2a a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ xm7 o;

    public wm7(xm7 xm7, g2a g2a) {
        this.o = xm7;
        this.a = g2a;
    }

    public final void a(boolean z) {
        if (z != this.b) {
            this.b = z;
            int i = z ? 1 : -1;
            xm7 xm7 = this.o;
            int i2 = xm7.c;
            xm7.c = i + i2;
            if (!xm7.d) {
                xm7.d = true;
                while (true) {
                    try {
                        int i3 = xm7.c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            xm7.g();
                        } else if (z3) {
                            xm7.h();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        xm7.d = false;
                        throw th;
                    }
                }
                xm7.d = false;
            }
            if (this.b) {
                xm7.c(this);
            }
        }
    }

    public void b() {
    }

    public boolean c(eh7 eh7) {
        return false;
    }

    public abstract boolean d();
}
