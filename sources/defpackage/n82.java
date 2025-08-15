package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: n82  reason: default package */
public final /* synthetic */ class n82 implements Callable {
    public final /* synthetic */ p82 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String o;

    public /* synthetic */ n82(p82 p82, List list, String str, String str2) {
        this.a = p82;
        this.b = list;
        this.c = str;
        this.o = str2;
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.Object, o10] */
    public final Object call() {
        p82 p82 = this.a;
        p82.getClass();
        StringBuilder sb = new StringBuilder("createMultiChat, contacts.size() = ");
        List list = this.b;
        sb.append(list.size());
        hm9.m("p82", sb.toString(), new Object[0]);
        j92 j92 = j92.b;
        String str = this.o;
        String str2 = this.c;
        e52 b2 = p82.b(j92, list, str2, str);
        ? obj = new Object();
        obj.a = p10.b;
        obj.l = 3;
        obj.c = list;
        obj.d = str2;
        ((s8g) p82.w.get()).a(new i8d(new h8d(b2.a, obj.a(), 1), (byte) 0));
        return b2;
    }
}
