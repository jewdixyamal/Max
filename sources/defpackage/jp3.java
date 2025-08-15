package defpackage;

import android.view.View;

/* renamed from: jp3  reason: default package */
public final /* synthetic */ class jp3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp3 b;
    public final /* synthetic */ bk3 c;

    public /* synthetic */ jp3(lp3 lp3, bk3 bk3, int i) {
        this.a = i;
        this.b = lp3;
        this.c = bk3;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                bk3 bk3 = this.c;
                this.b.o.invoke(new c19(bk3.k, bk3));
                return;
            default:
                bk3 bk32 = this.c;
                this.b.o.invoke(new d19(bk32.k, bk32));
                return;
        }
    }
}
