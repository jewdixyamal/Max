package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: nfd  reason: default package */
public final /* synthetic */ class nfd implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ufd c;

    public /* synthetic */ nfd(Context context, ufd ufd, int i) {
        this.a = i;
        this.b = context;
        this.c = ufd;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [mn, android.widget.CompoundButton, android.view.View, java.lang.Object, ofa] */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                caa caa = new caa(this.b);
                caa.setId(pga.j);
                LinearLayout linearLayout = this.c.M0;
                ti3 ti3 = new ti3(-2, -2);
                ti3.setMarginEnd(tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density));
                linearLayout.addView(caa, ti3);
                return caa;
            case 1:
                return ufd.x(this.b, this.c);
            case 2:
                return ufd.y(this.b, this.c);
            case 3:
                return ufd.A(this.b, this.c);
            case 4:
                return ufd.w(this.b, this.c);
            case 5:
                tja tja = new tja(this.b, (AttributeSet) null);
                tja.setChecked(false);
                tja.setShowText(false);
                this.c.M0.addView(tja);
                return tja;
            default:
                ? mnVar = new mn(this.b, (AttributeSet) null);
                float f = (float) 28;
                mnVar.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                mnVar.b(mnVar.isChecked(), qp4.u0.j(mnVar));
                mnVar.setChecked(false);
                this.c.M0.addView(mnVar);
                return mnVar;
        }
    }
}
