package defpackage;

/* renamed from: vnf  reason: default package */
public interface vnf {
    qnf a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    qnf b(Class cls, wh9 wh9) {
        return a(cls);
    }

    qnf c(h23 h23, wh9 wh9) {
        return b(h23.a(), wh9);
    }
}
