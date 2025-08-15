package defpackage;

/* renamed from: ikc  reason: default package */
public final class ikc extends q1 {
    public final /* synthetic */ jkc X;
    public int c;
    public int o;

    public ikc(jkc jkc) {
        this.X = jkc;
        this.c = jkc.getSize();
        this.o = jkc.c;
    }

    public final void a() {
        int i = this.c;
        if (i == 0) {
            this.a = 2;
            return;
        }
        jkc jkc = this.X;
        Object[] objArr = jkc.a;
        int i2 = this.o;
        this.b = objArr[i2];
        this.a = 1;
        this.o = (i2 + 1) % jkc.b;
        this.c = i - 1;
    }
}
