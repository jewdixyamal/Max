package defpackage;

import android.content.Context;

/* renamed from: xv9  reason: default package */
public final class xv9 {
    public final ida a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;

    public xv9(ida ida, rm4 rm4, rm4 rm42, rm4 rm43) {
        this.a = ida;
        this.b = rm4;
        this.c = rm42;
        this.d = rm43;
    }

    public final yx8 a(Context context, es8 es8, e52 e52) {
        es8 es82 = es8;
        cu8 cu8 = es82.a;
        String str = cu8.s0;
        boolean x = cu8.x();
        rm4 rm4 = this.c;
        if (x) {
            rm4 rm42 = this.b;
            boolean I = e52.I();
            uj3 i = ((el3) rm42.get()).i(cu8.Y, true);
            long t = ((hyc) ((q33) rm4.get())).t();
            Context context2 = context;
            str = are.k(context2, this.a, (el3) rm42.get(), I, es82.a, i, true, true, t).toString();
        } else if (str == null || str.length() == 0) {
            Context context3 = context;
            str = ((are) this.d.get()).f(context3, this.a, es82.a, true, false, true, false, ((hyc) ((q33) rm4.get())).t(), true);
        } else {
            this.a.getClass();
            cu8.D();
        }
        if (cu8.p()) {
            str = context.getString(c2c.tt_forwarded_message_patten, new Object[]{str});
        }
        if (str == null) {
            str = "";
        }
        return new yx8(str, true, 0);
    }
}
