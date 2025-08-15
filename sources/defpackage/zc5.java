package defpackage;

/* renamed from: zc5  reason: default package */
public final /* synthetic */ class zc5 implements kde {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zc5(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                dd5 dd5 = (dd5) this.c;
                dd5.getClass();
                return dd5.a(new yc5(dd5, this.b, 0));
            default:
                hd5 hd5 = (hd5) this.c;
                hd5.getClass();
                xrd xrd = new xrd();
                hd5.f.put(Long.valueOf(((k4a) hd5.a).e(4, this.b)), xrd);
                return xrd;
        }
    }
}
