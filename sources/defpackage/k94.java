package defpackage;

import android.content.Context;

/* renamed from: k94  reason: default package */
public final class k94 implements p24 {
    public final Context a;
    public final y0f b;
    public final p24 c;

    public k94(Context context, String str, h84 h84) {
        ib4 ib4 = new ib4();
        ib4.b = str;
        this.a = context.getApplicationContext();
        this.b = h84;
        this.c = ib4;
    }

    public final r24 a() {
        i94 i94 = new i94(this.a, this.c.a());
        y0f y0f = this.b;
        if (y0f != null) {
            i94.N(y0f);
        }
        return i94;
    }
}
