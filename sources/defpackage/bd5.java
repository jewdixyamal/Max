package defpackage;

import java.io.File;
import java.io.Serializable;

/* renamed from: bd5  reason: default package */
public final /* synthetic */ class bd5 implements kde {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bd5(Object obj, Serializable serializable, int i) {
        this.a = i;
        this.c = obj;
        this.b = serializable;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                dd5 dd5 = (dd5) this.c;
                dd5.getClass();
                return dd5.a(new u24(dd5, 3, (long[]) this.b));
            case 1:
                hd5 hd5 = (hd5) this.c;
                hd5.getClass();
                xrd xrd = new xrd();
                hd5.f.put(Long.valueOf(((k4a) hd5.a).f(4, (long[]) this.b)), xrd);
                return xrd;
            default:
                oke oke = (oke) this.c;
                ame ame = (ame) oke.b.getValue();
                ((p7b) ((m7b) oke.c.getValue())).b.getClass();
                ztc b2 = ((jle) ((hle) oke.X.getValue())).b();
                ame.getClass();
                return new dq6((khe) ame.a, (File) this.b, b2);
        }
    }
}
