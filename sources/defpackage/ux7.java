package defpackage;

/* renamed from: ux7  reason: default package */
public final /* synthetic */ class ux7 implements lde {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ y7d Y;
    public final /* synthetic */ p82 a;
    public final /* synthetic */ el3 b;
    public final /* synthetic */ oq3 c;
    public final /* synthetic */ b0d o;

    public /* synthetic */ ux7(p82 p82, el3 el3, oq3 oq3, b0d b0d, boolean z, y7d y7d) {
        this.a = p82;
        this.b = el3;
        this.c = oq3;
        this.o = b0d;
        this.X = z;
        this.Y = y7d;
    }

    public final Object get() {
        String[] strArr = (String[]) ((qyc) this.Y).k.getValue();
        p82 p82 = this.a;
        el3 el3 = this.b;
        oq3 oq3 = this.c;
        b0d b0d = this.o;
        boolean z = this.X;
        vzc vzc = new vzc(p82, el3, oq3, b0d, z);
        wzc wzc = null;
        if (strArr != null) {
            if (!(!(strArr.length == 0))) {
                strArr = null;
            }
            if (strArr != null) {
                wzc = new wzc(strArr, p82, b0d);
            }
        }
        return new uzc(p82, el3, b0d, z, vzc, wzc);
    }
}
