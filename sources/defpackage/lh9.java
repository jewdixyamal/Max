package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lh9  reason: default package */
public final class lh9 implements on5 {
    public final /* synthetic */ long X;
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ uh9 o;

    public lh9(long j, String str, String str2, uh9 uh9, long j2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = uh9;
        this.X = j2;
    }

    public final Object a(Object obj, Continuation continuation) {
        if (((dn4) obj).b == 3) {
            int i = uh9.K;
            StringBuilder sb = new StringBuilder();
            long j = this.a;
            sb.append(j);
            sb.append(" | ");
            String str = this.b;
            sb.append(str);
            sb.append(" is loaded, ");
            sb.append(this.c);
            hm9.m("uh9", sb.toString(), new Object[0]);
            uh9 uh9 = this.o;
            uh9.d.v(j, str, new hj8(27));
            uh9.f.c(new l6f(this.X, this.a, 0));
        }
        return e5f.a;
    }
}
