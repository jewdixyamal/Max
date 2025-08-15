package defpackage;

/* renamed from: gc3  reason: default package */
public final class gc3 extends ar0 {
    public final ja7 c;
    public int o;

    public gc3(sh0 sh0, ja7 ja7) {
        super(sh0);
        this.c = ja7;
    }

    public final void k() {
        this.a = true;
        this.o++;
    }

    public final void l() {
        this.a = false;
        u("\n");
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            u(this.c.a.g);
        }
    }

    public final void n() {
        if (this.a) {
            this.a = false;
        } else {
            l();
        }
    }

    public final void x() {
        t(' ');
    }

    public final void y() {
        this.o--;
    }
}
