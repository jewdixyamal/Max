package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* renamed from: d8c  reason: default package */
public final class d8c extends rd7 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d8c(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public List a() {
        Proxy proxy = (Proxy) this.c;
        if (proxy != null) {
            return Collections.singletonList(proxy);
        }
        URI h = ((vq6) this.o).h();
        if (h.getHost() == null) {
            return naf.k(Proxy.NO_PROXY);
        }
        List<Proxy> select = ((y9) ((gb0) this.b).e).k.select(h);
        return (select == null || select.isEmpty()) ? naf.k(Proxy.NO_PROXY) : naf.w(select);
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((e12) this.b).b.i(((y9) this.o).a.e, ((fi6) this.c).a());
            default:
                return a();
        }
    }
}
